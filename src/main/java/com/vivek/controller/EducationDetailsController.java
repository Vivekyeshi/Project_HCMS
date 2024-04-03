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

import com.vivek.entities.EducationDetails;
import com.vivek.service.EducationDetailsService;

@Controller
public class EducationDetailsController {

	@Autowired
	private EducationDetailsService educationDetailsService;

	@GetMapping("/educationDetails")
	public ResponseEntity<List<EducationDetails>> getAllEducationDetails() {
		return new ResponseEntity<List<EducationDetails>>(educationDetailsService.getAllEducationDetails(),
				HttpStatus.OK);
	}

	@PostMapping("/addEducationDetails")
	public ResponseEntity<Void> addEducationDetails(@RequestBody EducationDetails educationDetail) {
		if (educationDetail == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		} else {
			educationDetailsService.addEducationDetail(educationDetail);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

	}

	@PutMapping("/updateEducationDetail")
	public ResponseEntity<Void> updateEducationDetail(@RequestBody EducationDetails educationDetailToBeUpdate) {

		EducationDetails existingEducationDetail = educationDetailsService
				.getEducationDetailsById(educationDetailToBeUpdate.getEducationId());

		if (existingEducationDetail == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			educationDetailsService.updateEducationDetail(educationDetailToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

	}

	@DeleteMapping("/deleteEducationDetail/{id}")
	public ResponseEntity<Void> deleteEducationDetail(@PathVariable int id) {

		EducationDetails educationDetail = educationDetailsService.getEducationDetailsById(id);

		if (educationDetail == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			educationDetailsService.deleteEducationDetails(educationDetail);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}

	@GetMapping("/getEducationDetail/{id}")
	public ResponseEntity<EducationDetails> getEducationDetail(@PathVariable int id) {

		EducationDetails educationDetail = educationDetailsService.getEducationDetailsById(id);

		if (educationDetail == null) {
			return new ResponseEntity<EducationDetails>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<EducationDetails>(educationDetailsService.getEducationDetailsById(id),
					HttpStatus.OK);
		}

	}

}
