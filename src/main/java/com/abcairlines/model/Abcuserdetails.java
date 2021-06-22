package com.abcairlines.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//https://www.baeldung.com/the-persistence-layer-with-spring-and-jpa

@Entity
@Table(name = "abcflightdetails")
public class Abcuserdetails {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	Integer id;

	@Column(name = "fname")
	String fname;

	@Column(name = "lname")
	String lname;

	@Column(name = "address")
	String address;

	public Abcuserdetails(Integer id,String address, String lname, String fname) {
		this.id=id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	
	public Abcuserdetails() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
