/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListTimeLoggingData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing ECliente...");
		foundation.ECliente[] foundationEClientes = foundation.EClienteDAO.listEClienteByQuery(null, null);
		int length = Math.min(foundationEClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationEClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EDipendente...");
		foundation.EDipendente[] foundationEDipendentes = foundation.EDipendenteDAO.listEDipendenteByQuery(null, null);
		length = Math.min(foundationEDipendentes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationEDipendentes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EProgetto...");
		foundation.EProgetto[] foundationEProgettos = foundation.EProgettoDAO.listEProgettoByQuery(null, null);
		length = Math.min(foundationEProgettos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationEProgettos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ESottoprogetto...");
		foundation.ESottoprogetto[] foundationESottoprogettos = foundation.ESottoprogettoDAO.listESottoprogettoByQuery(null, null);
		length = Math.min(foundationESottoprogettos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationESottoprogettos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ETask...");
		foundation.ETask[] foundationETasks = foundation.ETaskDAO.listETaskByQuery(null, null);
		length = Math.min(foundationETasks.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationETasks[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ETimeRecordLavorativo...");
		foundation.ETimeRecordLavorativo[] foundationETimeRecordLavorativos = foundation.ETimeRecordLavorativoDAO.listETimeRecordLavorativoByQuery(null, null);
		length = Math.min(foundationETimeRecordLavorativos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationETimeRecordLavorativos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ETariffa...");
		foundation.ETariffa[] foundationETariffas = foundation.ETariffaDAO.listETariffaByQuery(null, null);
		length = Math.min(foundationETariffas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationETariffas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ETimeRecordNL...");
		foundation.ETimeRecordNL[] foundationETimeRecordNLs = foundation.ETimeRecordNLDAO.listETimeRecordNLByQuery(null, null);
		length = Math.min(foundationETimeRecordNLs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationETimeRecordNLs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ESpesaExtra...");
		foundation.ESpesaExtra[] foundationESpesaExtras = foundation.ESpesaExtraDAO.listESpesaExtraByQuery(null, null);
		length = Math.min(foundationESpesaExtras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationESpesaExtras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EProroga...");
		foundation.EProroga[] foundationEProrogas = foundation.EProrogaDAO.listEProrogaByQuery(null, null);
		length = Math.min(foundationEProrogas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationEProrogas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EDipendente_ETask...");
		foundation.EDipendente_ETask[] foundationEDipendente_ETasks = foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery(null, null);
		length = Math.min(foundationEDipendente_ETasks.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(foundationEDipendente_ETasks[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing ECliente by Criteria...");
		foundation.EClienteCriteria eClienteCriteria = new foundation.EClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eClienteCriteria.ID.eq();
		eClienteCriteria.setMaxResults(ROW_COUNT);
		foundation.ECliente[] foundationEClientes = eClienteCriteria.listECliente();
		int length =foundationEClientes== null ? 0 : Math.min(foundationEClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationEClientes[i]);
		}
		System.out.println(length + " ECliente record(s) retrieved."); 
		
		System.out.println("Listing EDipendente by Criteria...");
		foundation.EDipendenteCriteria eDipendenteCriteria = new foundation.EDipendenteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eDipendenteCriteria.ID.eq();
		eDipendenteCriteria.setMaxResults(ROW_COUNT);
		foundation.EDipendente[] foundationEDipendentes = eDipendenteCriteria.listEDipendente();
		length =foundationEDipendentes== null ? 0 : Math.min(foundationEDipendentes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationEDipendentes[i]);
		}
		System.out.println(length + " EDipendente record(s) retrieved."); 
		
		System.out.println("Listing EProgetto by Criteria...");
		foundation.EProgettoCriteria eProgettoCriteria = new foundation.EProgettoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eProgettoCriteria.ID.eq();
		eProgettoCriteria.setMaxResults(ROW_COUNT);
		foundation.EProgetto[] foundationEProgettos = eProgettoCriteria.listEProgetto();
		length =foundationEProgettos== null ? 0 : Math.min(foundationEProgettos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationEProgettos[i]);
		}
		System.out.println(length + " EProgetto record(s) retrieved."); 
		
		System.out.println("Listing ESottoprogetto by Criteria...");
		foundation.ESottoprogettoCriteria eSottoprogettoCriteria = new foundation.ESottoprogettoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eSottoprogettoCriteria.ID.eq();
		eSottoprogettoCriteria.setMaxResults(ROW_COUNT);
		foundation.ESottoprogetto[] foundationESottoprogettos = eSottoprogettoCriteria.listESottoprogetto();
		length =foundationESottoprogettos== null ? 0 : Math.min(foundationESottoprogettos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationESottoprogettos[i]);
		}
		System.out.println(length + " ESottoprogetto record(s) retrieved."); 
		
		System.out.println("Listing ETask by Criteria...");
		foundation.ETaskCriteria eTaskCriteria = new foundation.ETaskCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eTaskCriteria.ID.eq();
		eTaskCriteria.setMaxResults(ROW_COUNT);
		foundation.ETask[] foundationETasks = eTaskCriteria.listETask();
		length =foundationETasks== null ? 0 : Math.min(foundationETasks.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationETasks[i]);
		}
		System.out.println(length + " ETask record(s) retrieved."); 
		
		System.out.println("Listing ETimeRecordLavorativo by Criteria...");
		foundation.ETimeRecordLavorativoCriteria eTimeRecordLavorativoCriteria = new foundation.ETimeRecordLavorativoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eTimeRecordLavorativoCriteria.ID.eq();
		eTimeRecordLavorativoCriteria.setMaxResults(ROW_COUNT);
		foundation.ETimeRecordLavorativo[] foundationETimeRecordLavorativos = eTimeRecordLavorativoCriteria.listETimeRecordLavorativo();
		length =foundationETimeRecordLavorativos== null ? 0 : Math.min(foundationETimeRecordLavorativos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationETimeRecordLavorativos[i]);
		}
		System.out.println(length + " ETimeRecordLavorativo record(s) retrieved."); 
		
		System.out.println("Listing ETariffa by Criteria...");
		foundation.ETariffaCriteria eTariffaCriteria = new foundation.ETariffaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eTariffaCriteria.ID.eq();
		eTariffaCriteria.setMaxResults(ROW_COUNT);
		foundation.ETariffa[] foundationETariffas = eTariffaCriteria.listETariffa();
		length =foundationETariffas== null ? 0 : Math.min(foundationETariffas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationETariffas[i]);
		}
		System.out.println(length + " ETariffa record(s) retrieved."); 
		
		System.out.println("Listing ETimeRecordNL by Criteria...");
		foundation.ETimeRecordNLCriteria eTimeRecordNLCriteria = new foundation.ETimeRecordNLCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eTimeRecordNLCriteria.ID.eq();
		eTimeRecordNLCriteria.setMaxResults(ROW_COUNT);
		foundation.ETimeRecordNL[] foundationETimeRecordNLs = eTimeRecordNLCriteria.listETimeRecordNL();
		length =foundationETimeRecordNLs== null ? 0 : Math.min(foundationETimeRecordNLs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationETimeRecordNLs[i]);
		}
		System.out.println(length + " ETimeRecordNL record(s) retrieved."); 
		
		System.out.println("Listing ESpesaExtra by Criteria...");
		foundation.ESpesaExtraCriteria eSpesaExtraCriteria = new foundation.ESpesaExtraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eSpesaExtraCriteria.ID.eq();
		eSpesaExtraCriteria.setMaxResults(ROW_COUNT);
		foundation.ESpesaExtra[] foundationESpesaExtras = eSpesaExtraCriteria.listESpesaExtra();
		length =foundationESpesaExtras== null ? 0 : Math.min(foundationESpesaExtras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationESpesaExtras[i]);
		}
		System.out.println(length + " ESpesaExtra record(s) retrieved."); 
		
		System.out.println("Listing EProroga by Criteria...");
		foundation.EProrogaCriteria eProrogaCriteria = new foundation.EProrogaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eProrogaCriteria.ID.eq();
		eProrogaCriteria.setMaxResults(ROW_COUNT);
		foundation.EProroga[] foundationEProrogas = eProrogaCriteria.listEProroga();
		length =foundationEProrogas== null ? 0 : Math.min(foundationEProrogas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationEProrogas[i]);
		}
		System.out.println(length + " EProroga record(s) retrieved."); 
		
		System.out.println("Listing EDipendente_ETask by Criteria...");
		foundation.EDipendente_ETaskCriteria eDipendente_ETaskCriteria = new foundation.EDipendente_ETaskCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eDipendente_ETaskCriteria.ID.eq();
		eDipendente_ETaskCriteria.setMaxResults(ROW_COUNT);
		foundation.EDipendente_ETask[] foundationEDipendente_ETasks = eDipendente_ETaskCriteria.listEDipendente_ETask();
		length =foundationEDipendente_ETasks== null ? 0 : Math.min(foundationEDipendente_ETasks.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(foundationEDipendente_ETasks[i]);
		}
		System.out.println(length + " EDipendente_ETask record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTimeLoggingData listTimeLoggingData = new ListTimeLoggingData();
			try {
				listTimeLoggingData.listTestData();
				//listTimeLoggingData.listByCriteria();
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
