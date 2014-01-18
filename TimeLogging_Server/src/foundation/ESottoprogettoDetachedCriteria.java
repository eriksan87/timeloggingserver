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

public class ESottoprogettoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final TimestampExpression inizio;
	public final TimestampExpression scadenza;
	public final DoubleExpression budget;
	
	public ESottoprogettoDetachedCriteria() {
		super(foundation.ESottoprogetto.class, foundation.ESottoprogettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		scadenza = new TimestampExpression("scadenza", this.getDetachedCriteria());
		budget = new DoubleExpression("budget", this.getDetachedCriteria());
	}
	
	public ESottoprogettoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.ESottoprogettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		scadenza = new TimestampExpression("scadenza", this.getDetachedCriteria());
		budget = new DoubleExpression("budget", this.getDetachedCriteria());
	}
	
	public EProgettoDetachedCriteria createEProgettoCriteria() {
		return new EProgettoDetachedCriteria(createCriteria("eProgetto"));
	}
	
	public EDipendenteDetachedCriteria createEDipendenteCriteria() {
		return new EDipendenteDetachedCriteria(createCriteria("eDipendente"));
	}
	
	public ETaskDetachedCriteria createETaskCriteria() {
		return new ETaskDetachedCriteria(createCriteria("ORM_ETask"));
	}
	
	public ESpesaExtraDetachedCriteria createESpesaExtraCriteria() {
		return new ESpesaExtraDetachedCriteria(createCriteria("ORM_ESpesaExtra"));
	}
	
	public ESottoprogetto uniqueESottoprogetto(PersistentSession session) {
		return (ESottoprogetto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ESottoprogetto[] listESottoprogetto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ESottoprogetto[]) list.toArray(new ESottoprogetto[list.size()]);
	}
}

