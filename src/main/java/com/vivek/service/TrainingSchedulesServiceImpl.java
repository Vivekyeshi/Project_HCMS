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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainingSchedules(int trainingSchedulesId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingSchedules getTrainingSchedulesById(int trainingSchedulesId) {
		// TODO Auto-generated method stub
		return null;
	}

}
