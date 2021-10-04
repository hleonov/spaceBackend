package gm.spacebackend.model;
import javax.persistence.*;

@Entity
@Table(name = "CharacterConsumables")
public class CharacterConsumables {

	private static final int DEFAULT_STAT = 10;

    @GeneratedValue
    private Long id;
	
	@Id
	@Column(name="name", nullable = false)
	private String name;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "maxValue", column = @Column(name = "might_maxValue")),
		@AttributeOverride( name = "currentValue", column = @Column(name = "might_currentValue")),
	})
	private Consumable might;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "maxValue", column = @Column(name = "speed_maxValue")),
		@AttributeOverride( name = "currentValue", column = @Column(name = "speed_currentValue")),
	})
	private Consumable speed;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "maxValue", column = @Column(name = "intellect_maxValue")),
		@AttributeOverride( name = "currentValue", column = @Column(name = "intellect_currentValue")),
	})
	private Consumable intellect;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "maxValue", column = @Column(name = "stress_maxValue")),
		@AttributeOverride( name = "currentValue", column = @Column(name = "stress_currentValue")),
	})
	private Consumable stress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "maxValue", column = @Column(name = "mental_maxValue")),
		@AttributeOverride( name = "currentValue", column = @Column(name = "mental_currentValue")),
	})
	private Consumable mental;

	@Column(name="rested")
	private int timesRested;
	
	public CharacterConsumables() {}

	public CharacterConsumables(String name, Consumable might, Consumable speed, Consumable intellect,
			Consumable stress, Consumable mental) {
		this.name = name;
		this.might = might;
		this.speed = speed;
		this.intellect = intellect;
		this.stress = stress;
		this.mental = mental;
		this.timesRested = 0;
	}

	public CharacterConsumables(String name) {
		this(name, new Consumable(DEFAULT_STAT), new Consumable(DEFAULT_STAT), new Consumable(DEFAULT_STAT),
				new Consumable(DEFAULT_STAT), new Consumable(DEFAULT_STAT));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Consumable getMight() {
		return might;
	}

	public void setMight(Consumable might) {
		this.might = might;
	}

	public Consumable getSpeed() {
		return speed;
	}

	public void setSpeed(Consumable speed) {
		this.speed = speed;
	}

	public Consumable getIntellect() {
		return intellect;
	}

	public void setIntellect(Consumable intellect) {
		this.intellect = intellect;
	}

	public Consumable getStress() {
		return stress;
	}

	public void setStress(Consumable stress) {
		this.stress = stress;
	}

	public Consumable getMental() {
		return mental;
	}

	public void setMental(Consumable mental) {
		this.mental = mental;
	}

	public int getTimesRested() {
		return timesRested;
	}

	public void setTimesRested(int timesRested) {
		this.timesRested = timesRested;
	}

}
