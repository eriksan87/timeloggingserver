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

public class EDipendente_ETaskDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	
	public EDipendente_ETaskDetachedCriteria() {
		super(foundation.EDipendente_ETask.class, foundation.EDipendente_ETaskCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
	}
	
	public EDipendente_ETaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.EDipendente_ETaskCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
	}
	
	public EDipendenteDetachedCriteria createEdipendenteCriteria() {
		return new EDipendenteDetachedCriteria(createCriteria("edipendente"));
	}
	
	public ETaskDetachedCriteria createEtaskCriteria() {
		return new ETaskDetachedCriteria(createCriteria("etask"));
	}
	
	public EDipendente_ETask uniqueEDipendente_ETask(PersistentSession session) {
		return (EDipendente_ETask) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EDipendente_ETask[] listEDipendente_ETask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EDipendente_ETask[]) list.toArray(new EDipendente_ETask[list.size()]);
	}
}

