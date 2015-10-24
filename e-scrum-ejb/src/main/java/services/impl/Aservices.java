package services.impl;

import javax.ejb.Stateless;

import services.interfaces.AservicesRemote;

/**
 * Session Bean implementation class Aservices
 */
@Stateless
public class Aservices implements AservicesRemote {
	
	
	   /**
     * Default constructor. 
     */
    public Aservices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
