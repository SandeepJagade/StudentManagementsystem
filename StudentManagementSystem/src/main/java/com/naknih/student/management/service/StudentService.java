package com.naknih.student.management.service;

import com.naknih.student.management.models.TO.StudentTO;
import com.naknih.student.managemnet.utils.SuccessObject;

public interface StudentService {

	public SuccessObject getStudentById(Integer id);

	public SuccessObject getAllStudents();

	public SuccessObject add(StudentTO student);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 045c363133bbe817643788cc1576cf27aa799260
	
	public SuccessObject deleteStudentById(Integer id);
	
	public SuccessObject searchStudents(String searchValue);
<<<<<<< HEAD
=======
	
>>>>>>> 045c363133bbe817643788cc1576cf27aa799260

	public SuccessObject updateStudent(Integer id, StudentTO studentTO);
	
	
<<<<<<< HEAD
=======
>>>>>>> ce6d4c0 (updating and pushed)
>>>>>>> 045c363133bbe817643788cc1576cf27aa799260

}
