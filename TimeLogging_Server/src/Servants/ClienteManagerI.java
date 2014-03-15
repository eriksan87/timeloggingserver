package Servants;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import foundation.ECliente;
import foundation.EClienteDAO;
import foundation.EDipendente;
import foundation.EDipendenteDAO;
import foundation.EProgetto;

import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.InterfacceCondivise._ClienteManagerDisp;
import Ice.Current;
import Mapper.EntityMappersFactory;
import Services.Services;

public class ClienteManagerI extends _ClienteManagerDisp{

	@Override
	public void createCliente(EClienteCondiviso cliente, Current __current) {
		// TODO Auto-generated method stub		
		
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			try {
				ECliente ecliente=(ECliente) EntityMappersFactory.getInstance().IceToHibernateFactory(cliente);
				EClienteDAO.save(ecliente);
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
	public void UpdateCliente(EClienteCondiviso cliente, Current __current) {
		// TODO Auto-generated method stub
	
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			try {
				foundation.ECliente lfoundationECliente = foundation.EClienteDAO.loadEClienteByQuery("ID="+cliente.id, null);
				lfoundationECliente.setNome(cliente.nome);
				lfoundationECliente.setCognome(cliente.cognome);
				lfoundationECliente.setIndirizzo(cliente.indirizzo);
				foundation.EClienteDAO.save(lfoundationECliente);
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
	public ArrayList<EClienteCondiviso> getListClienti(Current __current) {
		// TODO Auto-generated method stub
		try{
		foundation.ECliente[] foundationECliente = foundation.EClienteDAO.listEClienteByQuery(null, null);
		//adesso passo da hibernate a ice
		ArrayList<EClienteCondiviso> list = new ArrayList<EClienteCondiviso>();	
		for (int i = 0; i < foundationECliente.length; i++) { 
			list.add((EClienteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationECliente[i])); 
			
		} 
		return list;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return null;
	}
	
	

	@Override
	public int deleteCliente(EClienteCondiviso cliente, Current __current) {
		// TODO Auto-generated method stub
		try {
			PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
			try {
				//controllo prima se il cliente è associato ad un progetto
				if( foundation.EProgettoDAO.listEProgettoByQuery("EClienteID="+cliente.id,null).length>0)
				{
					return 1;
				}
				else{
				 foundation.ECliente lfoundationECliente = foundation.EClienteDAO.loadEClienteByQuery("ID="+cliente.id, null);
				 foundation.EClienteDAO.delete(lfoundationECliente);
				t.commit();
				}
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

	
}
