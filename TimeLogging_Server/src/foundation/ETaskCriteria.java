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

public class ETaskCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final TimestampExpression inizio;
	public final TimestampExpression scadenza;
	
	public ETaskCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		descrizione = new StringExpression("descrizione", this);
		inizio = new TimestampExpression("inizio", this);
		scadenza = new TimestampExpression("scadenza", this);
	}
	
	public ETaskCriteria(PersistentSession session) {
		this(session.createCriteria(ETask.class));
	}
	
	public ETaskCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public ESottoprogettoCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoCriteria(createCriteria("eSottoprogetto"));
	}
	
	public EDipendente_ETaskCriteria createEdipendente_etasksCriteria() {
		return new EDipendente_ETaskCriteria(createCriteria("ORM_Edipendente_etasks"));
	}
	
	public ETimeRecordLavorativoCriteria createETimeRecordLavorativoCriteria() {
		return new ETimeRecordLavorativoCriteria(createCriteria("ORM_eTimeRecordLavorativo"));
	}
	
	public ETariffaCriteria createETariffaCriteria() {
		return new ETariffaCriteria(createCriteria("ORM_eTariffa"));
	}
	
	public ETask uniqueETask() {
		return (ETask) super.uniqueResult();
	}
	
	public ETask[] listETask() {
		java.util.List list = super.list();
		return (ETask[]) list.toArray(new ETask[list.size()]);
	}
}

