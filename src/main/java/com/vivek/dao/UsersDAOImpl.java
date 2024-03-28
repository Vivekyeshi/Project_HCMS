package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Users;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Users> getAllUsers() {
		return entityManager.unwrap(Session.class).createQuery("from Users",Users.class).getResultList();
	}

	@Override
	public void addUser(Users user) {
		entityManager.unwrap(Session.class).persist(user);
		
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
