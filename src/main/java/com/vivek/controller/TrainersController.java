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

import com.vivek.entities.Trainers;
import com.vivek.service.TrainersService;

@Controller
public class TrainersController {

	@Autowired
	private TrainersService trainersService;
	
	@GetMapping("/trainers")
	public ResponseEntity<List<Trainers>> getAll() {

		return new ResponseEntity<List<Trainers>>(trainersService.getAllTrainers(), HttpStatus.OK);
	}

	@PostMapping("/addTrainer")
	public ResponseEntity<Trainers> addTrainer(@RequestBody Trainers trainer) {
		if (trainer == null) {
			return new ResponseEntity<Trainers>(HttpStatus.BAD_REQUEST);
		} else {
			trainersService.addTrainer(trainer);
			return new ResponseEntity<Trainers>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateTrainer")
	public ResponseEntity<Void> updateTrainer(@RequestBody Trainers trainerToBeUpdate) {
		Trainers existingTrainer = trainersService.getTrainersById(trainerToBeUpdate.getTrainerId());

		if (existingTrainer == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainersService.updateTrainer(trainerToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/ getTrainer/{trainerId}")
	public ResponseEntity<Trainers> getTrainerById(@PathVariable int trainerId) {

		return new ResponseEntity<Trainers>(trainersService.getTrainersById(trainerId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTrainer/{trainerId}")
	public ResponseEntity<Void> deleteTrainer(@PathVariable int trainerId) {
		
		Trainers trainer = trainersService.getTrainersById(trainerId);
		
		if(trainer == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			trainersService.deleteTrainers(trainer);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
