package services.appointementServices.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.appointementServices.interfaces.MedicalRecordServicesRemote;
import services.appointementServices.interfacesl.MedicalRecordServicesLocal;
import entities.MedicalRecord;

/**
 * Session Bean implementation class MedicalRecordServices
 */
@Stateless
public class MedicalRecordServices implements MedicalRecordServicesRemote,
		MedicalRecordServicesLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager entityManager;

	public MedicalRecordServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean createMedicalRecord(MedicalRecord medicalRecord) {
		Boolean b = false;
		try {

			entityManager.persist(medicalRecord);
			b = true;

		} catch (Exception e) {

		}
		return b;
	}

	@Override
	public Boolean assignMedicalRecordPatient(MedicalRecord medicalRecord,
			Integer idPatient) {
				return null;
				
		
		
	}

	@Override
	public MedicalRecord findMedicalRecordByIdPatient(Integer idPatient) {
		// TODO Auto-generated method stub
		return null;
	}

}
