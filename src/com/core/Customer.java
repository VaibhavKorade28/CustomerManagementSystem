package com.core;

import java.time.LocalDate;

public class Customer{
     private String id;
     private String fname;
     private String lname;
     private String email;
     private String passwd;
     private Serviceplan plan;
     private double planAmount;
     private LocalDate dob;
     private boolean isActive;
	public Customer(String id, String fname, String lname, String email, String passwd, Serviceplan plan,
			LocalDate dob,double planAmount) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.passwd = passwd;
		this.plan = plan;
		this.dob = dob;
		this.planAmount=planAmount;
		this.isActive=true;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd="
				+ passwd + ", plan=" + plan + ", planAmount=" + planAmount + ", dob=" + dob + ", isActive=" + isActive
				+ "]";
	}

	public double getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(double planAmount) {
		this.planAmount = planAmount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Serviceplan getPlan() {
		return plan;
	}
	public void setPlan(Serviceplan plan) {
		this.plan = plan;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public boolean isMarried() {
		return isActive;
	}
	public void setMarried(boolean isActive) {
		this.isActive = isActive;
	}

	//@Override
	//public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		//return this.id.compareTo(o.id);
	//}
     
}
