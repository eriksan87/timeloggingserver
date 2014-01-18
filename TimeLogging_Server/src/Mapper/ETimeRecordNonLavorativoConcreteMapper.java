package Mapper;

import org.orm.PersistentException;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETimeRecordLavorativoCondiviso;
import Condivisione.EntityCondivise.ETimeRecordNonLavorativoCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.EConsulenteCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.ETaskCondivisoImp;
import EntityCondivise.ETimeRecordLavorativoCondivisoImp;
import EntityCondivise.ETimeRecordNonLavorativoCondivisoImp;
import foundation.EDipendente;
import foundation.EDipendenteCriteria;
import foundation.ETask;
import foundation.ETaskCriteria;
import foundation.ETimeRecordLavorativo;
import foundation.ETimeRecordNL;

public class ETimeRecordNonLavorativoConcreteMapper extends EntityMappersFactory {

	private static ETimeRecordNonLavorativoConcreteMapper instance=null;

	public ETimeRecordNonLavorativoConcreteMapper()
	{
		
	}
	
	public static ETimeRecordNonLavorativoConcreteMapper getInstance()
	{
		if(ETimeRecordNonLavorativoConcreteMapper.instance==null)
		{
			ETimeRecordNonLavorativoConcreteMapper.instance=new ETimeRecordNonLavorativoConcreteMapper();
		}
		return ETimeRecordNonLavorativoConcreteMapper.instance;
	}
	
	
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		
		ETimeRecordNL TRNL = (ETimeRecordNL) entity;
		ETimeRecordNonLavorativoCondiviso TRNLc = new ETimeRecordNonLavorativoCondivisoImp();
		
		EConsulenteCondiviso consulente=(EConsulenteCondivisoImp) EDipendenteConcreteMapper.getInstance().HibernateToIceFactory(TRNL.geteDipendente());
		
		
		TRNLc.setCategoria(TRNL.getCategoria());
		TRNLc.setCommento(TRNL.getCommento());
		TRNLc.setFine(TRNL.getFine());
		TRNLc.setInizio(TRNL.getInizio());
		TRNLc.setId(TRNL.getID());
		TRNLc.setConsulente(consulente);
		
		return TRNLc;
	}
	
	
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		ETimeRecordNL TRNL = new ETimeRecordNL();
	
		EDipendente consulente= new EDipendente();
		ETimeRecordNonLavorativoCondivisoImp trnlIce= (ETimeRecordNonLavorativoCondivisoImp) entity;
		EConsulenteCondivisoImp consulenteIce=(EConsulenteCondivisoImp) trnlIce.getConsulente();
		
		EDipendenteCriteria eCriteriadip = null;
		try {
			eCriteriadip = new EDipendenteCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eCriteriadip.ID.eq(consulenteIce.getId());
		consulente=eCriteriadip.uniqueEDipendente();
		
		TRNL.setCommento(trnlIce.getCommento());
		TRNL.setCategoria(trnlIce.getCategoria());
		TRNL.setFine(trnlIce.getFine());
		TRNL.setInizio(trnlIce.getInizio());
		TRNL.seteDipendente(consulente);
		
		return TRNL;

}
	
}
