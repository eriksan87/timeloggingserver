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
public class ESpesaExtra implements Serializable {
	public ESpesaExtra() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == foundation.ORMConstants.KEY_ESPESAEXTRA_EPROGETTO) {
			this.eProgetto = (foundation.EProgetto) owner;
		}
		
		else if (key == foundation.ORMConstants.KEY_ESPESAEXTRA_ESOTTOPROGETTO) {
			this.eSottoprogetto = (foundation.ESottoprogetto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private foundation.EProgetto eProgetto;
	
	private foundation.ESottoprogetto eSottoprogetto;
	
	private String tag;
	
	private double importo;
	
	private String descrizione;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTag(String value) {
		this.tag = value;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setImporto(double value) {
		this.importo = value;
	}
	
	public double getImporto() {
		return importo;
	}
	
	public void setDescrizione(String value) {
		this.descrizione = value;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void seteProgetto(foundation.EProgetto value) {
		if (eProgetto != null) {
			eProgetto.eSpesaExtra.remove(this);
		}
		if (value != null) {
			value.eSpesaExtra.add(this);
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
	
	public void seteSottoprogetto(foundation.ESottoprogetto value) {
		if (eSottoprogetto != null) {
			eSottoprogetto.eSpesaExtra.remove(this);
		}
		if (value != null) {
			value.eSpesaExtra.add(this);
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
