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

public class ETimeRecordLavorativoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final StringExpression commento;
	
	public ETimeRecordLavorativoDetachedCriteria() {
		super(foundation.ETimeRecordLavorativo.class, foundation.ETimeRecordLavorativoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		commento = new StringExpression("commento", this.getDetachedCriteria());
	}
	
	public ETimeRecordLavorativoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.ETimeRecordLavorativoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		commento = new StringExpression("commento", this.getDetachedCriteria());
	}
	
	public ETaskDetachedCriteria createETaskCriteria() {
		return new ETaskDetachedCriteria(createCriteria("eTask"));
	}
	
	public ETimeRecordLavorativo uniqueETimeRecordLavorativo(PersistentSession session) {
		return (ETimeRecordLavorativo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ETimeRecordLavorativo[] listETimeRecordLavorativo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ETimeRecordLavorativo[]) list.toArray(new ETimeRecordLavorativo[list.size()]);
	}
}

