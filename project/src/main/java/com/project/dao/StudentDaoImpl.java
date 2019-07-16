package com.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.Student;
import com.project.model.Teacher;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_QUERY = "INSERT INTO STUDENT(usn,name,username,password,sem) values(?,?,?,?,?)";
	private static final String SELECT_ALL = "SELECT * from STUDENT";
	private static final String UPDATE_QUERY = "UPDATE STUDENT SET usn = ?,name = ?,username = ?,password = ?,sem = ? where usn = ?"; 
	private static final String DELETE_QUERY = "DELETE from STUDENT where usn = ?";
	
	public void add(Student student) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(INSERT_QUERY, new Object[] {student.getUsn(),student.getName(),student.getUsername(),student.getPassword(),student.getSem()});
	}

	public void delete(String usn) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(DELETE_QUERY,usn);
	}
	
	public void update(Student student,String usn) {
		jdbcTemplate.update(UPDATE_QUERY, new Object[] {student.getUsn(),student.getName(),student.getUsername(),student.getPassword(),student.getSem()},usn);
	}

	public boolean checkStudentRegister(String username,String password) {
		// TODO Auto-generated method stub
	    List<Student> studentList = getAllStudents();
	    for(Student student1 : studentList) {
	    	if(student1.getUsername().equals(username) && student1.getPassword().equals(password)) {
	    		return true;
	    	}
	    }
		return false;
	}
	
	@Override
	public int checkIfuserisPresent(String username, String password) {
		// TODO Auto-generated method stub
	    List<Student> studentList = getAllStudents();
	    for(Student student : studentList) {
	    	if(student.getUsername().equals(username) && student.getPassword().equals(password)) {
	    		return 1;
	    	}else if(student.getUsername().equals(username) && !student.getPassword().equals(password)) {
	    		return 0;
	    	}
	    }
	    
		return -1;
	}
		

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
	    List<Student> studentList = new ArrayList<>();
	    List<Map<String,Object>>studentRows = jdbcTemplate.queryForList(SELECT_ALL);
	    System.out.println(studentRows);
	    for(Map<String,Object> studentRow : studentRows) {
	    	Student student = new Student();
	    	student.setUsn(String.valueOf(studentRow.get("usn")));	    	
	    	student.setName(String.valueOf(studentRow.get("name")));
	    	student.setUsername(String.valueOf(studentRow.get("username")));
	    	student.setPassword(String.valueOf(studentRow.get("password")));
	    	student.setSem(Integer.parseInt(String.valueOf(studentRow.get("sem"))));
	    	studentList.add(student);
	    }		
	    
	    System.out.println(studentList);
		return studentList;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	

}
