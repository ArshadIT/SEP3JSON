package com.via.sep.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "Patient")
	public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "patientId")
	private int patientId;
	
	@ManyToOne
	private Address address;
	
	@Column(name = "cprNo")
	private String cprNo;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "email")
	private String email;

	
	public Patient() {
		
	}


	public Patient(int patientId, Address address, String cprNo, String firstName, String lastName, String phoneNumber,
			String email) {
	
		this.patientId = patientId;
		this.address = address;
		this.cprNo = cprNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getCprNo() {
		return cprNo;
	}


	public void setCprNo(String cprNo) {
		this.cprNo = cprNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", address=" + address + ", cprNo=" + cprNo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
	}
