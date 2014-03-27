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

public class EClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression indirizzo;
	
	public EClienteDetachedCriteria() {
		super(foundation.ECliente.class, foundation.EClienteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
	}
	
	public EClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, foundation.EClienteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
	}
	
	public EProgettoDetachedCriteria createEProgettoCriteria() {
		return new EProgettoDetachedCriteria(createCriteria("ORM_EProgetto"));
	}
	
	public ECliente uniqueECliente(PersistentSession session) {
		return (ECliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ECliente[] listECliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ECliente[]) list.toArray(new ECliente[list.size()]);
	}
}

