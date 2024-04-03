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

import com.vivek.entities.TrainingSchedules;
import com.vivek.service.TrainingSchedulesService;

@Controller
public class TrainingSchedulesController {

	@Autowired
	private TrainingSchedulesService trainingSchedulesService;

	@GetMapping("/trainingSchedules")
	public ResponseEntity<List<TrainingSchedules>> getAll() {

		return new ResponseEntity<List<TrainingSchedules>>(trainingSchedulesService.getAllTrainingSchedules(),
				HttpStatus.OK);
	}

	@PostMapping("/addTrainingSchedule")
	public ResponseEntity<TrainingSchedules> addTrainingSchedule(@RequestBody TrainingSchedules trainingSchedule) {
		if (trainingSchedule == null) {
			return new ResponseEntity<TrainingSchedules>(HttpStatus.BAD_REQUEST);
		} else {
			trainingSchedulesService.addTrainingSchedules(trainingSchedule);
			return new ResponseEntity<TrainingSchedules>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateTrainingSchedule")
	public ResponseEntity<Void> updateTrainingSchedule(@RequestBody TrainingSchedules trainingScheduleToBeUpdate) {
		TrainingSchedules existingTrainingSchedule = trainingSchedulesService
				.getTrainingSchedulesById(trainingScheduleToBeUpdate.getScheduleId());

		if (existingTrainingSchedule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingSchedulesService.updateTrainingSchedules(trainingScheduleToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@GetMapping("/getTrainingSchedule/{trainingScheduleId}")
	public ResponseEntity<TrainingSchedules> getTrainingScheduleById(@PathVariable int trainingScheduleId) {

		return new ResponseEntity<TrainingSchedules>(
				trainingSchedulesService.getTrainingSchedulesById(trainingScheduleId), HttpStatus.OK);
	}

	@DeleteMapping("/deleteTrainingSchedule/{trainingScheduleId}")
	public ResponseEntity<Void> deleteTrainingSchedule(@PathVariable int trainingScheduleId) {

		TrainingSchedules trainingSchedule = trainingSchedulesService.getTrainingSchedulesById(trainingScheduleId);

		if (trainingSchedule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingSchedulesService.deleteTrainingSchedules(trainingSchedule);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}
}
