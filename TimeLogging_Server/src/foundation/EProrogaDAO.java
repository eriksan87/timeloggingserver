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

public class EProrogaDAO {
	public static EProroga loadEProrogaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProrogaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga getEProrogaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEProrogaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProrogaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga getEProrogaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEProrogaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EProroga) session.load(foundation.EProroga.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga getEProrogaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EProroga) session.get(foundation.EProroga.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EProroga) session.load(foundation.EProroga.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga getEProrogaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EProroga) session.get(foundation.EProroga.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga[] listEProrogaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEProrogaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga[] listEProrogaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEProrogaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga[] listEProrogaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProroga as EProroga");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EProroga[]) list.toArray(new EProroga[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga[] listEProrogaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProroga as EProroga");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EProroga[]) list.toArray(new EProroga[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProrogaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProrogaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EProroga[] eProrogas = listEProrogaByQuery(session, condition, orderBy);
		if (eProrogas != null && eProrogas.length > 0)
			return eProrogas[0];
		else
			return null;
	}
	
	public static EProroga loadEProrogaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EProroga[] eProrogas = listEProrogaByQuery(session, condition, orderBy, lockMode);
		if (eProrogas != null && eProrogas.length > 0)
			return eProrogas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEProrogaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEProrogaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEProrogaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEProrogaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEProrogaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProroga as EProroga");
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
	
	public static java.util.Iterator iterateEProrogaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProroga as EProroga");
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
	
	public static EProroga createEProroga() {
		return new foundation.EProroga();
	}
	
	public static boolean save(foundation.EProroga eProroga) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eProroga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.EProroga eProroga) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eProroga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EProroga eProroga)throws PersistentException {
		try {
			if(eProroga.geteProgetto() != null) {
				eProroga.geteProgetto().eProroga.remove(eProroga);
			}
			
			return delete(eProroga);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EProroga eProroga, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eProroga.geteProgetto() != null) {
				eProroga.geteProgetto().eProroga.remove(eProroga);
			}
			
			try {
				session.delete(eProroga);
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
	
	public static boolean refresh(foundation.EProroga eProroga) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eProroga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.EProroga eProroga) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eProroga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProroga loadEProrogaByCriteria(EProrogaCriteria eProrogaCriteria) {
		EProroga[] eProrogas = listEProrogaByCriteria(eProrogaCriteria);
		if(eProrogas == null || eProrogas.length == 0) {
			return null;
		}
		return eProrogas[0];
	}
	
	public static EProroga[] listEProrogaByCriteria(EProrogaCriteria eProrogaCriteria) {
		return eProrogaCriteria.listEProroga();
	}
}
