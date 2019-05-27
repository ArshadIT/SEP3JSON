package com.via.sep.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Dentist")

public class Dentist {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "dentistId")
	private int dentistId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "speciality")
	private String sepciality;
	
	@ManyToOne
	@JoinColumn
	private Branch branches;

//	@ManyToOne(fetch=FetchType.EAGER)
//	
//	@JoinColumn(name = "branchId")
//	private Branch branches;
//	
//	
//	public Branch getBranches() {
//		return branches;
//	}
//
//
//
//	public void setBranches(Branch branches) {
//		this.branches = branches;
//	}



	public Dentist() {
		
	}

	

	public int getDentistId() {
		return dentistId;
	}

	public Dentist(int dentistId, String firstName, String lastName, String sepciality) {
		this.dentistId = dentistId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sepciality = sepciality;
		//this.branches = branches;
	}



	public void setDentistId(int dentistId) {
		this.dentistId = dentistId;
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

	public String getSepciality() {
		return sepciality;
	}

	public void setSepciality(String sepciality) {
		this.sepciality = sepciality;
	}



	@Override
	public String toString() {
		return "Dentist [dentistId=" + dentistId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", sepciality=" + sepciality +  "]";
	}

	
	
//	public Branch getBranches() {
//		return branches;
//	}
//
//	public void setBranches(Branch branches) {
//		this.branches = branches;
//	}

//	@Override
//	public String toString() {
//		return "Dentist [DentistId=" + dentistId + ", FirstName=" + FirstName + ", LastName=" + LastName
//				+ ", Sepciality=" + Sepciality + ", branches=" + branches + "]";
//	}
	
	
}
