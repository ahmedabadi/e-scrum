package services.appointementServices.interfaces;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import entities.Appointement;
import entities.Doctor;
import entities.Patient;

@Remote
public interface AppointmentServicesRemote {

	boolean addPatient(Patient p);

	boolean updatePatient(Patient p);

	boolean addDoctor(Doctor doctor);

	Boolean createAppointment(Patient patient, Doctor doctor, Date date,
			String type);

	Patient findPatienById(Integer id);

	List<Patient> findPatientByName(String name);

	Doctor findDoctorById(Integer id);

	List<Doctor> findDoctorByName(String Name);

	List<Doctor> findAllDoctors();

	List<Patient> findAllPatients();

	List<Appointement> findAllAppointment();

	List<Appointement> findAppointmentsByIdPatient(Integer idPatient);

	List<Appointement> findAppointmentByIdDoctor(Integer idDoctor);

	List<Appointement> findAppointmentByDate(Date date);

	List<Appointement> findAppointementsByType(String typeAppointment);

}
