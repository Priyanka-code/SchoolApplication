package com.example.school.application.models;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.school.application.entity.Parent;
import com.example.school.application.entity.Student;
import com.example.school.application.entity.Teacher;

@Component
public class UserModel {
	
	private List<Teacher> teacherList;
	private List<Parent> parentList;
	private List<Student> studentList;
	private List<AdminModel> adminList;
	
	public List<Teacher> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	public List<Parent> getParentList() {
		return parentList;
	}
	public void setParentList(List<Parent> parentList) {
		this.parentList = parentList;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public List<AdminModel> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<AdminModel> adminList) {
		this.adminList = adminList;
	}
	public UserModel(List<Teacher> teacherList, List<Parent> parentList, List<Student> studentList, List<AdminModel> adminList) {
		super();
		this.teacherList = teacherList;
		this.parentList = parentList;
		this.studentList = studentList;
		this.adminList = adminList;
	}
	public UserModel() {
		super();
	}
	
	

}
