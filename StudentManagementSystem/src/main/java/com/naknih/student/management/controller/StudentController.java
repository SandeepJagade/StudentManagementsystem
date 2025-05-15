package com.naknih.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naknih.student.management.models.TO.StudentTO;
import com.naknih.student.management.service.StudentService;
import com.naknih.student.managemnet.utils.SuccessObject;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public ResponseEntity<SuccessObject> addStudent(@RequestBody StudentTO student) {
		SuccessObject successObject = studentService.add(student);
		return ResponseEntity.ok().body(successObject);
	}

}
