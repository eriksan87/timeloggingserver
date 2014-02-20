import Condivisione.*;

import Condivisione.EntityCondivise.EAdminCondiviso;
import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETariffaCondivisa;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.ETimeRecordCondiviso;
import Condivisione.EntityCondivise.ETimeRecordLavorativoCondiviso;
import Condivisione.EntityCondivise.ETimeRecordNonLavorativoCondiviso;
import EntityCondivise.ETaskCondivisoImp;

import EntityCondivise.EntityFactory;
import EntityNonCondivise.Sessione;
import Ice.ObjectFactory;
import Servants.*;

//import root.TLAppServer;



public class ServerMain  {
 public static void main(String[] args)
	
 {

	Ice.Communicator ic=null; 
	ic= Ice.Util.initialize(); //inizializzo ic

	ic.addObjectFactory( new EntityFactory(), ETaskCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), ETimeRecordLavorativoCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), ETimeRecordNonLavorativoCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), EProgettoCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), EClienteCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), EManagerCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), ESottoprogettoCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), EAdminCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), EConsulenteCondiviso.ice_staticId());
	ic.addObjectFactory( new EntityFactory(), ETariffaCondivisa.ice_staticId());
	
	// Create un oggetto adapter (stored in the _adapter static members)
		
	Ice.ObjectAdapter adapter= ic.createObjectAdapterWithEndpoints("TLogging", "tcp -h 192.168.1.39 -p 10104");
		
	//aggiungo all'adapter un oggetto TimeRecordManagerI() 
	
	adapter.add(new TimeRecordManagerI(), ic.stringToIdentity("TimeRecordManager"));
	adapter.add(new AttivitaManagerI(), ic.stringToIdentity("AttivitaManager"));
	adapter.add(new LoginManagerI(), ic.stringToIdentity("LoginManager"));
	
	adapter.add(new ClienteManagerI(), ic.stringToIdentity("ClienteManager"));
	adapter.add(new ManagerManagerI(), ic.stringToIdentity("ManagerManager"));
	adapter.add(new ConsulenteManagerI(), ic.stringToIdentity("ConsulenteManager"));
	
	//attivo l'adapter
	adapter.activate();
	// In Attesa...
	ic.waitForShutdown();
	
	Sessione.getIstance(); //inizializzo una sessione vuota
	}
}