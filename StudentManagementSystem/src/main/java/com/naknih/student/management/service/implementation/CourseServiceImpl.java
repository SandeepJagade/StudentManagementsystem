package com.naknih.student.management.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naknih.student.management.entity.Course;
import com.naknih.student.management.models.TO.CourseTO;
import com.naknih.student.management.repository.CourseRepository;
import com.naknih.student.management.service.CourseService;
import com.naknih.student.managemnet.TOToEntity.CourseTOToEntityConverter;
import com.naknih.student.managemnet.utils.SuccessObject;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Autowired
	private CourseRepository courserepository;

	@Override
	public SuccessObject getCourseById(Integer id) {
		Optional<Course> optCourse = courserepository.findById(id);
		if(optCourse.isPresent()) {
			CourseTOToEntityConverter courseTOToEntityConverter = new CourseTOToEntityConverter();
			courseTOToEntityConverter.convertCourseEntityToCourseTO(optCourse.get());
			return new SuccessObject("Ok", "Course data found", optCourse.get());
		}
		return new SuccessObject("Fail", "No Course found for the given id");
	}

	@Override
	public SuccessObject getAllCourse() {
		List<Course> list = courserepository.findAll();
		if(list != null && !list.isEmpty()) {
			CourseTOToEntityConverter courseTOToEntityConverter = new CourseTOToEntityConverter();
			courseTOToEntityConverter.convertCourseEntityToCourseTO(list);
			return new SuccessObject("OK", "Course data found",list);
		}
		return new SuccessObject("Fail", "Data not found");
	}

	@Override
	public SuccessObject add(CourseTO courseTO) {
		CourseTOToEntityConverter courseTOToEntityConverter = new CourseTOToEntityConverter();
		Course course = courseTOToEntityConverter.convertCourseTOToCourseEntity(courseTO);
		Course save = courserepository.save(course);
		return new SuccessObject("OK", "Course added successfully", save);
	}
	

	@Override
	public SuccessObject deleteCourseById(Integer id) {
		Optional<Course> optCourse = courserepository.findById(id);
		if(optCourse.isPresent()) {
			courserepository.deleteById(id);
		return new SuccessObject("OK", "Course Deleted Successfully");
	}
 return new SuccessObject("Fail", "No Course found");
	
 
	}


	
	
}
