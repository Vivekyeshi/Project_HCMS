package com.vivek.service;

import java.util.List;

import com.vivek.entities.Vacancies;

public interface VacanciesService{
	List<Vacancies> getAllVacancies();

	void addVacancie(Vacancies vacancie);

	void updateVacancie(Vacancies vacancie);

	void deleteVacancies(Vacancies vacancie);

	Vacancies getVacanciesById(int vacancieId);
}
