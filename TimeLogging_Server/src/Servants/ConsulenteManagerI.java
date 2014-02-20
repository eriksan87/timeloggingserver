package Servants;

import java.util.ArrayList;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.InterfacceCondivise._ConsulenteManagerDisp;
import Ice.Current;
import Mapper.EntityMappersFactory;



public class ConsulenteManagerI extends _ConsulenteManagerDisp {

	@Override
	public void createConsulente(String nome, String cognome, String indirizzo,
			Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateConsulente(EConsulenteCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<EConsulenteCondiviso> getListConsulenti(Current __current) {
		// TODO Auto-generated method stub
		
		
		
		try{
			foundation.EDipendente[] foundationEConsulente = foundation.EDipendenteDAO.listEDipendenteByQuery(null, null);
			//adesso passo da hibernate a ice
			ArrayList<EConsulenteCondiviso> list = new ArrayList<EConsulenteCondiviso>();	
			for (int i = 0; i < foundationEConsulente.length; i++) { 
				if(foundationEConsulente[i].getTag().equals("consulente"))
					list.add((EConsulenteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationEConsulente[i])); 
			} 
			return list;
			}
		
			catch (Exception e) {
			e.printStackTrace();
			}
			return null;
	}

	@Override
	public void deleteConsulente(EConsulenteCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
	}

}
