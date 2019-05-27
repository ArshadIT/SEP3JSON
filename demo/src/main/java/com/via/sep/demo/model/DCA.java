//package com.via.sep.demo.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "DCA")
//public class DCA {
//
//	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)
//	@Column(name = "DCA")
//	private int dcaId;
//	
//	@OneToOne
//	@MapsId
//	private Branch branches;
//
//	public DCA() {
//		
//	}
//
//	public DCA(int dcaId) {
//		
//		this.dcaId = dcaId;
//	}
//
//	public int getDcaId() {
//		return dcaId;
//	}
//
//	public void setDcaId(int dcaId) {
//		this.dcaId = dcaId;
//	}
//
//	public Branch getBranches() {
//		return branches;
//	}
//
//	public void setBranches(Branch branches) {
//		this.branches = branches;
//	}
//
//	@Override
//	public String toString() {
//		return "DCA [dcaId=" + dcaId + ", branches=" + branches + "]";
//	}
//	
//	
//}
