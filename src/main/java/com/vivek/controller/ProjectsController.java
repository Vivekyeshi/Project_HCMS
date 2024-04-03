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

import com.vivek.entities.Projects;
import com.vivek.service.ProjectsService;

@Controller
public class ProjectsController {

	@Autowired
	private ProjectsService projectService;
	
	@GetMapping("/projects")
	public ResponseEntity<List<Projects>> getAll() {

		return new ResponseEntity<List<Projects>>(projectService.getAllProjects(), HttpStatus.OK);
	}

	@PostMapping("/addProject")
	public ResponseEntity<Projects> addProject(@RequestBody Projects project) {
		if (project == null) {
			return new ResponseEntity<Projects>(HttpStatus.BAD_REQUEST);
		} else {
			projectService.addProject(project);
			return new ResponseEntity<Projects>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateProject")
	public ResponseEntity<Void> updateProject(@RequestBody Projects projectToBeUpdate) {
		Projects existingProject = projectService.getProjectsById(projectToBeUpdate.getProjectId());

		if (existingProject == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			projectService.updateProject(projectToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getProject/{projectId}")
	public ResponseEntity<Projects> getProjectById(@PathVariable int projectId) {

		return new ResponseEntity<Projects>(projectService.getProjectsById(projectId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProject/{projectId}")
	public ResponseEntity<Void> deleteProject(@PathVariable int projectId) {
		
		Projects project = projectService.getProjectsById(projectId);
		
		if(project == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			projectService.deleteProjects(project);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
