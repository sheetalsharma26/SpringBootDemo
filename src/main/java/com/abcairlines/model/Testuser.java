package com.abcairlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Testuser {
	@Id
	@Column(name = "dname")
	int dname;

	@Column(name = "fname")
	String fname;

	@Column(name = "city")
	String city;

	public Testuser(int i, String fname, String city) {
		this.dname = i;
		this.fname = fname;
		this.city = city;
	}
	public Testuser(Testuser T) {
		this.dname = T.dname;
		this.fname = T.fname;
		this.city = T.city;
	}

	public Testuser() {
	}

	public int getDname() {
		return dname;
	}

	public void setDname(int dname) {
		this.dname = dname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}

}
