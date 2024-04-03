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

import com.vivek.entities.Certifications;
import com.vivek.service.CertificationsService;


@Controller
public class CertificationsController {

	@Autowired
	private CertificationsService certificationService;

	@GetMapping("/cerifications/getAll")
	public ResponseEntity<List<Certifications>> getAllCertifications() {
		return new ResponseEntity<List<Certifications>>(certificationService.getAllCertifications(), HttpStatus.OK);
	}

	@PostMapping("/addCertifications")
	public ResponseEntity<Void> addCertificate(@RequestBody Certifications certificate) {
		if (certificate == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		} else {
			certificationService.addCertification(certificate);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateCertifications")
	public ResponseEntity<Void> updateCertificate(@RequestBody Certifications certificateToBeUpdated) {

		Certifications existingCertificate = certificationService
				.getCertificationsById(certificateToBeUpdated.getCertificationId());

		if (existingCertificate == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			certificationService.updateCertification(certificateToBeUpdated);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	}

	@DeleteMapping("/deleteCertifications/{id}")
	public ResponseEntity<Void> deleteCandidateProfiles(@PathVariable int id) {

		Certifications certificate = certificationService.getCertificationsById(id);

		if (certificate == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			certificationService.deleteCertifications(certificate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}
	
	@GetMapping("/getCertificate/{id}")
	public ResponseEntity<Certifications> getCertificate(@PathVariable int id) {
		return new ResponseEntity<Certifications> (certificationService.getCertificationsById(id),HttpStatus.OK);
	}
	

}