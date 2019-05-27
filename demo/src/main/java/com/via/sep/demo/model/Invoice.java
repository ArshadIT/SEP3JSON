//package com.via.sep.demo.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Invoice")
//public class Invoice {
//	
//	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)
//	@Column(name = "InvocieId")
//	private int invoiceId;
//	
////	@OneToMany
////	@JoinColumn(name ="procedureType")
////	private Procedure procedures;
//	public Invoice() {
//		
//	}
//
//	public Invoice(int invoiceId) {
//		
//		this.invoiceId = invoiceId;
//	}
//
//	public int getInvoiceId() {
//		return invoiceId;
//	}
//
//	public void setInvoiceId(int invoiceId) {
//		this.invoiceId = invoiceId;
//	}
//
////	public Procedure getProcedures() {
////		return procedures;
////	}
////
////	public void setProcedures(Procedure procedures) {
////		this.procedures = procedures;
////	}
//
////	@Override
////	public String toString() {
////		return "Invoice [invoiceId=" + invoiceId + ", procedures=" + procedures + "]";
////	}
//	
//
//
//}
