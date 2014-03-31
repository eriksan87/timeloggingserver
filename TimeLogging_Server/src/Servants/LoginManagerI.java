package Servants;

import org.orm.PersistentException;

import Condivisione.EntityCondivise.EAdminCondiviso;
import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.InterfacceCondivise._LoginManagerDisp;
import EntityNonCondivise.SessionHandler;
import Ice.Current;
import Mapper.EntityMappersFactory;

public class LoginManagerI extends _LoginManagerDisp {

	@Override
	public int authenticationRequest(String username, String password,Current __current) {
		// TODO Auto-generated method stub
		
		//controllo e restituisco l'id dell'utente
		
		if(SessionHandler.getIstance().checkGiaLoggato(username))
		{
			
			return -2;
		}
		
		else{
		
		
             EDipendenteCondiviso dip=null;
		    
			foundation.EDipendente[] foundationEDipendente = null;
			
			
			try {
				foundationEDipendente = foundation.EDipendenteDAO.listEDipendenteByQuery("Username='"+username+"'"+" AND Password='"+password+"'", null);} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(foundationEDipendente.length==0)
				return -1;
			else
			{  
				dip=(EDipendenteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationEDipendente[0]);
				SessionHandler.getIstance().aggiungiLoggato(dip);
				return (dip.getId());
				
			}
			
			

		}	
		
	}

	@Override
	public EDipendenteCondiviso IdentityRequest(int id, Current __current) {
		// TODO Auto-generated method stub
		
		
		return SessionHandler.getIstance().getIdentitaDipendente(id);
	}

	@Override
	public void sessionDestroy(int id, Current __current) {
		// TODO Auto-generated method stub
		SessionHandler.getIstance().sessionDestroy(id); 
	}

}
