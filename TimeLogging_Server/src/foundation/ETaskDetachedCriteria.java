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

public class ETaskDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final TimestampExpression inizio;
	public final TimestampExpression scadenza;
	
	public ETaskDetachedCriteria() {
		super(foundation.ETask.class, foundation.ETaskCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		scadenza = new TimestampExpression("scadenza", this.getDetachedCriteria());
	}
	
	public ETaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.ETaskCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		scadenza = new TimestampExpression("scadenza", this.getDetachedCriteria());
	}
	
	public ESottoprogettoDetachedCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoDetachedCriteria(createCriteria("eSottoprogetto"));
	}
	
	public EDipendente_ETaskDetachedCriteria createEdipendente_etasksCriteria() {
		return new EDipendente_ETaskDetachedCriteria(createCriteria("ORM_Edipendente_etasks"));
	}
	
	public ETimeRecordLavorativoDetachedCriteria createETimeRecordLavorativoCriteria() {
		return new ETimeRecordLavorativoDetachedCriteria(createCriteria("ORM_ETimeRecordLavorativo"));
	}
	
	public ETariffaDetachedCriteria createETariffaCriteria() {
		return new ETariffaDetachedCriteria(createCriteria("ORM_ETariffa"));
	}
	
	public ETask uniqueETask(PersistentSession session) {
		return (ETask) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ETask[] listETask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ETask[]) list.toArray(new ETask[list.size()]);
	}
}

