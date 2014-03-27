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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class EClienteDAO {
	public static ECliente loadEClienteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEClienteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente getEClienteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEClienteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEClienteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente getEClienteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEClienteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ECliente) session.load(foundation.ECliente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente getEClienteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ECliente) session.get(foundation.ECliente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ECliente) session.load(foundation.ECliente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente getEClienteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ECliente) session.get(foundation.ECliente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente[] listEClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente[] listEClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente[] listEClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ECliente as ECliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ECliente[]) list.toArray(new ECliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente[] listEClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ECliente as ECliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ECliente[]) list.toArray(new ECliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ECliente[] eClientes = listEClienteByQuery(session, condition, orderBy);
		if (eClientes != null && eClientes.length > 0)
			return eClientes[0];
		else
			return null;
	}
	
	public static ECliente loadEClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ECliente[] eClientes = listEClienteByQuery(session, condition, orderBy, lockMode);
		if (eClientes != null && eClientes.length > 0)
			return eClientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ECliente as ECliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ECliente as ECliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente createECliente() {
		return new foundation.ECliente();
	}
	
	public static boolean save(foundation.ECliente eCliente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eCliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.ECliente eCliente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eCliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ECliente eCliente)throws PersistentException {
		try {
			foundation.EProgetto[] leProgettos = eCliente.eProgetto.toArray();
			for(int i = 0; i < leProgettos.length; i++) {
				leProgettos[i].seteCliente(null);
			}
			return delete(eCliente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ECliente eCliente, org.orm.PersistentSession session)throws PersistentException {
		try {
			foundation.EProgetto[] leProgettos = eCliente.eProgetto.toArray();
			for(int i = 0; i < leProgettos.length; i++) {
				leProgettos[i].seteCliente(null);
			}
			try {
				session.delete(eCliente);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(foundation.ECliente eCliente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eCliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.ECliente eCliente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eCliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ECliente loadEClienteByCriteria(EClienteCriteria eClienteCriteria) {
		ECliente[] eClientes = listEClienteByCriteria(eClienteCriteria);
		if(eClientes == null || eClientes.length == 0) {
			return null;
		}
		return eClientes[0];
	}
	
	public static ECliente[] listEClienteByCriteria(EClienteCriteria eClienteCriteria) {
		return eClienteCriteria.listECliente();
	}
}
