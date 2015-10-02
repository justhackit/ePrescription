package com.deploy.eprescript.vo;

import com.deploy.eprescript.vo.ConstantsEnums.When;
import com.deploy.eprescript.vo.ConstantsEnums.Frequency;

public class Medication {
	
	private Medicine medicine;
	private Frequency frequency;
	private int quantity;
	private When dietContext;
	private int durationDays;
	private boolean dispensed = false;
	
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public When getDietContext() {
		return dietContext;
	}
	public void setDietContext(When dietContext) {
		this.dietContext = dietContext;
	}
	public int getDurationDays() {
		return durationDays;
	}
	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}
	public boolean isDispensed() {
		return dispensed;
	}
	public void setDispensed(boolean dispensed) {
		this.dispensed = dispensed;
	}
	
	
	
}
