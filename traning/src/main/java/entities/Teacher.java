package entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Teacher
 *
 */
@Entity

public class Teacher extends User implements Serializable {

	private Integer experience;
	private static final long serialVersionUID = 1L;

	public Teacher() {
		super();
	}

	public Integer getExperience() {
		return this.experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

}
