import condivisione.prova.persona;


public class server  {
 public static void main(String[] args)
	{
	
	 
	//TLAppServer app=TLAppServer.getIstance();
	
	Ice.Communicator ic=null; 
	ic= Ice.Util.initialize(); //inizializzo ic

	ic.addObjectFactory( new EntityFactory(), persona.ice_staticId());
	// Create un oggetto adapter (stored in the _adapter static members)
		
	Ice.ObjectAdapter adapter= ic.createObjectAdapterWithEndpoints("TLogging", "tcp -h 192.168.1.15 -p 10009");
		
	//aggiungo all'adapter un oggetto TimeRecordManagerI() 
	
	adapter.add(new personaInterfaceI(), ic.stringToIdentity("persona"));
    
	//attivo l'adapter
	adapter.activate();
	// In Attesa...
	ic.waitForShutdown();
	
	}
}