package com.naknih.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naknih.student.management.models.TO.CourseTO;
import com.naknih.student.management.service.CourseService;
import com.naknih.student.managemnet.utils.SuccessObject;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/add")
	public ResponseEntity<SuccessObject> addcourse(@RequestBody CourseTO course){
		SuccessObject successObject = courseService.add(course);
		return ResponseEntity.ok().body(successObject);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SuccessObject> getCourseById(@PathVariable Integer id){
		SuccessObject courseById = courseService.getCourseById(id);
		return ResponseEntity.ok().body(courseById);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<SuccessObject> getAllCourse(@RequestBody CourseTO course){
		SuccessObject allcourse = courseService.getAllCourse();
		return ResponseEntity.ok().body(allcourse);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<SuccessObject> deleteCourseById(@PathVariable Integer id){
		SuccessObject deletecourseById = courseService.deleteCourseById(id);
		return ResponseEntity.ok().body(deletecourseById);
	}
	}



