package Mapper;

import org.orm.PersistentException;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.ETimeRecordLavorativoCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.ETaskCondivisoImp;
import EntityCondivise.ETimeRecordLavorativoCondivisoImp;

import foundation.ETask;
import foundation.ETaskCriteria;
import foundation.ETimeRecordLavorativo;


public class ETimeRecordLavorativoConcreteMapper extends EntityMappersFactory {

	private static ETimeRecordLavorativoConcreteMapper instance=null;

	public ETimeRecordLavorativoConcreteMapper()
	{
		
	}
	
	public static ETimeRecordLavorativoConcreteMapper getInstance()
	{
		if(ETimeRecordLavorativoConcreteMapper.instance==null)
		{
			ETimeRecordLavorativoConcreteMapper.instance=new ETimeRecordLavorativoConcreteMapper();
		}
		return ETimeRecordLavorativoConcreteMapper.instance;
	}
	
	
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		
		ETimeRecordLavorativo TRL = (ETimeRecordLavorativo) entity;
		ETimeRecordLavorativoCondiviso TRLc = new ETimeRecordLavorativoCondivisoImp();
		
		ETaskCondivisoImp task=(ETaskCondivisoImp) ETaskConcreteMapper.getInstance().HibernateToIceFactory(TRL.geteTask());
		
		TRLc.setETaskCondiviso(task);
		TRLc.setFine(TRL.getFine());
		TRLc.setInizio(TRL.getInizio());
		TRLc.setId(TRL.getID());
		TRLc.setCommento(TRL.getCommento());
		TRLc.setConsulente((EConsulenteCondiviso) task.getDipendente());
		
		return TRLc;
	}
	
	
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		
		ETimeRecordLavorativo TRL = new ETimeRecordLavorativo();
		ETask task= new ETask();
		
		ETimeRecordLavorativoCondivisoImp trlIce= (ETimeRecordLavorativoCondivisoImp) entity;
		ETaskCondivisoImp taskIce=(ETaskCondivisoImp) trlIce.getETaskCondiviso();
		
		
		
		try {
			
			ETaskCriteria eCriteriatask= new ETaskCriteria();
			eCriteriatask.ID.eq(taskIce.getId());
			task=eCriteriatask.uniqueETask();
		
			TRL.setCommento(trlIce.getCommento());
			TRL.seteTask(task);
			TRL.setFine(trlIce.getFine());
			TRL.setInizio(trlIce.getInizio());
			
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return TRL;
	}
}
