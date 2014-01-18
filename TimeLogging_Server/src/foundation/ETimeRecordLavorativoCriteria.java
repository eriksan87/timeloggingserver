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

public class ETimeRecordLavorativoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final StringExpression commento;
	
	public ETimeRecordLavorativoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		inizio = new TimestampExpression("inizio", this);
		fine = new TimestampExpression("fine", this);
		commento = new StringExpression("commento", this);
	}
	
	public ETimeRecordLavorativoCriteria(PersistentSession session) {
		this(session.createCriteria(ETimeRecordLavorativo.class));
	}
	
	public ETimeRecordLavorativoCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public ETaskCriteria createETaskCriteria() {
		return new ETaskCriteria(createCriteria("eTask"));
	}
	
	public ETimeRecordLavorativo uniqueETimeRecordLavorativo() {
		return (ETimeRecordLavorativo) super.uniqueResult();
	}
	
	public ETimeRecordLavorativo[] listETimeRecordLavorativo() {
		java.util.List list = super.list();
		return (ETimeRecordLavorativo[]) list.toArray(new ETimeRecordLavorativo[list.size()]);
	}
}

