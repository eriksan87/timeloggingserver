package Servants;
import java.util.ArrayList;
import java.util.Calendar;


import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import foundation.EDipendente;
import foundation.EDipendenteCriteria;
import foundation.EDipendente_ETask;
import foundation.EDipendente_ETaskDAO;
import foundation.EProgetto;
import foundation.EProgettoDAO;
import foundation.EProroga;
import foundation.ESottoprogetto;
import foundation.ESottoprogettoDAO;
import foundation.ETariffa;
import foundation.ETariffaDAO;
import foundation.ETask;
import foundation.ETaskCriteria;
import foundation.ETaskDAO;
import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.ETimeRecordCondiviso;
import Condivisione.InterfacceCondivise._AttivitaManagerDisp;
import EntityCondivise.EProgettoCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.ETaskCondivisoImp;
import Ice.Current;
import Mapper.EntityMappersFactory;
import Services.Services;


public class AttivitaManagerI extends _AttivitaManagerDisp {
	@Override
	public void saveAttivita(EAttivitaCondivisa attivita, Current __current) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		java.util.Date now = calendar.getTime();
		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
		
		if(attivita.getId()==0){
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
					
					ETariffa etariffa=(ETariffa) EntityMappersFactory.getInstance().IceToHibernateFactory(((ETaskCondivisoImp)attivita).tariffe.get(0));
					etariffa.seteTask(etask);
					ETariffaDAO.save(etariffa);
					
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
	 
		else { //MODIFICA Attività 
			try {
				if(attivita.getClass().toString().equals(EProgettoCondivisoImp.class.toString()))//è un progetto
				{   
					
					foundation.EProgetto lfoundationEProgetto = foundation.EProgettoDAO.loadEProgettoByQuery("ID="+attivita.id, null);
					foundation.ECliente lfoundationECliente =foundation.EClienteDAO.loadEClienteByQuery("ID="+((EProgettoCondivisoImp)attivita).getEClienteCondiviso().getId(), null);
					foundation.EDipendente lfoundationEDipendete=foundation.EDipendenteDAO.loadEDipendenteByQuery("ID="+((EProgettoCondivisoImp)attivita).getDipendente().getId(),null);
					lfoundationEProgetto.setTitolo(attivita.getTitolo());
					lfoundationEProgetto.setBudget(attivita.getBudget());
					lfoundationEProgetto.setDescrizione(attivita.getDescrizione());
					lfoundationEProgetto.seteCliente(lfoundationECliente);
					lfoundationEProgetto.seteDipendente(lfoundationEDipendete);
					lfoundationEProgetto.setInizio(attivita.getInizio());
					if(lfoundationEProgetto.getScadenza().before(attivita.getScadenza()))
					{
						EProroga proroga= new EProroga();
						proroga.seteProgetto(lfoundationEProgetto);
						proroga.setFine(attivita.getScadenza());
						foundation.EProrogaDAO.save(proroga);
					}
						
					// Update the properties of the persistent object
					foundation.EProgettoDAO.save(lfoundationEProgetto);
				}
				if(attivita.getClass().toString().equals(ESottoprogettoCondivisoImp.class.toString()))
				{
					foundation.ESottoprogetto lfoundationESpttoprogetto = foundation.ESottoprogettoDAO.loadESottoprogettoByQuery("ID="+attivita.id, null);
					
					foundation.EProgetto lfoundationEProgetto = foundation.EProgettoDAO.loadEProgettoByQuery("ID="+attivita.getPadre().getId(), null);
					foundation.EDipendente lfoundationEDipendete=foundation.EDipendenteDAO.loadEDipendenteByQuery("ID="+attivita.getDipendente().getId(),null);
					
					lfoundationESpttoprogetto.setDescrizione(attivita.getDescrizione());
					lfoundationESpttoprogetto.setTitolo(attivita.getTitolo());
					lfoundationESpttoprogetto.setInizio(attivita.getInizio());
					lfoundationESpttoprogetto.setScadenza(attivita.getScadenza());
					lfoundationESpttoprogetto.seteDipendente(lfoundationEDipendete);
					lfoundationESpttoprogetto.seteProgetto(lfoundationEProgetto);
					lfoundationESpttoprogetto.setBudget(attivita.getBudget());
					
					foundation.ESottoprogettoDAO.save(lfoundationESpttoprogetto);
					
				}
				if(attivita.getClass().toString().equals(ETaskCondivisoImp.class.toString()))
				{
					
					foundation.ETask lfoundationETask = foundation.ETaskDAO.loadETaskByQuery("ID="+attivita.id, null);
					
					foundation.ESottoprogetto lfoundationESpttoprogetto = foundation.ESottoprogettoDAO.loadESottoprogettoByQuery("ID="+attivita.getPadre().getId(), null);
					lfoundationETask.setDescrizione(attivita.getDescrizione());
					lfoundationETask.setTitolo(attivita.getTitolo());
					lfoundationETask.setInizio(attivita.getInizio());
					lfoundationETask.setScadenza(attivita.getScadenza());
					lfoundationETask.seteSottoprogetto(lfoundationESpttoprogetto);
					foundation.ETaskDAO.save(lfoundationETask);
					
					//controllo nella tabella eDipentente_ETask se il task che ho modificato ha lo stesso dipendente 
					foundation.EDipendente_ETask[] foundationEDipendente_ETasks = foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery("ETaskID="+attivita.getId(), null);
					//prendo l'ultima riga della query che soddisfa le condizioni 
					foundation.EDipendente_ETask auxDT=	foundationEDipendente_ETasks[foundationEDipendente_ETasks.length-1];
					//controllo se è il dipendente del task passato dal client sia lo stesso di quello che risiede nel db
					if(auxDT.getEdipendente().getID()==attivita.getDipendente().getId())
					{
						// aggiorno solamente la data di fine
						foundation.EDipendente_ETask lfoundationEDT=foundation.EDipendente_ETaskDAO.loadEDipendente_ETaskByQuery("ID="+auxDT.getID(),null);
						lfoundationEDT.setFine(attivita.getScadenza());
						foundation.EDipendente_ETaskDAO.save(lfoundationEDT);
					}
					
					else 
					{
						/* 
						 * altrimenti inserisco una nuova riga nella tabella eDipentente_ETask 
						 * e al dipendete che prima aveva il task devo settargli la data di fine di oggi  
						 */
						EDipendente_ETask eDipentente_ETask=new EDipendente_ETask();
						
						EDipendenteCriteria eCriteriadip= new EDipendenteCriteria();
						eCriteriadip.ID.eq(attivita.getDipendente().id);
						EDipendente consulente=eCriteriadip.uniqueEDipendente();
						eDipentente_ETask.setEdipendente(consulente);
						
						ETaskCriteria eCriteriaTask= new  ETaskCriteria();
						eCriteriaTask.ID.eq(attivita.getId());
						eDipentente_ETask.setEtask(eCriteriaTask.uniqueETask());
						
						eDipentente_ETask.setInizio(currentTimestamp);
						eDipentente_ETask.setFine(attivita.getScadenza());
						
						EDipendente_ETaskDAO.save(eDipentente_ETask);
						
						// aggiorno solamente la data di fine del dipendete che prima aveva questo task
						foundation.EDipendente_ETask lfoundationEDT=foundation.EDipendente_ETaskDAO.loadEDipendente_ETaskByQuery("ID="+auxDT.getID(),null);
						lfoundationEDT.setFine(currentTimestamp);
						foundation.EDipendente_ETaskDAO.save(lfoundationEDT);
		
					}
					
					//adesso vado a controllare le tariffe
					foundation.ETariffa[] foundationETariffa = foundation.ETariffaDAO.listETariffaByQuery("ETaskID="+attivita.getId(), null);
					foundation.ETariffa lastTar=foundationETariffa[foundationETariffa.length-1];
					//se il prezzo della tariffa non è cambiato, comunque aggiorno il campo della data fine
					if( lastTar.getCosto()== (((ETaskCondivisoImp)attivita).tariffe.get(0).getImporto()) )
					{
						foundation.ETariffa lfoundationETar=foundation.ETariffaDAO.loadETariffaByQuery("ID="+lastTar.getID(),null);
						lfoundationETar.setFine(currentTimestamp);
						foundation.ETariffaDAO.save(lfoundationETar);
					}
					
					else
					{
						/*altrimenti inserisco una nuova riga nella tabella tariffa con riferimento al task che viene passato dal client
						 * e vado ad aggiornare la data di fine della tariffa che ho modoficato
						 */
						ETariffa eTariffa=new ETariffa();
						ETaskCriteria eCriteriaTask= new  ETaskCriteria();
						eCriteriaTask.ID.eq(attivita.getId());
						eTariffa.seteTask(eCriteriaTask.uniqueETask());
						eTariffa.setCosto(((ETaskCondivisoImp)attivita).tariffe.get(0).getImporto());
						eTariffa.setFine(eTariffa.geteTask().getScadenza());
						eTariffa.setInizio(currentTimestamp);
						ETariffaDAO.save(eTariffa);
						
						// aggiorno solamente la data di fine della  tariffa che prima aveva questo task
						foundation.ETariffa lfoundationET=foundation.ETariffaDAO.loadETariffaByQuery("ID="+lastTar.getID(),null);
						lfoundationET.setFine(currentTimestamp);
						foundation.ETariffaDAO.save(lfoundationET);
					
					}
						
				}
				
			}
			 catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
	EProgettoCondiviso p=new EProgettoCondivisoImp();
	try {
		PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
		try{
			foundation.EProgetto lfoundationEProgetto = foundation.EProgettoDAO.loadEProgettoByQuery("ID="+progetto.id, null);
			p=((EProgettoCondiviso)EntityMappersFactory.getInstance().HibernateToIceFactory(lfoundationEProgetto)); 
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
	ArrayList<ESottoprogettoCondiviso> sp=getListSottoProgetti(p.id,p.dipendente,false);
	for (int i=0;i<sp.size();i++)
	{
		p.getlistSp().add(getSottoprogetto((ESottoprogettoCondiviso) sp.get(i)));
		
	}
	return p;
	
}



@Override
public ESottoprogettoCondiviso getSottoprogetto(ESottoprogettoCondiviso sottoprogetto,
		Current __current) {
	// TODO Auto-generated method stub
	
	ESottoprogettoCondiviso sp=new ESottoprogettoCondivisoImp();
	try {
		PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
		try{
			foundation.ESottoprogetto lfoundationESottoprogetto = foundation.ESottoprogettoDAO.loadESottoprogettoByQuery("ID="+sottoprogetto.id, null);
			sp=((ESottoprogettoCondiviso)EntityMappersFactory.getInstance().HibernateToIceFactory(lfoundationESottoprogetto)); 
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
	
	
	

	ArrayList<ETaskCondiviso> task=getListTask(sp.id, false,sp.dipendente);
	sp.listTasks= new ArrayList<ETaskCondiviso>();
					
					for (int j=0;j<task.size();j++)
					{		
						sp.getlistTask().add(getTask((ETaskCondiviso) task.get(j)));	
					}
		
	return sp;
	
}


@Override
public ETaskCondiviso getTask(ETaskCondiviso task,
		Current __current) {
	// TODO Auto-generated method stub
	
	ETaskCondiviso Task=new ETaskCondivisoImp();
	try {
		PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
		try{
			foundation.ETask lfoundationETask = foundation.ETaskDAO.loadETaskByQuery("ID="+task.id, null);
			Task=((ETaskCondiviso)EntityMappersFactory.getInstance().HibernateToIceFactory(lfoundationETask)); 
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
	

	TimeRecordManagerI manager=new TimeRecordManagerI();
	Task.listTRL= new ArrayList<ETimeRecordCondiviso>();
	ArrayList<ETimeRecordCondiviso> trList=manager.getListTR(0,0, task.getId(),"01/01/2000","01/01/2100","tutti",true, false,"",task.dipendente);						
	Task.setlistTRL(trList);
	return Task;
	
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
		Services.eliminaSottoprogetto((ESottoprogettoCondivisoImp) attivita);
	}
	
	if(attivita.getClass().toString().equals(ETaskCondivisoImp.class.toString()))
	{
		Services.eliminaTask((ETaskCondivisoImp) attivita);
	}

	
	
	
}



@Override
public ArrayList<ETaskCondiviso> getListTaskConsulente(
		EConsulenteCondiviso consulente, Current __current) {
	// TODO Auto-generated method stub
	try{
		foundation.ETask foundationTask[] = foundation.ETaskDAO.listETaskByQuery(null, null);
		foundation.EDipendente_ETask foundationEDipTAsk[]=foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery(null,null);
		//adesso passo da hibernate a ice
		ArrayList<ETaskCondiviso> list = new ArrayList<ETaskCondiviso>();	
		
		for (int i = 0; i < foundationEDipTAsk.length; i++) 
		{ 
			if(foundationEDipTAsk[i].getEdipendente().getID()==consulente.getId())
			{ 
				for(int j = 0; j < foundationTask.length; j++)
				{
					if(foundationEDipTAsk[i].getEtask().getID()==foundationTask[j].getID())
						
						list.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationTask[j])); 
				}
			}
		}
		return list;
		}	
		catch (Exception e) {
		e.printStackTrace();
		}

	return null;
}



@Override
public ArrayList<ESottoprogettoCondiviso> getListSottoprogettiManager(
		EManagerCondiviso manager, Current __current) {
	// TODO Auto-generated method stub
	try{
		foundation.ESottoprogetto foundationSottoProgetto[] = foundation.ESottoprogettoDAO.listESottoprogettoByQuery(null, null);
		//adesso passo da hibernate a ice
		ArrayList<ESottoprogettoCondiviso> list = new ArrayList<ESottoprogettoCondiviso>();	
		for (int i = 0; i < foundationSottoProgetto.length; i++) { 
			if(foundationSottoProgetto[i].geteDipendente().getID()==manager.getId())
				list.add((ESottoprogettoCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationSottoProgetto[i])); 
		} 
		
		return list;
		}
	
		catch (Exception e) {
		e.printStackTrace();
		}
	
	return null;
}

@Override
public ArrayList<EProgettoCondiviso> getListProgettiClienti(
		EClienteCondiviso cliente, Current __current) {
	// TODO Auto-generated method stub
	try{
		foundation.EProgetto foundationProgetto[] = foundation.EProgettoDAO.listEProgettoByQuery(null, null);
		//adesso passo da hibernate a ice
		ArrayList<EProgettoCondiviso> list = new ArrayList<EProgettoCondiviso>();	
		for (int i = 0; i < foundationProgetto.length; i++) { 
			if(foundationProgetto[i].geteCliente().getID()==cliente.getId())
				list.add((EProgettoCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationProgetto[i])); 
		} 
		
		return list;
		}
	
		catch (Exception e) {
		e.printStackTrace();
		}
	
	return null;
}


	
	
}
