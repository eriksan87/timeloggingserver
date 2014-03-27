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

public class ETaskDAO {
	public static ETask loadETaskByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETaskByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask getETaskByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getETaskByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETaskByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask getETaskByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getETaskByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ETask) session.load(foundation.ETask.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask getETaskByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ETask) session.get(foundation.ETask.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ETask) session.load(foundation.ETask.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask getETaskByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ETask) session.get(foundation.ETask.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask[] listETaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listETaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask[] listETaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listETaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask[] listETaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETask as ETask");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ETask[]) list.toArray(new ETask[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask[] listETaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETask as ETask");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ETask[]) list.toArray(new ETask[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadETaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ETask[] eTasks = listETaskByQuery(session, condition, orderBy);
		if (eTasks != null && eTasks.length > 0)
			return eTasks[0];
		else
			return null;
	}
	
	public static ETask loadETaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ETask[] eTasks = listETaskByQuery(session, condition, orderBy, lockMode);
		if (eTasks != null && eTasks.length > 0)
			return eTasks[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateETaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateETaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateETaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateETaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateETaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETask as ETask");
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
	
	public static java.util.Iterator iterateETaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ETask as ETask");
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
	
	public static ETask createETask() {
		return new foundation.ETask();
	}
	
	public static boolean save(foundation.ETask eTask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.ETask eTask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ETask eTask)throws PersistentException {
		try {
			if(eTask.geteSottoprogetto() != null) {
				eTask.geteSottoprogetto().eTask.remove(eTask);
			}
			
			foundation.EDipendente_ETask[] lEdipendente_etaskss = eTask.edipendente_etasks.toArray();
			for(int i = 0; i < lEdipendente_etaskss.length; i++) {
				lEdipendente_etaskss[i].setEtask(null);
			}
			foundation.ETimeRecordLavorativo[] leTimeRecordLavorativos = eTask.eTimeRecordLavorativo.toArray();
			for(int i = 0; i < leTimeRecordLavorativos.length; i++) {
				leTimeRecordLavorativos[i].seteTask(null);
			}
			foundation.ETariffa[] leTariffas = eTask.eTariffa.toArray();
			for(int i = 0; i < leTariffas.length; i++) {
				leTariffas[i].seteTask(null);
			}
			return delete(eTask);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ETask eTask, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eTask.geteSottoprogetto() != null) {
				eTask.geteSottoprogetto().eTask.remove(eTask);
			}
			
			foundation.EDipendente_ETask[] lEdipendente_etaskss = eTask.edipendente_etasks.toArray();
			for(int i = 0; i < lEdipendente_etaskss.length; i++) {
				lEdipendente_etaskss[i].setEtask(null);
			}
			foundation.ETimeRecordLavorativo[] leTimeRecordLavorativos = eTask.eTimeRecordLavorativo.toArray();
			for(int i = 0; i < leTimeRecordLavorativos.length; i++) {
				leTimeRecordLavorativos[i].seteTask(null);
			}
			foundation.ETariffa[] leTariffas = eTask.eTariffa.toArray();
			for(int i = 0; i < leTariffas.length; i++) {
				leTariffas[i].seteTask(null);
			}
			try {
				session.delete(eTask);
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
	
	public static boolean refresh(foundation.ETask eTask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.ETask eTask) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ETask loadETaskByCriteria(ETaskCriteria eTaskCriteria) {
		ETask[] eTasks = listETaskByCriteria(eTaskCriteria);
		if(eTasks == null || eTasks.length == 0) {
			return null;
		}
		return eTasks[0];
	}
	
	public static ETask[] listETaskByCriteria(ETaskCriteria eTaskCriteria) {
		return eTaskCriteria.listETask();
	}
}
