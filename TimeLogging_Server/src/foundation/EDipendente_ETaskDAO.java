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

public class EDipendente_ETaskDAO {
	public static EDipendente_ETask loadEDipendente_ETaskByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendente_ETaskByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask getEDipendente_ETaskByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEDipendente_ETaskByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendente_ETaskByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask getEDipendente_ETaskByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEDipendente_ETaskByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EDipendente_ETask) session.load(foundation.EDipendente_ETask.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask getEDipendente_ETaskByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EDipendente_ETask) session.get(foundation.EDipendente_ETask.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EDipendente_ETask) session.load(foundation.EDipendente_ETask.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask getEDipendente_ETaskByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EDipendente_ETask) session.get(foundation.EDipendente_ETask.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask[] listEDipendente_ETaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEDipendente_ETaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask[] listEDipendente_ETaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEDipendente_ETaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask[] listEDipendente_ETaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente_ETask as EDipendente_ETask");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EDipendente_ETask[]) list.toArray(new EDipendente_ETask[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask[] listEDipendente_ETaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente_ETask as EDipendente_ETask");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EDipendente_ETask[]) list.toArray(new EDipendente_ETask[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendente_ETaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendente_ETaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EDipendente_ETask[] eDipendente_ETasks = listEDipendente_ETaskByQuery(session, condition, orderBy);
		if (eDipendente_ETasks != null && eDipendente_ETasks.length > 0)
			return eDipendente_ETasks[0];
		else
			return null;
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EDipendente_ETask[] eDipendente_ETasks = listEDipendente_ETaskByQuery(session, condition, orderBy, lockMode);
		if (eDipendente_ETasks != null && eDipendente_ETasks.length > 0)
			return eDipendente_ETasks[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEDipendente_ETaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEDipendente_ETaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEDipendente_ETaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEDipendente_ETaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEDipendente_ETaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente_ETask as EDipendente_ETask");
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
	
	public static java.util.Iterator iterateEDipendente_ETaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente_ETask as EDipendente_ETask");
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
	
	public static EDipendente_ETask createEDipendente_ETask() {
		return new foundation.EDipendente_ETask();
	}
	
	public static boolean save(foundation.EDipendente_ETask eDipendente_ETask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eDipendente_ETask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.EDipendente_ETask eDipendente_ETask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eDipendente_ETask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EDipendente_ETask eDipendente_ETask)throws PersistentException {
		try {
			if(eDipendente_ETask.getEdipendente() != null) {
				eDipendente_ETask.getEdipendente().edipendente_etasks.remove(eDipendente_ETask);
			}
			
			if(eDipendente_ETask.getEtask() != null) {
				eDipendente_ETask.getEtask().edipendente_etasks.remove(eDipendente_ETask);
			}
			
			return delete(eDipendente_ETask);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EDipendente_ETask eDipendente_ETask, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eDipendente_ETask.getEdipendente() != null) {
				eDipendente_ETask.getEdipendente().edipendente_etasks.remove(eDipendente_ETask);
			}
			
			if(eDipendente_ETask.getEtask() != null) {
				eDipendente_ETask.getEtask().edipendente_etasks.remove(eDipendente_ETask);
			}
			
			try {
				session.delete(eDipendente_ETask);
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
	
	public static boolean refresh(foundation.EDipendente_ETask eDipendente_ETask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eDipendente_ETask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.EDipendente_ETask eDipendente_ETask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eDipendente_ETask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente_ETask loadEDipendente_ETaskByCriteria(EDipendente_ETaskCriteria eDipendente_ETaskCriteria) {
		EDipendente_ETask[] eDipendente_ETasks = listEDipendente_ETaskByCriteria(eDipendente_ETaskCriteria);
		if(eDipendente_ETasks == null || eDipendente_ETasks.length == 0) {
			return null;
		}
		return eDipendente_ETasks[0];
	}
	
	public static EDipendente_ETask[] listEDipendente_ETaskByCriteria(EDipendente_ETaskCriteria eDipendente_ETaskCriteria) {
		return eDipendente_ETaskCriteria.listEDipendente_ETask();
	}
}
