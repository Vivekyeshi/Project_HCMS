package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.VacanciesDAOImpl;
import com.vivek.entities.Vacancies;

@Service
public class VacanciesServiceImpl implements VacanciesService{

	@Autowired
	private VacanciesDAOImpl vacanciesDAO;
	@Override
	public List<Vacancies> getAllVacancies() {
		return vacanciesDAO.getAllVacancies();
	}

	@Override
	public void addVacancie(Vacancies vacancie) {
		vacanciesDAO.addVacancie(vacancie);
		
	}

	@Override
	public void updateVacancie(Vacancies vacancie) {
		vacanciesDAO.updateVacancie(vacancie);		
	}

	@Override
	public void deleteVacancies(Vacancies vacancie) {
		vacanciesDAO.deleteVacancies(vacancie);		
	}

	@Override
	public Vacancies getVacanciesById(int vacancieId) {
		return vacanciesDAO.getVacanciesById(vacancieId);
	}

}
