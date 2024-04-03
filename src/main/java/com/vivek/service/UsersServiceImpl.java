package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.UsersDAOImpl;
import com.vivek.entities.Users;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDAOImpl usersDAO;
	@Override
	public List<Users> getAllUsers() {
		return usersDAO.getAllUsers();
	}

	@Override
	public void addUser(Users user) {
		usersDAO.addUser(user);		
	}

	@Override
	public void updateUser(Users user) {
		usersDAO.updateUser(user);		
	}

	@Override
	public void deleteUsers(Users user) {
		usersDAO.deleteUsers(user);		
	}

	@Override
	public Users getUsersById(int userId) {
		return usersDAO.getUsersById(userId);
	}

}
