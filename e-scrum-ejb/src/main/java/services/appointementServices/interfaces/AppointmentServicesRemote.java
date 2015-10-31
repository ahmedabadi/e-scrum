package services.appointementServices.interfaces;

import java.util.Date;

import javax.ejb.Remote;

import entities.Doctor;
import entities.Patient;

@Remote
public interface AppointmentServicesRemote {

	boolean addPatient(Patient p);

	boolean updatePatient(Patient p);

	boolean addDoctor(Doctor doctor);

	Boolean createAppointment(Patient patient, Doctor doctor, Date date,
			String type);

}
