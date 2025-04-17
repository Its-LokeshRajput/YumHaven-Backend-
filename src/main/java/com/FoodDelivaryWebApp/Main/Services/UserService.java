package com.FoodDelivaryWebApp.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodDelivaryWebApp.Main.Entities.User;
import com.FoodDelivaryWebApp.Main.Repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo obj;
	
	public User addUser(User user) {
		return obj.save(user);
	}
	
	public User getUserById(int userId) {
		return obj.findById(userId).orElse(null);
	}
	
	public List<User> getAllUsers() {
		return obj.findAll();
	}
	
	public void deleteUserById(int userId) {
		obj.deleteById(userId);
	}
	
	public User updateUserByNewData(User user) {
		return obj.save(user);
	}
}
