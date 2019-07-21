package com.example.school.application.models;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.school.application.entity.Student;

@Component
public class ParentModel {

	private String firstName;
	private String lastName;
	private List<Student> studentList;
	
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
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public ParentModel(String firstName, String lastName, List<Student> studentList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentList = studentList;
	}
	public ParentModel() {
		super();
	}
	
}
