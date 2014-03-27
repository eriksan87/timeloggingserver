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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EDipendenteDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public EDipendenteDetachedCriteria() {
		super(foundation.EDipendente.class, foundation.EDipendenteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
		paga_base = new DoubleExpression("paga_base", this.getDetachedCriteria());
		fig_professionale = new StringExpression("fig_professionale", this.getDetachedCriteria());
		anzianita = new StringExpression("anzianita", this.getDetachedCriteria());
		tag = new StringExpression("tag", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public EDipendenteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.EDipendenteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
		paga_base = new DoubleExpression("paga_base", this.getDetachedCriteria());
		fig_professionale = new StringExpression("fig_professionale", this.getDetachedCriteria());
		anzianita = new StringExpression("anzianita", this.getDetachedCriteria());
		tag = new StringExpression("tag", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public EProgettoDetachedCriteria createEProgettoCriteria() {
		return new EProgettoDetachedCriteria(createCriteria("ORM_EProgetto"));
	}
	
	public ESottoprogettoDetachedCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoDetachedCriteria(createCriteria("ORM_ESottoprogetto"));
	}
	
	public ETimeRecordNLDetachedCriteria createETimeRecordNLCriteria() {
		return new ETimeRecordNLDetachedCriteria(createCriteria("ORM_ETimeRecordNL"));
	}
	
	public EDipendente_ETaskDetachedCriteria createEdipendente_etasksCriteria() {
		return new EDipendente_ETaskDetachedCriteria(createCriteria("ORM_Edipendente_etasks"));
	}
	
	public EDipendente uniqueEDipendente(PersistentSession session) {
		return (EDipendente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EDipendente[] listEDipendente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EDipendente[]) list.toArray(new EDipendente[list.size()]);
	}
}

