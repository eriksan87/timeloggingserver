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
public class ECliente extends EntityServer implements Serializable{
	public ECliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foundation.ORMConstants.KEY_ECLIENTE_EPROGETTO) {
			return ORM_eProgetto;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nome;
	
	private String cognome;
	
	private String indirizzo;
	
	private java.util.Set ORM_eProgetto = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String value) {
		this.cognome = value;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setIndirizzo(String value) {
		this.indirizzo = value;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	private void setORM_eProgetto(java.util.Set value) {
		this.ORM_eProgetto = value;
	}
	
	private java.util.Set getORM_eProgetto() {
		return ORM_eProgetto;
	}
	
	public final foundation.EProgettoSetCollection eProgetto = new foundation.EProgettoSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_ECLIENTE_EPROGETTO, foundation.ORMConstants.KEY_EPROGETTO_ECLIENTE, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
