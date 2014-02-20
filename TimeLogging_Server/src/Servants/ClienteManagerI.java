package Servants;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import foundation.ECliente;
import foundation.EProgetto;

import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.InterfacceCondivise._ClienteManagerDisp;
import Ice.Current;
import Mapper.EntityMappersFactory;
import Services.Services;

public class ClienteManagerI extends _ClienteManagerDisp{

	@Override
	public void createCliente(String nome, String cognome, String indirizzo,
			Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateCliente(EClienteCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
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
	public void deleteCliente(EClienteCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
	}

}
