package EntityCondivise;
import java.sql.Timestamp;
import java.util.ArrayList;
import Condivisione.EntityCondivise.*;
import Ice.Current;
public class ETaskCondivisoImp extends ETaskCondiviso{
	
	public ETaskCondivisoImp(){
		super();
	}
	
	 public ETaskCondivisoImp(int id, String titolo, String descrizione, double budget, java.sql.Timestamp inizio, java.sql.Timestamp scadenza, EDipendenteCondiviso dipendente, boolean abilitato,EAttivitaCondivisa padre, ArrayList<ETariffaCondivisa> tariffe, Timestamp assegnato, Timestamp revocato,ArrayList<ETimeRecordCondiviso> listTRL)
	    {
	        super(id, titolo, descrizione, 0, inizio, scadenza, dipendente,padre,0,abilitato, tariffe, assegnato, revocato, listTRL);
	    }
	
	@Override
	public void setAbilitato(boolean abilitato, Current __current) {
		// TODO Auto-generated method stub
		this.abilitato=abilitato;
		
	}
	@Override
	public void setCosto(double costo, Current __current) {
		// TODO Auto-generated method stub
		this.setCosto(costo);
	}
	@Override
	public boolean getAbilitato(Current __current) {
		// TODO Auto-generated method stub
		return this.abilitato;
	}
	@Override
	public double getCosto(Current __current) {
		// TODO Auto-generated method stub
		return this.costo;
	}
	@Override
	public void setId(int id, Current __current) {
		// TODO Auto-generated method stub
		this.id=id;
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
	public void setDipendente(EDipendenteCondiviso dipendente, Current __current) {
		// TODO Auto-generated method stub
		this.dipendente=dipendente;
	}
	@Override
	public int getId(Current __current) {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public String getTitolo(Current __current) {
		// TODO Auto-generated method stub
		return this.titolo;
	}
	@Override
	public String getDescrizione(Current __current) {
		// TODO Auto-generated method stub
		return this.descrizione=descrizione;
	}
	@Override
	public double getBudget(Current __current) {
		// TODO Auto-generated method stub
		return this.budget;
	}
	@Override
	public Timestamp getInizio(Current __current) {
		// TODO Auto-generated method stub
		return this.inizio;
	}
	@Override
	public Timestamp getScadenza(Current __current) {
		// TODO Auto-generated method stub
		return this.scadenza;
	}
	@Override
	public EDipendenteCondiviso getDipendente(Current __current) {
		// TODO Auto-generated method stub
		return this.dipendente;
	}
	@Override
	public void setPadre(EAttivitaCondivisa padre, Current __current) {
		// TODO Auto-generated method stub
		this.padre=padre;
		
	}
	@Override
	public EAttivitaCondivisa getPadre(Current __current) {
		// TODO Auto-generated method stub
		return this.padre;
	}
	@Override
	public void setAssegnato(Timestamp assegnatoIl, Current __current) {
		// TODO Auto-generated method stub
		this.assegnatoIl=assegnatoIl;
	}
	@Override
	public void setRevocato(Timestamp revocatoIl, Current __current) {
		// TODO Auto-generated method stub
		this.revocatoIl=revocatoIl;
	}
	@Override
	public Timestamp getAssegnato(Current __current) {
		// TODO Auto-generated method stub
		return assegnatoIl;
	}
	@Override
	public Timestamp getRevocato(Current __current) {
		// TODO Auto-generated method stub
		return revocatoIl;
	}
	@Override
	public double elaboraCosti(Current __current) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setlistTRL(ArrayList<ETimeRecordCondiviso> listTRL,
			Current __current) {
		// TODO Auto-generated method stub
		this.listTRL=listTRL;
	}
	@Override
	public ArrayList<ETimeRecordCondiviso> getListTRL(Current __current) {
		// TODO Auto-generated method stub
		return this.listTRL;
	}
	
	public String toString()
	{
		return this.titolo;
	}
	
	
}