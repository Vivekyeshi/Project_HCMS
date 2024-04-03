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

import com.vivek.entities.TrainingModules;
import com.vivek.service.TrainingModulesService;

@Controller 
public class TrainingModulesController {

	@Autowired
	private TrainingModulesService trainingModulesService;
	
	@GetMapping("/trainingModules")
	public ResponseEntity<List<TrainingModules>> getAll() {

		return new ResponseEntity<List<TrainingModules>>(trainingModulesService.getAllTrainingModules(), HttpStatus.OK);
	}

	@PostMapping("/addTrainingModule")
	public ResponseEntity<TrainingModules> addTrainingModule(@RequestBody TrainingModules trainingModule) {
		if (trainingModule == null) {
			return new ResponseEntity<TrainingModules>(HttpStatus.BAD_REQUEST);
		} else {
			trainingModulesService.addTrainingModules(trainingModule);
			return new ResponseEntity<TrainingModules>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateTrainingModule")
	public ResponseEntity<Void> updateTrainingModule(@RequestBody TrainingModules trainingModuleToBeUpdate) {
		TrainingModules existingTrainingModule = trainingModulesService.getTrainingModulesById(trainingModuleToBeUpdate.getModuleId());

		if (existingTrainingModule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingModulesService.updateTrainingModules(trainingModuleToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/ getTrainingModule/{trainingModuleId}")
	public ResponseEntity<TrainingModules> getTrainingModuleById(@PathVariable int trainingModuleId) {

		return new ResponseEntity<TrainingModules>(trainingModulesService.getTrainingModulesById(trainingModuleId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTrainingModule/{trainingModuleId}")
	public ResponseEntity<Void> deleteTrainingModule(@PathVariable int trainingModuleId) {
		
		TrainingModules trainingModule = trainingModulesService.getTrainingModulesById(trainingModuleId);
		
		if(trainingModule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			trainingModulesService.deleteTrainingModules(trainingModule);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
