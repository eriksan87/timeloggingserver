
package EntityCondivise;

import Condivisione.EntityCondivise.*;
import Condivisione.InterfacceCondivise.*;
import Ice.Object;

public class EntityFactory implements Ice.ObjectFactory {
	@Override
	public Object create(String type) {
	
	//System.out.println("tipo");	
		 if (type.equals(ETaskCondiviso.ice_staticId())) {  
			 return new ETaskCondivisoImp(); 
	        }
		 if (type.equals(ETimeRecordLavorativoCondiviso.ice_staticId())) {
			 return new ETimeRecordLavorativoCondivisoImp(); 
	        }
		 if (type.equals(ETimeRecordNonLavorativoCondiviso.ice_staticId())) {
			 return new ETimeRecordNonLavorativoCondivisoImp(); 
	        }
		 if (type.equals(EProgettoCondiviso.ice_staticId())) {
			 return new EProgettoCondivisoImp(); 
	        }
		 if (type.equals(EClienteCondiviso.ice_staticId())) {
			 return new EClienteCondivisoImp(); 
	        }
		 if (type.equals(EAdminCondiviso.ice_staticId())) {
			 return new EAdminCondivisoImp(); 
	        }
		 if (type.equals(EManagerCondiviso.ice_staticId())) {
			 return new EManagerCondivisoImp(); 
	        }
		 if (type.equals(ESottoprogettoCondiviso.ice_staticId())) {
			 return new ESottoprogettoCondivisoImp(); 
	        }
		 if (type.equals(EConsulenteCondiviso.ice_staticId())) {
			 return new EConsulenteCondivisoImp(); 
	        }
		 if (type.equals(ETariffaCondivisa.ice_staticId())) {
			 return new ETariffaCondivisaImp(); 
	        }
		    assert(false); 
	        return null; 
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}