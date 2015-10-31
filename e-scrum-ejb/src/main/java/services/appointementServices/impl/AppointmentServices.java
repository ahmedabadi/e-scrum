package services.appointementServices.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

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
	public boolean updatePatient(Patient p) {
		// TODO Auto-generated method stub
		return false;
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
			Appointement appointement = new Appointement(type, patient, doctor,
					date);
			entityManager.merge(appointement);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
