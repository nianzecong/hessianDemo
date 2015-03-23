package com.yesway.yconnect.api.entity;

import java.io.Serializable;
import java.util.Calendar;

public class User implements Serializable {
	
	private static final long serialVersionUID = -7124591171334078199L;
	
	private String userId;
	private String loginName;
	private String password;
	private int customerType;
	private String companyName;
	private String corpPersonName;
	private String corpPersonTelNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String title;
	private String gender;
	private Calendar birthday;
	private String email;
	private String identityNumber;
	private String province;
	private String city;
	private String district;
	private String adCode;
	private String address;
	private String zipCode;
	private String pin;
	private Calendar addTime;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCustomerType() {
		return customerType;
	}
	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCorpPersonName() {
		return corpPersonName;
	}
	public void setCorpPersonName(String corpPersonName) {
		this.corpPersonName = corpPersonName;
	}
	public String getCorpPersonTelNumber() {
		return corpPersonTelNumber;
	}
	public void setCorpPersonTelNumber(String corpPersonTelNumber) {
		this.corpPersonTelNumber = corpPersonTelNumber;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAdCode() {
		return adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Calendar getAddTime() {
		return addTime;
	}
	public void setAddTime(Calendar addTime) {
		this.addTime = addTime;
	}
	
}
