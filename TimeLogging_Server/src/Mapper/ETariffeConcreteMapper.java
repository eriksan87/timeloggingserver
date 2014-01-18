package Mapper;

import foundation.ETariffa;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.ETariffaCondivisaImp;

public class ETariffeConcreteMapper extends EntityMappersFactory{

	private static ETariffeConcreteMapper instance=null;

	public ETariffeConcreteMapper()
	{
		
	}
	
	public static ETariffeConcreteMapper getInstance()
	{
		if(ETariffeConcreteMapper.instance==null)
		{
			ETariffeConcreteMapper.instance=new ETariffeConcreteMapper();
		}
		return ETariffeConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		
		ETariffa tariffa= (ETariffa) entity;
		
		ETariffaCondivisaImp tariffaCondivisoImp = new ETariffaCondivisaImp(
				tariffa.getID(),tariffa.getCosto(),tariffa.getInizio(),tariffa.getFine());
		
		return tariffaCondivisoImp;
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
	
		ETariffa tariffa= new ETariffa();
		
		ETariffaCondivisaImp tariffaIce= (ETariffaCondivisaImp) entity;
		tariffa.setCosto(tariffaIce.getImporto());
		tariffa.setFine(tariffaIce.getFine());
		tariffa.setInizio(tariffaIce.getInizio());
		
		return tariffa;
	}

}