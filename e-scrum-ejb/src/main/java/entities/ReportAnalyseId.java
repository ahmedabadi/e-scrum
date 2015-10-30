package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: ReportAnalyseId
 *
 */
@Embeddable
public class ReportAnalyseId implements Serializable {
	private Integer idConsultation;
	private Integer idAnalyse;
	private Date dateReportAnalyse;

	private static final long serialVersionUID = 1L;

	public ReportAnalyseId() {
		super();
	}

	public Integer getIdConsultation() {
		return idConsultation;
	}

	public void setIdConsultation(Integer idConsultation) {
		this.idConsultation = idConsultation;
	}

	public Integer getIdAnalyse() {
		return idAnalyse;
	}

	public void setIdAnalyse(Integer idAnalyse) {
		this.idAnalyse = idAnalyse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((dateReportAnalyse == null) ? 0 : dateReportAnalyse
						.hashCode());
		result = prime * result
				+ ((idAnalyse == null) ? 0 : idAnalyse.hashCode());
		result = prime * result
				+ ((idConsultation == null) ? 0 : idConsultation.hashCode());
		return result;
	}

	public Date getDateReportAnalyse() {
		return dateReportAnalyse;
	}

	public void setDateReportAnalyse(Date dateReportAnalyse) {
		this.dateReportAnalyse = dateReportAnalyse;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReportAnalyseId other = (ReportAnalyseId) obj;
		if (dateReportAnalyse == null) {
			if (other.dateReportAnalyse != null)
				return false;
		} else if (!dateReportAnalyse.equals(other.dateReportAnalyse))
			return false;
		if (idAnalyse == null) {
			if (other.idAnalyse != null)
				return false;
		} else if (!idAnalyse.equals(other.idAnalyse))
			return false;
		if (idConsultation == null) {
			if (other.idConsultation != null)
				return false;
		} else if (!idConsultation.equals(other.idConsultation))
			return false;
		return true;
	}

}
