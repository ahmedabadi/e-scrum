package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Appointement
 *
 */
@Entity
public class Appointement implements Serializable {

	private String type;
	private AppointmentID appointmentId;
	private Patient patient;
	private Doctor doctor;
	private static final long serialVersionUID = 1L;

	public Appointement() {
		super();
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Id
	public AppointmentID getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(AppointmentID appointmentId) {
		this.appointmentId = appointmentId;
	}

	@ManyToOne
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
