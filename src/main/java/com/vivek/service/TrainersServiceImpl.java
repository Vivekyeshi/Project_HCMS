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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainers(int trainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trainers getTrainersById(int trainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
