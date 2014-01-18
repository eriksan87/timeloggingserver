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

public class ETimeRecordNLDAO {
	public static ETimeRecordNL loadETimeRecordNLByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordNLByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL getETimeRecordNLByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getETimeRecordNLByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordNLByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL getETimeRecordNLByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getETimeRecordNLByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ETimeRecordNL) session.load(foundation.ETimeRecordNL.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL getETimeRecordNLByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ETimeRecordNL) session.get(foundation.ETimeRecordNL.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ETimeRecordNL) session.load(foundation.ETimeRecordNL.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL getETimeRecordNLByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ETimeRecordNL) session.get(foundation.ETimeRecordNL.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL[] listETimeRecordNLByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listETimeRecordNLByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL[] listETimeRecordNLByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listETimeRecordNLByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL[] listETimeRecordNLByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordNL as ETimeRecordNL");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ETimeRecordNL[]) list.toArray(new ETimeRecordNL[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL[] listETimeRecordNLByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordNL as ETimeRecordNL");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ETimeRecordNL[]) list.toArray(new ETimeRecordNL[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordNLByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordNLByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ETimeRecordNL[] eTimeRecordNLs = listETimeRecordNLByQuery(session, condition, orderBy);
		if (eTimeRecordNLs != null && eTimeRecordNLs.length > 0)
			return eTimeRecordNLs[0];
		else
			return null;
	}
	
	public static ETimeRecordNL loadETimeRecordNLByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ETimeRecordNL[] eTimeRecordNLs = listETimeRecordNLByQuery(session, condition, orderBy, lockMode);
		if (eTimeRecordNLs != null && eTimeRecordNLs.length > 0)
			return eTimeRecordNLs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateETimeRecordNLByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateETimeRecordNLByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateETimeRecordNLByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateETimeRecordNLByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateETimeRecordNLByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordNL as ETimeRecordNL");
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
	
	public static java.util.Iterator iterateETimeRecordNLByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordNL as ETimeRecordNL");
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
	
	public static ETimeRecordNL createETimeRecordNL() {
		return new foundation.ETimeRecordNL();
	}
	
	public static boolean save(foundation.ETimeRecordNL eTimeRecordNL) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eTimeRecordNL);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.ETimeRecordNL eTimeRecordNL) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eTimeRecordNL);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ETimeRecordNL eTimeRecordNL)throws PersistentException {
		try {
			if(eTimeRecordNL.geteDipendente() != null) {
				eTimeRecordNL.geteDipendente().eTimeRecordNL.remove(eTimeRecordNL);
			}
			
			return delete(eTimeRecordNL);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ETimeRecordNL eTimeRecordNL, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eTimeRecordNL.geteDipendente() != null) {
				eTimeRecordNL.geteDipendente().eTimeRecordNL.remove(eTimeRecordNL);
			}
			
			try {
				session.delete(eTimeRecordNL);
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
	
	public static boolean refresh(foundation.ETimeRecordNL eTimeRecordNL) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eTimeRecordNL);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.ETimeRecordNL eTimeRecordNL) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eTimeRecordNL);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordNL loadETimeRecordNLByCriteria(ETimeRecordNLCriteria eTimeRecordNLCriteria) {
		ETimeRecordNL[] eTimeRecordNLs = listETimeRecordNLByCriteria(eTimeRecordNLCriteria);
		if(eTimeRecordNLs == null || eTimeRecordNLs.length == 0) {
			return null;
		}
		return eTimeRecordNLs[0];
	}
	
	public static ETimeRecordNL[] listETimeRecordNLByCriteria(ETimeRecordNLCriteria eTimeRecordNLCriteria) {
		return eTimeRecordNLCriteria.listETimeRecordNL();
	}
}
