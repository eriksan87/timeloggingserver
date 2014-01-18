package Mapper;

import org.orm.PersistentException;

import Condivisione.EntityCondivise.EAttivitaCondivisa;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.EManagerCondivisoImp;
import EntityCondivise.EProgettoCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import foundation.EDipendente;
import foundation.EDipendenteCriteria;
import foundation.EProgetto;
import foundation.EProgettoCriteria;
import foundation.ESottoprogetto;

public class ESottoprogettoConcreteMapper extends EntityMappersFactory {
	
	private static ESottoprogettoConcreteMapper instance=null;

	public ESottoprogettoConcreteMapper()
	{
		
	}
	
	public static ESottoprogettoConcreteMapper getInstance()
	{
		if(ESottoprogettoConcreteMapper.instance==null)
		{
			ESottoprogettoConcreteMapper.instance=new ESottoprogettoConcreteMapper();
		}
		return ESottoprogettoConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		
		ESottoprogetto sottoprogetto=(ESottoprogetto)entity;
		
		EManagerCondivisoImp dipIce=(EManagerCondivisoImp) EDipendenteConcreteMapper.getInstance().HibernateToIceFactory(sottoprogetto.geteDipendente());
		EProgettoCondiviso progIce=(EProgettoCondivisoImp) EProgettoConcreteMapper.getInstance().HibernateToIceFactory(sottoprogetto.geteProgetto());
		
		ESottoprogettoCondivisoImp sottoprogettoCondivisoImp = new ESottoprogettoCondivisoImp(
				sottoprogetto.getTitolo(),sottoprogetto.getDescrizione()
				, sottoprogetto.getBudget(),sottoprogetto.getInizio()
				,sottoprogetto.getScadenza(),dipIce, null,progIce);
		
		sottoprogettoCondivisoImp.setId(sottoprogetto.getID());
		
		return sottoprogettoCondivisoImp;
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		ESottoprogetto sottoprogetto = new ESottoprogetto();
		EDipendente manager= new EDipendente();
		EProgetto progetto=new EProgetto();
		
		ESottoprogettoCondivisoImp sottoprogettoIce= (ESottoprogettoCondivisoImp) entity;
		EManagerCondivisoImp managerIce=(EManagerCondivisoImp) sottoprogettoIce.getDipendente();
		
		try {
			
			EDipendenteCriteria eCriteriadip= new EDipendenteCriteria();
			eCriteriadip.ID.eq(managerIce.getId());
			manager=eCriteriadip.uniqueEDipendente();
			
			EProgettoCriteria eCriteriaprogetto= new EProgettoCriteria();
			eCriteriaprogetto.ID.eq(sottoprogettoIce.getPadre().getId());
			progetto=eCriteriaprogetto.uniqueEProgetto();
			
			
			sottoprogetto.setDescrizione(sottoprogettoIce.getDescrizione());
			sottoprogetto.seteDipendente(manager);
			sottoprogetto.setInizio(sottoprogettoIce.getInizio());
			sottoprogetto.setScadenza(sottoprogettoIce.getScadenza());
			sottoprogetto.setTitolo(sottoprogettoIce.getTitolo());
			sottoprogetto.setBudget(sottoprogettoIce.getBudget());
			sottoprogetto.seteProgetto(progetto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sottoprogetto;
	}

}
