import Ice.Current;
import condivisione.prova.persona;
import condivisione.prova2._personaInterfaceDisp;




public class personaInterfaceI extends _personaInterfaceDisp{

	@Override
	public persona getPersona(Current __current) {
		// TODO Auto-generated method stub
		persona p = new personaI();
		p.setNome("ciao scema");
		return p;
	}

}
