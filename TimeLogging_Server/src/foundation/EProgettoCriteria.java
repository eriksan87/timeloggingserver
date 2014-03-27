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

public class EProgettoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final TimestampExpression inizio;
	public final TimestampExpression scadenza;
	public final DoubleExpression budget;
	
	public EProgettoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		descrizione = new StringExpression("descrizione", this);
		inizio = new TimestampExpression("inizio", this);
		scadenza = new TimestampExpression("scadenza", this);
		budget = new DoubleExpression("budget", this);
	}
	
	public EProgettoCriteria(PersistentSession session) {
		this(session.createCriteria(EProgetto.class));
	}
	
	public EProgettoCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EDipendenteCriteria createEDipendenteCriteria() {
		return new EDipendenteCriteria(createCriteria("eDipendente"));
	}
	
	public EClienteCriteria createEClienteCriteria() {
		return new EClienteCriteria(createCriteria("eCliente"));
	}
	
	public ESottoprogettoCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoCriteria(createCriteria("ORM_eSottoprogetto"));
	}
	
	public ESpesaExtraCriteria createESpesaExtraCriteria() {
		return new ESpesaExtraCriteria(createCriteria("ORM_eSpesaExtra"));
	}
	
	public EProrogaCriteria createEProrogaCriteria() {
		return new EProrogaCriteria(createCriteria("ORM_eProroga"));
	}
	
	public EProgetto uniqueEProgetto() {
		return (EProgetto) super.uniqueResult();
	}
	
	public EProgetto[] listEProgetto() {
		java.util.List list = super.list();
		return (EProgetto[]) list.toArray(new EProgetto[list.size()]);
	}
}

