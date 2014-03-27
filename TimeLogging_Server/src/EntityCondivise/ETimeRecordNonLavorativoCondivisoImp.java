package EntityCondivise;

import java.sql.Timestamp;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.ETimeRecordNonLavorativoCondiviso;
import Ice.Current;

public class ETimeRecordNonLavorativoCondivisoImp extends ETimeRecordNonLavorativoCondiviso {

	public ETimeRecordNonLavorativoCondivisoImp()
	{
		super();
	}
	
	public ETimeRecordNonLavorativoCondivisoImp(int id, String categoria, String commento, Timestamp inizio, Timestamp fine, EConsulenteCondiviso consulente)
	{
		super(id,commento,inizio,fine, consulente, categoria);
	}
	
	
	@Override
	public void setId(int id, Current __current) {
		// TODO Auto-generated method stub
		this.id= id;
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
	public void setCategoria(String categoria, Current __current) {
		// TODO Auto-generated method stub
		this.categoria=categoria;
	}

	@Override
	public String getCategoria(Current __current) {
		// TODO Auto-generated method stub
		return this.categoria;
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

	
	
	
	
}
