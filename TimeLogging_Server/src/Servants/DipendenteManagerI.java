package Servants;

import java.util.ArrayList;

import org.orm.PersistentTransaction;

import foundation.EDipendente;
import foundation.EDipendenteDAO;
import foundation.ESottoprogetto;

import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.InterfacceCondivise._DipendenteManagerDisp;
import EntityCondivise.EConsulenteCondivisoImp;
import EntityCondivise.EManagerCondivisoImp;
import EntityCondivise.EProgettoCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.ETaskCondivisoImp;
import Ice.Current;
import Mapper.EntityMappersFactory;

public class DipendenteManagerI extends _DipendenteManagerDisp {

	@Override
	public void createDipendente(EDipendenteCondiviso dipendente,
			Current __current) {
		// TODO Auto-generated method stub
		
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			try {
				EDipendente econsulente=(EDipendente) EntityMappersFactory.getInstance().IceToHibernateFactory(dipendente);
				EDipendenteDAO.save(econsulente);
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
	public int UpdateDipendente(EDipendenteCondiviso dipendente,
			Current __current) {
		// TODO Auto-generated method stub
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			try {
				
				foundation.EDipendente lfoundationEDipendente = foundation.EDipendenteDAO.loadEDipendenteByQuery("ID="+dipendente.id, null);
				
				/* se il dipendente è un consulente ed il tag del suo id nel DB è diverso da consulente 
				 * (quindi è un manager), allora controllo se ha qualche sottoprogetto associato
				 * ---> in questo caso return 1
				 */
				
				if(((dipendente.getClass().toString().equals(EConsulenteCondivisoImp.class.toString())))&& (lfoundationEDipendente.getTag().equals("manager") )  )
				{
					if(foundation.ESottoprogettoDAO.listESottoprogettoByQuery("EDipendenteID="+dipendente.id, null).length>0)
						return 1;
					lfoundationEDipendente.setTag("consulente");
					
				}
				/*
				 *se il dipendente è un manager ed il tag del suo id è diverso da manager 
				 *(quindi consulente), allora controllo se il consulente ha qualche task
				 *associato ad esso 
				 * */	
				if(((dipendente.getClass().toString().equals(EManagerCondivisoImp.class.toString())))&& (lfoundationEDipendente.getTag().equals("consulente") )  )
				{
					if((foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery("EDipendenteID="+dipendente.id, null).length>0))
						return 1;
					lfoundationEDipendente.setTag("manager");
				}
				
				
				
				lfoundationEDipendente.setAnzianita(Integer.toString(dipendente.anzianita));
				lfoundationEDipendente.setCognome(dipendente.cognome);
				lfoundationEDipendente.setFig_professionale(dipendente.figProfessionale);
				lfoundationEDipendente.setIndirizzo(dipendente.indirizzo);
				lfoundationEDipendente.setNome(dipendente.nome);
				lfoundationEDipendente.setPaga_base(dipendente.pagaBase);
				lfoundationEDipendente.setPassword(dipendente.password);
				lfoundationEDipendente.setUsername(dipendente.username);
				foundation.EDipendenteDAO.save(lfoundationEDipendente);
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
		return 0;
	}

	@Override
	public int deleteDipendente(EDipendenteCondiviso dipendente,
			Current __current) {
		// TODO Auto-generated method stub
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			try {
				//controllo se un consulente non è associato ad un task oppure se un manager non è associato ad un sottoprogetto
				if((foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery("EDipendenteID="+dipendente.id, null).length>0)||(foundation.ESottoprogettoDAO.listESottoprogettoByQuery("EDipendenteID="+dipendente.id, null).length>0)||(foundation.ETimeRecordNLDAO.listETimeRecordNLByQuery("EDipendenteID="+dipendente.id, null).length>0))
					return 1;
			
				foundation.EDipendente lfoundationEDipendente = foundation.EDipendenteDAO.loadEDipendenteByQuery("ID="+dipendente.id, null);
				foundation.EDipendenteDAO.delete(lfoundationEDipendente);
				
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
		
		return 0;	
	}
	
	//il seguente metodo restituisce una lista di consulenti per manager o per admin  
	@Override
	public ArrayList<EConsulenteCondiviso> getListConsulenti(
			EDipendenteCondiviso dipendente, Current __current) {
		
		ArrayList<EConsulenteCondiviso> listC = new ArrayList<EConsulenteCondiviso>(); //array di consulenti
		
		if((dipendente.getTag().toString().equals("manager")) ){
		try{
			foundation.ESottoprogetto foundationSP[]=foundation.ESottoprogettoDAO.listESottoprogettoByQuery(null,null);
			foundation.ETask foundationT[]=foundation.ETaskDAO.listETaskByQuery(null,null);
			//lista dei task dei sottoprogetti appartenenti al manager
			ArrayList<ETaskCondiviso> listT = new ArrayList<ETaskCondiviso>(); 	
			
			for (int i = 0; i < foundationSP.length; i++) 
			{ 
				//se il manager che ha il task i-esimo è ugauale al manager che gli è stato passato
				if (foundationSP[i].geteDipendente().getID()==dipendente.id)
				{ 
					for(int j = 0; j < foundationT.length; j++)
					{
						//qui vado a prendere la lista dei task del sottoprogetto appartenenti al manager
						if(foundationT[j].geteSottoprogetto().getID()==foundationSP[i].getID())
							listT.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationT[j])); 
					}		
				}
			}
			
		    // Adesso scorro la lista dei task ListT per prendermi i consulenti ed inserirli nella ListC
			for(int k=0;k<listT.size();k++)
			{
				if (listC.isEmpty())
					listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
				
			else
				{ //Se nella lista non ci sono duplicati allora inserisco i dipendenti
					boolean trovato=false;
					for(int z=0; z<listC.size(); z++)
					{
						if( listC.get(z).getId()==listT.get(k).getDipendente().getId())
						  	trovato=true;
					}
					if (!trovato) 
					{   
						listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
					}
				}
			}
			return listC;
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		}
		
		else if (dipendente.getTag().toString().equals("admin"))
		{
			try{
					
				foundation.EDipendente foundationEDip[]=foundation.EDipendenteDAO.listEDipendenteByQuery(null, null);
				
				for(int k=0;k<foundationEDip.length;k++)
				{
					if(foundationEDip[k].getTag().toString().equals("consulente"))
						listC.add((EConsulenteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationEDip[k]));
				}
				return listC;
				}
				catch (Exception e) {
				e.printStackTrace();
				}
			
		  }
		
		return null;
	}
	

	
	@Override
	public ArrayList<EManagerCondiviso> getListManager(Current __current) {
		// TODO Auto-generated method stub
		try{
			foundation.EDipendente[] foundationEManager = foundation.EDipendenteDAO.listEDipendenteByQuery(null, null);
			//adesso passo da hibernate a ice
			ArrayList<EManagerCondiviso> list = new ArrayList<EManagerCondiviso>();	
			for (int i = 0; i < foundationEManager.length; i++) { 
				if(foundationEManager[i].getTag().equals("manager"))
					list.add((EManagerCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationEManager[i])); 
			} 
			
			return list;
			}
		
			catch (Exception e) {
			e.printStackTrace();
			
			}
			return null;
	}

	@Override
	public ArrayList<EDipendenteCondiviso> getListDipendentiAttivita(
			EAttivitaCondivisa attivita, Current __current) {
		// TODO Auto-generated method stub				
		ArrayList<EConsulenteCondiviso> listC = new ArrayList<EConsulenteCondiviso>(); //array di consulenti
		ArrayList<EManagerCondiviso> listM = new ArrayList<EManagerCondiviso>(); //array di consulenti
		ArrayList<EDipendenteCondiviso> listDipendenti = new ArrayList<EDipendenteCondiviso>(); //array di Dipendenti
		ArrayList<ETaskCondiviso> listT = new ArrayList<ETaskCondiviso>(); //lista task dal quale mi riprendo i dipendenti 
		
		
		//controllo se l'attività è diversa dal task
		  try{
			  	if(!attivita.getClass().toString().equals(ETaskCondivisoImp.class.toString()))
			  	{
					  	ESottoprogetto[] foundationSP=null;
						if(attivita.getClass().toString().equals(EProgettoCondivisoImp.class.toString()))
							{	
							foundationSP=foundation.ESottoprogettoDAO.listESottoprogettoByQuery("EProgettoID="+attivita.id,null);
							}
						if(attivita.getClass().toString().equals(ESottoprogettoCondivisoImp.class.toString()))
						{
							foundationSP=foundation.ESottoprogettoDAO.listESottoprogettoByQuery("ID="+attivita.id,null);
						}
						
						//lista dei task dei sottoprogetti appartenenti al manager		
						for (int i = 0; i < foundationSP.length; i++) 
						{  // riprendo i sottoprogetti del progetto interessato e poi lo trasformo in una classe software  
							foundation.ETask foundationT[]=foundation.ETaskDAO.listETaskByQuery("ESottoprogettoID="+foundationSP[i].getID(),null);
							ESottoprogettoCondiviso sp=(ESottoprogettoCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationSP[i]);
							//prendo i task del sottoprogetto
							for(int j = 0; j < foundationT.length; j++)
								{
									listT.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationT[j])); 
								}	
							//qui vado a riempire la lista di manager
							if (listM.isEmpty())
							{	
								listM.add((EManagerCondiviso) sp.getDipendente());
							}
							else
							{ //Se nella lista non ci sono duplicati allora inserisco i dipendenti
								boolean trovato=false;
								for(int z=0; z<listM.size(); z++)
								{
									if( listM.get(z).getId()==sp.getDipendente().getId())
									  	trovato=true;
								}
								if (!trovato) 
								{   
									listM.add((EManagerCondiviso) sp.getDipendente());
								}
							}		
						}
						// Adesso scorro la lista dei task ListT per prendermi i consulenti ed inserirli nella ListC
						for(int k=0;k<listT.size();k++)
						{
							
							if (listC.isEmpty())
								listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
							
						else
							{ //Se nella lista non ci sono duplicati allora inserisco i dipendenti
								boolean trovato=false;
								for(int z=0; z<listC.size(); z++)
								{
									if( listC.get(z).getId()==listT.get(k).getDipendente().getId())
									  	trovato=true;
								}
								if (!trovato) 
								{   
									listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
								}
							}
						}
		  	}
			  	
		  else // se l'attività è un task 
		  {
			  foundation.EDipendente_ETask foundationEDT[]= foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery("ETaskID="+attivita.id, null);
			 
			  //prendo i task del sottoprogetto
				
			/*  for(int j = 0; j < foundationT.length; j++)
					{
						listT.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationT[j])); 
					}	
			*/
			  for(int k=0;k<foundationEDT.length;k++)
				{
					if (listC.isEmpty())
						listC.add((EConsulenteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationEDT[k].getEdipendente()) );
					
					else
					{ //Se nella lista non ci sono duplicati allora inserisco i dipendenti
						boolean trovato=false;
						for(int z=0; z<listC.size(); z++)
						{
							if( listC.get(z).getId()==listT.get(k).getDipendente().getId())
							  	trovato=true;
						}
						if (!trovato) 
						{   
							listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
						}
					}
				}
		  }
								
		  }
			catch (Exception e) {
			e.printStackTrace();
			}
		
		listDipendenti.addAll(listM);
		listDipendenti.addAll(listC);
 		return listDipendenti;

	}

	@Override
	public ArrayList<EDipendenteCondiviso> getListAllDipendenti(
			Current __current) {
		// TODO Auto-generated method stub
		try{
			foundation.EDipendente[] foundationED = foundation.EDipendenteDAO.listEDipendenteByQuery(null, null);
			//adesso passo da hibernate a ice
			ArrayList<EDipendenteCondiviso> list = new ArrayList<EDipendenteCondiviso>();	
			for (int i = 0; i < foundationED.length; i++) { 
				
					list.add((EDipendenteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationED[i])); 
			} 
			
			return list;
			}
		
			catch (Exception e) {
			e.printStackTrace();
			
			}
			return null;
	}


}
