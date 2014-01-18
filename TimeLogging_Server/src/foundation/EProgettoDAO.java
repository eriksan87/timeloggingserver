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

public class EProgettoDAO {
	public static EProgetto loadEProgettoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProgettoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto getEProgettoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEProgettoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProgettoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto getEProgettoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEProgettoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EProgetto) session.load(foundation.EProgetto.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto getEProgettoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EProgetto) session.get(foundation.EProgetto.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EProgetto) session.load(foundation.EProgetto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto getEProgettoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EProgetto) session.get(foundation.EProgetto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto[] listEProgettoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEProgettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto[] listEProgettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEProgettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto[] listEProgettoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProgetto as EProgetto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EProgetto[]) list.toArray(new EProgetto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto[] listEProgettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProgetto as EProgetto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EProgetto[]) list.toArray(new EProgetto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProgettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEProgettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EProgetto[] eProgettos = listEProgettoByQuery(session, condition, orderBy);
		if (eProgettos != null && eProgettos.length > 0)
			return eProgettos[0];
		else
			return null;
	}
	
	public static EProgetto loadEProgettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EProgetto[] eProgettos = listEProgettoByQuery(session, condition, orderBy, lockMode);
		if (eProgettos != null && eProgettos.length > 0)
			return eProgettos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEProgettoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEProgettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEProgettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEProgettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEProgettoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProgetto as EProgetto");
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
	
	public static java.util.Iterator iterateEProgettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EProgetto as EProgetto");
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
	
	public static EProgetto createEProgetto() {
		return new foundation.EProgetto();
	}
	
	public static boolean save(foundation.EProgetto eProgetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eProgetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.EProgetto eProgetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eProgetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EProgetto eProgetto)throws PersistentException {
		try {
			if(eProgetto.geteDipendente() != null) {
				eProgetto.geteDipendente().eProgetto.remove(eProgetto);
			}
			
			if(eProgetto.geteCliente() != null) {
				eProgetto.geteCliente().eProgetto.remove(eProgetto);
			}
			
			foundation.ESottoprogetto[] leSottoprogettos = eProgetto.eSottoprogetto.toArray();
			for(int i = 0; i < leSottoprogettos.length; i++) {
				leSottoprogettos[i].seteProgetto(null);
			}
			foundation.ESpesaExtra[] leSpesaExtras = eProgetto.eSpesaExtra.toArray();
			for(int i = 0; i < leSpesaExtras.length; i++) {
				leSpesaExtras[i].seteProgetto(null);
			}
			foundation.EProroga[] leProrogas = eProgetto.eProroga.toArray();
			for(int i = 0; i < leProrogas.length; i++) {
				leProrogas[i].seteProgetto(null);
			}
			return delete(eProgetto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EProgetto eProgetto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(eProgetto.geteDipendente() != null) {
				eProgetto.geteDipendente().eProgetto.remove(eProgetto);
			}
			
			if(eProgetto.geteCliente() != null) {
				eProgetto.geteCliente().eProgetto.remove(eProgetto);
			}
			
			foundation.ESottoprogetto[] leSottoprogettos = eProgetto.eSottoprogetto.toArray();
			for(int i = 0; i < leSottoprogettos.length; i++) {
				leSottoprogettos[i].seteProgetto(null);
			}
			foundation.ESpesaExtra[] leSpesaExtras = eProgetto.eSpesaExtra.toArray();
			for(int i = 0; i < leSpesaExtras.length; i++) {
				leSpesaExtras[i].seteProgetto(null);
			}
			foundation.EProroga[] leProrogas = eProgetto.eProroga.toArray();
			for(int i = 0; i < leProrogas.length; i++) {
				leProrogas[i].seteProgetto(null);
			}
			try {
				session.delete(eProgetto);
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
	
	public static boolean refresh(foundation.EProgetto eProgetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eProgetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.EProgetto eProgetto) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eProgetto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EProgetto loadEProgettoByCriteria(EProgettoCriteria eProgettoCriteria) {
		EProgetto[] eProgettos = listEProgettoByCriteria(eProgettoCriteria);
		if(eProgettos == null || eProgettos.length == 0) {
			return null;
		}
		return eProgettos[0];
	}
	
	public static EProgetto[] listEProgettoByCriteria(EProgettoCriteria eProgettoCriteria) {
		return eProgettoCriteria.listEProgetto();
	}
}
