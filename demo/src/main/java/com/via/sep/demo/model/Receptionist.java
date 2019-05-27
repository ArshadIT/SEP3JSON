package com.via.sep.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Receptionist")
public class Receptionist {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "ReceptionistId")
	private int receptionistId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;

	public Receptionist() {
		
	}

	public Receptionist(int receptionistId, String firstName, String lastName) {
		
		this.receptionistId = receptionistId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(int receptionistId) {
		this.receptionistId = receptionistId;
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
	@Override
	public String toString() {
		return "Receptionist [receptionistId=" + receptionistId + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

	
}
