
import condivisione.prova.persona;
import Ice.Object;

public class EntityFactory implements Ice.ObjectFactory {
	@Override
	public Object create(String type) {
		 if (type.equals(persona.ice_staticId())) {  
			 return new personaI(); 
	        }
	        assert(false); 
	        return null; 
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}