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
public class EProroga implements Serializable {
	public EProroga() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_EPROROGA_EPROGETTO) {
			this.eProgetto = (foundation.EProgetto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private foundation.EProgetto eProgetto;
	
	private java.sql.Timestamp fine;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFine(java.sql.Timestamp value) {
		this.fine = value;
	}
	
	public java.sql.Timestamp getFine() {
		return fine;
	}
	
	public void seteProgetto(foundation.EProgetto value) {
		if (eProgetto != null) {
			eProgetto.eProroga.remove(this);
		}
		if (value != null) {
			value.eProroga.add(this);
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
