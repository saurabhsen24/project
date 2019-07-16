package com.project.model;

public class Teacher {

	private int teachersId;
	private String name;
	private String username;
	private String password;
	private String sub;
	
	public int getTeachersId() {
		return teachersId;
	}
	
	public void setTeachersId(int teachersId) {
		this.teachersId = teachersId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Teacher [teachersId=" + teachersId + ", name=" + name + ", username=" + username + ", password="
				+ password + "]";
	}

	
	
}
