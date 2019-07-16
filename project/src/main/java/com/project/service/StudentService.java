package com.project.service;

import java.util.List;

import com.project.model.Student;

public interface StudentService {

	public void addStudent(Student student);
	
	public void removeStudent(String usn);
	
	public boolean checkStudentRegister(String name,String password);
	
	public int checkIfUseridPresent(String username,String password);
	
	public List<Student> getAllStudent();
}
