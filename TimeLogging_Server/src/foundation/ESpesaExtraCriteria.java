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

public class ESpesaExtraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression tag;
	public final DoubleExpression importo;
	public final StringExpression descrizione;
	
	public ESpesaExtraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		tag = new StringExpression("tag", this);
		importo = new DoubleExpression("importo", this);
		descrizione = new StringExpression("descrizione", this);
	}
	
	public ESpesaExtraCriteria(PersistentSession session) {
		this(session.createCriteria(ESpesaExtra.class));
	}
	
	public ESpesaExtraCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EProgettoCriteria createEProgettoCriteria() {
		return new EProgettoCriteria(createCriteria("eProgetto"));
	}
	
	public ESottoprogettoCriteria createESottoprogettoCriteria() {
		return new ESottoprogettoCriteria(createCriteria("eSottoprogetto"));
	}
	
	public ESpesaExtra uniqueESpesaExtra() {
		return (ESpesaExtra) super.uniqueResult();
	}
	
	public ESpesaExtra[] listESpesaExtra() {
		java.util.List list = super.list();
		return (ESpesaExtra[]) list.toArray(new ESpesaExtra[list.size()]);
	}
}

