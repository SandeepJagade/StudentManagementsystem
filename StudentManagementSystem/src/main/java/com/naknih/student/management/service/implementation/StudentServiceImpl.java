package com.naknih.student.management.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naknih.student.management.entity.Student;
import com.naknih.student.management.models.TO.StudentTO;
import com.naknih.student.management.repository.StudentRepository;
import com.naknih.student.management.service.StudentService;
import com.naknih.student.managemnet.TOToEntity.StudentTOToEntityConverter;
import com.naknih.student.managemnet.utils.SuccessObject;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public SuccessObject getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuccessObject getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuccessObject add(StudentTO studentTO) {
		StudentTOToEntityConverter studentTOToEntityConverter = new StudentTOToEntityConverter();
		Student student = studentTOToEntityConverter.convertStudentTOToStudentEntity(studentTO);
		Student save = studentRepository.save(student);
		return new SuccessObject("OK", "Student added successfully", save);
	}

}
