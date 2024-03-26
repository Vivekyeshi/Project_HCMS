package com.vivek.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ApplicationStatus")
public class ApplicationStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ApplicationID")
	private int applicationId;

	@ManyToOne
	@JoinColumn(name = "CandidateID")
	private CandidateProfiles candidate;

	@ManyToOne
	@JoinColumn(name = "VacancyID")
	private Vacancies vacancies;

	@Column(name = "Status")
	private String status;

	@Column(name = "ApplicationDate")
	private LocalDate applicationDate;

	@Column(name = "ApplicationNotes")
	private String applicationNotes;
	
	

}
