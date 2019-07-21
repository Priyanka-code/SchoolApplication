package com.example.school.application.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.application.entity.Parent;
import com.example.school.application.models.ParentModel;
import com.example.school.application.repositories.ParentRepository;
import com.example.school.application.utility.Utility;

@Service
public class TeacherService {
	
	@Autowired
	ParentRepository parentRepository;
	
	public String addParentService(@Valid ParentModel parentModel) {
		String msg = "Parent added successfully.";
		Parent parent = new Parent();
		parent = (Parent)Utility.mappingObjects(parentModel, parent);
		
		parentRepository.save(parent);
		return msg;
	}

}
