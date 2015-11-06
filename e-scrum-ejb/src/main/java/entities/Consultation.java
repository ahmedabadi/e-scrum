package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Consultation
 *
 */
@Entity
public class Consultation implements Serializable {

	private Integer id;
	private Date dateConsultation;
	private static final long serialVersionUID = 1L;

	private MedicalRecord medicalRecord;
	private Doctor doctor;
	private List<Operation> operations;
	private List<ReportAnalyse> reportAnalyses;
	private List<Prescription> prescriptions;

	public Consultation() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	@ManyToOne
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@ManyToOne
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@ManyToMany
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@OneToMany(mappedBy = "consultation")
	public List<ReportAnalyse> getReportAnalyses() {
		return reportAnalyses;
	}

	public void setReportAnalyses(List<ReportAnalyse> reportAnalyses) {
		this.reportAnalyses = reportAnalyses;
	}

	@OneToMany(mappedBy = "consultation")
	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	@Override
	public String toString() {
		return "Consultation [id=" + id + ", dateConsultation="
				+ dateConsultation + ", medicalRecord=" + medicalRecord
				+ ", doctor=" + doctor + ", operations=" + operations
				+ ", reportAnalyses=" + reportAnalyses + ", prescriptions="
				+ prescriptions + "]";
	}
	
	
}
