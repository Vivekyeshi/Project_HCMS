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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsers(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users getUsersById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
