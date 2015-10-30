package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ReportAnalyseID
 *
 */

@Embeddable

public class ReportAnalyseID implements Serializable {

	private Date date;
	private Integer idConsultation;
	private Integer idDoctor;
	private String description;
	private static final long serialVersionUID = 1L;

	public ReportAnalyseID() {
		super();
	}   
	
	public ReportAnalyseID(Integer idDoctor, Integer idConsultation,
			Date dateConsultation) {
		super();
		this.idDoctor = idDoctor;
		this.idConsultation = idConsultation;
		this.date = dateConsultation;
	}
	
  
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}
	public Integer getIdConsultation() {
		return idConsultation;
	}
	public void setIdConsultation(Integer idConsultation) {
		this.idConsultation = idConsultation;
	}
   
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((idDoctor == null) ? 0 : idDoctor.hashCode());
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
		if (idDoctor == null) {
			if (other.idDoctor != null)
				return false;
		} else if (!idDoctor.equals(other.idDoctor))
			return false;
		if (idConsultation == null) {
			if (other.idConsultation != null)
				return false;
		} else if (!idConsultation.equals(other.idConsultation))
			return false;
		return true;
	}

	
	
}
