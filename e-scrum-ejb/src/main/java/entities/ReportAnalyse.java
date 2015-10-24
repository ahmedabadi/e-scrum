package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: ReportAnalyse
 *
 */
@Entity
public class ReportAnalyse implements Serializable {

	private Integer id;
	private static final long serialVersionUID = 1L;

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

}
