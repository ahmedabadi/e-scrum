package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Patient
 *
 */
@Entity
public class Patient implements Serializable {

	private Integer idPatient;
	private String Name;
	private Integer cinNumber;
	private Date dateBirth;
	private String address;
	private Integer phoneNumber;
	private static final long serialVersionUID = 1L;

	private MedicalRecord medicalRecord;
	private List<Appointement> appointements;

	public Patient() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPatient() {
		return this.idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getCinNumber() {
		return this.cinNumber;
	}

	public void setCinNumber(Integer cinNumber) {
		this.cinNumber = cinNumber;
	}

	public Date getDateBirth() {
		return this.dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@OneToOne
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@OneToMany(mappedBy = "patient")
	public List<Appointement> getAppointements() {
		return appointements;
	}

	public void setAppointements(List<Appointement> appointements) {
		this.appointements = appointements;
	}

}
