package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.TrainersDAOImpl;
import com.vivek.entities.Trainers;

@Service
public class TrainersServiceImpl implements TrainersService{

	@Autowired
	private TrainersDAOImpl trainersDAO;
	@Override
	public List<Trainers> getAllTrainers() {
		return trainersDAO.getAllTrainers();
	}

	@Override
	public void addTrainer(Trainers trainer) {
		trainersDAO.addTrainer(trainer);		
	}

	@Override
	public void updateTrainer(Trainers trainer) {
		trainersDAO.updateTrainer(trainer);		
	}

	@Override
	public void deleteTrainers(Trainers trainer) {
		trainersDAO.deleteTrainers(trainer);		
	}

	@Override
	public Trainers getTrainersById(int trainerId) {
		return trainersDAO.getTrainersById(trainerId);
	}

}
