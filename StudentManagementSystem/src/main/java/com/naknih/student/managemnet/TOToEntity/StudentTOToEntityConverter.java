package com.naknih.student.managemnet.TOToEntity;

import java.time.LocalDateTime;

import com.naknih.student.management.entity.Student;
import com.naknih.student.management.models.TO.StudentTO;

public class StudentTOToEntityConverter {
	
	// id, first_name, last_name, email, address, mobile_number, date_of_birth, college, passout_year, branch, enrolled_course, date
	
	public Student convertStudentTOToStudentEntity(StudentTO studentTO) {
		
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
		
	}

}
