package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.Users;
import com.vivek.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getAll() {

		return new ResponseEntity<List<Users>>(usersService.getAllUsers(), HttpStatus.OK);
	}

	@PostMapping("/addUser")
	public ResponseEntity<Users> addUser(@RequestBody Users user) {
		if (user == null) {
			return new ResponseEntity<Users>(HttpStatus.BAD_REQUEST);
		} else {
			usersService.addUser(user);
			return new ResponseEntity<Users>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateUser")
	public ResponseEntity<Void> updateUser(@RequestBody Users userToBeUpdate) {
		Users existingUser = usersService.getUsersById(userToBeUpdate.getUserId());

		if (existingUser == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			usersService.updateUser(userToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<Users> getUserById(@PathVariable int userId) {

		return new ResponseEntity<Users>(usersService.getUsersById(userId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable int userId) {
		
		Users user = usersService.getUsersById(userId);
		
		if(user == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			usersService.deleteUsers(user);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
