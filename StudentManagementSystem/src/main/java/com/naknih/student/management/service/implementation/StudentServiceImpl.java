package com.naknih.student.management.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naknih.student.management.custom.exceptions.EmailAlreadyPresentException;
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
		Optional<Student> optStudent = studentRepository.findById(id);
		if (optStudent.isPresent()) {
			StudentTOToEntityConverter studentEntityToStudentToConverter = new StudentTOToEntityConverter();
			StudentTO studentTo = studentEntityToStudentToConverter.convertStudentEntityToStudentTO(optStudent.get());
			
			return new SuccessObject("OK", "Student data found", studentTo);
			
			//return new SuccessObject(ResponseMessages.OK, ResponseMessages.STUDENT_DATA_FOUND, studentTo);
		}
		return new SuccessObject("FAIL", "Data not found");
		
	}

	@Override
	public SuccessObject getAllStudents() {
		List<Student> list = studentRepository.findAll();
		if(list != null && !list.isEmpty()) {
			StudentTOToEntityConverter studentTOToEntityConverter = new StudentTOToEntityConverter();
			studentTOToEntityConverter.convertStudentEntityToStudentTO(list);
			return new SuccessObject("OK", "list of all students",list);
		}
		
		return new SuccessObject("FAIL","Data not found");
	}

	@Override
	public SuccessObject add(StudentTO studentTO) {
		StudentTOToEntityConverter studentTOToEntityConverter = new StudentTOToEntityConverter();
		Optional<Student> optStudent = studentRepository.findByEmail(studentTO.getEmail());
		if (optStudent.isPresent()) {
			throw new EmailAlreadyPresentException(String.format("Email already exists: %s", studentTO.getEmail()));
		}
		
		Student student = studentTOToEntityConverter.convertStudentTOToStudentEntity(studentTO);
		Student save = studentRepository.save(student);
		return new SuccessObject("OK", "Student added successfully", save);
	}

	@Override
	public SuccessObject deleteStudentById(Integer id) {
		Optional<Student> optionalStudById = studentRepository.findById(id);
		if(optionalStudById.isPresent()) {
			int deleteStudent = studentRepository.deleteStudent(id);
			if (deleteStudent == 1) {
				return new SuccessObject("OK","Student Deleted Successfully");
			}
			
		}
		return new SuccessObject("FAIL","student not Found with Id");
	}

	@Override
	public SuccessObject searchStudents(String searchValue) {
		// TODO Auto-generated method stub
		List<StudentTO> searchStudents = studentRepository.searchStudents(searchValue);
		if(searchStudents!=null && !searchStudents.isEmpty()) {
			return new SuccessObject("OK","List All Students", searchStudents);
		}
		return new SuccessObject("FAIL","Data not found");
	}


	@Override
	public SuccessObject updateStudent(Integer id, StudentTO studentTO) {
		// TODO Auto-generated method stub
		StudentTOToEntityConverter studentTOToEntityConverter = new StudentTOToEntityConverter();
		Optional<Student> updateOptionalById = studentRepository.findById(id);
		if(updateOptionalById.isPresent()) {
			Student student = studentTOToEntityConverter.updateStudentToToStudentEntity(updateOptionalById.get(), studentTO);
			Student updatedStudent = studentRepository.save(student);
			return new SuccessObject("OK","Data Updated Successfully", updatedStudent);
			
		}
		return new SuccessObject("FAIL","Dana not Updated");
	}

}
