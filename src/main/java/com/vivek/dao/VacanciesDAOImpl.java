package com.vivek.dao;


import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Vacancies;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VacanciesDAOImpl implements VacanciesDAO{
	@Autowired
	private EntityManager entityManager;
	

	@Override
	public List<Vacancies> getAllVacancies() {
		return entityManager.unwrap(Session.class).createQuery("from Vacancies",Vacancies.class).getResultList();
	}

	@Override
	public void addVacancie(Vacancies vacancie) {
		entityManager.persist(vacancie);
		
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
