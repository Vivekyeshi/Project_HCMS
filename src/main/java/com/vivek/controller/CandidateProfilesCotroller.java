package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.vivek.entities.CandidateProfiles;
import com.vivek.service.CandidateProfilesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CandidateProfilesCotroller {

	@Autowired
	private CandidateProfilesService candidateProfilesService;

	@GetMapping("/candidateProfiles")
	public ResponseEntity<List<CandidateProfiles>> getAllCandidateProfiles() {
		return new ResponseEntity<List<CandidateProfiles>>(candidateProfilesService.getAllCandidateProfiles(),
				HttpStatus.OK);
	}

	@PostMapping("addCandidateProfiles")
	public ResponseEntity<Void> addCandidateProfiles(@RequestBody CandidateProfiles candidateProfile) {

		if (candidateProfile == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		} else {
			candidateProfilesService.addCandidateProfile(candidateProfile);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

	}

	@PutMapping("updateCandidateProfiles")
	public ResponseEntity<Void> updateCandidateProfile(@RequestBody CandidateProfiles candidateProfilesToBeUpdate) {

		CandidateProfiles existingCandidateProfiles = candidateProfilesService
				.getCandidateProfilesById(candidateProfilesToBeUpdate.getCandidateId());

		if (existingCandidateProfiles == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			candidateProfilesService.updateCandidateProfile(existingCandidateProfiles);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}
	
	@DeleteMapping("/deleteCandidate/{id}")
	public ResponseEntity<Void> deleteCandidateProfiles(@PathVariable int id){
		
		CandidateProfiles candidateProfiles = candidateProfilesService.getCandidateProfilesById(id);

		if (candidateProfiles == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			candidateProfilesService.deleteCandidateProfiles(candidateProfiles);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	@GetMapping("/getProfile/{id}")
	public ResponseEntity<CandidateProfiles> getCandidateProfilesById(@PathVariable int id) {
		return new ResponseEntity<CandidateProfiles>(candidateProfilesService.getCandidateProfilesById(id),
				HttpStatus.FOUND);
	}
	

}
