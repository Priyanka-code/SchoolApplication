package com.example.school.application.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.application.models.ParentModel;
import com.example.school.application.services.TeacherService;

@RequestMapping("/teacher")
@RestController
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@PostMapping("/addParent")
	public String addParent(@Valid @RequestBody ParentModel parentModel) {
		String msg = teacherService.addParentService(parentModel);
		return msg;
	}
}
