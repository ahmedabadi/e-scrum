package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: ReportAnalyse
 *
 */
@Entity
public class ReportAnalyse implements Serializable {

	private Integer id;
	private static final long serialVersionUID = 1L;
	private ReportAnalyseID reportAnalyseID;
	private Consultation consultation;
	private Doctor doctor;
	

	public ReportAnalyse() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ReportAnalyseID getReportAnalyseID() {
		return reportAnalyseID;
	}

	public void setReportAnalyseID(ReportAnalyseID reportAnalyseID) {
		this.reportAnalyseID = reportAnalyseID;
	}

	@OneToMany
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	@OneToMany
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
