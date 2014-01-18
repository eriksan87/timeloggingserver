package EntityCondivise;

import Condivisione.EntityCondivise.EClienteCondiviso;
import Ice.Current;

public class EClienteCondivisoImp extends EClienteCondiviso {
	
	public EClienteCondivisoImp(){
		super();
	}
	
	public  EClienteCondivisoImp(int id, String nome, String cognome, String indirizzo)
    {
		super(id,nome,cognome,indirizzo);
	}
	
	@Override
	public void setId(int id, Current __current) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setNome(String nome, Current __current) {
		// TODO Auto-generated method stub
		this.nome=nome;
	}

	@Override
	public void setCognome(String cognome, Current __current) {
		// TODO Auto-generated method stub
		this.cognome=cognome;
	}

	@Override
	public void setIndirizzo(String indirizzo, Current __current) {
		// TODO Auto-generated method stub
		this.indirizzo=indirizzo;
	}

	@Override
	public int getId(Current __current) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getNome(Current __current) {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String getCognome(Current __current) {
		// TODO Auto-generated method stub
		return cognome;
	}

	@Override
	public String getIndirizzo(Current __current) {
		// TODO Auto-generated method stub
		return indirizzo;
	}
	

}