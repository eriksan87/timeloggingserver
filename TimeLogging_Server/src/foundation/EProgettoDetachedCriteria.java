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

public class EProgettoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final TimestampExpression inizio;
	public final TimestampExpression scadenza;
	public final DoubleExpression budget;
	
	public EProgettoDetachedCriteria() {
		super(foundation.EProgetto.class, foundation.EProgettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		scadenza = new TimestampExpression("scadenza", this.getDetachedCriteria());
		budget = new DoubleExpression("budget", this.getDetachedCriteria());
	}
	
	public EProgettoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.EProgettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		scadenza = new TimestampExpression("scadenza", this.getDetachedCriteria());
		budget = new DoubleExpression("budget", this.getDetachedCriteria());
	}
	
	public EDipendenteDetachedCriteria createEDipendenteCriteria() {
		return new EDipendenteDetachedCriteria(createCriteria("eDipendente"));
	}
	
	public EClienteDetachedCriteria createEClienteCriteria() {
		return new EClienteDetachedCriteria(createCriteria("eCliente"));
	}
	
	public ESottoprogettoDetachedCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoDetachedCriteria(createCriteria("ORM_ESottoprogetto"));
	}
	
	public ESpesaExtraDetachedCriteria createESpesaExtraCriteria() {
		return new ESpesaExtraDetachedCriteria(createCriteria("ORM_ESpesaExtra"));
	}
	
	public EProrogaDetachedCriteria createEProrogaCriteria() {
		return new EProrogaDetachedCriteria(createCriteria("ORM_EProroga"));
	}
	
	public EProgetto uniqueEProgetto(PersistentSession session) {
		return (EProgetto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EProgetto[] listEProgetto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EProgetto[]) list.toArray(new EProgetto[list.size()]);
	}
}

