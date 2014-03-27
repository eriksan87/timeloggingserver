package EntityCondivise;

import java.sql.Timestamp;

import Condivisione.EntityCondivise.ETariffaCondivisa;
import Ice.Current;


public class ETariffaCondivisaImp extends ETariffaCondivisa {

	public ETariffaCondivisaImp()
	{
		super();
	}
	public ETariffaCondivisaImp(int id, double importo, Timestamp inizio, Timestamp fine)
    {
	super(id,importo,inizio,fine);
		
	}
	
	
	@Override
	public void setId(int id, Current __current) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setImporto(double importo, Current __current) {
		// TODO Auto-generated method stub
		this.importo=importo;
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
	public double getImporto(Current __current) {
		// TODO Auto-generated method stub
		return importo;
	}

	@Override
	public Timestamp getInizio(Current __current) {
		// TODO Auto-generated method stub
		return inizio;
	}

	@Override
	public Timestamp getFine(Current __current) {
		// TODO Auto-generated method stub
		return scadenza;
	}

}