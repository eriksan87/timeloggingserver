package Mapper;

import java.sql.Timestamp;

import org.orm.PersistentException;

import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.EAdminCondivisoImp;
import EntityCondivise.EClienteCondivisoImp;
import EntityCondivise.EProgettoCondivisoImp;
import foundation.ECliente;
import foundation.EClienteCriteria;
import foundation.EDipendente;
import foundation.EDipendenteCriteria;
import foundation.EDipendente_ETask;
import foundation.EProgetto;


public class EProgettoConcreteMapper extends EntityMappersFactory {
	
	private static EProgettoConcreteMapper instance=null;

	public EProgettoConcreteMapper()
	{
		
	}
	
	public static EProgettoConcreteMapper getInstance()
	{
		if(EProgettoConcreteMapper.instance==null)
		{
			EProgettoConcreteMapper.instance=new EProgettoConcreteMapper();
		}
		return EProgettoConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		EProgetto p = (EProgetto) entity;
		EProgettoCondiviso pc = new EProgettoCondivisoImp();
		pc.setBudget(p.getBudget());
		pc.setDescrizione(p.getDescrizione());
		EAdminCondivisoImp dipendente=(EAdminCondivisoImp) EDipendenteConcreteMapper.getInstance().HibernateToIceFactory(p.geteDipendente());
		pc.setDipendente(dipendente);
		EClienteCondivisoImp cliente=(EClienteCondivisoImp) EClienteConcreteMapper.getInstance().HibernateToIceFactory(p.geteCliente());
		pc.setEClienteCondiviso(cliente);
		pc.setId(p.getID());
		pc.setInizio(p.getInizio());
		pc.setPadre(null);
		pc.setScadenza(p.getScadenza());
		pc.setTitolo(p.getTitolo());
		
	
		foundation.EProroga[] foundationEProroga = null;
		try {
			foundationEProroga = foundation.EProrogaDAO.listEProrogaByQuery("EProgettoID="+p.getID(), "Fine ");
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Timestamp[] time = new Timestamp[foundationEProroga.length];
		for(int i=0;i<foundationEProroga.length;i++)
		{
			time[i]=foundationEProroga[i].getFine();
		}
		
		pc.setProroghe(time);
		return pc;
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		EProgetto progetto = new EProgetto();
		ECliente cliente= new ECliente();
		EDipendente admin= new EDipendente();
		
		EProgettoCondivisoImp progettoIce= (EProgettoCondivisoImp) entity;
		EClienteCondivisoImp clienteIce=(EClienteCondivisoImp) progettoIce.getEClienteCondiviso();
		EAdminCondivisoImp adminIce=(EAdminCondivisoImp) progettoIce.getDipendente();
		
		
		try {
			
			EClienteCriteria eCriteriacliente= new EClienteCriteria();
			eCriteriacliente.ID.eq(clienteIce.getId());
			cliente=eCriteriacliente.uniqueECliente();
			
			EDipendenteCriteria eCriteriadip= new EDipendenteCriteria();
			eCriteriadip.ID.eq(adminIce.getId());
			admin=eCriteriadip.uniqueEDipendente();
			
			progetto.setDescrizione(progettoIce.getDescrizione());
			progetto.seteCliente(cliente);
			progetto.seteDipendente(admin);
			progetto.setInizio(progettoIce.getInizio());
			progetto.setScadenza(progettoIce.getScadenza());
			progetto.setTitolo(progettoIce.getTitolo());
			progetto.setBudget(progettoIce.getBudget());
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return progetto;
	}

}
