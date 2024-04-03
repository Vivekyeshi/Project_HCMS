package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Vacancies;

public interface VacanciesDAO {
	List<Vacancies> getAllVacancies();

	void addVacancie(Vacancies vacancie);

	void updateVacancie(Vacancies vacancie);

	void deleteVacancies(Vacancies vacancie);

	Vacancies getVacanciesById(int vacancieId);
}
