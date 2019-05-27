//package com.via.sep.demo.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Procedure")
//public class Procedure {
//
//	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)
//	@Column(name = "Procedure")
//	private String procedureType;
//	
//	@Column(name = "price")
//	private double price;
//
//	public Procedure() {
//		
//	}
//
//	public Procedure(String procedureType, double price) {
//		
//		this.procedureType = procedureType;
//		this.price = price;
//	}
//
//	public String getProcedureType() {
//		return procedureType;
//	}
//
//	public void setProcedureType(String procedureType) {
//		this.procedureType = procedureType;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	@Override
//	public String toString() {
//		return "Procedure [procedureType=" + procedureType + ", price=" + price + "]";
//	}
//	
//		
//	
//
//}
