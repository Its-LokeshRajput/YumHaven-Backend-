package com.FoodDelivaryWebApp.Main.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FoodDelivaryWebApp.Main.Entities.User;
import com.FoodDelivaryWebApp.Main.Services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService obj;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
		return ResponseEntity.ok(obj.addUser(user));
	}
	
	@GetMapping("/getUserById/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable(name="userId") int userId) {
		return ResponseEntity.ok(obj.getUserById(userId));
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(obj.getAllUsers());
	}
	
	@PutMapping("/udpateUser")
	public ResponseEntity<User> updateUserByNewData(@Valid @RequestBody User user) {
		return ResponseEntity.ok(obj.updateUserByNewData(user));
	}
	
	
}
