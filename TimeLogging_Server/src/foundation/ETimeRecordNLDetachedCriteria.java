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

public class ETimeRecordNLDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final StringExpression commento;
	public final StringExpression categoria;
	
	public ETimeRecordNLDetachedCriteria() {
		super(foundation.ETimeRecordNL.class, foundation.ETimeRecordNLCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		commento = new StringExpression("commento", this.getDetachedCriteria());
		categoria = new StringExpression("categoria", this.getDetachedCriteria());
	}
	
	public ETimeRecordNLDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.ETimeRecordNLCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		commento = new StringExpression("commento", this.getDetachedCriteria());
		categoria = new StringExpression("categoria", this.getDetachedCriteria());
	}
	
	public EDipendenteDetachedCriteria createEDipendenteCriteria() {
		return new EDipendenteDetachedCriteria(createCriteria("eDipendente"));
	}
	
	public ETimeRecordNL uniqueETimeRecordNL(PersistentSession session) {
		return (ETimeRecordNL) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ETimeRecordNL[] listETimeRecordNL(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ETimeRecordNL[]) list.toArray(new ETimeRecordNL[list.size()]);
	}
}

