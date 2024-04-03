package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.ExternalTrainers;
import com.vivek.service.ExternalTrainersService;

public class ExternalTrainersController {

	@Autowired
	private ExternalTrainersService externalTrainersService;

	@GetMapping("/externalTrainers")
	public ResponseEntity<List<ExternalTrainers>> getAll() {

		return new ResponseEntity<List<ExternalTrainers>>(externalTrainersService.getAllExternalTrainers(), HttpStatus.OK);
	}

	@PostMapping("/addexternalTrainer")
	public ResponseEntity<ExternalTrainers> addExternalTrainer(@RequestBody ExternalTrainers externalTrainer) {
		if (externalTrainer == null) {
			return new ResponseEntity<ExternalTrainers>(HttpStatus.BAD_REQUEST);
		} else {
			externalTrainersService.addExternalTrainers(externalTrainer);
			return new ResponseEntity<ExternalTrainers>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateExternalTrainer")
	public ResponseEntity<Void> updateExternalTrainer(@RequestBody ExternalTrainers externalTrainerToBeUpdate) {
		ExternalTrainers existingExternalTrainer = externalTrainersService.getExternalTrainersById(externalTrainerToBeUpdate.getTrainerId());

		if (existingExternalTrainer == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			externalTrainersService.updateExternalTrainers(externalTrainerToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getExternalTrainer/{externalTrainerId}")
	public ResponseEntity<ExternalTrainers> getExternalTrainerById(@PathVariable int externalTrainerId) {

		return new ResponseEntity<ExternalTrainers>(externalTrainersService.getExternalTrainersById(externalTrainerId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteExternalTrainer/{externalTrainerId}")
	public ResponseEntity<Void> deleteExternalTrainer(@PathVariable int externalTrainerId) {
		
		ExternalTrainers externalTrainer = externalTrainersService.getExternalTrainersById(externalTrainerId);
		
		if(externalTrainer == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			externalTrainersService.deleteExternalTrainers(externalTrainer);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	
}
