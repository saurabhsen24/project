package com.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_QUERY = "INSERT INTO TEACHER(name,username,password,sub) values(?,?,?,?)";
	private static final String SELECT_ALL = "SELECT * from TEACHER";
	private static final String UPDATE_QUERY = "UPDATE TEACHER SET teachersId = ?,name = ?,username = ?,password = ?,sub = ? where teachersId = ?"; 
	private static final String DELETE_QUERY = "DELETE from Teacher where teachersId = ?";	

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(INSERT_QUERY, new Object[] {teacher.getName(),teacher.getUsername(),teacher.getPassword(),teacher.getSub()});	
	}

	@Override
	public void delete(int teachersId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(DELETE_QUERY,teachersId);	
	}

	@Override
	public boolean checkTeacherRegister(String username, String password) {
		// TODO Auto-generated method stub
	    List<Teacher> teacherList = getAllTeachers();
	    for(Teacher teacher : teacherList) {
	    	if(teacher.getUsername().equals(username) && teacher.getPassword().equals(password)) {
	    		return true;
	    	}
	    }
		return false;
	}
	
	
	@Override
	public int checkIfuserisPresent(String username, String password) {
		// TODO Auto-generated method stub
	    List<Teacher> teacherList = getAllTeachers();
	    for(Teacher teacher : teacherList) {
	    	if(teacher.getUsername().equals(username) && teacher.getPassword().equals(password)) {
	    		return 1;
	    	}else if(teacher.getUsername().equals(username) && !teacher.getPassword().equals(password)) {
	    		return 0;
	    	}
	    }
	    
		return -1;
	}
	
	@Override
	public void update(Teacher teacher, String teachersId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
	    List<Teacher> teacherList = new ArrayList<>();
	    List<Map<String,Object>> teacherRows = jdbcTemplate.queryForList(SELECT_ALL);
	    System.out.println(teacherRows);
	    for(Map<String,Object> teacherRow : teacherRows) {
	    	Teacher teacher = new Teacher();
	    	teacher.setTeachersId(Integer.parseInt(String.valueOf(teacherRow.get("teachersId"))));    	
	    	teacher.setName(String.valueOf(teacherRow.get("name")));
	    	teacher.setUsername(String.valueOf(teacherRow.get("username")));
	    	teacher.setPassword(String.valueOf(teacherRow.get("password")));
            teacher.setSub(String.valueOf(teacherRow.get("sub"))); 
	    	teacherList.add(teacher);
	    }		
	    
	    System.out.println(teacherList);
		return teacherList;		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	

}
