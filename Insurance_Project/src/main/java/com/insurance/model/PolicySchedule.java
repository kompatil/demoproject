package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policyschedulerdetails")
public class PolicySchedule
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	String policyname;
	String planname;
	String username;
	Double premiumamount;
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getPremiumamount() {
		return premiumamount;
	}
	public void setPremiumamount(Double premiumamount) {
		this.premiumamount = premiumamount;
	}
	@Override
	public String toString() {
		return "PolicySchedule [policyname=" + policyname + ", planname=" + planname + ", username=" + username
				+ ", premiumamount=" + premiumamount + "]";
	}


}
