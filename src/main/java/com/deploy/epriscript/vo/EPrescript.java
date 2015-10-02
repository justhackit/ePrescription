package com.deploy.epriscript.vo;

import java.util.Date;
import java.util.List;

public class EPrescript {
	
	private Physician physician;
	private String prescSerialNum;
	private Date prescDate;
	private Patient patient;
	private List<Medication> medicines;
	private List<Pharmacy> dispensedBy;
	
	public Physician getPhysician() {
		return physician;
	}
	public void setPhysician(Physician physician) {
		this.physician = physician;
	}
	public String getPrescSerialNum() {
		return prescSerialNum;
	}
	public void setPrescSerialNum(String prescSerialNum) {
		this.prescSerialNum = prescSerialNum;
	}
	public Date getPrescDate() {
		return prescDate;
	}
	public void setPrescDate(Date prescDate) {
		this.prescDate = prescDate;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public List<Medication> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Medication> medicines) {
		this.medicines = medicines;
	}
	public List<Pharmacy> getDispensedBy() {
		return dispensedBy;
	}
	public void setDispensedBy(List<Pharmacy> dispensedBy) {
		this.dispensedBy = dispensedBy;
	}

}
