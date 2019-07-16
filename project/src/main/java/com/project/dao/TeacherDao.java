package com.project.dao;

import java.util.List;

import com.project.model.Teacher;

public interface TeacherDao {
	
	public void add(Teacher teacher);
	
	public void delete(int teachersId);	
	
	public boolean checkTeacherRegister(String username,String password);
	
	public int checkIfuserisPresent(String username,String password);
	
	public void update(Teacher teacher,String teachersId);
	
	public List<Teacher> getAllTeachers();

}
