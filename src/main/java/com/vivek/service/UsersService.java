package com.vivek.service;

import java.util.List;

import com.vivek.entities.Users;

public interface UsersService {
	List<Users> getAllUsers();

	void addUser(Users user);

	void updateUser(Users user);

	void deleteUsers(Users user);

	Users getUsersById(int userId);
}
