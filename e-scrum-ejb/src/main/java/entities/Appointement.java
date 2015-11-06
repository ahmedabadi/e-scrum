package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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

	public Appointement(String type, Patient patient, Doctor doctor, Date date) {
		this.appointmentId = new AppointmentID(doctor.getId(), patient.getId(),
				date);
		this.type = type;
		this.patient = patient;
		this.doctor = doctor;
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

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idPatient", referencedColumnName = "id", insertable = false, updatable = false)
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idDoctor", referencedColumnName = "id", insertable = false, updatable = false)
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Appointement [appointmentId=" + appointmentId + ", type="
				+ type + ", patient=" + patient + ", doctor=" + doctor + "]";
	}

}
