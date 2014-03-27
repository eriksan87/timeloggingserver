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

public class ETimeRecordLavorativoDAO {
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordLavorativoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo getETimeRecordLavorativoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getETimeRecordLavorativoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordLavorativoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo getETimeRecordLavorativoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getETimeRecordLavorativoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ETimeRecordLavorativo) session.load(foundation.ETimeRecordLavorativo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo getETimeRecordLavorativoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ETimeRecordLavorativo) session.get(foundation.ETimeRecordLavorativo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ETimeRecordLavorativo) session.load(foundation.ETimeRecordLavorativo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo getETimeRecordLavorativoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ETimeRecordLavorativo) session.get(foundation.ETimeRecordLavorativo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo[] listETimeRecordLavorativoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listETimeRecordLavorativoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo[] listETimeRecordLavorativoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listETimeRecordLavorativoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo[] listETimeRecordLavorativoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordLavorativo as ETimeRecordLavorativo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ETimeRecordLavorativo[]) list.toArray(new ETimeRecordLavorativo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo[] listETimeRecordLavorativoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordLavorativo as ETimeRecordLavorativo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ETimeRecordLavorativo[]) list.toArray(new ETimeRecordLavorativo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordLavorativoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETimeRecordLavorativoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ETimeRecordLavorativo[] eTimeRecordLavorativos = listETimeRecordLavorativoByQuery(session, condition, orderBy);
		if (eTimeRecordLavorativos != null && eTimeRecordLavorativos.length > 0)
			return eTimeRecordLavorativos[0];
		else
			return null;
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ETimeRecordLavorativo[] eTimeRecordLavorativos = listETimeRecordLavorativoByQuery(session, condition, orderBy, lockMode);
		if (eTimeRecordLavorativos != null && eTimeRecordLavorativos.length > 0)
			return eTimeRecordLavorativos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateETimeRecordLavorativoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateETimeRecordLavorativoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateETimeRecordLavorativoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateETimeRecordLavorativoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateETimeRecordLavorativoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordLavorativo as ETimeRecordLavorativo");
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
	
	public static java.util.Iterator iterateETimeRecordLavorativoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETimeRecordLavorativo as ETimeRecordLavorativo");
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
	
	public static ETimeRecordLavorativo createETimeRecordLavorativo() {
		return new foundation.ETimeRecordLavorativo();
	}
	
	public static boolean save(foundation.ETimeRecordLavorativo eTimeRecordLavorativo) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eTimeRecordLavorativo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.ETimeRecordLavorativo eTimeRecordLavorativo) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eTimeRecordLavorativo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ETimeRecordLavorativo eTimeRecordLavorativo)throws PersistentException {
		try {
			if(eTimeRecordLavorativo.geteTask() != null) {
				eTimeRecordLavorativo.geteTask().eTimeRecordLavorativo.remove(eTimeRecordLavorativo);
			}
			
			return delete(eTimeRecordLavorativo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ETimeRecordLavorativo eTimeRecordLavorativo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eTimeRecordLavorativo.geteTask() != null) {
				eTimeRecordLavorativo.geteTask().eTimeRecordLavorativo.remove(eTimeRecordLavorativo);
			}
			
			try {
				session.delete(eTimeRecordLavorativo);
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
	
	public static boolean refresh(foundation.ETimeRecordLavorativo eTimeRecordLavorativo) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eTimeRecordLavorativo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.ETimeRecordLavorativo eTimeRecordLavorativo) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eTimeRecordLavorativo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETimeRecordLavorativo loadETimeRecordLavorativoByCriteria(ETimeRecordLavorativoCriteria eTimeRecordLavorativoCriteria) {
		ETimeRecordLavorativo[] eTimeRecordLavorativos = listETimeRecordLavorativoByCriteria(eTimeRecordLavorativoCriteria);
		if(eTimeRecordLavorativos == null || eTimeRecordLavorativos.length == 0) {
			return null;
		}
		return eTimeRecordLavorativos[0];
	}
	
	public static ETimeRecordLavorativo[] listETimeRecordLavorativoByCriteria(ETimeRecordLavorativoCriteria eTimeRecordLavorativoCriteria) {
		return eTimeRecordLavorativoCriteria.listETimeRecordLavorativo();
	}
}
