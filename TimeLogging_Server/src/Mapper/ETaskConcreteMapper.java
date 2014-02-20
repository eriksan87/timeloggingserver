package Mapper;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.orm.PersistentException;

import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETariffaCondivisa;
import Condivisione.EntityCondivise.ETimeRecordCondiviso;

import Condivisione.EntityCondivise.EntityCondivisa;

import EntityCondivise.EConsulenteCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.ETariffaCondivisaImp;
import EntityCondivise.ETaskCondivisoImp;

import foundation.EDipendente_ETask;

import foundation.EDipendente;
import foundation.ESottoprogetto;
import foundation.ESottoprogettoCriteria;
import foundation.ETariffa;
import foundation.ETask;

public class ETaskConcreteMapper extends EntityMappersFactory {
	
	private static ETaskConcreteMapper instance=null;
	public ETaskConcreteMapper()
	{
		
	}
	
	public static ETaskConcreteMapper getInstance()
	{
		if(ETaskConcreteMapper.instance==null)
		{
			ETaskConcreteMapper.instance=new ETaskConcreteMapper();
		}
		return ETaskConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa HibernateToIceFactory(EntityServer entity) {
		
		ETask task=(ETask)entity;
		
		EDipendente_ETask dipHibernate=null;
		foundation.EDipendente_ETask[] foundationETaskEDipendente = null;
		try {
			foundationETaskEDipendente = foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery("ETaskID="+task.getID(), "Fine asc");//deve essere asc
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int size= foundationETaskEDipendente.length;
		dipHibernate=foundationETaskEDipendente[size-1];
		
		EDipendente_ETaskImp dipTaskImp=(EDipendente_ETaskImp) EDipendente_ETaskConcreteMapper.getInstance().HibernateToIceFactory(dipHibernate);
		
		ESottoprogettoCondiviso spprogIce=(ESottoprogettoCondivisoImp) ESottoprogettoConcreteMapper.getInstance().HibernateToIceFactory(task.geteSottoprogetto());
		EDipendenteCondiviso dipendente=(EDipendenteCondiviso) EDipendenteConcreteMapper.getInstance().HibernateToIceFactory(dipHibernate.getEdipendente());
		   
		ETariffa tariffa=null;
		foundation.ETariffa[] tariffe = null;
		ArrayList<ETariffaCondivisa> t=new ArrayList<ETariffaCondivisa> ();
		try {
			tariffe = foundation.ETariffaDAO.listETariffaByQuery("ETaskID="+task.getID(), null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<tariffe.length;i++)
		{
			ETariffaCondivisa tar=(ETariffaCondivisaImp) ETariffeConcreteMapper.getInstance().HibernateToIceFactory(tariffe[i]);
			t.add(tar);	
		}
		ETaskCondivisoImp taskCondivisoImp = new ETaskCondivisoImp(task.getID(), task.getTitolo(),task.getDescrizione(),0,task.getInizio(),task.getScadenza(),dipendente,true,spprogIce,t, dipTaskImp.getAssegnato(), dipTaskImp.getRevocato(),null);
		
		return taskCondivisoImp;
	
	}
	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		ETask task = new ETask();
		ESottoprogetto sottoprogetto=new ESottoprogetto();

		ETaskCondivisoImp taskIce= (ETaskCondivisoImp) entity;
	
		try {
		
			ESottoprogettoCriteria eCriteriasottoprogetto= new ESottoprogettoCriteria();
			eCriteriasottoprogetto.ID.eq(taskIce.getPadre().getId());
			sottoprogetto=eCriteriasottoprogetto.uniqueESottoprogetto();

			task.setDescrizione(taskIce.getDescrizione());
			task.setInizio(taskIce.getInizio());
			task.setScadenza(taskIce.getScadenza());
			task.setTitolo(taskIce.getTitolo());
			task.seteSottoprogetto(sottoprogetto);
			
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return task;
	}
}