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

public class ESpesaExtraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression tag;
	public final DoubleExpression importo;
	public final StringExpression descrizione;
	
	public ESpesaExtraDetachedCriteria() {
		super(foundation.ESpesaExtra.class, foundation.ESpesaExtraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tag = new StringExpression("tag", this.getDetachedCriteria());
		importo = new DoubleExpression("importo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
	}
	
	public ESpesaExtraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.ESpesaExtraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tag = new StringExpression("tag", this.getDetachedCriteria());
		importo = new DoubleExpression("importo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
	}
	
	public EProgettoDetachedCriteria createEProgettoCriteria() {
		return new EProgettoDetachedCriteria(createCriteria("eProgetto"));
	}
	
	public ESottoprogettoDetachedCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoDetachedCriteria(createCriteria("eSottoprogetto"));
	}
	
	public ESpesaExtra uniqueESpesaExtra(PersistentSession session) {
		return (ESpesaExtra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ESpesaExtra[] listESpesaExtra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ESpesaExtra[]) list.toArray(new ESpesaExtra[list.size()]);
	}
}

