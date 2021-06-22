package com.abcairlines.model;

//https://dzone.com/articles/spring-boot-restful-web-service-complete-example

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {

	private List<Abcuserdetails> userRecords;
	private static UserRegistration userReg = null;

	private UserRegistration() {
		userRecords = new ArrayList<Abcuserdetails>();
	}

	public static UserRegistration getInstance() {

		if (userReg == null) {
			userReg = new UserRegistration();
			return userReg;
		} else
			return userReg;
	}

	public void addUser(Abcuserdetails user) {
		userRecords.add(user);
	}
	
	public List<Abcuserdetails> getUserRecord(){
		return userRecords;
	}

}

/*
 * public String upDateStudent(Student std) { 
 * for (int i = 0; i < studentRecords.size(); i++) { Student stdn =
 * studentRecords.get(i); if
 * (stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
 * studentRecords.set(i, std);// update the new record return
 * "Update successful"; } }
 * return "Update un-successful"; }
 * 
 * public String deleteStudent(String registrationNumber) {
 * for (int i = 0; i < studentRecords.size(); i++) { Student stdn =
 * studentRecords.get(i); if
 * (stdn.getRegistrationNumber().equals(registrationNumber)) {
 * studentRecords.remove(i);// update the new record return "Delete successful";
 * } }
 * return "Delete un-successful"; }
 * public List<Student> getStudentRecords() { return studentRecords; }
 */
