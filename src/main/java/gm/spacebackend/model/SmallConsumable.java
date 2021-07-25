package gm.spacebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMALLCONSUMABLES")
public class SmallConsumable {
	@Id
    @GeneratedValue
    private Long id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="rested")
	private int timesRested;

	
	public SmallConsumable() {
		super();
	}

	public SmallConsumable(String name, int timesRested) {
		super();
		this.name = name;
		this.timesRested = timesRested;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimesRested() {
		return timesRested;
	}

	public void setTimesRested(int timesRested) {
		this.timesRested = timesRested;
	}
	
}
