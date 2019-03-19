package edu.mum.wap.dao;

import java.util.HashMap;
import java.util.Map;

import edu.mum.wap.model.User;

public class DataBase {
	
	private static Map<String, User> users;
	
	public DataBase() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void addUser() {
		users.put("flor", new User("flor", "123"));
		users.put("admin", new User("admin", "123"));
		users.put("carlos", new User("carlos", "123"));
		users.put("victor", new User("victor", "123"));
	}
	
	public static Map<String, User> getUsers() {
		users= new HashMap<>();
		addUser() ;
		return users;
	}

}
