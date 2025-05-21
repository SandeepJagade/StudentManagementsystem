package com.naknih.student.managemnet.TOToEntity;

import java.util.List;

import com.naknih.student.management.entity.Course;
import com.naknih.student.management.models.TO.CourseTO;

public class CourseTOToEntityConverter {
	
	public Course convertCourseTOToCourseEntity(CourseTO courseTo) {
		
		Course course = new Course();
		course.setCourseName(courseTo.getCourseName());
		course.setDateAdded(courseTo.getDateAdded());
		course.setDateModified(courseTo.getDateModified());
		return course;
	}
	
	
	public CourseTO convertCourseEntityToCourseTO(Course course) {
		return new CourseTO(course.getId(), course.getCourseName(), course.getDateAdded(), course.getDateModified());
	}


	public void convertCourseEntityToCourseTO(List<Course> list) {
		// TODO Auto-generated method stub
		
	}

}
