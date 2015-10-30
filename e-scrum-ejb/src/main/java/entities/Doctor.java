package entities;

import java.io.Serializable;
import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity
public class Doctor implements Serializable {

	private Integer id;
	private Integer cinNumber;
	private String Name;
	private String address;
	private Integer phoneNumber;
	private String speciality;
	private ReportAnalyse reportAnalyse;
	private static final long serialVersionUID = 1L;


	private List<Consultation> consultations;
	private List<Appointement> appointements;

	public Doctor() {
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

	public Integer getCinNumber() {
		return this.cinNumber;
	}

	public void setCinNumber(Integer cinNumber) {
		this.cinNumber = cinNumber;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
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

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@OneToMany(mappedBy = "doctor")
	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	@OneToMany(mappedBy = "doctor")
	public List<Appointement> getAppointements() {
		return appointements;
	}

	public void setAppointements(List<Appointement> appointements) {
		this.appointements = appointements;
	}

	@ManyToOne
	public ReportAnalyse getReportAnalyse() {
		return reportAnalyse;
	}

	public void setReportAnalyse(ReportAnalyse reportAnalyse) {
		this.reportAnalyse = reportAnalyse;
	}

}
