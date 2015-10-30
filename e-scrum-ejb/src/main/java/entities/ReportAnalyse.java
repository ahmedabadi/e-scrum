package entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: ReportAnalyse
 *
 */
@Entity
public class ReportAnalyse implements Serializable {

	private String description;
	private static final long serialVersionUID = 1L;

	private ReportAnalyseID reportAnalyseId;
	private Consultation consultation;
	private Analyse analyse;

	public ReportAnalyse() {
		super();
	}

}
