package gm.spacebackend.model;

import javax.persistence.Embeddable;

@Embeddable
public class Consumable {

	int maxValue;
	int currentValue;

	
	public Consumable() {
		this.maxValue = 0;
		this.currentValue = 0;
	}

	public Consumable(int maxValue) {
		this.maxValue = maxValue;
		this.currentValue = maxValue;
	}
	
	public Consumable(int maxValue, int currentValue) {
		this.maxValue = maxValue;
		this.currentValue = currentValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	public int getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
}
