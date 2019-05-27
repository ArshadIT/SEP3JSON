package com.via.sep.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name = "addressId")
private int addressId;

@Column(name = "streetName")
private String streetName;

@Column(name = "streetNumber")
private String streetNumber;

@Column(name = "postalCode")
private String postalCode;

@Column(name = "city")
private String city;

public Address() {
	
}

public Address(int addressId, String streetName, String streetNumber, String postalCode, String city) {
	this.addressId = addressId;
	this.streetName = streetName;
	this.streetNumber = streetNumber;
	this.postalCode = postalCode;
	this.city = city;
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
}

public String getStreetNumber() {
	return streetNumber;
}

public void setStreetNumber(String streetNumber) {
	this.streetNumber = streetNumber;
}

public String getPostalCode() {
	return postalCode;
}

public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getAddressId() {
	return addressId;
}

@Override
public String toString() {
	return "Address [AddressId=" + addressId + ", StreetName=" + streetName + ", StreetNumber=" + streetNumber
			+ ", PostalCode=" + postalCode + ", City=" + city + "]";
}





	
}
