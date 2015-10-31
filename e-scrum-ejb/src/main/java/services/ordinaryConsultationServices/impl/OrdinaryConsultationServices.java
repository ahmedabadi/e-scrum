package services.ordinaryConsultationServices.impl;

import javax.ejb.Stateless;
import services.ordinaryConsultationServices.interfaces.OrdinaryConsultationServicesLocal;
import services.ordinaryConsultationServices.interfaces.OrdinaryConsultationServicesRemote;

/**
 * Session Bean implementation class OrdinaryConsultationServices
 */
@Stateless
public class OrdinaryConsultationServices implements OrdinaryConsultationServicesRemote, OrdinaryConsultationServicesLocal {

    /**
     * Default constructor. 
     */
    public OrdinaryConsultationServices() {
        // TODO Auto-generated constructor stub
    }

}
