package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: ReportAnalyseID
 *
 */

@Embeddable
public class ReportAnalyseID implements Serializable {

	private Date date;
	private Integer idConsultation;
	private Integer idAnalyse;

	private static final long serialVersionUID = 1L;

	public ReportAnalyseID() {
		super();
	}

	public ReportAnalyseID(Date date, Integer idConsultation, Integer idAnalyse) {
		super();
		this.date = date;
		this.idConsultation = idConsultation;
		this.idAnalyse = idAnalyse;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((idAnalyse == null) ? 0 : idAnalyse.hashCode());
		result = prime * result
				+ ((idConsultation == null) ? 0 : idConsultation.hashCode());
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
		ReportAnalyseID other = (ReportAnalyseID) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
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

	@Override
	public String toString() {
		return "ReportAnalyseID [date=" + date + ", idConsultation="
				+ idConsultation + ", idAnalyse=" + idAnalyse + "]";
	}

}
