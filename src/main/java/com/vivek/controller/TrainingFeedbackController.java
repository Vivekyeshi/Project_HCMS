package com.vivek.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.TrainingFeedback;
import com.vivek.service.TrainingFeedbackService;

@Controller
public class TrainingFeedbackController {

	private TrainingFeedbackService trainingFeedbackService;

	@GetMapping("/trainingFeedback")
	public ResponseEntity<List<TrainingFeedback>> getAll() {

		return new ResponseEntity<List<TrainingFeedback>>(trainingFeedbackService.getAllTrainingFeedback(),
				HttpStatus.OK);
	}

	@PostMapping("/addTrainingFeedback")
	public ResponseEntity<TrainingFeedback> addTrainingFeedback(@RequestBody TrainingFeedback trainingFeedback) {
		if (trainingFeedback == null) {
			return new ResponseEntity<TrainingFeedback>(HttpStatus.BAD_REQUEST);
		} else {
			trainingFeedbackService.addTrainingFeedback(trainingFeedback);
			return new ResponseEntity<TrainingFeedback>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateTrainingFeedback")
	public ResponseEntity<Void> updateTrainingFeedback(@RequestBody TrainingFeedback trainingFeedbackToBeUpdate) {
		TrainingFeedback existingTrainingFeedback = trainingFeedbackService
				.getTrainingFeedbackById(trainingFeedbackToBeUpdate.getFeedbackId());

		if (existingTrainingFeedback == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingFeedbackService.updateTrainingFeedback(trainingFeedbackToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@GetMapping("/getTrainingFeedback/{trainingFeedbackId}")
	public ResponseEntity<TrainingFeedback> getTrainingFeedbackById(@PathVariable int trainingFeedbackId) {

		return new ResponseEntity<TrainingFeedback>(trainingFeedbackService.getTrainingFeedbackById(trainingFeedbackId),
				HttpStatus.OK);
	}

	@DeleteMapping("/deleteTrainingFeedback/{trainingFeedbackId}")
	public ResponseEntity<Void> deleteTrainingFeedback(@PathVariable int trainingFeedbackId) {

		TrainingFeedback trainingFeedback = trainingFeedbackService.getTrainingFeedbackById(trainingFeedbackId);

		if (trainingFeedback == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingFeedbackService.deleteTrainingFeedback(trainingFeedback);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}
}
