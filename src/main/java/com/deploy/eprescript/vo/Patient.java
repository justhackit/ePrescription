package com.deploy.eprescript.vo;

import java.util.Date;

public class Patient {
	
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobilePhoneNum;
	private String urgencyPhoneNum;
	private String sex;
	private Date dateOfBirth;
	private Double weight;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobilePhoneNum() {
		return mobilePhoneNum;
	}
	public void setMobilePhoneNum(String mobilePhoneNum) {
		this.mobilePhoneNum = mobilePhoneNum;
	}
	public String getUrgencyPhoneNum() {
		return urgencyPhoneNum;
	}
	public void setUrgencyPhoneNum(String urgencyPhoneNum) {
		this.urgencyPhoneNum = urgencyPhoneNum;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
