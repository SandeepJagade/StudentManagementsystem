package com.naknih.student.managemnet.TOToEntity;

import java.time.LocalDateTime;
<<<<<<< HEAD
import java.util.List;
import java.util.stream.Collectors;
=======
<<<<<<< HEAD
=======
import java.util.List;
import java.util.stream.Collectors;
>>>>>>> ce6d4c0 (updating and pushed)
>>>>>>> 045c363133bbe817643788cc1576cf27aa799260

import com.naknih.student.management.entity.Student;
import com.naknih.student.management.models.TO.StudentTO;

public class StudentTOToEntityConverter {
<<<<<<< HEAD

	// id, first_name, last_name, email, address, mobile_number, date_of_birth,
	// college, passout_year, branch, enrolled_course, date

	public Student convertStudentTOToStudentEntity(StudentTO studentTO) {

=======
<<<<<<< HEAD
	
	// id, first_name, last_name, email, address, mobile_number, date_of_birth, college, passout_year, branch, enrolled_course, date
	
	public Student convertStudentTOToStudentEntity(StudentTO studentTO) {
		
=======

	// id, first_name, last_name, email, address, mobile_number, date_of_birth,
	// college, passout_year, branch, enrolled_course, date

	public Student convertStudentTOToStudentEntity(StudentTO studentTO) {

>>>>>>> ce6d4c0 (updating and pushed)
>>>>>>> 045c363133bbe817643788cc1576cf27aa799260
		Student student = new Student();
		student.setFirstName(studentTO.getFirstName());
		student.setLastName(studentTO.getLastName());
		student.setEmail(studentTO.getEmail());
		student.setAddress(studentTO.getAddress());
		student.setCity(studentTO.getCity());
		student.setState(studentTO.getState());
		student.setMobileNumber(studentTO.getMobileNumber());
		student.setDateOfBirth(studentTO.getDateOfBirth());
		student.setCollege(studentTO.getCollege());
		student.setPassoutYear(studentTO.getPassoutYear());
		student.setBranch(studentTO.getBranch());
		student.setCourseEnrolled(studentTO.isCourseEnrolled());
		student.setEnquiryDate(LocalDateTime.now());
		return student;
<<<<<<< HEAD
	}
	
	
	public Student updateStudentToToStudentEntity(Student student, StudentTO studentTO) {
		student.setFirstName(studentTO.getFirstName());
		student.setLastName(studentTO.getLastName());
		student.setEmail(studentTO.getEmail());
		student.setAddress(studentTO.getAddress());
		student.setCity(studentTO.getCity());
		student.setState(studentTO.getState());
		student.setMobileNumber(studentTO.getMobileNumber());
		student.setDateOfBirth(studentTO.getDateOfBirth());
		student.setCollege(studentTO.getCollege());
		student.setPassoutYear(studentTO.getPassoutYear());
		student.setBranch(studentTO.getBranch());
		student.setCourseEnrolled(studentTO.isCourseEnrolled());
		return student;
	}

=======
<<<<<<< HEAD
		
	}

=======
	}
	
	
	public Student updateStudentToToStudentEntity(Student student, StudentTO studentTO) {
		student.setFirstName(studentTO.getFirstName());
		student.setLastName(studentTO.getLastName());
		student.setEmail(studentTO.getEmail());
		student.setAddress(studentTO.getAddress());
		student.setCity(studentTO.getCity());
		student.setState(studentTO.getState());
		student.setMobileNumber(studentTO.getMobileNumber());
		student.setDateOfBirth(studentTO.getDateOfBirth());
		student.setCollege(studentTO.getCollege());
		student.setPassoutYear(studentTO.getPassoutYear());
		student.setBranch(studentTO.getBranch());
		student.setCourseEnrolled(studentTO.isCourseEnrolled());
		return student;
	}

>>>>>>> 045c363133bbe817643788cc1576cf27aa799260

	public StudentTO convertStudentEntityToStudentTO(Student student) {
		StudentTO studentTO = new StudentTO(student.getId(), student.getFirstName(), student.getLastName(),
				student.getEmail(), student.getAddress(), student.getCity(), student.getState(),
				student.getMobileNumber(), student.getDateOfBirth(), student.getCollege(), student.getPassoutYear(),
				student.getBranch(), student.isCourseEnrolled());
		return studentTO;
	}

	public List<StudentTO> convertStudentEntityToStudentTO(List<Student> students) {
		List<StudentTO> studentTOs = students.stream()
				.map(student -> new StudentTO(student.getId(), student.getFirstName(), student.getLastName(),
						student.getEmail(), student.getAddress(), student.getCity(), student.getState(),
						student.getMobileNumber(), student.getDateOfBirth(), student.getCollege(), student.getPassoutYear(),
						student.getBranch(), student.isCourseEnrolled()))
				.collect(Collectors.toList());

		return studentTOs;
	}

	
<<<<<<< HEAD
=======
>>>>>>> ce6d4c0 (updating and pushed)
>>>>>>> 045c363133bbe817643788cc1576cf27aa799260
}
