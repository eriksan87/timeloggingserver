package EntityNonCondivise;

import java.util.ArrayList;
import java.util.Iterator;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import EntityCondivise.EConsulenteCondivisoImp;

public class Sessione {

	private static Sessione istanza=null; //la sessione � singleton
	private ArrayList<EDipendenteCondiviso> elencoLoggati;
	
	protected Sessione()
	{   
		elencoLoggati = new ArrayList<EDipendenteCondiviso>();
	}
	
	
	public void aggiungiLoggato(EDipendenteCondiviso dipendente)
	{
		elencoLoggati.add(dipendente);
	}
	
	
	
	public static Sessione getIstance()
	{
		if(istanza==null)
		{
			istanza= new Sessione();
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
