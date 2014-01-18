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
public class ETimeRecordNL extends EntityServer implements Serializable {
	public ETimeRecordNL() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_ETIMERECORDNL_EDIPENDENTE) {
			this.eDipendente = (foundation.EDipendente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private foundation.EDipendente eDipendente;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp fine;
	
	private String commento;
	
	private String categoria;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setInizio(java.sql.Timestamp value) {
		this.inizio = value;
	}
	
	public java.sql.Timestamp getInizio() {
		return inizio;
	}
	
	public void setFine(java.sql.Timestamp value) {
		this.fine = value;
	}
	
	public java.sql.Timestamp getFine() {
		return fine;
	}
	
	public void setCommento(String value) {
		this.commento = value;
	}
	
	public String getCommento() {
		return commento;
	}
	
	public void setCategoria(String value) {
		this.categoria = value;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void seteDipendente(foundation.EDipendente value) {
		if (eDipendente != null) {
			eDipendente.eTimeRecordNL.remove(this);
		}
		if (value != null) {
			value.eTimeRecordNL.add(this);
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
