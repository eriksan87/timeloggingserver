package Mapper;


import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;
import EntityCondivise.EAdminCondivisoImp;
import EntityCondivise.EConsulenteCondivisoImp;
import EntityCondivise.EManagerCondivisoImp;

import foundation.EDipendente;

public class EDipendenteConcreteMapper extends EntityMappersFactory{

	private static EDipendenteConcreteMapper instance=null;

	public EDipendenteConcreteMapper()
	{
		
	}
	
	public static EDipendenteConcreteMapper getInstance()
	{
		if(EDipendenteConcreteMapper.instance==null)
		{
			EDipendenteConcreteMapper.instance=new EDipendenteConcreteMapper();
		}
		return EDipendenteConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		
		EDipendente dipendente= (EDipendente) entity;
		EDipendenteCondiviso dipendenteCondivisoImp = null;
		
		if(dipendente.getTag().equals("admin"))
		{
		dipendenteCondivisoImp = new EAdminCondivisoImp(dipendente.getID(),dipendente.getNome(),dipendente.getCognome(),dipendente.getIndirizzo(),dipendente.getPaga_base(),dipendente.getFig_professionale(),Integer.parseInt(dipendente.getAnzianita()),dipendente.getTag(),null,null);
		
		}
		else if(dipendente.getTag().equals("manager"))
		{
		dipendenteCondivisoImp = new EManagerCondivisoImp(dipendente.getID(),dipendente.getNome(),dipendente.getCognome(),dipendente.getIndirizzo(),dipendente.getPaga_base(),dipendente.getFig_professionale(),Integer.parseInt(dipendente.getAnzianita()),dipendente.getTag(),null,null);
		
		}
		else if(dipendente.getTag().equals("consulente"))
		{
		dipendenteCondivisoImp = new EConsulenteCondivisoImp(dipendente.getID(),dipendente.getNome(),dipendente.getCognome(),dipendente.getIndirizzo(),dipendente.getPaga_base(),dipendente.getFig_professionale(),Integer.parseInt(dipendente.getAnzianita()),dipendente.getTag(),null,null);
		
		}
		return dipendenteCondivisoImp;
		
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
	
		EDipendente dipendente= new EDipendente();
		EDipendenteCondiviso dipendenteIce = (EDipendenteCondiviso) entity;
		
		dipendente.setAnzianita(Integer.toString(dipendenteIce.getAnzianita()));
		dipendente.setCognome(dipendenteIce.getCognome());
		dipendente.setNome(dipendenteIce.getNome());
		dipendente.setFig_professionale(dipendenteIce.getFigProfessionale());
		dipendente.setPaga_base(dipendenteIce.getPagaBase());
		dipendente.setIndirizzo(dipendenteIce.getIndirizzo());
		//dipendente.setUsername(dipendenteIce.getPagaBase());
		//dipendente.setPassword(dipendenteIce.getIndirizzo());

		if(entity.getClass().toString().equals(EAdminCondivisoImp.class.toString()))
		{
			dipendente.setTag("admin");
		}
		else if (entity.getClass().toString().equals(EManagerCondivisoImp.class.toString()))
		{
			dipendente.setTag("manager");
		}
		else if (entity.getClass().toString().equals(EConsulenteCondivisoImp.class.toString()))
		{
			dipendente.setTag("consulente");
		}
		
		return dipendente;
	}

}