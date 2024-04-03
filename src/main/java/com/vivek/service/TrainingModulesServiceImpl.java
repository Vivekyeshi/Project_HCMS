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
		trainingModulesDAO.updateTrainingModules(trainingModules);		
	}

	@Override
	public void deleteTrainingModules(TrainingModules trainingModules) {
		trainingModulesDAO.deleteTrainingModules(trainingModules);		
	}

	@Override
	public TrainingModules getTrainingModulesById(int trainingModulesId) {
		return trainingModulesDAO.getTrainingModulesById(trainingModulesId);
	}

}
