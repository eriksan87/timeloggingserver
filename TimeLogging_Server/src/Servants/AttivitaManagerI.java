package Servants;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import foundation.ECliente;
import foundation.EClienteCriteria;
import foundation.EDipendente;
import foundation.EDipendenteCriteria;
import foundation.EDipendente_ETask;
import foundation.EDipendente_ETaskDAO;
import foundation.EProgetto;
import foundation.EProgettoCriteria;
import foundation.EProgettoDAO;
import foundation.ESottoprogetto;
import foundation.ESottoprogettoCriteria;
import foundation.ESottoprogettoDAO;
import foundation.ETariffa;
import foundation.ETask;
import foundation.ETaskCriteria;
import foundation.ETaskDAO;
import foundation.ETimeRecordLavorativo;

import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETariffaCondivisa;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.ETimeRecordCondiviso;
import Condivisione.EntityCondivise.ETimeRecordLavorativoCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import Condivisione.InterfacceCondivise._AttivitaManagerDisp;
import EntityCondivise.EProgettoCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.ETariffaCondivisaImp;
import EntityCondivise.ETaskCondivisoImp;
import EntityCondivise.ETimeRecordLavorativoCondivisoImp;
import Ice.Current;
import Mapper.EClienteConcreteMapper;
import Mapper.ESottoprogettoConcreteMapper;
import Mapper.ETariffeConcreteMapper;
import Mapper.ETaskConcreteMapper;
import Mapper.ETimeRecordLavorativoConcreteMapper;
import Mapper.EntityMappersFactory;
import Services.Services;


