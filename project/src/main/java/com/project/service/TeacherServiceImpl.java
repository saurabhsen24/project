package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.TeacherDao;
import com.project.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDao teacherDao;

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.add(teacher);
	}

	@Override
	public void removeTeacher(int teachersId) {
		// TODO Auto-generated method stub
		teacherDao.delete(teachersId);
	}


	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherDao.getAllTeachers();
	}

	@Override
	public boolean checkTeacherRegister(String username, String password) {
		// TODO Auto-generated method stub
		return teacherDao.checkTeacherRegister(username, password);
	}

	@Override
	public int cheackIfUserisPresent(String username, String password) {
		// TODO Auto-generated method stub
		return teacherDao.checkIfuserisPresent(username, password);
	}
	
	

}
