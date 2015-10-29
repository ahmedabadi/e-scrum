package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;

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

}
