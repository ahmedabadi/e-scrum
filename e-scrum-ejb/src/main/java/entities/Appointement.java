package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: 
 *
 */
@Entity
public class Appointement implements Serializable {

	private AppointmentID appointmentId;
	private String type;
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

	@EmbeddedId
	public AppointmentID getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(AppointmentID appointmentId) {
		this.appointmentId = appointmentId;
	}

	@ManyToOne
	@JoinColumn(name = "idPatient", referencedColumnName = "idPatient", insertable = false, updatable = false)
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne
	@JoinColumn(name = "idDoctor", referencedColumnName = "id", insertable = false, updatable = false)
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
