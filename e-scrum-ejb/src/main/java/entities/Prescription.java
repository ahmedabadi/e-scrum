package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Prescription
 *
 */
@Entity
public class Prescription implements Serializable {

	private PrescriptionId prescriptionId;
	private String Description;
	private static final long serialVersionUID = 1L;

	private Consultation consultation;
	private Medicament medicament;

	public Prescription() {
		super();
	}

	public Prescription(String description,Date datePrescription) {
		this.prescriptionId=new PrescriptionId(datePrescription, consultation.getId(), medicament.getId());
		Description = description;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@EmbeddedId
	public PrescriptionId getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(PrescriptionId prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	@ManyToOne
	 @JoinColumn(name = "idConsultation", referencedColumnName = "id",
	 insertable = false, updatable = false)
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	@ManyToOne
	@JoinColumn(name = "idMedicament", referencedColumnName = "id", insertable = false, updatable = false)
	public Medicament getMedicament() {
		return medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

}
