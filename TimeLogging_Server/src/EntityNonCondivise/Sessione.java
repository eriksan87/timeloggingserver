package EntityNonCondivise;

import java.util.HashMap;
import java.util.Iterator;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import EntityCondivise.EConsulenteCondivisoImp;

public class Sessione {

	private static Sessione istanza=null; //la sessione è singleton
	
	
	private HashMap<Integer,EDipendenteCondiviso> elencoLoggati;
	
	
	protected Sessione()
	{   
		
		EDipendenteCondiviso dip=new EConsulenteCondivisoImp();
		dip.setNome("Antonio");
		elencoLoggati=new HashMap<Integer,EDipendenteCondiviso>();
		elencoLoggati.put(1, dip);
	}
	
	
	public void aggiungiLoggato(EDipendenteCondiviso dipendente)
	{
		elencoLoggati.put(dipendente.getId(),dipendente);
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
		Iterator i=elencoLoggati.keySet().iterator();
		while(i.hasNext())
		{
		  int key= (Integer) i.next();
		  if(elencoLoggati.get(key).getNome().equals(username))
		  	{
			  return true;
		  	}
		}
	  return false;	
	}
	
	
	public EDipendenteCondiviso getIdentitaDipendente(int id)
	{
		return elencoLoggati.get(id);
	}
	
	public void sessionDestroy(int id) { elencoLoggati.remove(id); }
	
}
