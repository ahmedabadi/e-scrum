package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Appointment
 *
 */
@Entity
public class Appointment implements Serializable {

	private Integer id;
	private Date dateAppointment;

	private static final long serialVersionUID = 1L;

	public Appointment() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateAppointment() {
		return this.dateAppointment;
	}

	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

}
