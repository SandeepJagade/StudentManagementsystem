package com.naknih.student.management.service;

import com.naknih.student.management.models.TO.StudentTO;
import com.naknih.student.managemnet.utils.SuccessObject;

public interface StudentService {

	public SuccessObject getStudentById(Integer id);

	public SuccessObject getAllStudents();

	public SuccessObject add(StudentTO student);
<<<<<<< HEAD
=======
	
	public SuccessObject deleteStudentById(Integer id);
	
	public SuccessObject searchStudents(String searchValue);
	

	public SuccessObject updateStudent(Integer id, StudentTO studentTO);
	
	
>>>>>>> ce6d4c0 (updating and pushed)

}
