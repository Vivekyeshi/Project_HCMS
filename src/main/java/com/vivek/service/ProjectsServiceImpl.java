package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.ProjectsDAOImpl;
import com.vivek.entities.Projects;

@Service
public class ProjectsServiceImpl implements ProjectsService{

	@Autowired
	private ProjectsDAOImpl projectsDAO;
	@Override
	public List<Projects> getAllProjects() {
		return projectsDAO.getAllProjects();
	}

	@Override
	public void addProject(Projects project) {
		projectsDAO.addProject(project);		
	}

	@Override
	public void updateProject(Projects project) {
		projectsDAO.updateProject(project);		
	}

	@Override
	public void deleteProjects(Projects project) {
		projectsDAO.deleteProjects(project);		
	}

	@Override
	public Projects getProjectsById(int projectId) {
		return projectsDAO.getProjectsById(projectId);
	}

}
