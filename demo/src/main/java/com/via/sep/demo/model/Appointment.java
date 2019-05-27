package com.via.sep.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name= "Appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "appointmentId")
	private int appointmentId;
	
	@ManyToOne
	private Patient patients;
	@ManyToOne
	private Branch branches;
	@ManyToOne
	private Dentist dentists;
	

	public Appointment() {
		
	}

	public Appointment(int appointmentId) {
		
		this.appointmentId = appointmentId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	public Dentist getDentists() {
		return dentists;
	}

	public void setDentists(Dentist dentists) {
		this.dentists = dentists;
	}

	public Patient getPatients() {
		return patients;
	}

	public void setPatients(Patient patients) {
		this.patients = patients;
	}

	public Branch getBranches() {
		return branches;
	}

	public void setBranches(Branch branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", dentists=" + dentists + ", patients=" + patients
				+ ", branches=" + branches + "]";
	}
	
}
