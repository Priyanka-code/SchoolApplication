package com.example.school.application.utility;

import org.springframework.beans.BeanUtils;

public class Utility {
	
	public static Object mappingObjects(Object object1, Object object2)
	{
		BeanUtils.copyProperties(object1, object2);
		return object2;
		
	}

}
