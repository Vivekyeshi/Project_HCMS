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

import com.vivek.entities.AppraisalForms;
import com.vivek.service.AppraisalFormsService;

@Controller
public class AppraisalFormsController {

	@Autowired
	private AppraisalFormsService appraisalFormsService;

	@GetMapping("/allAppraisalForms")
	public ResponseEntity<List<AppraisalForms>> getAllAppraisalForms() {
		return new ResponseEntity<List<AppraisalForms>>(appraisalFormsService.getAllAppraisalForms(),
				HttpStatus.OK);
	}

	@PostMapping("/addAppraisalForms")
	public ResponseEntity<AppraisalForms> addAppraisalForms(@RequestBody AppraisalForms appraisalForms) {
		if (appraisalForms == null) {
			return new ResponseEntity<AppraisalForms>(HttpStatus.BAD_REQUEST);
		}
		appraisalFormsService.addAppraisalForms(appraisalForms);
		return new ResponseEntity<AppraisalForms>(HttpStatus.CREATED);
	}

	@PutMapping("/updateAppraisalForms")
	public ResponseEntity<Void> updateAppraisalForms(@RequestBody AppraisalForms appraisalFormsToBeUpdate) {
		AppraisalForms existingAppraisalForms = appraisalFormsService
				.getAppraisalFormsById(appraisalFormsToBeUpdate.getFormId());

		if (existingAppraisalForms == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			appraisalFormsService.updateAppraisalForms(appraisalFormsToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@GetMapping("/appraisalForms/{appraisalFormsId}")
	public ResponseEntity<AppraisalForms> getAppraisalFormsById(@PathVariable int appraisalFormsId) {

		return new ResponseEntity<AppraisalForms>(
				appraisalFormsService.getAppraisalFormsById(appraisalFormsId), HttpStatus.OK);
	}

	@DeleteMapping("/deleteAppraisalForms/{appraisalFormsId}")
	public ResponseEntity<Void> deleteAppraisalForms(@PathVariable int appraisalFormsId) {

		AppraisalForms appraisalForms = appraisalFormsService.getAppraisalFormsById(appraisalFormsId);

		if (appraisalForms == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			appraisalFormsService.deleteAppraisalForms(appraisalForms);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}

}
