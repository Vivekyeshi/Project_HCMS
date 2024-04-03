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

import com.vivek.entities.SkillMatrix;
import com.vivek.service.SkillMatrixService;

@Controller
public class SkillMatrixController {

	@Autowired
	private SkillMatrixService skillMatrixService;
	
	@GetMapping("/skillMatrix")
	public ResponseEntity<List<SkillMatrix>> getAll() {

		return new ResponseEntity<List<SkillMatrix>>(skillMatrixService.getAllSkillMatrix(), HttpStatus.OK);
	}

	@PostMapping("/addSkillMatrix")
	public ResponseEntity<SkillMatrix> addSkillMatrix(@RequestBody SkillMatrix skillMatrix) {
		if (skillMatrix == null) {
			return new ResponseEntity<SkillMatrix>(HttpStatus.BAD_REQUEST);
		} else {
			skillMatrixService.addSkillMatrix(skillMatrix);
			return new ResponseEntity<SkillMatrix>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateSkillMatrix")
	public ResponseEntity<Void> updateSkillMatrix(@RequestBody SkillMatrix skillMatrixToBeUpdate) {
		SkillMatrix existingSkillMatrix = skillMatrixService.getSkillMatrixById(skillMatrixToBeUpdate.getMatrixId());

		if (existingSkillMatrix == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			skillMatrixService.updateSkillMatrix(skillMatrixToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getSkillMatrix/{skillMatrixId}")
	public ResponseEntity<SkillMatrix> getSkillMatrixById(@PathVariable int skillMatrixId) {

		return new ResponseEntity<SkillMatrix>(skillMatrixService.getSkillMatrixById(skillMatrixId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteSkillMatrix/{skillMatrixId}")
	public ResponseEntity<Void> deleteSkillMatrix(@PathVariable int skillMatrixId) {
		
		SkillMatrix skillMatrix = skillMatrixService.getSkillMatrixById(skillMatrixId);
		
		if(skillMatrix == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			skillMatrixService.deleteSkillMatrix(skillMatrix);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
