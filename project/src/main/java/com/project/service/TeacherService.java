package com.project.service;

import java.util.List;

import com.project.model.Teacher;

public interface TeacherService {
	
	public void addTeacher(Teacher teacher);
	
	public void removeTeacher(int teachersId);
	
	public boolean checkTeacherRegister(String username,String password);
	
	public int cheackIfUserisPresent(String username,String password);
	
	public List<Teacher> getAllTeachers();
}
