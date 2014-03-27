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
public class ETask extends EntityServer implements Serializable {
	public ETask() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foundation.ORMConstants.KEY_ETASK_EDIPENDENTE_ETASKS) {
			return ORM_edipendente_etasks;
		}
		else if (key == foundation.ORMConstants.KEY_ETASK_ETIMERECORDLAVORATIVO) {
			return ORM_eTimeRecordLavorativo;
		}
		else if (key == foundation.ORMConstants.KEY_ETASK_ETARIFFA) {
			return ORM_eTariffa;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_ETASK_ESOTTOPROGETTO) {
			this.eSottoprogetto = (foundation.ESottoprogetto) owner;
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
	
	private foundation.ESottoprogetto eSottoprogetto;
	
	private String titolo;
	
	private String descrizione;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp scadenza;
	
	private java.util.Set ORM_edipendente_etasks = new java.util.HashSet();
	
	private java.util.Set ORM_eTimeRecordLavorativo = new java.util.HashSet();
	
	private java.util.Set ORM_eTariffa = new java.util.HashSet();
	
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
	
	public void seteSottoprogetto(foundation.ESottoprogetto value) {
		if (eSottoprogetto != null) {
			eSottoprogetto.eTask.remove(this);
		}
		if (value != null) {
			value.eTask.add(this);
		}
	}
	
	public foundation.ESottoprogetto geteSottoprogetto() {
		return eSottoprogetto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_eSottoprogetto(foundation.ESottoprogetto value) {
		this.eSottoprogetto = value;
	}
	
	private foundation.ESottoprogetto getORM_ESottoprogetto() {
		return eSottoprogetto;
	}
	
	private void setORM_Edipendente_etasks(java.util.Set value) {
		this.ORM_edipendente_etasks = value;
	}
	
	private java.util.Set getORM_Edipendente_etasks() {
		return ORM_edipendente_etasks;
	}
	
	public final foundation.EDipendente_ETaskSetCollection edipendente_etasks = new foundation.EDipendente_ETaskSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_ETASK_EDIPENDENTE_ETASKS, foundation.ORMConstants.KEY_EDIPENDENTE_ETASK_ETASK, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eTimeRecordLavorativo(java.util.Set value) {
		this.ORM_eTimeRecordLavorativo = value;
	}
	
	private java.util.Set getORM_eTimeRecordLavorativo() {
		return ORM_eTimeRecordLavorativo;
	}
	
	public final foundation.ETimeRecordLavorativoSetCollection eTimeRecordLavorativo = new foundation.ETimeRecordLavorativoSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_ETASK_ETIMERECORDLAVORATIVO, foundation.ORMConstants.KEY_ETIMERECORDLAVORATIVO_ETASK, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eTariffa(java.util.Set value) {
		this.ORM_eTariffa = value;
	}
	
	private java.util.Set getORM_eTariffa() {
		return ORM_eTariffa;
	}
	
	public final foundation.ETariffaSetCollection eTariffa = new foundation.ETariffaSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_ETASK_ETARIFFA, foundation.ORMConstants.KEY_ETARIFFA_ETASK, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
