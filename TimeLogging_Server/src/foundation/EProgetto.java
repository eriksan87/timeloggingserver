/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package foundation;

import java.io.Serializable;

import Mapper.EntityServer;
public class EProgetto extends EntityServer implements Serializable {
	public EProgetto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foundation.ORMConstants.KEY_EPROGETTO_ESOTTOPROGETTO) {
			return ORM_eSottoprogetto;
		}
		else if (key == foundation.ORMConstants.KEY_EPROGETTO_ESPESAEXTRA) {
			return ORM_eSpesaExtra;
		}
		else if (key == foundation.ORMConstants.KEY_EPROGETTO_EPROROGA) {
			return ORM_eProroga;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_EPROGETTO_EDIPENDENTE) {
			this.eDipendente = (foundation.EDipendente) owner;
		}
		
		else if (key == foundation.ORMConstants.KEY_EPROGETTO_ECLIENTE) {
			this.eCliente = (foundation.ECliente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private foundation.EDipendente eDipendente;
	
	private foundation.ECliente eCliente;
	
	private String titolo;
	
	private String descrizione;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp scadenza;
	
	private double budget;
	
	private java.util.Set ORM_eSottoprogetto = new java.util.HashSet();
	
	private java.util.Set ORM_eSpesaExtra = new java.util.HashSet();
	
	private java.util.Set ORM_eProroga = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitolo(String value) {
		this.titolo = value;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setDescrizione(String value) {
		this.descrizione = value;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setInizio(java.sql.Timestamp value) {
		this.inizio = value;
	}
	
	public java.sql.Timestamp getInizio() {
		return inizio;
	}
	
	public void setScadenza(java.sql.Timestamp value) {
		this.scadenza = value;
	}
	
	public java.sql.Timestamp getScadenza() {
		return scadenza;
	}
	
	public void setBudget(double value) {
		this.budget = value;
	}
	
	public double getBudget() {
		return budget;
	}
	
	public void seteDipendente(foundation.EDipendente value) {
		if (eDipendente != null) {
			eDipendente.eProgetto.remove(this);
		}
		if (value != null) {
			value.eProgetto.add(this);
		}
	}
	
	public foundation.EDipendente geteDipendente() {
		return eDipendente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_eDipendente(foundation.EDipendente value) {
		this.eDipendente = value;
	}
	
	private foundation.EDipendente getORM_EDipendente() {
		return eDipendente;
	}
	
	public void seteCliente(foundation.ECliente value) {
		if (eCliente != null) {
			eCliente.eProgetto.remove(this);
		}
		if (value != null) {
			value.eProgetto.add(this);
		}
	}
	
	public foundation.ECliente geteCliente() {
		return eCliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_eCliente(foundation.ECliente value) {
		this.eCliente = value;
	}
	
	private foundation.ECliente getORM_ECliente() {
		return eCliente;
	}
	
	private void setORM_eSottoprogetto(java.util.Set value) {
		this.ORM_eSottoprogetto = value;
	}
	
	private java.util.Set getORM_eSottoprogetto() {
		return ORM_eSottoprogetto;
	}
	
	public final foundation.ESottoprogettoSetCollection eSottoprogetto = new foundation.ESottoprogettoSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EPROGETTO_ESOTTOPROGETTO, foundation.ORMConstants.KEY_ESOTTOPROGETTO_EPROGETTO, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eSpesaExtra(java.util.Set value) {
		this.ORM_eSpesaExtra = value;
	}
	
	private java.util.Set getORM_eSpesaExtra() {
		return ORM_eSpesaExtra;
	}
	
	public final foundation.ESpesaExtraSetCollection eSpesaExtra = new foundation.ESpesaExtraSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EPROGETTO_ESPESAEXTRA, foundation.ORMConstants.KEY_ESPESAEXTRA_EPROGETTO, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eProroga(java.util.Set value) {
		this.ORM_eProroga = value;
	}
	
	private java.util.Set getORM_eProroga() {
		return ORM_eProroga;
	}
	
	public final foundation.EProrogaSetCollection eProroga = new foundation.EProrogaSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EPROGETTO_EPROROGA, foundation.ORMConstants.KEY_EPROROGA_EPROGETTO, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
