package services.interfaces;

import javax.ejb.Remote;

@Remote
public interface AservicesRemote {
	
 String sayHello (String name); 
	
	

}
