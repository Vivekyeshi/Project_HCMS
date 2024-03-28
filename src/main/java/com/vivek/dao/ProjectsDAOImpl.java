package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Projects;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProjectsDAOImpl implements ProjectsDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Projects> getAllProjects() {
		return entityManager.unwrap(Session.class).createQuery("from Projects",Projects.class).getResultList();
	}

	@Override
	public void addProject(Projects project) {
		entityManager.unwrap(Session.class).persist(project);
		
	}

	@Override
	public void updateProject(Projects project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjects(int projectId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Projects getProjectsById(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
