package com.example.ServiceI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Modal.User;
import com.example.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private static final int User=0;
	private static final int List=0;
	
	
	@Autowired
	private UserRepository userRepository ;

	@Override
	public User saveUser(User user) {
		User user1= userRepository.save(user);
		
		
		return user1;
	}

	@Override
	public List<User> getAllUsers() {
		List<User>list=userRepository.findAll();
		return list;
	}

	@Override
	public User getSingleUser(int id) {
		User findUser= userRepository.findById(id).get();
		return findUser;
	}

	@Override
	public User updateUser(User user) {
			User save = userRepository.save(user);
		return save;
	}

	@Override
	public List<User> deleteSingleUsers(int id) {
		List<User> list=userRepository.findAll();
		
		return list;
	}

	@Override
	public void deleteAllUser() {
		userRepository.deleteAll();
		
	}

	@Override
	public List<User> saveAllUsers(List<User> users) {
		List<User>list=userRepository.saveAll(users);
		return list;
	}

	@Override
	public List<User> updateAllUsers(List<User> users) {
		List<User> list=userRepository.saveAll(users);
		return null;
	}
	
	
	

}
