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

public class ETariffaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final DoubleExpression costo;
	
	public ETariffaDetachedCriteria() {
		super(foundation.ETariffa.class, foundation.ETariffaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		costo = new DoubleExpression("costo", this.getDetachedCriteria());
	}
	
	public ETariffaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.ETariffaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		costo = new DoubleExpression("costo", this.getDetachedCriteria());
	}
	
	public ETaskDetachedCriteria createETaskCriteria() {
		return new ETaskDetachedCriteria(createCriteria("eTask"));
	}
	
	public ETariffa uniqueETariffa(PersistentSession session) {
		return (ETariffa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ETariffa[] listETariffa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ETariffa[]) list.toArray(new ETariffa[list.size()]);
	}
}

