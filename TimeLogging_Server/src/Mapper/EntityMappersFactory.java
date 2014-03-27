package Mapper;

import Condivisione.EntityCondivise.EntityCondivisa;

import EntityCondivise.EAdminCondivisoImp;
import EntityCondivise.EClienteCondivisoImp;
import EntityCondivise.EConsulenteCondivisoImp;
import EntityCondivise.EManagerCondivisoImp;
import EntityCondivise.ESottoprogettoCondivisoImp;
import EntityCondivise.EProgettoCondivisoImp;
import EntityCondivise.ETariffaCondivisaImp;
import EntityCondivise.ETaskCondivisoImp;
import EntityCondivise.ETimeRecordLavorativoCondivisoImp;
import EntityCondivise.ETimeRecordNonLavorativoCondivisoImp;


import foundation.ECliente;
import foundation.EDipendente;
import foundation.EDipendente_ETask;

import foundation.EProgetto;
import foundation.ESottoprogetto;
import foundation.ETariffa;
import foundation.ETask;
import foundation.ETimeRecordLavorativo;
import foundation.ETimeRecordNL;

public class EntityMappersFactory {


	private static EntityMappersFactory instance=null;
	
	protected EntityMappersFactory()
	{
	}
	public static EntityMappersFactory getInstance()
	{
		if(EntityMappersFactory.instance==null)
		{
			EntityMappersFactory.instance=new EntityMappersFactory();
		}
		return EntityMappersFactory.instance;
	}
	/**
	 * 
	 * @param entity
	 * @return 
	 */
	public  EntityCondivisa HibernateToIceFactory(EntityServer entity) {
	
		if(entity.getClass().toString().equals(ECliente.class.toString()))
		{
			return EClienteConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		
		if(entity.getClass().toString().equals(EDipendente.class.toString()))
		{
			return EDipendenteConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}

		if(entity.getClass().toString().equals(EProgetto.class.toString()))
		{
			return EProgettoConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(ESottoprogetto.class.toString()))
		{
			return ESottoprogettoConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(ETask.class.toString()))
		{
			return ETaskConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(ETariffa.class.toString()))
		{
			return ETariffeConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(ETimeRecordLavorativo.class.toString()))
		{
			return ETimeRecordLavorativoConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(ETimeRecordNL.class.toString()))
		{
			return ETimeRecordNonLavorativoConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(EDipendente_ETask.class.toString()))
		{
			return EDipendente_ETaskConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		return null;
		
	}

	/**
	 * 
	 * @param entity
	 * @param i 
	 * @return 
	 */
	public  EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		if(entity.getClass().toString().equals(EClienteCondivisoImp.class.toString()))
		{
			return EClienteConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		
		if(entity.getClass().toString().equals(EAdminCondivisoImp.class.toString()))
		{
			return EDipendenteConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		
		if(entity.getClass().toString().equals(EManagerCondivisoImp.class.toString()))
		{
			return EDipendenteConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(EProgettoCondivisoImp.class.toString()))
		{
			return EProgettoConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(ESottoprogettoCondivisoImp.class.toString()))
		{
			return ESottoprogettoConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(EConsulenteCondivisoImp.class.toString()))
		{
			return EDipendenteConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(ETaskCondivisoImp.class.toString()))
		{
			return ETaskConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(ETariffaCondivisaImp.class.toString()))
		{
			return ETariffeConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(ETimeRecordLavorativoCondivisoImp.class.toString()))
		{
			return ETimeRecordLavorativoConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(ETimeRecordNonLavorativoCondivisoImp.class.toString()))
		{
			return ETimeRecordNonLavorativoConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(ETimeRecordNonLavorativoCondivisoImp.class.toString()))
		{
			return ETimeRecordNonLavorativoConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(EDipendente_ETaskImp.class.toString()))
		{
			return EDipendente_ETaskConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}


		return null;
	}
}
