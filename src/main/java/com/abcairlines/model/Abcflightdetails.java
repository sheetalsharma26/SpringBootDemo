package com.abcairlines.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name="abcflightdetails")
public class Abcflightdetails {
	@Id
//	@GeneratedValue
	@Column(name="fid")
	String fid;
	
	@Column(name="tocity")
	String toCity;
	
	@Column(name="fromcity")
	String fromCity;
	
	@Column(name="totalseat")
	int totalSeat;
	
	@Column(name="bookedseat")
	int bookedSeat;
	
	@Column(name="basefare")
	float baseFare;
	
	public Abcflightdetails() {
		
	}
	
	public Abcflightdetails(List<Abcflightdetails> abcflight) {
	
	}
	public Abcflightdetails(Abcflightdetails a) {
		this.toCity=a.toCity;
		this.baseFare=a.baseFare;
		this.bookedSeat=a.bookedSeat;
		this.fromCity=a.fromCity;
		this.totalSeat=a.totalSeat;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getBookedSeat() {
		return bookedSeat;
	}

	public void setBookedSeat(int bookedSeat) {
		this.bookedSeat = bookedSeat;
	}

	public float getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(float baseFare) {
		this.baseFare = baseFare;
	}



}
