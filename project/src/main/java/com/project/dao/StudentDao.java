package com.project.dao;

import java.util.List;

import com.project.model.Student;

public interface StudentDao {

	public void add(Student student);
	
	public void delete(String usn);	
	
	public boolean checkStudentRegister(String username,String password);

	public int checkIfuserisPresent(String username,String password);
	
	public void update(Student student,String usn);
	
	public List<Student> getAllStudents();
}
