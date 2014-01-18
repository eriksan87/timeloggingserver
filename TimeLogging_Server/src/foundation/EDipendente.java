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
public class EDipendente extends EntityServer implements Serializable {
	public EDipendente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == foundation.ORMConstants.KEY_EDIPENDENTE_EPROGETTO) {
			return ORM_eProgetto;
		}
		else if (key == foundation.ORMConstants.KEY_EDIPENDENTE_ESOTTOPROGETTO) {
			return ORM_eSottoprogetto;
		}
		else if (key == foundation.ORMConstants.KEY_EDIPENDENTE_ETIMERECORDNL) {
			return ORM_eTimeRecordNL;
		}
		else if (key == foundation.ORMConstants.KEY_EDIPENDENTE_EDIPENDENTE_ETASKS) {
			return ORM_edipendente_etasks;
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
	
	private Double paga_base;
	
	private String fig_professionale;
	
	private String anzianita;
	
	private String tag;
	
	private String username;
	
	private String password;
	
	private java.util.Set ORM_eProgetto = new java.util.HashSet();
	
	private java.util.Set ORM_eSottoprogetto = new java.util.HashSet();
	
	private java.util.Set ORM_eTimeRecordNL = new java.util.HashSet();
	
	private java.util.Set ORM_edipendente_etasks = new java.util.HashSet();
	
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
	
	public void setPaga_base(double value) {
		setPaga_base(new Double(value));
	}
	
	public void setPaga_base(Double value) {
		this.paga_base = value;
	}
	
	public Double getPaga_base() {
		return paga_base;
	}
	
	public void setFig_professionale(String value) {
		this.fig_professionale = value;
	}
	
	public String getFig_professionale() {
		return fig_professionale;
	}
	
	public void setAnzianita(String value) {
		this.anzianita = value;
	}
	
	public String getAnzianita() {
		return anzianita;
	}
	
	public void setTag(String value) {
		this.tag = value;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_eProgetto(java.util.Set value) {
		this.ORM_eProgetto = value;
	}
	
	private java.util.Set getORM_eProgetto() {
		return ORM_eProgetto;
	}
	
	public final foundation.EProgettoSetCollection eProgetto = new foundation.EProgettoSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EDIPENDENTE_EPROGETTO, foundation.ORMConstants.KEY_EPROGETTO_EDIPENDENTE, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eSottoprogetto(java.util.Set value) {
		this.ORM_eSottoprogetto = value;
	}
	
	private java.util.Set getORM_eSottoprogetto() {
		return ORM_eSottoprogetto;
	}
	
	public final foundation.ESottoprogettoSetCollection eSottoprogetto = new foundation.ESottoprogettoSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EDIPENDENTE_ESOTTOPROGETTO, foundation.ORMConstants.KEY_ESOTTOPROGETTO_EDIPENDENTE, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_eTimeRecordNL(java.util.Set value) {
		this.ORM_eTimeRecordNL = value;
	}
	
	private java.util.Set getORM_eTimeRecordNL() {
		return ORM_eTimeRecordNL;
	}
	
	public final foundation.ETimeRecordNLSetCollection eTimeRecordNL = new foundation.ETimeRecordNLSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EDIPENDENTE_ETIMERECORDNL, foundation.ORMConstants.KEY_ETIMERECORDNL_EDIPENDENTE, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Edipendente_etasks(java.util.Set value) {
		this.ORM_edipendente_etasks = value;
	}
	
	private java.util.Set getORM_Edipendente_etasks() {
		return ORM_edipendente_etasks;
	}
	
	public final foundation.EDipendente_ETaskSetCollection edipendente_etasks = new foundation.EDipendente_ETaskSetCollection(this, _ormAdapter, foundation.ORMConstants.KEY_EDIPENDENTE_EDIPENDENTE_ETASKS, foundation.ORMConstants.KEY_EDIPENDENTE_ETASK_EDIPENDENTE, foundation.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
