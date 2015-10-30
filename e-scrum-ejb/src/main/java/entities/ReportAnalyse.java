package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: ReportAnalyse
 *
 */
@Entity
public class ReportAnalyse implements Serializable {


	private String description;
	private static final long serialVersionUID = 1L;

	private ReportAnalyseId reportAnalyseId;
	private Consultation consultation;
	private Analyse analyse;

	public ReportAnalyse() {
		super();
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@EmbeddedId
	public ReportAnalyseId getReportAnalyseId() {
		return reportAnalyseId;
	}

	public void setReportAnalyseId(ReportAnalyseId reportAnalyseId) {
		this.reportAnalyseId = reportAnalyseId;
	}

	@ManyToOne
	@JoinColumn(name = "idConsultation", referencedColumnName = "id", insertable = false, updatable = false)
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	@ManyToOne
	@JoinColumn(name = "idAnalyse", referencedColumnName = "id", insertable = false, updatable = false)
	public Analyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}

}
