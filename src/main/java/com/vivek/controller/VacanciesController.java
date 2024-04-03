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

import com.vivek.entities.Vacancies;
import com.vivek.service.VacanciesService;
@Controller
public class VacanciesController {

	@Autowired
	private VacanciesService vacanciesService;
	
	@GetMapping("/vacancies")
	public ResponseEntity<List<Vacancies>> getAll() {

		return new ResponseEntity<List<Vacancies>>(vacanciesService.getAllVacancies(), HttpStatus.OK);
	}

	@PostMapping("/addVacancie")
	public ResponseEntity<Vacancies> addVacancie(@RequestBody Vacancies vacancie) {
		if (vacancie == null) {
			return new ResponseEntity<Vacancies>(HttpStatus.BAD_REQUEST);
		} else {
			vacanciesService.addVacancie(vacancie);
			return new ResponseEntity<Vacancies>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateVacancie")
	public ResponseEntity<Void> updateVacancie(@RequestBody Vacancies vacancieToBeUpdate) {
		Vacancies existingVacancie = vacanciesService.getVacanciesById(vacancieToBeUpdate.getVacancyId());

		if (existingVacancie == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			vacanciesService.updateVacancie(vacancieToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getVacancie/{vacancieId}")
	public ResponseEntity<Vacancies> getVacancieById(@PathVariable int vacancieId) {

		return new ResponseEntity<Vacancies>(vacanciesService.getVacanciesById(vacancieId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteVacancie/{vacancieId}")
	public ResponseEntity<Void> deleteVacancie(@PathVariable int vacancieId) {
		
		Vacancies vacancie = vacanciesService.getVacanciesById(vacancieId);
		
		if(vacancie == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			vacanciesService.deleteVacancies(vacancie);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	
}
