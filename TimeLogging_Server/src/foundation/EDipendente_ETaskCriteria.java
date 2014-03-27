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

public class EDipendente_ETaskCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	
	public EDipendente_ETaskCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		inizio = new TimestampExpression("inizio", this);
		fine = new TimestampExpression("fine", this);
	}
	
	public EDipendente_ETaskCriteria(PersistentSession session) {
		this(session.createCriteria(EDipendente_ETask.class));
	}
	
	public EDipendente_ETaskCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EDipendenteCriteria createEdipendenteCriteria() {
		return new EDipendenteCriteria(createCriteria("ORM_Edipendente"));
	}
	
	public ETaskCriteria createEtaskCriteria() {
		return new ETaskCriteria(createCriteria("ORM_Etask"));
	}
	
	public EDipendente_ETask uniqueEDipendente_ETask() {
		return (EDipendente_ETask) super.uniqueResult();
	}
	
	public EDipendente_ETask[] listEDipendente_ETask() {
		java.util.List list = super.list();
		return (EDipendente_ETask[]) list.toArray(new EDipendente_ETask[list.size()]);
	}
}

