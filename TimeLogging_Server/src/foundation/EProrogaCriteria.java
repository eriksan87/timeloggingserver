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

public class EProrogaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression fine;
	
	public EProrogaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		fine = new TimestampExpression("fine", this);
	}
	
	public EProrogaCriteria(PersistentSession session) {
		this(session.createCriteria(EProroga.class));
	}
	
	public EProrogaCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EProgettoCriteria createEProgettoCriteria() {
		return new EProgettoCriteria(createCriteria("eProgetto"));
	}
	
	public EProroga uniqueEProroga() {
		return (EProroga) super.uniqueResult();
	}
	
	public EProroga[] listEProroga() {
		java.util.List list = super.list();
		return (EProroga[]) list.toArray(new EProroga[list.size()]);
	}
}

