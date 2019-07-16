package com.project.model;

public class Student {
	private String usn;
	private String name;
	private String username;
	private String password;
	private int sem;
	
	
	public String getUsn() {
		return usn;
	}
	
	public void setUsn(String usn) {
		this.usn = usn;
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
	
	public int getSem() {
		return sem;
	}
	
	public void setSem(int sem) {
		this.sem = sem;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", username=" + username + ", password=" + password + ", sem="
				+ sem + "]";
	}
	
	
}
