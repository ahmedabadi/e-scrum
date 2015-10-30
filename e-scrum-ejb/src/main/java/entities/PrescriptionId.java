package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: PrescriptionId
 *
 */
@Embeddable
public class PrescriptionId implements Serializable {

	private Date datePrescription;
	private Integer idConsultation;
	private Integer idMedicament;
	private static final long serialVersionUID = 1L;

	public PrescriptionId() {
		super();
	}

	public Date getDatePrescription() {
		return this.datePrescription;
	}

	public void setDatePrescription(Date datePrescription) {
		this.datePrescription = datePrescription;
	}

	public Integer getIdConsultation() {
		return idConsultation;
	}

	public void setIdConsultation(Integer idConsultation) {
		this.idConsultation = idConsultation;
	}

	public Integer getIdMedicament() {
		return idMedicament;
	}

	public void setIdMedicament(Integer idMedicament) {
		this.idMedicament = idMedicament;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((datePrescription == null) ? 0 : datePrescription.hashCode());
		result = prime * result
				+ ((idConsultation == null) ? 0 : idConsultation.hashCode());
		result = prime * result
				+ ((idMedicament == null) ? 0 : idMedicament.hashCode());
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
		PrescriptionId other = (PrescriptionId) obj;
		if (datePrescription == null) {
			if (other.datePrescription != null)
				return false;
		} else if (!datePrescription.equals(other.datePrescription))
			return false;
		if (idConsultation == null) {
			if (other.idConsultation != null)
				return false;
		} else if (!idConsultation.equals(other.idConsultation))
			return false;
		if (idMedicament == null) {
			if (other.idMedicament != null)
				return false;
		} else if (!idMedicament.equals(other.idMedicament))
			return false;
		return true;
	}

}
