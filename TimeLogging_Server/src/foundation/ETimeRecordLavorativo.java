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
public class ETimeRecordLavorativo extends EntityServer implements Serializable {
	public ETimeRecordLavorativo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_ETIMERECORDLAVORATIVO_ETASK) {
			this.eTask = (foundation.ETask) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private foundation.ETask eTask;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp fine;
	
	private String commento;
	
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
	
	public void seteTask(foundation.ETask value) {
		if (eTask != null) {
			eTask.eTimeRecordLavorativo.remove(this);
		}
		if (value != null) {
			value.eTimeRecordLavorativo.add(this);
		}
	}
	
	public foundation.ETask geteTask() {
		return eTask;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_eTask(foundation.ETask value) {
		this.eTask = value;
	}
	
	private foundation.ETask getORM_ETask() {
		return eTask;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
