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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EDipendenteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression indirizzo;
	public final DoubleExpression paga_base;
	public final StringExpression fig_professionale;
	public final StringExpression anzianita;
	public final StringExpression tag;
	public final StringExpression username;
	public final StringExpression password;
	
	public EDipendenteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		indirizzo = new StringExpression("indirizzo", this);
		paga_base = new DoubleExpression("paga_base", this);
		fig_professionale = new StringExpression("fig_professionale", this);
		anzianita = new StringExpression("anzianita", this);
		tag = new StringExpression("tag", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
	}
	
	public EDipendenteCriteria(PersistentSession session) {
		this(session.createCriteria(EDipendente.class));
	}
	
	public EDipendenteCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EProgettoCriteria createEProgettoCriteria() {
		return new EProgettoCriteria(createCriteria("ORM_eProgetto"));
	}
	
	public ESottoprogettoCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoCriteria(createCriteria("ORM_eSottoprogetto"));
	}
	
	public ETimeRecordNLCriteria createETimeRecordNLCriteria() {
		return new ETimeRecordNLCriteria(createCriteria("ORM_eTimeRecordNL"));
	}
	
	public EDipendente_ETaskCriteria createEdipendente_etasksCriteria() {
		return new EDipendente_ETaskCriteria(createCriteria("ORM_Edipendente_etasks"));
	}
	
	public EDipendente uniqueEDipendente() {
		return (EDipendente) super.uniqueResult();
	}
	
	public EDipendente[] listEDipendente() {
		java.util.List list = super.list();
		return (EDipendente[]) list.toArray(new EDipendente[list.size()]);
	}
}

