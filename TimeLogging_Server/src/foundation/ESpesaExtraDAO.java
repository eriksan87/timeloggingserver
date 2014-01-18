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

public class ESpesaExtraDAO {
	public static ESpesaExtra loadESpesaExtraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESpesaExtraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra getESpesaExtraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getESpesaExtraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESpesaExtraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra getESpesaExtraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getESpesaExtraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ESpesaExtra) session.load(foundation.ESpesaExtra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra getESpesaExtraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ESpesaExtra) session.get(foundation.ESpesaExtra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ESpesaExtra) session.load(foundation.ESpesaExtra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra getESpesaExtraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ESpesaExtra) session.get(foundation.ESpesaExtra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra[] listESpesaExtraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listESpesaExtraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra[] listESpesaExtraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listESpesaExtraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra[] listESpesaExtraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESpesaExtra as ESpesaExtra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ESpesaExtra[]) list.toArray(new ESpesaExtra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra[] listESpesaExtraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESpesaExtra as ESpesaExtra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ESpesaExtra[]) list.toArray(new ESpesaExtra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESpesaExtraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESpesaExtraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ESpesaExtra[] eSpesaExtras = listESpesaExtraByQuery(session, condition, orderBy);
		if (eSpesaExtras != null && eSpesaExtras.length > 0)
			return eSpesaExtras[0];
		else
			return null;
	}
	
	public static ESpesaExtra loadESpesaExtraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ESpesaExtra[] eSpesaExtras = listESpesaExtraByQuery(session, condition, orderBy, lockMode);
		if (eSpesaExtras != null && eSpesaExtras.length > 0)
			return eSpesaExtras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateESpesaExtraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateESpesaExtraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateESpesaExtraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateESpesaExtraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateESpesaExtraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESpesaExtra as ESpesaExtra");
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
	
	public static java.util.Iterator iterateESpesaExtraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESpesaExtra as ESpesaExtra");
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
	
	public static ESpesaExtra createESpesaExtra() {
		return new foundation.ESpesaExtra();
	}
	
	public static boolean save(foundation.ESpesaExtra eSpesaExtra) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eSpesaExtra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.ESpesaExtra eSpesaExtra) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eSpesaExtra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ESpesaExtra eSpesaExtra)throws PersistentException {
		try {
			if(eSpesaExtra.geteProgetto() != null) {
				eSpesaExtra.geteProgetto().eSpesaExtra.remove(eSpesaExtra);
			}
			
			if(eSpesaExtra.geteSottoprogetto() != null) {
				eSpesaExtra.geteSottoprogetto().eSpesaExtra.remove(eSpesaExtra);
			}
			
			return delete(eSpesaExtra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ESpesaExtra eSpesaExtra, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eSpesaExtra.geteProgetto() != null) {
				eSpesaExtra.geteProgetto().eSpesaExtra.remove(eSpesaExtra);
			}
			
			if(eSpesaExtra.geteSottoprogetto() != null) {
				eSpesaExtra.geteSottoprogetto().eSpesaExtra.remove(eSpesaExtra);
			}
			
			try {
				session.delete(eSpesaExtra);
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
	
	public static boolean refresh(foundation.ESpesaExtra eSpesaExtra) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eSpesaExtra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.ESpesaExtra eSpesaExtra) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eSpesaExtra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESpesaExtra loadESpesaExtraByCriteria(ESpesaExtraCriteria eSpesaExtraCriteria) {
		ESpesaExtra[] eSpesaExtras = listESpesaExtraByCriteria(eSpesaExtraCriteria);
		if(eSpesaExtras == null || eSpesaExtras.length == 0) {
			return null;
		}
		return eSpesaExtras[0];
	}
	
	public static ESpesaExtra[] listESpesaExtraByCriteria(ESpesaExtraCriteria eSpesaExtraCriteria) {
		return eSpesaExtraCriteria.listESpesaExtra();
	}
}