public class AttivitaManagerI extends _AttivitaManagerDisp {

	
	@Override
	public void saveAttivita(EAttivitaCondivisa attivita, Current __current) {
		// TODO Auto-generated method stub
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			
			try {
				if(attivita.getClass().toString().equals(EProgettoCondivisoImp.class.toString()))
				{
					EProgetto eprogetto=(EProgetto) EntityMappersFactory.getInstance().IceToHibernateFactory(attivita);
					EProgettoDAO.save(eprogetto);
				}
				else if(attivita.getClass().toString().equals(ESottoprogettoCondivisoImp.class.toString()))
				{
					ESottoprogetto esottoprogetto = (ESottoprogetto) EntityMappersFactory.getInstance().IceToHibernateFactory(attivita);
					
					ESottoprogettoDAO.save(esottoprogetto);
				}
				else if(attivita.getClass().toString().equals(ETaskCondivisoImp.class.toString()))
				{
					ETask etask = (ETask) EntityMappersFactory.getInstance().IceToHibernateFactory(attivita);
					
					ETaskDAO.save(etask);
					
					EDipendente_ETask eDipentente_ETask=new EDipendente_ETask();
					
					EDipendenteCriteria eCriteriadip= new EDipendenteCriteria();
					eCriteriadip.ID.eq(attivita.getDipendente().id);
					EDipendente consulente=eCriteriadip.uniqueEDipendente();
					
					eDipentente_ETask.setEdipendente(consulente);
					eDipentente_ETask.setEtask(etask);
					eDipentente_ETask.setInizio(etask.getInizio());
					eDipentente_ETask.setFine(etask.getScadenza());
					EDipendente_ETaskDAO.save(eDipentente_ETask);
				}
					
				t.commit();
				}
			catch (Exception e) {
				t.rollback();
			}
		    finally 
		    {
				foundation.TimeLoggingPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	

@Override
public ArrayList<EProgettoCondiviso> getListProgetti(
		EDipendenteCondiviso dipendente, boolean abilitati,Current __current) {
	// TODO Auto-generated method stub
	
	ArrayList<EProgettoCondiviso> list = new ArrayList<EProgettoCondiviso>();
	EProgettoCondiviso p=null;
	ArrayList<EProgetto> foundationEProgettos = null; 
	foundationEProgettos=Services.queryProgettiDipendente(dipendente,abilitati); 
	for (int i = 0; i < foundationEProgettos.size(); i++) { 
		p = (EProgettoCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationEProgettos.get(i)); 
		list.add(p); 
	} 
	return list;
}



@Override
public ArrayList<ESottoprogettoCondiviso> getListSottoProgetti(int idprogetto,
		EDipendenteCondiviso dipendente, boolean abilitati,Current __current) {
	// TODO Auto-generated method stub
	
	ArrayList<ESottoprogettoCondiviso> list = new ArrayList<ESottoprogettoCondiviso>();
	ESottoprogettoCondiviso p=null; 
	ArrayList<ESottoprogetto> foundationESottoprogettos = null; 
	foundationESottoprogettos=Services.querySottoprogettiDipendente(idprogetto,dipendente,abilitati); 
	
	for (int i = 0; i < foundationESottoprogettos.size(); i++) { 
		p = (ESottoprogettoCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationESottoprogettos.get(i)); 
		list.add(p); 
	} 
	
	return list;
}



@Override
public ArrayList<ETaskCondiviso> getListTask(int idsottoprogetto,
		boolean abilitati, EDipendenteCondiviso dipendente, Current __current) {
	// TODO Auto-generated method stub
	
	ArrayList<ETaskCondiviso> list = new ArrayList<ETaskCondiviso>();
	ETaskCondiviso task=null; 
	ArrayList<ETask> foundationETasks = null; 
	foundationETasks=Services.queryTaskDipendente(idsottoprogetto, abilitati, dipendente); 
	for (int i = 0; i < foundationETasks.size(); i++) { 
		task = (ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationETasks.get(i)); 
		list.add(task); 
	} 
	
	return list;
}



@Override
public EProgettoCondiviso getProgetto(EProgettoCondiviso progetto,
		Current __current) {
	// TODO Auto-generated method stub
	
	ArrayList<ESottoprogettoCondiviso> sp=getListSottoProgetti(progetto.id,progetto.dipendente,false);
	//progetto.listSp= new ArrayList<ESottoprogettoCondiviso>();
	
	for (int i=0;i<sp.size();i++)
	{
		progetto.getlistSp().add(getSottoprogetto((ESottoprogettoCondiviso) sp.get(i)));
		
	}

	return progetto;
	
}



@Override
public ESottoprogettoCondiviso getSottoprogetto(ESottoprogettoCondiviso sottoprogetto,
		Current __current) {
	// TODO Auto-generated method stub

	ArrayList<ETaskCondiviso> task=getListTask(sottoprogetto.id, false,sottoprogetto.dipendente);
	sottoprogetto.listTasks= new ArrayList<ETaskCondiviso>();
					
					for (int j=0;j<task.size();j++)
					{		
						sottoprogetto.getlistTask().add(getTask((ETaskCondiviso) task.get(j)));	
					}
		
	return sottoprogetto;
	
}


@Override
public ETaskCondiviso getTask(ETaskCondiviso task,
		Current __current) {
	// TODO Auto-generated method stub
	TimeRecordManagerI manager=new TimeRecordManagerI();
	task.listTRL= new ArrayList<ETimeRecordCondiviso>();
					
	ArrayList<ETimeRecordCondiviso> trList=manager.getListTR(0,0, task.getId(),"01/01/2000","01/01/2100","tutti",true, false,"",task.dipendente);
									
	task.setlistTRL(trList);
						
	
	return task;
	
}



@Override
public ArrayList<ETaskCondiviso> getAllTask(Current __current) {
	// TODO Auto-generated method stub
	try{
	foundation.ETask foundationTask[] = foundation.ETaskDAO.listETaskByQuery(null, null);
	
	ArrayList<ETaskCondiviso> list = new ArrayList<ETaskCondiviso>();
	
	for(int j = 0; j < foundationTask.length; j++)
	{
			
		list.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationTask[j])); 
	}
	return list;
	
	}

	catch (Exception e) {
	e.printStackTrace();
	}
	return null;
}



@Override
public ArrayList<ESottoprogettoCondiviso>getAllSp(EManagerCondiviso manager,
		Current __current) {
	// TODO Auto-generated method stub
	
	try{
		foundation.ESottoprogetto foundationSottoprogetto[]=foundation.ESottoprogettoDAO.listESottoprogettoByQuery(null,null);
		
		ArrayList<ESottoprogettoCondiviso> list = new ArrayList<ESottoprogettoCondiviso>();	
		
		for (int i = 0; i < foundationSottoprogetto.length; i++) 
		{ 
			if(foundationSottoprogetto[i].geteDipendente().getID()==manager.getId())
			 	list.add((ESottoprogettoCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationSottoprogetto[i])); 
		}
		
		return list;
		}
	
		catch (Exception e) {
		e.printStackTrace();
		}
		return null;
}



@Override
public void eliminaAttivita(EAttivitaCondivisa attivita, Current __current) {
	// TODO Auto-generated method stub
	
	if(attivita.getClass().toString().equals(EProgettoCondivisoImp.class.toString()))
	{
		//elimina progetto,sottoprogetti,task,etask_dipendente,tariffa
		Services.eliminaProgetto((EProgettoCondivisoImp) attivita);
		
	}
	
	if(attivita.getClass().toString().equals(ESottoprogettoCondivisoImp.class.toString()))
	{
		//elimina sottoprogetto e i suoi task 
	}
	
	if(attivita.getClass().toString().equals(ETaskCondivisoImp.class.toString()))
	{
		//
	}

	
	
	
}


	
	
}
