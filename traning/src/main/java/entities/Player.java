package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player implements Serializable {

	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	private Tem tem;

	public Player() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
@ManyToOne
	public Tem getTem() {
		return tem;
	}

	public void setTem(Tem tem) {
		this.tem = tem;
	}

}
