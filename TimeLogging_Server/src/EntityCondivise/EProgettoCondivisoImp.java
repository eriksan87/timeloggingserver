package EntityCondivise;
import java.sql.Timestamp;
import java.util.ArrayList;
import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import Ice.Current;
public class EProgettoCondivisoImp extends EProgettoCondiviso {
    
	
	
	public EProgettoCondivisoImp()
	{
		super();
	}
	
	 
	   public EProgettoCondivisoImp(int id, String titolo, String descrizione, double budget, java.sql.Timestamp inizio, java.sql.Timestamp scadenza, EDipendenteCondiviso dipendente, java.util.ArrayList<ESottoprogettoCondiviso> listaSp, EClienteCondiviso cliente, EAttivitaCondivisa padre,Timestamp[] proroghe)
	    {
	  
	       super(id, titolo, descrizione, budget, inizio, scadenza, dipendente, padre,0,cliente,listaSp,proroghe);
	        
	    }
	    
	@Override
	public void setId(int id, Current __current) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	@Override
	public void setEClienteCondiviso(EClienteCondiviso cliente,
			Current __current) {
		// TODO Auto-generated method stub
		this.cliente= cliente;
	}
	@Override
	public void setTitolo(String titolo, Current __current) {
		// TODO Auto-generated method stub
		this.titolo=titolo;
	}
	@Override
	public void setDescrizione(String descrizione, Current __current) {
		// TODO Auto-generated method stub
		this.descrizione=descrizione;
	}
	@Override
	public void setBudget(double budget, Current __current) {
		// TODO Auto-generated method stub
		this.budget=budget;
	}
	@Override
	public void setInizio(Timestamp inizio, Current __current) {
		// TODO Auto-generated method stub
		this.inizio=inizio;
	}
	@Override
	public void setScadenza(Timestamp scadenza, Current __current) {
		// TODO Auto-generated method stub
		this.scadenza=scadenza;
	}
	
	
	
	@Override
	public int getId(Current __current) {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public EClienteCondiviso getEClienteCondiviso(Current __current) {
		// TODO Auto-generated method stub
		return cliente;
	}
	@Override
	public String getTitolo(Current __current) {
		// TODO Auto-generated method stub
		return titolo;
	}
	@Override
	public String getDescrizione(Current __current) {
		// TODO Auto-generated method stub
		return descrizione;
	}
	@Override
	public double getBudget(Current __current) {
		// TODO Auto-generated method stub
		return budget;
	}
	@Override
	public Timestamp getInizio(Current __current) {
		// TODO Auto-generated method stub
		return inizio;
	}
	
	@Override
	public Timestamp getScadenza(Current __current) {
		// TODO Auto-generated method stub
		return scadenza;
	}
	@Override
	public void setDipendente(EDipendenteCondiviso dipendente, Current __current) {
		// TODO Auto-generated method stub
		this.dipendente=dipendente;
	}
	@Override
	public EDipendenteCondiviso getDipendente(Current __current) {
		// TODO Auto-generated method stub
		return dipendente;
	}
	@Override
	public ESottoprogettoCondiviso aggiungiSottoprogetto(String titolo, String descrizione,
			double budget, Timestamp inizio, Timestamp scadenza,
			EDipendenteCondiviso manager, Current __current) {
		// TODO Auto-generated method stub
		
		ESottoprogettoCondiviso sottoprogetto = new ESottoprogettoCondivisoImp();
		
		sottoprogetto.setTitolo(titolo);
		sottoprogetto.setDescrizione(descrizione);
		sottoprogetto.setBudget(budget);
		sottoprogetto.setInizio(inizio);
		sottoprogetto.setScadenza(scadenza);
		sottoprogetto.setDipendente(manager);
		sottoprogetto.setPadre(this);
		
		this.getlistSp().add(sottoprogetto);
	
		return (ESottoprogettoCondiviso) sottoprogetto;
		
	}
	@Override
	public void setPadre(EAttivitaCondivisa padre, Current __current) {
		this.padre=null;
		
	}
	@Override
	public EAttivitaCondivisa getPadre(Current __current) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setCosto(double costo, Current __current) {
		// TODO Auto-generated method stub
		this.costo=costo;
		
	}
	@Override
	public double getCosto(Current __current) {
		// TODO Auto-generated method stub
		return this.costo;
	}
	@Override
	public double elaboraCosti(Current __current) {
		// TODO Auto-generated method stub
		
		//ciclo for che scorre tutta la lista dei sottoprogetti
		
		for(int i=0; i<this.listSp.size(); i++)
		{
			this.costo=this.costo+listSp.get(i).elaboraCosti(); 
			System.out.println("costo progetto:"+this.costo);
		}
		
		
		
		return this.costo;
	}
	@Override
	public void setlistSp(ArrayList<ESottoprogettoCondiviso> listSp,
			Current __current) {
		// TODO Auto-generated method stub
		this.listSp=listSp;
	}
	@Override
	public ArrayList<ESottoprogettoCondiviso> getlistSp(Current __current) {
		// TODO Auto-generated method stub
		return listSp;
	}
	@Override
	public ESottoprogettoCondiviso getSp(String titolo, Current __current) {
			ESottoprogettoCondiviso sp=null;
			for (int i=0; i < listSp.size(); i++ )
			{
				if ( ((EAttivitaCondivisa) listSp.get(i)).getTitolo().equals(titolo))
					{
					sp= (ESottoprogettoCondiviso) listSp.get(i);
					}
			}
			return sp;
	}
	
	public String toString()
	{
		return this.titolo;
	}


	@Override
	public Timestamp[] getProroghe(Current __current) {
		// TODO Auto-generated method stub
		return proroga;
	}


	@Override
	public void setProroghe(Timestamp[] p, Current __current) {
		// TODO Auto-generated method stub
		this.proroga=p;
	}
	
	
}