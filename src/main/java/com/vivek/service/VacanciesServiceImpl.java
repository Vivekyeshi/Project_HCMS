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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVacancies(int vacancieId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vacancies getVacanciesById(int vacancieId) {
		// TODO Auto-generated method stub
		return null;
	}

}
