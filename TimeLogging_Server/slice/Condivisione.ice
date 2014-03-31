module Condivisione{
module EntityCondivise{
	["java:serializable:java.sql.Timestamp"]
	sequence<byte> JavaObj; 
	
	class EntityCondivisa{};
	
	class EClienteCondiviso extends EntityCondivisa
	{
		int id;
		string nome;
		string cognome;
		string indirizzo;		
		void setId(int id);
		void setNome(string nome);
		void setCognome(string cognome);
		void setIndirizzo(string indirizzo);
	
		int getId();
		string getNome();
		string getCognome();
		string getIndirizzo();
	};
	
	class EDipendenteCondiviso extends EntityCondivisa
	{
		int id;
		string nome;
		string cognome;
		string indirizzo;
		double pagaBase;
		string figProfessionale;
		int anzianita;
		string username;
		string password;
		
		void setId(int id);
		void setNome(string nome);
		void setCognome(string cognome);
		void setIndirizzo(string indirizzo);
		void setPagaBase(double pagaBase);
		void setFigProfessionale(string figProfessionale);
		void setAnzianita(int anzianita);
		void setUsername(string username);
		void setPassword(string password);
	
		int getId();
		string getNome();
		string getCognome();
		string getIndirizzo();
		double getPagaBase();
		string getFigProfessionale();
		int getAnzianita();	
		string getTag();
		string getUsername();
		string getPassword();
	};
	
    class EAdminCondiviso extends EDipendenteCondiviso
    {};
    
    class EManagerCondiviso extends EDipendenteCondiviso
    {};
    class EConsulenteCondiviso extends EDipendenteCondiviso
    {};
    
	
	class ETimeRecordCondiviso extends EntityCondivisa
	{
		int id;
		string commento;
		JavaObj inizio;
		JavaObj fine;
		EConsulenteCondiviso consulente;
		
		void setId(int id);
		void setCommento(string commento);
		void setInizio(JavaObj inizio);
		void setFine(JavaObj fine);
		void setConsulente(EConsulenteCondiviso consulente);
	    
	  
		int getId();
		string getCommento();
		JavaObj getInizio();
		JavaObj getFine();	
		EConsulenteCondiviso getConsulente();
	};
	
	
	
	
	
	
	
	class EAttivitaCondivisa extends EntityCondivisa
	{
		int id;
		string titolo;
		string descrizione;
		double budget;
		JavaObj inizio;
		JavaObj scadenza;
		EDipendenteCondiviso dipendente; 
		EAttivitaCondivisa padre;
		double costo;
		
		void setId(int id);
		void setTitolo(string titolo);
		void setDescrizione(string descrizione);
		void setBudget(double budget);
		void setInizio(JavaObj inizio);
		void setScadenza(JavaObj scadenza);
		void setDipendente(EDipendenteCondiviso dipendente);
		void setPadre(EAttivitaCondivisa padre);
		void setCosto(double costo);
		
		int getId();
		string getTitolo();
		string getDescrizione();
		double getBudget();
		JavaObj getInizio();
		JavaObj getScadenza();	
		EDipendenteCondiviso getDipendente();
		EAttivitaCondivisa getPadre();
		double getCosto();
		double elaboraCosti();
	
	};
	
	class ETariffaCondivisa extends EntityCondivisa
	{
		int id;
		double importo;
		JavaObj inizio;
		JavaObj scadenza;	
		
		void setId(int id);
		void setImporto(double importo);
		void setInizio(JavaObj inizio);
		void setScadenza(JavaObj scadenza);
	
		int getId();
		double getImporto();
		JavaObj getInizio();
		JavaObj getFine();
	
	};
	
	["java:type:java.util.ArrayList<ETariffaCondivisa>:java.util.ArrayList<ETariffaCondivisa>"]
    sequence<ETariffaCondivisa> listTariffe;
    
    ["java:type:java.util.ArrayList<ETimeRecordCondiviso>:java.util.ArrayList<ETimeRecordCondiviso>"]
    sequence<ETimeRecordCondiviso> listTRLavorativo;
	
	class ETaskCondiviso extends  EAttivitaCondivisa
	{
		 
		bool abilitato;
	
		listTariffe tariffe;
		JavaObj assegnatoIl;
		JavaObj revocatoIl;
		listTRLavorativo listTRL;
		
		
		void setAbilitato(bool abilitato);
		void setAssegnato(JavaObj assegnatoIl);
		void setRevocato(JavaObj revocatoIl);
	    void setlistTRL(listTRLavorativo listTRL); 
	
		
		bool getAbilitato();
		JavaObj getAssegnato();
		JavaObj getRevocato();
		listTRLavorativo getListTRL();
		
		
	};
	
	
 class ETimeRecordLavorativoCondiviso extends ETimeRecordCondiviso
	{
	    
		ETaskCondiviso task;
		double costo;
		
		void setCosto(double costo);
		
		double getCosto();
		void setETaskCondiviso(ETaskCondiviso task);
		ETaskCondiviso getETaskCondiviso();
		double calcolaCosto(listTariffe tariffe);
	};
	
	
class ETimeRecordNonLavorativoCondiviso extends ETimeRecordCondiviso
	{
		string categoria;
		void setCategoria(string categoria);
		string getCategoria();
	};
	
	["java:type:java.util.ArrayList<Condivisione.EntityCondivise.ETaskCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.ETaskCondiviso>"]
    sequence<::Condivisione::EntityCondivise::ETaskCondiviso> listaTask;
	
	class ESottoprogettoCondiviso extends EAttivitaCondivisa
	{
	 
	  listaTask listTasks;
	  ETaskCondiviso aggiungiTask(string titolo,string descrizione, double budget, JavaObj inizio, JavaObj scadenza, EDipendenteCondiviso consulente);
	  void setlistTask(listaTask listTasks);
	  listaTask getlistTask();
	};
	
	["java:type:java.util.ArrayList<Condivisione.EntityCondivise.ESottoprogettoCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.ESottoprogettoCondiviso>"]
    sequence<::Condivisione::EntityCondivise::ESottoprogettoCondiviso> listaSottoProgetti;
    
    sequence<JavaObj> proroghe;
	
	class EProgettoCondiviso extends EAttivitaCondivisa
	{
		EClienteCondiviso cliente;
		listaSottoProgetti listSp;
		proroghe proroga;
		double guadagno;
	
		proroghe getProroghe();
		void setProroghe(proroghe p);
		void setEClienteCondiviso(EClienteCondiviso cliente);
         
        ESottoprogettoCondiviso aggiungiSottoprogetto(string titolo,string descrizione, double budget, JavaObj inizio, JavaObj scadenza, EDipendenteCondiviso manager);
	
		EClienteCondiviso getEClienteCondiviso();
		
		void setlistSp(listaSottoProgetti listSp);
	  	listaSottoProgetti getlistSp();
	  	ESottoprogettoCondiviso getSp(string titolo);
		
		double elaboraGuadagno();
		double elaboraFattura();
	};
	
	["java:type:java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso>"]
	sequence<::Condivisione::EntityCondivise::ETimeRecordCondiviso> listaTR;
	
	["java:type:java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso>"]
    sequence<::Condivisione::EntityCondivise::EProgettoCondiviso> listaProgetti;
    
    ["java:type:java.util.ArrayList<Condivisione.EntityCondivise.EClienteCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.EClienteCondiviso>"]
    sequence<::Condivisione::EntityCondivise::EClienteCondiviso> listaClienti;
    
    ["java:type:java.util.ArrayList<Condivisione.EntityCondivise.EManagerCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.EManagerCondiviso>"]
    sequence<::Condivisione::EntityCondivise::EManagerCondiviso> listaManager;
    
    
    ["java:type:java.util.ArrayList<Condivisione.EntityCondivise.EConsulenteCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.EConsulenteCondiviso>"]
    sequence<::Condivisione::EntityCondivise::EConsulenteCondiviso> listaConsulenti;
    
     ["java:type:java.util.ArrayList<Condivisione.EntityCondivise.EDipendenteCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.EDipendenteCondiviso>"]
     sequence<::Condivisione::EntityCondivise::EDipendenteCondiviso> listaDipendenti;
    
};
	
module InterfacceCondivise{

interface TimeRecordManager{
	
		int save(::Condivisione::EntityCondivise::ETimeRecordCondiviso e);
		void elimina (::Condivisione::EntityCondivise::ETimeRecordCondiviso e);
		::Condivisione::EntityCondivise::listaTR getListTR(int idprogetto, int idsottoprogetto, int idtask, string dal, string al, string ultimi,bool lavorativo, bool nonlavorativo, string categoria,::Condivisione::EntityCondivise::EDipendenteCondiviso dip);
	};
	
interface AttivitaManager{
		void saveAttivita(::Condivisione::EntityCondivise::EAttivitaCondivisa e);
		
		::Condivisione::EntityCondivise::EProgettoCondiviso getProgetto(::Condivisione::EntityCondivise::EProgettoCondiviso progetto);
		::Condivisione::EntityCondivise::ESottoprogettoCondiviso getSottoprogetto(::Condivisione::EntityCondivise::ESottoprogettoCondiviso sprogetto);
		::Condivisione::EntityCondivise::ETaskCondiviso getTask(::Condivisione::EntityCondivise::ETaskCondiviso task);
	 
	 // funzioni che servono per il riempimento delle combo
	    ::Condivisione::EntityCondivise::listaProgetti getListProgetti(::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente,bool abilitati);
		::Condivisione::EntityCondivise::listaSottoProgetti getListSottoProgetti(int idprogetto,::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente,bool abilitati);
	    ::Condivisione::EntityCondivise::listaTask getListTask(int idsottoprogetto,bool abilitati,::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente);
	 
	 // funzioni che filtrano le attività per i dipendenti: queste funzioni vengono usate nell'area di  ricerca Admin e Manager
	 ::Condivisione::EntityCondivise::listaTask getListTaskConsulente(::Condivisione::EntityCondivise::EConsulenteCondiviso consulente);
	 ::Condivisione::EntityCondivise::listaSottoProgetti getListSottoprogettiManager(::Condivisione::EntityCondivise::EManagerCondiviso manager);
	 ::Condivisione::EntityCondivise::listaTask getListTaskConsulenteByManager(::Condivisione::EntityCondivise::EConsulenteCondiviso consulente, ::Condivisione::EntityCondivise::EManagerCondiviso manager);
	 ::Condivisione::EntityCondivise::listaTask getListTaskByManager(::Condivisione::EntityCondivise::EManagerCondiviso manager);
	 
	 //funzioni admin: queste funzione vengono usate esclusivamente nell'area di ricerca dell'Admin
	   	::Condivisione::EntityCondivise::listaTask getAllTask();
	   	::Condivisione::EntityCondivise::listaSottoProgetti getAllSp(::Condivisione::EntityCondivise::EManagerCondiviso manager);
	   	void eliminaAttivita(::Condivisione::EntityCondivise::EAttivitaCondivisa attivita);
	 //funzioni clienti
	 ::Condivisione::EntityCondivise::listaProgetti getListProgettiClienti(::Condivisione::EntityCondivise::EClienteCondiviso cliente);
	 
	   
	};
	
interface LoginManager{
		
		int authenticationRequest (string username, string password);
		::Condivisione::EntityCondivise::EDipendenteCondiviso IdentityRequest (int id);
		void sessionDestroy(int id);
	};
	
interface ClienteManager
	{
		//CRUD Cliente Create-Read-Update-Delete
   		void createCliente(::Condivisione::EntityCondivise::EClienteCondiviso cliente);
   		void UpdateCliente(::Condivisione::EntityCondivise::EClienteCondiviso cliente);
   		::Condivisione::EntityCondivise::listaClienti getListClienti();
   		int deleteCliente(::Condivisione::EntityCondivise::EClienteCondiviso cliente);
	};
		

interface DipendenteManager
	{
		//CRUD Dipendente Create-Read-Update-Delete
   		void createDipendente(::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente);
   		int UpdateDipendente(::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente);
   		int deleteDipendente(::Condivisione::EntityCondivise::EDipendenteCondiviso dipentente);
   		::Condivisione::EntityCondivise::listaConsulenti getListConsulenti(::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente);
   		::Condivisione::EntityCondivise::listaManager getListManager();
   		::Condivisione::EntityCondivise::listaDipendenti getListDipendentiAttivita(::Condivisione::EntityCondivise::EAttivitaCondivisa progetto);
  		::Condivisione::EntityCondivise::listaDipendenti getListAllDipendenti();
  };

interface FatturaManager

{
	double getPercentualeGuadagno();
	double getPercentualeScontoCliente();
	double getScontoSoglia();
	double getSoglia();
	
	void setPercentualeGuadagno(double percentuale);
	void setPercentualeScontoCliente(double percentuale);
	void setScontoSoglia(double scontosoglia);
	void setSoglia(double soglia);
	
	bool nuovoCliente(::Condivisione::EntityCondivise::EClienteCondiviso cliente);
	
	
};




  
};


};