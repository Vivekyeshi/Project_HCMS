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
	public List<ExternalTrainers> getAllExtrnalTrainers() {
		return externalTrainersDAO.getAllExtrnalTrainers();
	}

	@Override
	public void addextrnalTrainers(ExternalTrainers extrnalTrainer) {
		externalTrainersDAO.addextrnalTrainers(extrnalTrainer);
	}

	@Override
	public void updateextrnalTrainers(ExternalTrainers extrnalTrainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExtrnalTrainers(int extrnalTrainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExternalTrainers getExtrnalTrainersById(int extrnalTrainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
