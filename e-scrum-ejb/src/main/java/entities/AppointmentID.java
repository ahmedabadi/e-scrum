package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: AppointmentID
 *
 */
@Embeddable
public class AppointmentID implements Serializable {

	private Integer idDoctor;

	private Integer idPatient;

	private Date dateAppointment;
	private static final long serialVersionUID = 1L;

	public AppointmentID() {
		super();
	}

	public AppointmentID(Integer idDoctor, Integer idPatient,
			Date dateAppointment) {
		super();
		this.idDoctor = idDoctor;
		this.idPatient = idPatient;
		this.dateAppointment = dateAppointment;
	}

	public Integer getIdDoctor() {
		return this.idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Integer getIdPatient() {
		return this.idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}

	public Date getDateAppointment() {
		return this.dateAppointment;
	}

	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateAppointment == null) ? 0 : dateAppointment.hashCode());
		result = prime * result
				+ ((idDoctor == null) ? 0 : idDoctor.hashCode());
		result = prime * result
				+ ((idPatient == null) ? 0 : idPatient.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppointmentID other = (AppointmentID) obj;
		if (dateAppointment == null) {
			if (other.dateAppointment != null)
				return false;
		} else if (!dateAppointment.equals(other.dateAppointment))
			return false;
		if (idDoctor == null) {
			if (other.idDoctor != null)
				return false;
		} else if (!idDoctor.equals(other.idDoctor))
			return false;
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		return true;
	}

}
