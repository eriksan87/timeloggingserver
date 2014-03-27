/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateTimeLoggingData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = foundation.TimeLoggingPersistentManager.instance().getSession().beginTransaction();
		try {
			foundation.ECliente lfoundationECliente = foundation.EClienteDAO.createECliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eProgetto
			foundation.EClienteDAO.save(lfoundationECliente);
			foundation.EDipendente lfoundationEDipendente = foundation.EDipendenteDAO.createEDipendente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : edipendente_etasks, eTimeRecordNL, eSottoprogetto, eProgetto
			foundation.EDipendenteDAO.save(lfoundationEDipendente);
			foundation.EProgetto lfoundationEProgetto = foundation.EProgettoDAO.createEProgetto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eProroga, eSpesaExtra, eSottoprogetto, budget, eCliente, eDipendente
			foundation.EProgettoDAO.save(lfoundationEProgetto);
			foundation.ESottoprogetto lfoundationESottoprogetto = foundation.ESottoprogettoDAO.createESottoprogetto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eSpesaExtra, eTask, budget, eDipendente, eProgetto
			foundation.ESottoprogettoDAO.save(lfoundationESottoprogetto);
			foundation.ETask lfoundationETask = foundation.ETaskDAO.createETask();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eTariffa, eTimeRecordLavorativo, edipendente_etasks, eSottoprogetto
			foundation.ETaskDAO.save(lfoundationETask);
			foundation.ETimeRecordLavorativo lfoundationETimeRecordLavorativo = foundation.ETimeRecordLavorativoDAO.createETimeRecordLavorativo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eTask
			foundation.ETimeRecordLavorativoDAO.save(lfoundationETimeRecordLavorativo);
			foundation.ETariffa lfoundationETariffa = foundation.ETariffaDAO.createETariffa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : costo, eTask
			foundation.ETariffaDAO.save(lfoundationETariffa);
			foundation.ETimeRecordNL lfoundationETimeRecordNL = foundation.ETimeRecordNLDAO.createETimeRecordNL();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eDipendente
			foundation.ETimeRecordNLDAO.save(lfoundationETimeRecordNL);
			foundation.ESpesaExtra lfoundationESpesaExtra = foundation.ESpesaExtraDAO.createESpesaExtra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : importo, eSottoprogetto, eProgetto
			foundation.ESpesaExtraDAO.save(lfoundationESpesaExtra);
			foundation.EProroga lfoundationEProroga = foundation.EProrogaDAO.createEProroga();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eProgetto
			foundation.EProrogaDAO.save(lfoundationEProroga);
			foundation.EDipendente_ETask lfoundationEDipendente_ETask = foundation.EDipendente_ETaskDAO.createEDipendente_ETask();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : etask, edipendente
			foundation.EDipendente_ETaskDAO.save(lfoundationEDipendente_ETask);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTimeLoggingData createTimeLoggingData = new CreateTimeLoggingData();
			try {
				createTimeLoggingData.createTestData();
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
