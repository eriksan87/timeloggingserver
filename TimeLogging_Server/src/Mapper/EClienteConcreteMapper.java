package Mapper;

import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.EClienteCondivisoImp;
import foundation.ECliente;

public class EClienteConcreteMapper extends EntityMappersFactory{

	private static EClienteConcreteMapper instance=null;

	public EClienteConcreteMapper()
	{
		
	}
	
	public static EClienteConcreteMapper getInstance()
	{
		if(EClienteConcreteMapper.instance==null)
		{
			EClienteConcreteMapper.instance=new EClienteConcreteMapper();
		}
		return EClienteConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		
		ECliente cliente= (ECliente) entity;
		
		
		EClienteCondivisoImp clienteCondivisoImp = new EClienteCondivisoImp(
				cliente.getID(),cliente.getNome(),cliente.getCognome(),cliente.getIndirizzo());
		
		return clienteCondivisoImp;
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
	
		ECliente cliente= new ECliente();
		
		EClienteCondivisoImp clienteIce= (EClienteCondivisoImp) entity;
		
		cliente.setCognome(clienteIce.cognome);
		cliente.setIndirizzo(clienteIce.indirizzo);
		cliente.setNome(clienteIce.nome);
		
		return cliente;
	}

}
