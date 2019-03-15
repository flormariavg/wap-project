package edu.mum.wap.data;

import java.util.HashMap;
import java.util.Map;

import edu.mum.wap.model.login.User;

public class DataBase {
	
	private static Map<String, User> users;
	
	public DataBase() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void addUser() {
		users.put("flor", new User("flor", "123"));
		users.put("admin", new User("admin", "123"));
		users.put("test", new User("test", "123"));
	}
	
	public static Map<String, User> getUsers() {
		users= new HashMap<>();
		addUser() ;
		return users;
	}

}
