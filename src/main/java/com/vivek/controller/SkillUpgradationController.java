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

import com.vivek.entities.SkillUpgradation;
import com.vivek.service.SkillUpgradationService;

@Controller
public class SkillUpgradationController {

	
	@Autowired
	private SkillUpgradationService skillUpgradationService;
	
	@GetMapping("/skillUpgradation")
	public ResponseEntity<List<SkillUpgradation>> getAll() {

		return new ResponseEntity<List<SkillUpgradation>>(skillUpgradationService.getAllSkillUpgradation(), HttpStatus.OK);
	}

	@PostMapping("/addSkillUpgradation")
	public ResponseEntity<SkillUpgradation> addSkillUpgradation(@RequestBody SkillUpgradation skillUpgradation) {
		if (skillUpgradation == null) {
			return new ResponseEntity<SkillUpgradation>(HttpStatus.BAD_REQUEST);
		} else {
			skillUpgradationService.addSkillUpgradation(skillUpgradation);
			return new ResponseEntity<SkillUpgradation>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateSkillUpgradation")
	public ResponseEntity<Void> updateSkillUpgradation(@RequestBody SkillUpgradation skillUpgradationToBeUpdate) {
		SkillUpgradation existingSkillUpgradation = skillUpgradationService.getSkillUpgradationById(skillUpgradationToBeUpdate.getUpgradationId());

		if (existingSkillUpgradation == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			skillUpgradationService.updateSkillUpgradation(skillUpgradationToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getSkillUpgradation/{skillUpgradationId}")
	public ResponseEntity<SkillUpgradation> getSkillUpgradationById(@PathVariable int skillUpgradationId) {

		return new ResponseEntity<SkillUpgradation>(skillUpgradationService.getSkillUpgradationById(skillUpgradationId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteSkillUpgradation/{skillUpgradationId}")
	public ResponseEntity<Void> deleteSkillUpgradation(@PathVariable int skillUpgradationId) {
		
		SkillUpgradation skillUpgradation = skillUpgradationService.getSkillUpgradationById(skillUpgradationId);
		
		if(skillUpgradation == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			skillUpgradationService.deleteSkillUpgradation(skillUpgradation);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
