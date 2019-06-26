package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private String passportNumber;
	
	
	public Student(Integer sid,String sname, String passportNumber) {
		
		this.sid=sid;
		this.sname = sname;
		this.passportNumber = passportNumber;
	}
	public Student() {
		
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", passportNumber=" + passportNumber + "]";
	}

}
