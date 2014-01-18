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

public class ESottoprogettoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final TimestampExpression inizio;
	public final TimestampExpression scadenza;
	public final DoubleExpression budget;
	
	public ESottoprogettoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		descrizione = new StringExpression("descrizione", this);
		inizio = new TimestampExpression("inizio", this);
		scadenza = new TimestampExpression("scadenza", this);
		budget = new DoubleExpression("budget", this);
	}
	
	public ESottoprogettoCriteria(PersistentSession session) {
		this(session.createCriteria(ESottoprogetto.class));
	}
	
	public ESottoprogettoCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EProgettoCriteria createEProgettoCriteria() {
		return new EProgettoCriteria(createCriteria("eProgetto"));
	}
	
	public EDipendenteCriteria createEDipendenteCriteria() {
		return new EDipendenteCriteria(createCriteria("eDipendente"));
	}
	
	public ETaskCriteria createETaskCriteria() {
		return new ETaskCriteria(createCriteria("ORM_eTask"));
	}
	
	public ESpesaExtraCriteria createESpesaExtraCriteria() {
		return new ESpesaExtraCriteria(createCriteria("ORM_eSpesaExtra"));
	}
	
	public ESottoprogetto uniqueESottoprogetto() {
		return (ESottoprogetto) super.uniqueResult();
	}
	
	public ESottoprogetto[] listESottoprogetto() {
		java.util.List list = super.list();
		return (ESottoprogetto[]) list.toArray(new ESottoprogetto[list.size()]);
	}
}

