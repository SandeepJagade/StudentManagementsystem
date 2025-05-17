package com.naknih.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/{id}")
	public ResponseEntity<SuccessObject> getStudentById(@PathVariable Integer id) {
		SuccessObject studentById = studentService.getStudentById(id);
		return ResponseEntity.ok().body(studentById);

	}

	@GetMapping("/")
	public ResponseEntity<SuccessObject> getAllStudents(@RequestBody StudentTO student) {
		SuccessObject allStudents = studentService.getAllStudents();
		return ResponseEntity.ok().body(allStudents);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<SuccessObject> deleteStudentById(@PathVariable Integer id) {
		SuccessObject deleteStudentById = studentService.deleteStudentById(id);
		return ResponseEntity.ok().body(deleteStudentById);
	}

	@GetMapping("/search")
	public ResponseEntity<SuccessObject> searchStudents(@RequestParam String searchValue) {
		SuccessObject allStudents = studentService.searchStudents(searchValue);
		return ResponseEntity.ok().body(allStudents);

	}
	
	public ResponseEntity<SuccessObject> updateStudent(@PathVariable Integer id , @RequestBody StudentTO studentTO){
		
		SuccessObject updateStudent = studentService.updateStudent(id ,studentTO);
		return ResponseEntity.ok().body(updateStudent);
	}

}
