package Mapper;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.orm.PersistentException;
import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETariffaCondivisa;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.EConsulenteCondivisoImp;
import EntityCondivise.EManagerCondivisoImp;
import EntityCondivise.EProgettoCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.ETaskCondivisoImp;
import foundation.EClienteCriteria;
import foundation.EDipendente;
import foundation.EDipendenteCriteria;

import foundation.EDipendente_ETask;
import foundation.EProgettoCriteria;
import foundation.ESottoprogetto;
import foundation.ESottoprogettoCriteria;
import foundation.ETask;
import foundation.ETaskCriteria;
import foundation.ETimeRecordLavorativo;

public class EDipendente_ETaskConcreteMapper extends EntityMappersFactory {
	
	private static EDipendente_ETaskConcreteMapper instance=null;
	public EDipendente_ETaskConcreteMapper()
	{
		
	}
	
	public static EDipendente_ETaskConcreteMapper getInstance()
	{
		if(EDipendente_ETaskConcreteMapper.instance==null)
		{
			EDipendente_ETaskConcreteMapper.instance=new EDipendente_ETaskConcreteMapper();
		}
		return EDipendente_ETaskConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa HibernateToIceFactory(EntityServer entity) {
		
		
	    EDipendente_ETask diptask=(EDipendente_ETask) entity;
	    
	    EDipendente_ETaskImp dipTaskImp=new EDipendente_ETaskImp();
	    dipTaskImp.setAssegnato(diptask.getInizio());
	    dipTaskImp.setRevocato(diptask.getFine());
	    
	    EDipendenteCondiviso dipendente=(EDipendenteCondiviso) EDipendenteConcreteMapper.getInstance().HibernateToIceFactory(diptask.getEdipendente());
	    dipTaskImp.setDipendente( dipendente.getId());
	    
	    dipTaskImp.setTask(diptask.getEtask().getID());
	    
		return dipTaskImp;
	
	}
	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		EDipendente_ETask dipendentetask = new EDipendente_ETask();
		EDipendente_ETaskImp taskDip= (EDipendente_ETaskImp) entity;
		ETask task=null;
		EDipendente dipendente=null;
		
		ETaskCriteria eCriteriatask = null;
		try {
			eCriteriatask = new ETaskCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eCriteriatask.ID.eq(taskDip.getTask());
		task=eCriteriatask.uniqueETask();
		
		EDipendenteCriteria eCriteriadip = null;
		try {
			eCriteriadip = new EDipendenteCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eCriteriadip.ID.eq(taskDip.getDipendente());
		dipendente=eCriteriadip.uniqueEDipendente();
		
		dipendentetask.setFine(taskDip.getRevocato());
		dipendentetask.setInizio(taskDip.getAssegnato());
		dipendentetask.setEdipendente(dipendente);
		dipendentetask.setEtask(task);
		
	
		return dipendentetask;
	}
}