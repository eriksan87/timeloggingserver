package EntityNonCondivise;

import java.util.ArrayList;
import java.util.Iterator;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import EntityCondivise.EConsulenteCondivisoImp;

public class SessionHandler {

	private static SessionHandler istanza=null; //la sessione è singleton
	private ArrayList<EDipendenteCondiviso> elencoLoggati;
	
	protected SessionHandler()
	{   
		elencoLoggati = new ArrayList<EDipendenteCondiviso>();
	}
	
	
	public void aggiungiLoggato(EDipendenteCondiviso dipendente)
	{
		elencoLoggati.add(dipendente);
	}
	
	
	
	public static SessionHandler getIstance()
	{
		if(istanza==null)
		{
			istanza= new SessionHandler();
		}
		 return istanza;
	}
	
	public boolean checkGiaLoggato(String username)
	{	
		for(int i=0;i<elencoLoggati.size();i++)
		{
			if(elencoLoggati.get(i).getUsername().equals(username))
			{
				return true;
			}
		}
		
	  return false;	
	}
	
	
	public EDipendenteCondiviso getIdentitaDipendente(int id)
	{  
		for(int i=0;i<elencoLoggati.size();i++)
		{
			if(elencoLoggati.get(i).getId()==id)
			{
				return elencoLoggati.get(i) ;
			}
		}
		return null;	
	}
	
	public void sessionDestroy(int id) { 
		
		for(int i=0;i<elencoLoggati.size();i++)
		{
			if(elencoLoggati.get(i).getId()==id)
			{
			 elencoLoggati.remove(i);
			}
		}
	}		
		
}
