package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.TrainingSchedulesDAOImpl;
import com.vivek.entities.TrainingSchedules;

@Service
public class TrainingSchedulesServiceImpl implements TrainingSchedulesService {

	@Autowired
	private TrainingSchedulesDAOImpl trainingSchedulesDAO;
	@Override
	public List<TrainingSchedules> getAllTrainingSchedules() {
		return trainingSchedulesDAO.getAllTrainingSchedules();
	}

	@Override
	public void addTrainingSchedules(TrainingSchedules trainingSchedules) {
		trainingSchedulesDAO.addTrainingSchedules(trainingSchedules);		
	}

	@Override
	public void updateTrainingSchedules(TrainingSchedules trainingSchedules) {
		trainingSchedulesDAO.updateTrainingSchedules(trainingSchedules);		
	}

	@Override
	public void deleteTrainingSchedules(TrainingSchedules trainingSchedules) {
		trainingSchedulesDAO.deleteTrainingSchedules(trainingSchedules);		
	}

	@Override
	public TrainingSchedules getTrainingSchedulesById(int trainingSchedulesId) {
		return trainingSchedulesDAO.getTrainingSchedulesById(trainingSchedulesId);
	}

}
