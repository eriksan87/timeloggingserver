/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteTimeLoggingData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
		try {
			foundation.ECliente lfoundationECliente = foundation.EClienteDAO.loadEClienteByQuery(null, null);
			// Delete the persistent object
			foundation.EClienteDAO.delete(lfoundationECliente);
			foundation.EDipendente lfoundationEDipendente = foundation.EDipendenteDAO.loadEDipendenteByQuery(null, null);
			// Delete the persistent object
			foundation.EDipendenteDAO.delete(lfoundationEDipendente);
			foundation.EProgetto lfoundationEProgetto = foundation.EProgettoDAO.loadEProgettoByQuery(null, null);
			// Delete the persistent object
			foundation.EProgettoDAO.delete(lfoundationEProgetto);
			foundation.ESottoprogetto lfoundationESottoprogetto = foundation.ESottoprogettoDAO.loadESottoprogettoByQuery(null, null);
			// Delete the persistent object
			foundation.ESottoprogettoDAO.delete(lfoundationESottoprogetto);
			foundation.ETask lfoundationETask = foundation.ETaskDAO.loadETaskByQuery(null, null);
			// Delete the persistent object
			foundation.ETaskDAO.delete(lfoundationETask);
			foundation.ETimeRecordLavorativo lfoundationETimeRecordLavorativo = foundation.ETimeRecordLavorativoDAO.loadETimeRecordLavorativoByQuery(null, null);
			// Delete the persistent object
			foundation.ETimeRecordLavorativoDAO.delete(lfoundationETimeRecordLavorativo);
			foundation.ETariffa lfoundationETariffa = foundation.ETariffaDAO.loadETariffaByQuery(null, null);
			// Delete the persistent object
			foundation.ETariffaDAO.delete(lfoundationETariffa);
			foundation.ETimeRecordNL lfoundationETimeRecordNL = foundation.ETimeRecordNLDAO.loadETimeRecordNLByQuery(null, null);
			// Delete the persistent object
			foundation.ETimeRecordNLDAO.delete(lfoundationETimeRecordNL);
			foundation.ESpesaExtra lfoundationESpesaExtra = foundation.ESpesaExtraDAO.loadESpesaExtraByQuery(null, null);
			// Delete the persistent object
			foundation.ESpesaExtraDAO.delete(lfoundationESpesaExtra);
			foundation.EProroga lfoundationEProroga = foundation.EProrogaDAO.loadEProrogaByQuery(null, null);
			// Delete the persistent object
			foundation.EProrogaDAO.delete(lfoundationEProroga);
			foundation.EDipendente_ETask lfoundationEDipendente_ETask = foundation.EDipendente_ETaskDAO.loadEDipendente_ETaskByQuery(null, null);
			// Delete the persistent object
			foundation.EDipendente_ETaskDAO.delete(lfoundationEDipendente_ETask);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTimeLoggingData deleteTimeLoggingData = new DeleteTimeLoggingData();
			try {
				deleteTimeLoggingData.deleteTestData();
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
