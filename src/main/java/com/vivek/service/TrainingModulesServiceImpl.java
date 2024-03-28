package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.TrainingModulesDAOImpl;
import com.vivek.entities.TrainingModules;

@Service
public class TrainingModulesServiceImpl implements TrainingModulesService {

	@Autowired
	private TrainingModulesDAOImpl trainingModulesDAO;
	@Override
	public List<TrainingModules> getAllTrainingModules() {
		return trainingModulesDAO.getAllTrainingModules();
	}

	@Override
	public void addTrainingModules(TrainingModules trainingModules) {
		trainingModulesDAO.addTrainingModules(trainingModules);
		
	}

	@Override
	public void updateTrainingModules(TrainingModules trainingModules) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainingModules(int trainingModulesId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingModules getTrainingModulesById(int trainingModulesId) {
		// TODO Auto-generated method stub
		return null;
	}

}
