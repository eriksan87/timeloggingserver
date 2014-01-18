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

public class EDipendenteDAO {
	public static EDipendente loadEDipendenteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente getEDipendenteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEDipendenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente getEDipendenteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return getEDipendenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EDipendente) session.load(foundation.EDipendente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente getEDipendenteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EDipendente) session.get(foundation.EDipendente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EDipendente) session.load(foundation.EDipendente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente getEDipendenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EDipendente) session.get(foundation.EDipendente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente[] listEDipendenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEDipendenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente[] listEDipendenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return listEDipendenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente[] listEDipendenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente as EDipendente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EDipendente[]) list.toArray(new EDipendente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente[] listEDipendenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente as EDipendente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EDipendente[]) list.toArray(new EDipendente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return loadEDipendenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EDipendente[] eDipendentes = listEDipendenteByQuery(session, condition, orderBy);
		if (eDipendentes != null && eDipendentes.length > 0)
			return eDipendentes[0];
		else
			return null;
	}
	
	public static EDipendente loadEDipendenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EDipendente[] eDipendentes = listEDipendenteByQuery(session, condition, orderBy, lockMode);
		if (eDipendentes != null && eDipendentes.length > 0)
			return eDipendentes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEDipendenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEDipendenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEDipendenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foundation.TimeLoggingPersistentManager.instance().getSession();
			return iterateEDipendenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEDipendenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente as EDipendente");
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
	
	public static java.util.Iterator iterateEDipendenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foundation.EDipendente as EDipendente");
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
	
	public static EDipendente createEDipendente() {
		return new foundation.EDipendente();
	}
	
	public static boolean save(foundation.EDipendente eDipendente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().saveObject(eDipendente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foundation.EDipendente eDipendente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().deleteObject(eDipendente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EDipendente eDipendente)throws PersistentException {
		try {
			foundation.EProgetto[] leProgettos = eDipendente.eProgetto.toArray();
			for(int i = 0; i < leProgettos.length; i++) {
				leProgettos[i].seteDipendente(null);
			}
			foundation.ESottoprogetto[] leSottoprogettos = eDipendente.eSottoprogetto.toArray();
			for(int i = 0; i < leSottoprogettos.length; i++) {
				leSottoprogettos[i].seteDipendente(null);
			}
			foundation.ETimeRecordNL[] leTimeRecordNLs = eDipendente.eTimeRecordNL.toArray();
			for(int i = 0; i < leTimeRecordNLs.length; i++) {
				leTimeRecordNLs[i].seteDipendente(null);
			}
			foundation.EDipendente_ETask[] lEdipendente_etaskss = eDipendente.edipendente_etasks.toArray();
			for(int i = 0; i < lEdipendente_etaskss.length; i++) {
				lEdipendente_etaskss[i].setEdipendente(null);
			}
			return delete(eDipendente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foundation.EDipendente eDipendente, org.orm.PersistentSession session)throws PersistentException {
		try {
			foundation.EProgetto[] leProgettos = eDipendente.eProgetto.toArray();
			for(int i = 0; i < leProgettos.length; i++) {
				leProgettos[i].seteDipendente(null);
			}
			foundation.ESottoprogetto[] leSottoprogettos = eDipendente.eSottoprogetto.toArray();
			for(int i = 0; i < leSottoprogettos.length; i++) {
				leSottoprogettos[i].seteDipendente(null);
			}
			foundation.ETimeRecordNL[] leTimeRecordNLs = eDipendente.eTimeRecordNL.toArray();
			for(int i = 0; i < leTimeRecordNLs.length; i++) {
				leTimeRecordNLs[i].seteDipendente(null);
			}
			foundation.EDipendente_ETask[] lEdipendente_etaskss = eDipendente.edipendente_etasks.toArray();
			for(int i = 0; i < lEdipendente_etaskss.length; i++) {
				lEdipendente_etaskss[i].setEdipendente(null);
			}
			try {
				session.delete(eDipendente);
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
	
	public static boolean refresh(foundation.EDipendente eDipendente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().refresh(eDipendente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foundation.EDipendente eDipendente) throws PersistentException {
		try {
			foundation.TimeLoggingPersistentManager.instance().getSession().evict(eDipendente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EDipendente loadEDipendenteByCriteria(EDipendenteCriteria eDipendenteCriteria) {
		EDipendente[] eDipendentes = listEDipendenteByCriteria(eDipendenteCriteria);
		if(eDipendentes == null || eDipendentes.length == 0) {
			return null;
		}
		return eDipendentes[0];
	}
	
	public static EDipendente[] listEDipendenteByCriteria(EDipendenteCriteria eDipendenteCriteria) {
		return eDipendenteCriteria.listEDipendente();
	}
}
