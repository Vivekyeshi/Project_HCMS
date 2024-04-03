package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.ExternalTrainersDAOImpl;
import com.vivek.entities.ExternalTrainers;

@Service
public class ExternalTrainersServiceImpl implements ExternalTrainersService{
	
	@Autowired
	private ExternalTrainersDAOImpl externalTrainersDAO;

	@Override
	public List<ExternalTrainers> getAllExternalTrainers() {
		return externalTrainersDAO.getAllExternalTrainers();
	}

	@Override
	public void addExternalTrainers(ExternalTrainers externalTrainer) {
		externalTrainersDAO.addExternalTrainers(externalTrainer);
	}

	@Override
	public void updateExternalTrainers(ExternalTrainers externalTrainer) {
		externalTrainersDAO.updateExternalTrainers(externalTrainer);		
	}

	@Override
	public void deleteExternalTrainers(ExternalTrainers externalTrainer) {
		externalTrainersDAO.deleteExternalTrainers(externalTrainer);		
	}

	@Override
	public ExternalTrainers getExternalTrainersById(int extrnalTrainerId) {
		return externalTrainersDAO.getExternalTrainersById(extrnalTrainerId);
	}

}
