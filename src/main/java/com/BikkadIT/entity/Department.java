package com.BikkadIT.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Department {
	
	private int did;
	private String dname;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
}
