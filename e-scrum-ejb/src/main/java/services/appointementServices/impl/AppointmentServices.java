package services.appointementServices.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import services.appointementServices.interfaces.AppointmentServicesLocal;
import services.appointementServices.interfaces.AppointmentServicesRemote;
import entities.Appointement;
import entities.Doctor;
import entities.Patient;

/**
 * Session Bean implementation class appointmentServices
 */
@Stateless
public class AppointmentServices implements AppointmentServicesRemote,
		AppointmentServicesLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager entityManager;

	public AppointmentServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPatient(Patient p) {
		boolean b = false;
		try {
			entityManager.persist(p);
			b = true;
		} catch (PersistenceException ex) {
			System.out.println("Failed Persist");
			System.out.println(ex.getStackTrace());
		}
		return b;
	}

	@Override
	public boolean updatePatient(Patient patient) {
		Boolean b = false;
		try {

			entityManager.merge(patient);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;

	}

	@Override
	public boolean addDoctor(Doctor doctor) {
		boolean b = false;
		try {
			entityManager.persist(doctor);
			b = true;
		} catch (PersistenceException ex) {
			System.out.println("Failed Persist");
			System.out.println(ex.getStackTrace());
		}
		return b;
	}

	@Override
	public Boolean createAppointment(Patient patient, Doctor doctor, Date date,
			String type) {
		Boolean b = false;
		try {
			Appointement appointement = new Appointement(type,
					entityManager.merge(patient), entityManager.merge(doctor),
					date);
			entityManager.merge(appointement);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Patient findPatienById(Integer id) {

		return entityManager.find(Patient.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> findPatientByName(String name) {
		String jpql = "select d from Patient d where d.name=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", name);
		return query.getResultList();
	}

	@Override
	public Doctor findDoctorById(Integer id) {
		return entityManager.find(Doctor.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> findDoctorByName(String name) {
		String jpql = "select d from Doctor d where d.name=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", name);
		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> findAllDoctors() {
		String jpql = "select * from Doctor ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> findAllPatients() {
		String jpql = "select p from Patient ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointement> findAllAppointment() {
		String jpql = "select a from Appointement ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointement> findAppointmentByIdDoctor(Integer idDoctor) {
		String jpql = "select a from Appointement a where a.doctor.id=: param ";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", idDoctor);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointement> findAppointmentByDate(Date date) {
		String jpql = "select a from Appointement a where a.appointmentId.dateAppointment=:param ";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", date);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointement> findAppointmentsByIdPatient(Integer idPatient) {
		String jpql = "select a from Appointement a where a.patient.id=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", idPatient);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointement> findAppointementsByType(String typeAppointment) {
		String jpql = "select a from Appointement a where a.type=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", typeAppointment);
		return query.getResultList();
	}

}
