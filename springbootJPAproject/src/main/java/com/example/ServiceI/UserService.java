package com.example.ServiceI;

import java.util.List;

import com.example.Modal.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUsers();
	
	User getSingleUser(int id);
	
	User updateUser(User use);
	
	List<User> deleteSingleUsers(int id);
	
	void deleteAllUser();
	
	List<User>saveAllUsers(List<User>users);
	
	List<User>updateAllUsers(List<User>users);
	
	
	
	

}
