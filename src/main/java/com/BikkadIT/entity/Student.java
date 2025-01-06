package com.BikkadIT.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
		
	@Id
	private int sid;
	private String name;
	private int marks;
	private String city;
//	private Department dp;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String name, int marks, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.city = city;
//		this.dp = dp;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


//	public Department getDp() {
//		return dp;
//	}
//
//
//	public void setDp(Department dp) {
//		this.dp = dp;
//	}
}
