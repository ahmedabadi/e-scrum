package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Analyse
 *
 */
@Entity
public class Analyse implements Serializable {

	private Integer id;
	private Date dateAnalyse;
	private String type;
	private static final long serialVersionUID = 1L;

	public Analyse() {
		super();
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateAnalyse() {
		return this.dateAnalyse;
	}

	public void setDateAnalyse(Date dateAnalyse) {
		this.dateAnalyse = dateAnalyse;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
