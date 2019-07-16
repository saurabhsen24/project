package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentDao;
import com.project.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.add(student);
	}

	@Override
	public void removeStudent(String usn) {
		// TODO Auto-generated method stub
		studentDao.delete(usn);
	}

	@Override
	public boolean checkStudentRegister(String name,String password) {
		// TODO Auto-generated method stub
		return studentDao.checkStudentRegister(name,password);
	}
	
	@Override
	public int checkIfUseridPresent(String username, String password) {
		// TODO Auto-generated method stub
		return studentDao.checkIfuserisPresent(username, password);
	}
		

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
