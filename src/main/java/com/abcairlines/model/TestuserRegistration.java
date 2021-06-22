package com.abcairlines.model;

import java.util.ArrayList;
import java.util.List;

public class TestuserRegistration {

	private List<Testuser> tuserRecords;
	private static TestuserRegistration tuserReg = null;

	private TestuserRegistration() {
		tuserRecords = new ArrayList<Testuser>();
	}

	public static TestuserRegistration getInstance() {

		if (tuserReg == null) {
			tuserReg = new TestuserRegistration();
			return tuserReg;
		} else
			return tuserReg;
	}

	public void addUser(Testuser user) {
		tuserRecords.add(user);
	}
	
	public List<Testuser> getUserRecord(){
		return tuserRecords;
	}

}
