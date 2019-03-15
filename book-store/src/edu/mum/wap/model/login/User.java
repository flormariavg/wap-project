package edu.mum.wap.model.login;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public User(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username= username;
		this.password= password;
		
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

}
