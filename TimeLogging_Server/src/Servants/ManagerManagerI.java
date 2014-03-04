package Servants;

import java.util.ArrayList;

import foundation.EProgetto;

import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.InterfacceCondivise._ManagerManagerDisp;
import Ice.Current;
import Mapper.EntityMappersFactory;
import Services.Services;

public class ManagerManagerI extends _ManagerManagerDisp {

	@Override
	public void createManager(String nome, String cognome, String indirizzo,
			double pagaBase, String figProfessionale, int anzianita,
			String tag, String username, String password, Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateManager(EManagerCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
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
	public void deleteManager(EManagerCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ESottoprogettoCondiviso> getListSottoprogetti(
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

	

}
