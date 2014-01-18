package EntityCondivise;

import java.sql.Timestamp;
import java.util.ArrayList;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.ETariffaCondivisa;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.ETimeRecordLavorativoCondiviso;
import Ice.Current;

public class ETimeRecordLavorativoCondivisoImp extends ETimeRecordLavorativoCondiviso {

	public ETimeRecordLavorativoCondivisoImp(){
		super();
	}
	
	public ETimeRecordLavorativoCondivisoImp (int id, String commento, java.sql.Timestamp inizio, java.sql.Timestamp fine, EConsulenteCondiviso consulente, ETaskCondiviso task){
		super(id,commento,inizio,fine, consulente, task, 0);
		
	}
	
	@Override
	public void setETaskCondiviso(ETaskCondiviso task, Current __current) {
		// TODO Auto-generated method stub
		this.task= task;
	}

	@Override
	public void setCommento(String commento, Current __current) {
		// TODO Auto-generated method stub
		this.commento=commento;
	}

	@Override
	public void setInizio(Timestamp inizio, Current __current) {
		// TODO Auto-generated method stub
		this.inizio=inizio;
	}

	@Override
	public void setFine(Timestamp fine, Current __current) {
		// TODO Auto-generated method stub
		this.fine=fine;
	}

	@Override
	public ETaskCondiviso getETaskCondiviso(Current __current) {
		// TODO Auto-generated method stub
		return task;
	}

	@Override
	public String getCommento(Current __current) {
		// TODO Auto-generated method stub
		return commento;
	}

	@Override
	public Timestamp getInizio(Current __current) {
		// TODO Auto-generated method stub
		return inizio;
	}

	@Override
	public Timestamp getFine(Current __current) {
		// TODO Auto-generated method stub
		return fine;
	}

	@Override
	public int getId(Current __current) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id, Current __current) {
		// TODO Auto-generated method stub
		this.id= id;
	}

	@Override
	public void setConsulente(EConsulenteCondiviso consulente, Current __current) {
		// TODO Auto-generated method stub
		this.consulente=consulente;
	}

	@Override
	public EConsulenteCondiviso getConsulente(Current __current) {
		// TODO Auto-generated method stub
		return consulente;
	}

	@Override
	public void setCosto(double costo, Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCosto(Current __current) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcolaCosto(ArrayList<ETariffaCondivisa> tariffe,
			Current __current) {
		// TODO Auto-generated method stub
		return 0;
	}
	
} 