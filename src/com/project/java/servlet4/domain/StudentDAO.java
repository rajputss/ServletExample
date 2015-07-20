package com.project.java.servlet4.domain;

import java.util.List;

public interface StudentDAO {
	
	List<Student> getAllStudents() throws DAOException;
	//void create (Student student);

}
