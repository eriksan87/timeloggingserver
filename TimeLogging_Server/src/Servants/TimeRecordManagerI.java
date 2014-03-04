package Servants;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;


import org.orm.PersistentException;

import org.orm.PersistentTransaction;



import foundation.ETariffa;
import foundation.ETask;
import foundation.ETaskCriteria;
import foundation.ETimeRecordLavorativo;
import foundation.ETimeRecordLavorativoDAO;
import foundation.ETimeRecordNL;
import foundation.ETimeRecordNLDAO;


import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETariffaCondivisa;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.ETimeRecordCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import Condivisione.InterfacceCondivise._TimeRecordManagerDisp;


import Condivisione.EntityCondivise.ETimeRecordLavorativoCondiviso;
import Condivisione.EntityCondivise.ETimeRecordNonLavorativoCondiviso;
import EntityCondivise.ETimeRecordNonLavorativoCondivisoImp;
import EntityCondivise.ETimeRecordLavorativoCondivisoImp;
import Ice.Current;

import Mapper.EntityMappersFactory;
import Services.Services;

//import root.TLAppServer;

public class TimeRecordManagerI extends  _TimeRecordManagerDisp {

		
	@Override
	public int save(ETimeRecordCondiviso tr, Current __current) {
		// TODO Auto-generated method stub
		
		int cod=0;
		
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			System.out.println(tr.getId());	
			
			ETimeRecordCondiviso timeR=null;
			ArrayList<ETimeRecordLavorativo> foundationETRL = null;
			ETimeRecordNL[] foundationETRNL = null;
			
						
						try {
							foundationETRL = Services.queryTRDipendente(tr.getConsulente().getId(), tr.getId());
					
							if (tr.getId()==0)
							foundationETRNL = foundation.ETimeRecordNLDAO.listETimeRecordNLByQuery("EDipendenteID="+tr.getConsulente().getId(), null);
							else
							foundationETRNL = foundation.ETimeRecordNLDAO.listETimeRecordNLByQuery("EDipendenteID="+tr.getConsulente().getId()+" and ID <> "+tr.getId(), null);	
						
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
						for (int i = 0; i < foundationETRL.size(); i++) {
							timeR= (ETimeRecordCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationETRL.get(i));	
							if ( 
									//meet e meet(-1)
									 ( (tr.fine.equals(timeR.inizio)) || (timeR.fine.equals(tr.inizio)) ) ||
									//during e during (-1)
									 ( ( (timeR.inizio.before(tr.inizio)) && (tr.fine.before(timeR.fine)) ) || ( (tr.inizio.before(timeR.inizio)) && (timeR.fine.before(tr.fine)) ) ) ||
									// equals
									 ( (tr.inizio.equals(timeR.inizio)) && (tr.fine.equals(timeR.fine)) ) || 
									// start e start(-1)
									 ( ((tr.inizio.equals(timeR.inizio)) && (tr.fine.before(timeR.fine)) ) || ( (timeR.inizio.equals(tr.inizio)) && (timeR.fine.before(tr.fine)) ) ) ||
									// finishes e finishes(-1)
									 ( ((tr.fine.equals(timeR.fine)) && (tr.inizio.after(timeR.inizio)) ) || ( (timeR.fine.equals(tr.fine)) && (timeR.inizio.after(tr.inizio)) ) ) ||
									// overlap
									 (  ( (tr.inizio.before(timeR.inizio)) && (tr.fine.before(timeR.fine)) &&  (timeR.inizio.before(tr.fine)) ) || ( (tr.inizio.before(timeR.inizio)) && (timeR.inizio.before(tr.fine)) ) || ( (tr.inizio.before(timeR.fine)) && (timeR.inizio.before(tr.fine)) ) ) ||
									// overlap(-1)
									 (  ( (timeR.inizio.before(tr.inizio)) && (timeR.fine.before(tr.fine)) &&  (tr.inizio.before(timeR.fine)) ) || ( (timeR.inizio.before(tr.inizio)) && (tr.inizio.before(timeR.fine)) ) || ( (timeR.inizio.before(tr.fine)) && (tr.inizio.before(timeR.fine)) ) ) 
									 
								)
								
								cod=-1;
						}	
						
						for (int i = 0; i < foundationETRNL.length; i++) {
							timeR= (ETimeRecordCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationETRNL[i]);	
							if ( 
									//meet e meet(-1)
									 ( (tr.fine.equals(timeR.inizio)) || (timeR.fine.equals(tr.inizio)) ) ||
									//during e during (-1)
									 ( ( (timeR.inizio.before(tr.inizio)) && (tr.fine.before(timeR.fine)) ) || ( (tr.inizio.before(timeR.inizio)) && (timeR.fine.before(tr.fine)) ) ) ||
									// equals
									 ( (tr.inizio.equals(timeR.inizio)) && (tr.fine.equals(timeR.fine)) ) || 
									// start e start(-1)
									 ( ((tr.inizio.equals(timeR.inizio)) && (tr.fine.before(timeR.fine)) ) || ( (timeR.inizio.equals(tr.inizio)) && (timeR.fine.before(tr.fine)) ) ) ||
									// finishes e finishes(-1)
									 ( ((tr.fine.equals(timeR.fine)) && (tr.inizio.after(timeR.inizio)) ) || ( (timeR.fine.equals(tr.fine)) && (timeR.inizio.after(tr.inizio)) ) ) ||
									// overlap
									 (  ( (tr.inizio.before(timeR.inizio)) && (tr.fine.before(timeR.fine)) &&  (timeR.inizio.before(tr.fine)) ) || ( (tr.inizio.before(timeR.inizio)) && (timeR.inizio.before(tr.fine)) ) || ( (tr.inizio.before(timeR.fine)) && (timeR.inizio.before(tr.fine)) ) ) ||
									// overlap(-1)
									 (  ( (timeR.inizio.before(tr.inizio)) && (timeR.fine.before(tr.fine)) &&  (tr.inizio.before(timeR.fine)) ) || ( (timeR.inizio.before(tr.inizio)) && (tr.inizio.before(timeR.fine)) ) || ( (timeR.inizio.before(tr.fine)) && (tr.inizio.before(timeR.fine)) ) ) 
									 
								)
								cod=-1;
						}
			
			if (cod!=-1)// se da errore allora cod=-1 per cui il
			{
			try {
				
				if(tr.getClass().toString().equals(ETimeRecordLavorativoCondivisoImp.class.toString()))
				{
					//INSERIMENTO NUOVO TIME RECORD; controllo se è -1 per l'inserimento del trl a posteriore
					if (tr.getId()==0) 
						{		
						ETimeRecordLavorativo eTRL=(ETimeRecordLavorativo) EntityMappersFactory.getInstance().IceToHibernateFactory(tr);
						
						ETimeRecordLavorativoDAO.save(eTRL);
						ETimeRecordLavorativo[] foundationETimeRecordLavorativo = null;
						ETimeRecordLavorativo TimeR= null;
							try {
								foundationETimeRecordLavorativo = foundation.ETimeRecordLavorativoDAO.listETimeRecordLavorativoByQuery("ETaskID='"+((ETimeRecordLavorativoCondivisoImp) tr).getETaskCondiviso().getId()+"'", null);
							} catch (PersistentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						int size= foundationETimeRecordLavorativo.length;
						TimeR= foundationETimeRecordLavorativo[size-1];			
						cod=TimeR.getID();
						}
					else { //MODIFICA TIME RECORD
						try {
							
							//System.out.println("Fine"+tr.getFine());
							//System.out.println(tr.getFine());
							ETimeRecordLavorativo	etrl = (ETimeRecordLavorativo) foundation.TimeLoggingPersistentManager.instance().getSession().get(ETimeRecordLavorativo.class, tr.getId());
							//System.out.println("prova1");
							ETaskCondiviso taskcondiviso=((ETimeRecordLavorativoCondiviso)tr).getETaskCondiviso();
									//( ((ETimeRecordLavorativoCondiviso)tr).getETaskCondiviso());
							
							//System.out.println("il dipendente è: "+ ((ETimeRecordLavorativoCondiviso)tr).getETaskCondiviso().getDipendente().getNome());
							
							//System.out.println("il task condiviso è: "+ taskcondiviso.getDescrizione());
							//System.out.println("il padre del task condiviso è: "+ taskcondiviso.getPadre().getId());
							//System.out.println("");
							
							//ETask etask= (ETask) EntityMappersFactory.getInstance().IceToHibernateFactory(taskcondiviso);
							
							ETask etask= null;
							ETaskCriteria eCriteriat= new ETaskCriteria();
							eCriteriat.ID.eq(((ETimeRecordLavorativoCondiviso)tr).getETaskCondiviso().getId());
							etask=eCriteriat.uniqueETask();
							
							//System.out.println("prova2");
							etrl.setFine(tr.getFine());
							etrl.setCommento(tr.getCommento()); // sull'aggiornamento inserisco anche i commenti
							etrl.setInizio(tr.getInizio());
							etrl.seteTask(etask);
							
						
						}
						catch (HibernateException e) { // questo primo catch può essere anche evitato (da vedere meglio)
							foundation.TimeLoggingPersistentManager.instance().getSession().getTransaction().rollback();
							e.printStackTrace();
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						cod=tr.getId();
	
					}
										
				}
				
				else if(tr.getClass().toString().equals(ETimeRecordNonLavorativoCondivisoImp.class.toString()))
				{
					
					/*  qui devo fare il controllo se è un time record non lavorativo nuovo e quindi controllare
					    l'id, altrimenti fare lo stesso discorso di sopra*/
					if (tr.getId()==0) 
					{
					ETimeRecordNL eTRNL = (ETimeRecordNL) EntityMappersFactory.getInstance().IceToHibernateFactory(tr);
					ETimeRecordNLDAO.save(eTRNL);
					}
					else
					{
						try {
							
							ETimeRecordNL	etrnl = (ETimeRecordNL) foundation.TimeLoggingPersistentManager.instance().getSession().get(ETimeRecordNL.class, tr.getId());
							etrnl.setFine(tr.getFine());
							etrnl.setCommento(tr.getCommento()); // sull'aggiornamento inserisco anche i commenti
							etrnl.setInizio(tr.getInizio());
							etrnl.setCategoria(( (ETimeRecordNonLavorativoCondiviso)tr).getCategoria());
							System.out.println("categoria"+( (ETimeRecordNonLavorativoCondiviso)tr).getCategoria());
						
						}
						catch (HibernateException e) { // questo primo catch può essere anche evitato (da vedere meglio)
							foundation.TimeLoggingPersistentManager.instance().getSession().getTransaction().rollback();
							e.printStackTrace();
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();}	
						
					}
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
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return cod;
		
	}
	
	


	@Override
	public ArrayList<ETimeRecordCondiviso> getListTR(int idprogetto,
			int idsottoprogetto, int idtask, String dal, String al,
			String ultimi, boolean lavorativo, boolean nonlavorativo,String categoria, EDipendenteCondiviso dipendente,Current __current) {
		
		ETimeRecordCondiviso t=null;
		List<ETimeRecordLavorativo> array = new ArrayList<ETimeRecordLavorativo>();
		List<ETimeRecordNL> array2 = new ArrayList<ETimeRecordNL>();
		if(lavorativo){
			array=Services.timerecordLavorativoDipendente(idprogetto,idsottoprogetto,idtask,dal,al,dipendente);
			
		}
		
		if(nonlavorativo){
			if(Services.timerecordNLDipendente(dal,al,categoria,dipendente)!=null){
			array2=Services.timerecordNLDipendente(dal,al,categoria,dipendente);
			}
		}
		
		int ult=0;
		if(ultimi.equals("tutti"))
			{
			ult = array.size()+array2.size();
			
			}
		else
			ult = Integer.parseInt(ultimi);
		
		System.out.println(ult);
		
		ArrayList<ETimeRecordCondiviso> list=new ArrayList<ETimeRecordCondiviso>();
		int i=0;
		int j=0;
		
		while(i<array.size() && j<array2.size() && ult!=i+j)
		{
				
				if(array.get(i).getInizio().after(array2.get(j).getInizio())){
					t=(ETimeRecordCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(array.get(i));
					i++;
					}
				else{
					t=(ETimeRecordCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(array2.get(j));
					j++;
									
				}
				
			list.add(t);
		}
		
		System.out.println(list.size());
		
		if(list.size()!=ult){
			if(i==array.size()){
						
					if (array2.size()<j+ult-list.size()){
						array2= array2.subList(j, array2.size()); //j+ult-list.size()
					}
					else
					{
						array2= array2.subList(j, j+ult-list.size()); //
					}
						for(int k=0;k<array2.size();k++){
							
							t=(ETimeRecordCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(array2.get(k));
							list.add(t);
						}
					
			}
			else{
				System.out.println("ciao2");
				if (array.size()<i+ult-list.size()){
					array=array.subList(i,  array.size()); //i+ult-list.size()
				}
				else {
					array=array.subList(i, i+ult-list.size()); }
					
					for(int k=0;k<array.size();k++){
						t=(ETimeRecordCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(array.get(k));
						list.add(t);
						
					}
			}
		}
		
		return list;
		
	}

	@Override
	public void elimina(ETimeRecordCondiviso tr, Current __current) {
		// TODO Auto-generated method stub
		
		if(tr.getClass().toString().equals(ETimeRecordLavorativoCondivisoImp.class.toString()))
		{
			ETimeRecordLavorativo eTimeRecordLavorativo = null;
			
			try {
				eTimeRecordLavorativo = ETimeRecordLavorativoDAO.loadETimeRecordLavorativoByQuery("ID="+tr.id, null);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Delete the persistent object
			try {
				foundation.ETimeRecordLavorativoDAO.delete(eTimeRecordLavorativo);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else
		{
			ETimeRecordNL eTimeRecordNL = null;
			
			try {
				eTimeRecordNL = ETimeRecordNLDAO.loadETimeRecordNLByQuery("ID="+tr.id, null);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Delete the persistent object
			try {
				foundation.ETimeRecordNLDAO.delete(eTimeRecordNL);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}

}
