package com.vivek.service;

import java.util.List;

import com.vivek.entities.Projects;

public interface ProjectsService {
	List<Projects> getAllProjects();

	void addProject(Projects project);

	void updateProject(Projects project);

	void deleteProjects(Projects project);

	Projects getProjectsById(int projectId);
}
