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

public class ESottoprogettoDAO {
	public static ESottoprogetto loadESottoprogettoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESottoprogettoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto getESottoprogettoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getESottoprogettoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESottoprogettoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto getESottoprogettoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getESottoprogettoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ESottoprogetto) session.load(foundation.ESottoprogetto.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto getESottoprogettoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ESottoprogetto) session.get(foundation.ESottoprogetto.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ESottoprogetto) session.load(foundation.ESottoprogetto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto getESottoprogettoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ESottoprogetto) session.get(foundation.ESottoprogetto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto[] listESottoprogettoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listESottoprogettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto[] listESottoprogettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listESottoprogettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto[] listESottoprogettoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESottoprogetto as ESottoprogetto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ESottoprogetto[]) list.toArray(new ESottoprogetto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto[] listESottoprogettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESottoprogetto as ESottoprogetto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ESottoprogetto[]) list.toArray(new ESottoprogetto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESottoprogettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadESottoprogettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ESottoprogetto[] eSottoprogettos = listESottoprogettoByQuery(session, condition, orderBy);
		if (eSottoprogettos != null && eSottoprogettos.length > 0)
			return eSottoprogettos[0];
		else
			return null;
	}
	
	public static ESottoprogetto loadESottoprogettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ESottoprogetto[] eSottoprogettos = listESottoprogettoByQuery(session, condition, orderBy, lockMode);
		if (eSottoprogettos != null && eSottoprogettos.length > 0)
			return eSottoprogettos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateESottoprogettoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateESottoprogettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateESottoprogettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateESottoprogettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateESottoprogettoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESottoprogetto as ESottoprogetto");
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
	
	public static java.util.Iterator iterateESottoprogettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.ESottoprogetto as ESottoprogetto");
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
	
	public static ESottoprogetto createESottoprogetto() {
		return new foundation.ESottoprogetto();
	}
	
	public static boolean save(foundation.ESottoprogetto eSottoprogetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eSottoprogetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.ESottoprogetto eSottoprogetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eSottoprogetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ESottoprogetto eSottoprogetto)throws PersistentException {
		try {
			if(eSottoprogetto.geteProgetto() != null) {
				eSottoprogetto.geteProgetto().eSottoprogetto.remove(eSottoprogetto);
			}
			
			if(eSottoprogetto.geteDipendente() != null) {
				eSottoprogetto.geteDipendente().eSottoprogetto.remove(eSottoprogetto);
			}
			
			foundation.ETask[] leTasks = eSottoprogetto.eTask.toArray();
			for(int i = 0; i < leTasks.length; i++) {
				leTasks[i].seteSottoprogetto(null);
			}
			foundation.ESpesaExtra[] leSpesaExtras = eSottoprogetto.eSpesaExtra.toArray();
			for(int i = 0; i < leSpesaExtras.length; i++) {
				leSpesaExtras[i].seteSottoprogetto(null);
			}
			return delete(eSottoprogetto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.ESottoprogetto eSottoprogetto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eSottoprogetto.geteProgetto() != null) {
				eSottoprogetto.geteProgetto().eSottoprogetto.remove(eSottoprogetto);
			}
			
			if(eSottoprogetto.geteDipendente() != null) {
				eSottoprogetto.geteDipendente().eSottoprogetto.remove(eSottoprogetto);
			}
			
			foundation.ETask[] leTasks = eSottoprogetto.eTask.toArray();
			for(int i = 0; i < leTasks.length; i++) {
				leTasks[i].seteSottoprogetto(null);
			}
			foundation.ESpesaExtra[] leSpesaExtras = eSottoprogetto.eSpesaExtra.toArray();
			for(int i = 0; i < leSpesaExtras.length; i++) {
				leSpesaExtras[i].seteSottoprogetto(null);
			}
			try {
				session.delete(eSottoprogetto);
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
	
	public static boolean refresh(foundation.ESottoprogetto eSottoprogetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eSottoprogetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.ESottoprogetto eSottoprogetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eSottoprogetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ESottoprogetto loadESottoprogettoByCriteria(ESottoprogettoCriteria eSottoprogettoCriteria) {
		ESottoprogetto[] eSottoprogettos = listESottoprogettoByCriteria(eSottoprogettoCriteria);
		if(eSottoprogettos == null || eSottoprogettos.length == 0) {
			return null;
		}
		return eSottoprogettos[0];
	}
	
	public static ESottoprogetto[] listESottoprogettoByCriteria(ESottoprogettoCriteria eSottoprogettoCriteria) {
		return eSottoprogettoCriteria.listESottoprogetto();
	}
}
