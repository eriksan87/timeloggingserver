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
public class ESottoprogetto extends EntityServer implements Serializable {
	public ESottoprogetto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foundation.ORMConstants.KEY_ESOTTOPROGETTO_ETASK) {
			return ORM_eTask;
		}
		else if (key == foundation.ORMConstants.KEY_ESOTTOPROGETTO_ESPESAEXTRA) {
			return ORM_eSpesaExtra;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_ESOTTOPROGETTO_EPROGETTO) {
			this.eProgetto = (foundation.EProgetto) owner;
		}
		
		else if (key == foundation.ORMConstants.KEY_ESOTTOPROGETTO_EDIPENDENTE) {
			this.eDipendente = (foundation.EDipendente) owner;
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
	
	private foundation.EProgetto eProgetto;
	
	private foundation.EDipendente eDipendente;
	
	private String titolo;
	
	private String descrizione;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp scadenza;
	
	private double budget;
	
	private java.util.Set ORM_eTask = new java.util.HashSet();
	
	private java.util.Set ORM_eSpesaExtra = new java.util.HashSet();
	
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
	
	public void seteProgetto(foundation.EProgetto value) {
		if (eProgetto != null) {
			eProgetto.eSottoprogetto.remove(this);
		}
		if (value != null) {
			value.eSottoprogetto.add(this);
		}
	}
	
	public foundation.EProgetto geteProgetto() {
		return eProgetto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_eProgetto(foundation.EProgetto value) {
		this.eProgetto = value;
	}
	
	private foundation.EProgetto getORM_EProgetto() {
		return eProgetto;
	}
	
	public void seteDipendente(foundation.EDipendente value) {
		if (eDipendente != null) {
			eDipendente.eSottoprogetto.remove(this);
		}
		if (value != null) {
			value.eSottoprogetto.add(this);
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
	
	private void setORM_eTask(java.util.Set value) {
		this.ORM_eTask = value;
	}
	
	private java.util.Set getORM_eTask() {
		return ORM_eTask;
	}
	
	public final foundation.ETaskSetCollection eTask = new foundation.ETaskSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_ESOTTOPROGETTO_ETASK, foundation.ORMConstants.KEY_ETASK_ESOTTOPROGETTO, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eSpesaExtra(java.util.Set value) {
		this.ORM_eSpesaExtra = value;
	}
	
	private java.util.Set getORM_eSpesaExtra() {
		return ORM_eSpesaExtra;
	}
	
	public final foundation.ESpesaExtraSetCollection eSpesaExtra = new foundation.ESpesaExtraSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_ESOTTOPROGETTO_ESPESAEXTRA, foundation.ORMConstants.KEY_ESPESAEXTRA_ESOTTOPROGETTO, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
