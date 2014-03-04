package Servants;

import java.util.ArrayList;
import java.util.HashSet;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EManagerCondiviso;
import Condivisione.EntityCondivise.ESottoprogettoCondiviso;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.InterfacceCondivise._ConsulenteManagerDisp;
import Ice.Current;
import Mapper.EntityMappersFactory;



public class ConsulenteManagerI extends _ConsulenteManagerDisp {

	@Override
	public void createConsulente(String nome, String cognome, String indirizzo,
			Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateConsulente(EConsulenteCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<EConsulenteCondiviso> getListConsulenti(
			EDipendenteCondiviso dipendente, Current __current){
		// TODO Auto-generated method stub
		
		try{
			foundation.ESottoprogetto foundationSP[]=foundation.ESottoprogettoDAO.listESottoprogettoByQuery(null,null);
			foundation.ETask foundationT[]=foundation.ETaskDAO.listETaskByQuery(null,null);
			foundation.EDipendente_ETask foundationEDipTAsk[]=foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery(null,null);
			
			//foundation.EDipendente foundationTask[] = foundation.EDipendenteDAO.listEDipendenteByQuery(null, null);
			
			ArrayList<EConsulenteCondiviso> listC = new ArrayList<EConsulenteCondiviso>();	
			ArrayList<ETaskCondiviso> listT = new ArrayList<ETaskCondiviso>();
			
			for (int i = 0; i < foundationSP.length; i++) 
			{ 
				if (foundationSP[i].geteDipendente().getID()==dipendente.id)
				{ 
					for(int j = 0; j < foundationT.length; j++)
					{
						// qui vado a prendere la lista dei task appartenenti al manager
						if(foundationT[j].geteSottoprogetto().getID()==foundationSP[i].getID())
							listT.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationT[j])); 
					}		
				}
			}
		    // inserisco i dipendeti della mia lista di task nell' auxListC
			for(int k=0;k<listT.size();k++)
			{
				if (listC.isEmpty())
					listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
				
				else
				{
					boolean trovato=false;
					for(int z=0; z<listC.size(); z++)
					{
						if( listC.get(z).getId()==listT.get(k).getDipendente().getId())
						  	trovato=true;
					}
					if (!trovato)
					{
						listC.add((EConsulenteCondiviso) listT.get(k).getDipendente());
					}
				}
			}
			return listC;
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		return null;
	}

	@Override
	public void deleteConsulente(EConsulenteCondiviso e, Current __current) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ETaskCondiviso> getListTask(
			EConsulenteCondiviso consulente, Current __current) {
		// TODO Auto-generated method stub
	
		try{
			foundation.ETask foundationTask[] = foundation.ETaskDAO.listETaskByQuery(null, null);
			foundation.EDipendente_ETask foundationEDipTAsk[]=foundation.EDipendente_ETaskDAO.listEDipendente_ETaskByQuery(null,null);
			//adesso passo da hibernate a ice
			ArrayList<ETaskCondiviso> list = new ArrayList<ETaskCondiviso>();	
			
			for (int i = 0; i < foundationEDipTAsk.length; i++) 
			{ 
				if(foundationEDipTAsk[i].getEdipendente().getID()==consulente.getId())
				{ 
					for(int j = 0; j < foundationTask.length; j++)
					{
						if(foundationEDipTAsk[i].getEtask().getID()==foundationTask[j].getID())
							
							list.add((ETaskCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(foundationTask[j])); 
					}
				}
			}
			
			return list;
			}
		
			catch (Exception e) {
			e.printStackTrace();
			}
		
		
		
		
		return null;
	}

	

}
