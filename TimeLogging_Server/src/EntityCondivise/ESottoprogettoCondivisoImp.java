package EntityCondivise;
import java.sql.Timestamp;
import java.util.ArrayList;
import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import Ice.Current;
public class ESottoprogettoCondivisoImp extends ESottoprogettoCondiviso {
	public ESottoprogettoCondivisoImp()
	{
		super();
	    
	}
	
	
	 public ESottoprogettoCondivisoImp( String titolo, String descrizione, double budget, java.sql.Timestamp inizio, java.sql.Timestamp scadenza, EDipendenteCondiviso dipendente, java.util.ArrayList<ETaskCondiviso> listTask,EAttivitaCondivisa padre)
	    {
	        super(0, titolo, descrizione, budget, inizio, scadenza, dipendente,padre,0,listTask);
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
		return id;
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
	public EDipendenteCondiviso getDipendente(Current __current) {
		// TODO Auto-generated method stub
		return dipendente;
	}
	@Override
	public ETaskCondiviso aggiungiTask(String titolo, String descrizione, double budget, Timestamp inizio, Timestamp scadenza, EDipendenteCondiviso consulente, Current __current) {
		// TODO Auto-generated method stub
		ETaskCondiviso task = new ETaskCondivisoImp();
		task.setTitolo(titolo);
		task.setDescrizione(descrizione);
		task.setBudget(budget);
		task.setInizio(inizio);
		task.setScadenza(scadenza);
		task.setDipendente(consulente);
		task.setId(0);
		task.setPadre(this);
		this.getlistTask().add(task);	
		return (ETaskCondiviso) task;
		
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
		
		
		for(int i=0; i<this.listTasks.size();i++)
		{
			
			this.costo=this.costo+listTasks.get(i).elaboraCosti();
			System.out.println("costo sottoprogetto:"+this.costo);
		}
		
		
		return this.costo;
	}
	@Override
	public void setlistTask(ArrayList<ETaskCondiviso> listTasks,
			Current __current) {
		// TODO Auto-generated method stub
		this.listTasks=listTasks;
	}
	@Override
	public ArrayList<ETaskCondiviso> getlistTask(Current __current) {
		// TODO Auto-generated method stub
		return this.listTasks;
	}
	
	public String toString()
	{
		return this.titolo;
	}
}