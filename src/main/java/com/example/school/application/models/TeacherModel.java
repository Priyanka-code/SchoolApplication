package com.example.school.application.models;

import org.springframework.stereotype.Component;

@Component
public class TeacherModel {

	private String firstName;
	private String lastName;
	private String designation;
	
	public TeacherModel(String firstName, String lastName, String designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public TeacherModel() {
		super();
	}

	
}
