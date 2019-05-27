package com.via.sep.demo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Branch")
public class Branch implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branchId")
	private int branchId;

	@Column(name = "branchName")
	private String branchName;
	@Column(name = "branchNumber")
	private String branchNumber;
	@Column(name = "email")
	private String email;
//	@OneToOne
//	@MapsId
//	private Address address;

	@OneToMany(mappedBy = "branches", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("branches")
	private Set<Dentist> dentists;

	public Branch() {
	}

	public Branch(int branchId, String branchName, String branchNumber, String email, Set<Dentist> dentists) {
	
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchNumber = branchNumber;
		this.email = email;
		this.dentists = dentists;
	}

	public Set<Dentist> getDentists() {
		return dentists;
	}

	public void setDentists(Set<Dentist> dentists) {
		this.dentists = dentists;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchNumber=" + branchNumber
				+ ", email=" + email + ", dentists=" + dentists + "]";
	}

}
