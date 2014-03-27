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

public class ETariffaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final DoubleExpression costo;
	
	public ETariffaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		inizio = new TimestampExpression("inizio", this);
		fine = new TimestampExpression("fine", this);
		costo = new DoubleExpression("costo", this);
	}
	
	public ETariffaCriteria(PersistentSession session) {
		this(session.createCriteria(ETariffa.class));
	}
	
	public ETariffaCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public ETaskCriteria createETaskCriteria() {
		return new ETaskCriteria(createCriteria("eTask"));
	}
	
	public ETariffa uniqueETariffa() {
		return (ETariffa) super.uniqueResult();
	}
	
	public ETariffa[] listETariffa() {
		java.util.List list = super.list();
		return (ETariffa[]) list.toArray(new ETariffa[list.size()]);
	}
}

