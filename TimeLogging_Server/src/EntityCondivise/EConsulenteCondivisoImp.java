package EntityCondivise;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Ice.Current;

public class EConsulenteCondivisoImp extends EConsulenteCondiviso {

	public EConsulenteCondivisoImp()
	{
		super();
	}
	public EConsulenteCondivisoImp(int id, String nome, String cognome, String indirizzo, double pagaBase, String figProfessionale, int anzianita, String tag,String username,String password)
    {
	super(id,nome,cognome,indirizzo,pagaBase,figProfessionale,anzianita, username, password);
		
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
	public void setPagaBase(double pagaBase, Current __current) {
		// TODO Auto-generated method stub
		this.pagaBase=pagaBase;
	}

	@Override
	public void setFigProfessionale(String figProfessionale, Current __current) {
		// TODO Auto-generated method stub
		this.figProfessionale=figProfessionale;
	}

	@Override
	public void setAnzianita(int anzianita, Current __current) {
		// TODO Auto-generated method stub
		this.anzianita=anzianita;
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

	@Override
	public double getPagaBase(Current __current) {
		// TODO Auto-generated method stub
		return pagaBase;
	}

	@Override
	public String getFigProfessionale(Current __current) {
		// TODO Auto-generated method stub
		return figProfessionale;
	}

	@Override
	public int getAnzianita(Current __current) {
		// TODO Auto-generated method stub
		return anzianita;
	}

	public String getTag(Current __current) {
		// TODO Auto-generated method stub
		return "consulente";
	}
	@Override
	public void setUsername(String username, Current __current) {
		// TODO Auto-generated method stub
		this.username=username;
	}
	@Override
	public void setPassword(String password, Current __current) {
		// TODO Auto-generated method stub
		this.password=password;
	}
	@Override
	public String getPassword(Current __current) {
		// TODO Auto-generated method stub
		return password;
	}
	@Override
	public String getUsername(Current __current) {
		// TODO Auto-generated method stub
		return username;
	}


	
}