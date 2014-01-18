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
		
		proroghe getProroghe();
		void setProroghe(proroghe p);
		void setEClienteCondiviso(EClienteCondiviso cliente);
         
        ESottoprogettoCondiviso aggiungiSottoprogetto(string titolo,string descrizione, double budget, JavaObj inizio, JavaObj scadenza, EDipendenteCondiviso manager);
	
		EClienteCondiviso getEClienteCondiviso();
		
		void setlistSp(listaSottoProgetti listSp);
	  	listaSottoProgetti getlistSp();
	  	ESottoprogettoCondiviso getSp(string titolo);
		
	};
	
	["java:type:java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso>"]
	sequence<::Condivisione::EntityCondivise::ETimeRecordCondiviso> listaTR;
	
	["java:type:java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso>:java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso>"]
    sequence<::Condivisione::EntityCondivise::EProgettoCondiviso> listaProgetti;
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
	    ::Condivisione::EntityCondivise::listaProgetti getListProgetti(::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente,bool abilitati);
		::Condivisione::EntityCondivise::listaSottoProgetti getListSottoProgetti(int idprogetto,::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente,bool abilitati);
	    ::Condivisione::EntityCondivise::listaTask getListTask(int idsottoprogetto,bool abilitati,::Condivisione::EntityCondivise::EDipendenteCondiviso dipendente);
	   
	};
interface LoginManager{
		
		int authenticationRequest (string username, string password);
		::Condivisione::EntityCondivise::EDipendenteCondiviso IdentityRequest (int id);
		void sessionDestroy(int id);
	};
};
};