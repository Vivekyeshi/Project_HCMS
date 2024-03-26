package com.vivek.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.vivek.dao.EmployeesDAO;
import com.vivek.dao.EmployeesDAOImpl;

public class JdbcConfig {

	@Bean(name={"dataSource"})
	public DataSource getsDataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/hcms");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("SonalMam@2023");

		return driverManagerDataSource;
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate(){
			
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			
			jdbcTemplate.setDataSource(getsDataSource());
			return jdbcTemplate;
			
	}
	
	@Bean(name = {"employeesDAO"})
	public EmployeesDAO getEmployeesDAO() {
		EmployeesDAOImpl employeesDAO = new EmployeesDAOImpl();
		
		employeesDAO.setJdbcTemplate(getJdbcTemplate());
		return employeesDAO;
	}

}
