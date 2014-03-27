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

public class ETimeRecordNLCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final StringExpression commento;
	public final StringExpression categoria;
	
	public ETimeRecordNLCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		inizio = new TimestampExpression("inizio", this);
		fine = new TimestampExpression("fine", this);
		commento = new StringExpression("commento", this);
		categoria = new StringExpression("categoria", this);
	}
	
	public ETimeRecordNLCriteria(PersistentSession session) {
		this(session.createCriteria(ETimeRecordNL.class));
	}
	
	public ETimeRecordNLCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EDipendenteCriteria createEDipendenteCriteria() {
		return new EDipendenteCriteria(createCriteria("eDipendente"));
	}
	
	public ETimeRecordNL uniqueETimeRecordNL() {
		return (ETimeRecordNL) super.uniqueResult();
	}
	
	public ETimeRecordNL[] listETimeRecordNL() {
		java.util.List list = super.list();
		return (ETimeRecordNL[]) list.toArray(new ETimeRecordNL[list.size()]);
	}
}

