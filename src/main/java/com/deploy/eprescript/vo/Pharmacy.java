package com.deploy.eprescript.vo;

import java.util.Date;

public class Pharmacy {
	
	private String pharmacyId;
	private String pharmacyName;
	private String prescSerialNum;
	private Date dateOfDispense;
	
	public String getPharmacyId() {
		return pharmacyId;
	}
	public void setPharmacyId(String pharmacyId) {
		this.pharmacyId = pharmacyId;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public String getPrescSerialNum() {
		return prescSerialNum;
	}
	public void setPrescSerialNum(String prescSerialNum) {
		this.prescSerialNum = prescSerialNum;
	}
	public Date getDateOfDispense() {
		return dateOfDispense;
	}
	public void setDateOfDispense(Date dateOfDispense) {
		this.dateOfDispense = dateOfDispense;
	}
	
	
}
