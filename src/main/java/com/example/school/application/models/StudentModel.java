package com.example.school.application.models;

import org.springframework.stereotype.Component;

@Component
public class StudentModel {

	private String firstName;
	private String lastName;
	private String parentId;
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
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public StudentModel(String firstName, String lastName, String parentId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentId = parentId;
	}
	public StudentModel() {
		super();
	}

	
}
