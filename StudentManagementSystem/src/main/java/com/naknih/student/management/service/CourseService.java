package com.naknih.student.management.service;

import com.naknih.student.management.models.TO.CourseTO;
import com.naknih.student.managemnet.utils.SuccessObject;

public interface CourseService {
	
	public SuccessObject getCourseById(Integer id);
	
	public SuccessObject getAllCourse();
	
	public SuccessObject add(CourseTO course);

	public SuccessObject deleteCourseById(Integer id);
	

}
