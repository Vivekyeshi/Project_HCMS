package com.vivek.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vivek.entities.Employees;

public class EmployeesDAOImpl implements EmployeesDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
