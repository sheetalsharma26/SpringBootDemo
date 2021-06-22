package com.abcairlines.model;

import java.util.ArrayList;
import java.util.List;

public class FlightRegistration {

	private List<Abcflightdetails> flightRecords;
	private static FlightRegistration flightReg = null;

	private FlightRegistration() {
		flightRecords = new ArrayList<Abcflightdetails>();
	}

	private FlightRegistration getInstance(){
		
		if (flightReg==null) {
			flightReg=new FlightRegistration();
			return flightReg;
		}
		else
		return flightReg;
	}
	
	public void bookFlight(Abcflightdetails flightDetails) {
		flightRecords.add(flightDetails);
		
	}
	
	public List<Abcflightdetails> retreiveFlightDetails(){
		return flightRecords;
	}
}
