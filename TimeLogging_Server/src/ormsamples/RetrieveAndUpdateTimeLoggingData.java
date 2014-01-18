/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTimeLoggingData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
		try {
			foundation.ECliente lfoundationECliente = foundation.EClienteDAO.loadEClienteByQuery(null, null);
			// Update the properties of the persistent object
			foundation.EClienteDAO.save(lfoundationECliente);
			foundation.EDipendente lfoundationEDipendente = foundation.EDipendenteDAO.loadEDipendenteByQuery(null, null);
			// Update the properties of the persistent object
			foundation.EDipendenteDAO.save(lfoundationEDipendente);
			foundation.EProgetto lfoundationEProgetto = foundation.EProgettoDAO.loadEProgettoByQuery(null, null);
			// Update the properties of the persistent object
			foundation.EProgettoDAO.save(lfoundationEProgetto);
			foundation.ESottoprogetto lfoundationESottoprogetto = foundation.ESottoprogettoDAO.loadESottoprogettoByQuery(null, null);
			// Update the properties of the persistent object
			foundation.ESottoprogettoDAO.save(lfoundationESottoprogetto);
			foundation.ETask lfoundationETask = foundation.ETaskDAO.loadETaskByQuery(null, null);
			// Update the properties of the persistent object
			foundation.ETaskDAO.save(lfoundationETask);
			foundation.ETimeRecordLavorativo lfoundationETimeRecordLavorativo = foundation.ETimeRecordLavorativoDAO.loadETimeRecordLavorativoByQuery(null, null);
			// Update the properties of the persistent object
			foundation.ETimeRecordLavorativoDAO.save(lfoundationETimeRecordLavorativo);
			foundation.ETariffa lfoundationETariffa = foundation.ETariffaDAO.loadETariffaByQuery(null, null);
			// Update the properties of the persistent object
			foundation.ETariffaDAO.save(lfoundationETariffa);
			foundation.ETimeRecordNL lfoundationETimeRecordNL = foundation.ETimeRecordNLDAO.loadETimeRecordNLByQuery(null, null);
			// Update the properties of the persistent object
			foundation.ETimeRecordNLDAO.save(lfoundationETimeRecordNL);
			foundation.ESpesaExtra lfoundationESpesaExtra = foundation.ESpesaExtraDAO.loadESpesaExtraByQuery(null, null);
			// Update the properties of the persistent object
			foundation.ESpesaExtraDAO.save(lfoundationESpesaExtra);
			foundation.EProroga lfoundationEProroga = foundation.EProrogaDAO.loadEProrogaByQuery(null, null);
			// Update the properties of the persistent object
			foundation.EProrogaDAO.save(lfoundationEProroga);
			foundation.EDipendente_ETask lfoundationEDipendente_ETask = foundation.EDipendente_ETaskDAO.loadEDipendente_ETaskByQuery(null, null);
			// Update the properties of the persistent object
			foundation.EDipendente_ETaskDAO.save(lfoundationEDipendente_ETask);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving ECliente by EClienteCriteria");
		foundation.EClienteCriteria eClienteCriteria = new foundation.EClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eClienteCriteria.ID.eq();
		System.out.println(eClienteCriteria.uniqueECliente());
		
		System.out.println("Retrieving EDipendente by EDipendenteCriteria");
		foundation.EDipendenteCriteria eDipendenteCriteria = new foundation.EDipendenteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eDipendenteCriteria.ID.eq();
		System.out.println(eDipendenteCriteria.uniqueEDipendente());
		
		System.out.println("Retrieving EProgetto by EProgettoCriteria");
		foundation.EProgettoCriteria eProgettoCriteria = new foundation.EProgettoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eProgettoCriteria.ID.eq();
		System.out.println(eProgettoCriteria.uniqueEProgetto());
		
		System.out.println("Retrieving ESottoprogetto by ESottoprogettoCriteria");
		foundation.ESottoprogettoCriteria eSottoprogettoCriteria = new foundation.ESottoprogettoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eSottoprogettoCriteria.ID.eq();
		System.out.println(eSottoprogettoCriteria.uniqueESottoprogetto());
		
		System.out.println("Retrieving ETask by ETaskCriteria");
		foundation.ETaskCriteria eTaskCriteria = new foundation.ETaskCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eTaskCriteria.ID.eq();
		System.out.println(eTaskCriteria.uniqueETask());
		
		System.out.println("Retrieving ETimeRecordLavorativo by ETimeRecordLavorativoCriteria");
		foundation.ETimeRecordLavorativoCriteria eTimeRecordLavorativoCriteria = new foundation.ETimeRecordLavorativoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eTimeRecordLavorativoCriteria.ID.eq();
		System.out.println(eTimeRecordLavorativoCriteria.uniqueETimeRecordLavorativo());
		
		System.out.println("Retrieving ETariffa by ETariffaCriteria");
		foundation.ETariffaCriteria eTariffaCriteria = new foundation.ETariffaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eTariffaCriteria.ID.eq();
		System.out.println(eTariffaCriteria.uniqueETariffa());
		
		System.out.println("Retrieving ETimeRecordNL by ETimeRecordNLCriteria");
		foundation.ETimeRecordNLCriteria eTimeRecordNLCriteria = new foundation.ETimeRecordNLCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eTimeRecordNLCriteria.ID.eq();
		System.out.println(eTimeRecordNLCriteria.uniqueETimeRecordNL());
		
		System.out.println("Retrieving ESpesaExtra by ESpesaExtraCriteria");
		foundation.ESpesaExtraCriteria eSpesaExtraCriteria = new foundation.ESpesaExtraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eSpesaExtraCriteria.ID.eq();
		System.out.println(eSpesaExtraCriteria.uniqueESpesaExtra());
		
		System.out.println("Retrieving EProroga by EProrogaCriteria");
		foundation.EProrogaCriteria eProrogaCriteria = new foundation.EProrogaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eProrogaCriteria.ID.eq();
		System.out.println(eProrogaCriteria.uniqueEProroga());
		
		System.out.println("Retrieving EDipendente_ETask by EDipendente_ETaskCriteria");
		foundation.EDipendente_ETaskCriteria eDipendente_ETaskCriteria = new foundation.EDipendente_ETaskCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eDipendente_ETaskCriteria.ID.eq();
		System.out.println(eDipendente_ETaskCriteria.uniqueEDipendente_ETask());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTimeLoggingData retrieveAndUpdateTimeLoggingData = new RetrieveAndUpdateTimeLoggingData();
			try {
				retrieveAndUpdateTimeLoggingData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTimeLoggingData.retrieveByCriteria();
			}
			finally {
				foundation.TimeLoggingPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
