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
public class EDipendente_ETask extends EntityServer implements Serializable {
	public EDipendente_ETask() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_EDIPENDENTE_ETASK_EDIPENDENTE) {
			this.edipendente = (foundation.EDipendente) owner;
		}
		
		else if (key == foundation.ORMConstants.KEY_EDIPENDENTE_ETASK_ETASK) {
			this.etask = (foundation.ETask) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp fine;
	
	private foundation.EDipendente edipendente;
	
	private foundation.ETask etask;
	
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
	
	public void setEdipendente(foundation.EDipendente value) {
		if (edipendente != null) {
			edipendente.edipendente_etasks.remove(this);
		}
		if (value != null) {
			value.edipendente_etasks.add(this);
		}
	}
	
	public foundation.EDipendente getEdipendente() {
		return edipendente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Edipendente(foundation.EDipendente value) {
		this.edipendente = value;
	}
	
	private foundation.EDipendente getORM_Edipendente() {
		return edipendente;
	}
	
	public void setEtask(foundation.ETask value) {
		if (etask != null) {
			etask.edipendente_etasks.remove(this);
		}
		if (value != null) {
			value.edipendente_etasks.add(this);
		}
	}
	
	public foundation.ETask getEtask() {
		return etask;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Etask(foundation.ETask value) {
		this.etask = value;
	}
	
	private foundation.ETask getORM_Etask() {
		return etask;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
