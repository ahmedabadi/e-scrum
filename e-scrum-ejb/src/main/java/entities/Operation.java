package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Operation
 *
 */
@Entity
public class Operation implements Serializable {

	private Integer id;
	private Date dateOperation;
	private String status;
	private String description;
	private static final long serialVersionUID = 1L;
	private List<Consultation> consultations;

	public Operation() {
		super();
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany (mappedBy ="operations")
	
	public List<Consultation> getConsultations() {
		return consultations;
	}

	
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", dateOperation=" + dateOperation
				+ ", status=" + status + ", description=" + description
				+ ", consultations=" + consultations + "]";
	}
	

}
