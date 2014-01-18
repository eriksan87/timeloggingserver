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

public class EClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression indirizzo;
	
	public EClienteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		indirizzo = new StringExpression("indirizzo", this);
	}
	
	public EClienteCriteria(PersistentSession session) {
		this(session.createCriteria(ECliente.class));
	}
	
	public EClienteCriteria() throws PersistentException {
		this(foundation.TimeLoggingPersistentManager.instance().getSession());
	}
	
	public EProgettoCriteria createEProgettoCriteria() {
		return new EProgettoCriteria(createCriteria("ORM_eProgetto"));
	}
	
	public ECliente uniqueECliente() {
		return (ECliente) super.uniqueResult();
	}
	
	public ECliente[] listECliente() {
		java.util.List list = super.list();
		return (ECliente[]) list.toArray(new ECliente[list.size()]);
	}
}

