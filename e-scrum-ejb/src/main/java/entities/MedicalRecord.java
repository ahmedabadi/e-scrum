package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MedicalRecord
 *
 */
@Entity

public class MedicalRecord implements Serializable {

	
	private Integer id;
	private Date dateCreation;
	private String description;
	private Patient patient ; 
	private static final long serialVersionUID = 1L;
	private List<Consultation> consultations ;

	public MedicalRecord() {
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
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@OneToOne(mappedBy="medicalRecord")
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	@OneToMany (mappedBy ="medicalRecord")
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	@Override
	public String toString() {
		return "MedicalRecord [id=" + id + ", dateCreation=" + dateCreation
				+ ", description=" + description + ", patient=" + patient
				+ ", consultations=" + consultations + "]";
	}
	
   
}
