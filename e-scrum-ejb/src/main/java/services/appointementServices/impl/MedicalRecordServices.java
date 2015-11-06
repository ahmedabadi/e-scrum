package services.appointementServices.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.appointementServices.interfaces.AppointmentServicesRemote;
import services.appointementServices.interfaces.MedicalRecordServicesLocal;
import services.appointementServices.interfaces.MedicalRecordServicesRemote;
import entities.MedicalRecord;
import entities.Patient;

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
			Patient patient) {
		Boolean b = true;
		AppointmentServicesRemote appointmentServices = new AppointmentServices();

		if (patient.getMedicalRecord() == null) {

			createMedicalRecord(medicalRecord);
			patient.setMedicalRecord(medicalRecord);

			entityManager.persist(patient);
			System.out.println("Medical record == null");
			b = true;
		} else {

			MedicalRecord medicalR = findMedicalRecordByIdPatient(patient
					.getId());
			patient.setMedicalRecord(medicalR);
			appointmentServices.addPatient(patient);
			b = true;
		}

		return b;
	}

	@Override
	public MedicalRecord findMedicalRecordByIdPatient(Integer idPatient) {
		String jpql = "select mr from MedicalRecord mr where mr.patient.id=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", idPatient);
		return (MedicalRecord) query.getSingleResult();
	}

}
