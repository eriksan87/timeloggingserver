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

public class EProrogaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression fine;
	
	public EProrogaDetachedCriteria() {
		super(foundation.EProroga.class, foundation.EProrogaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
	}
	
	public EProrogaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.EProrogaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
	}
	
	public EProgettoDetachedCriteria createEProgettoCriteria() {
		return new EProgettoDetachedCriteria(createCriteria("eProgetto"));
	}
	
	public EProroga uniqueEProroga(PersistentSession session) {
		return (EProroga) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EProroga[] listEProroga(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EProroga[]) list.toArray(new EProroga[list.size()]);
	}
}

