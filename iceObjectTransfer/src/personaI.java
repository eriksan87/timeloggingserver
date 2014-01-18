import condivisione.prova.persona;
import Ice.Current;


public class personaI extends persona{

	personaI(){
		super();
	}
	@Override
	public void setNome(String s, Current __current) {
		// TODO Auto-generated method stub
		this.nome=s;
	}

	@Override
	public String getNome(Current __current) {
		// TODO Auto-generated method stub
		return nome;
	}

}
