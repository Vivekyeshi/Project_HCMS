package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Trainers;

public interface TrainersDAO {
	List<Trainers> getAllTrainers();

	void addTrainer(Trainers trainer);

	void updateTrainer(Trainers trainer);

	void deleteTrainers(Trainers trainer);

	Trainers getTrainersById(int trainerId);
}
