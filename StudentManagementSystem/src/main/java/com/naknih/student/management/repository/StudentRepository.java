package com.naknih.student.management.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.naknih.student.management.entity.Student;
import com.naknih.student.management.models.TO.StudentTO;

import jakarta.transaction.Transactional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Transactional
	@Modifying
	@Query("UPDATE Student s SET s.status = false WHERE s.id = :id")
	int deleteStudent(@Param("id") Integer id);
	
	

	
	@Query("SELECT NEW com.naknih.student.management.models.TO.StudentTO(" +
		       "s.id, s.firstName, s.lastName, s.email, s.address, s.city, s.state, " +
		       "s.mobileNumber, s.dateOfBirth, s.college, s.passoutYear, s.branch, s.isCourseEnrolled) " +
		       "FROM Student s " +
		       "WHERE s.status = true AND (" +
		       "LOWER(s.firstName) LIKE LOWER(CONCAT('%', :searchValue, '%')) OR " +
		       "LOWER(s.lastName) LIKE LOWER(CONCAT('%', :searchValue, '%')) OR " +
		       "LOWER(s.email) LIKE LOWER(CONCAT('%', :searchValue, '%')) OR " +
		       "LOWER(s.mobileNumber) LIKE LOWER(CONCAT('%', :searchValue, '%')) OR " +
		       "LOWER(s.city) LIKE LOWER(CONCAT('%', :searchValue, '%')) OR " +
		       "LOWER(s.college) LIKE LOWER(CONCAT('%', :searchValue, '%'))" +
		       ")")
		List<StudentTO> searchStudents(@Param("searchValue") String searchValue);
}

