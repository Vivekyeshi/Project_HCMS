package com.vivek.service;

import java.util.List;

import com.vivek.entities.Trainers;

public interface TrainersService {
	List<Trainers> getAllTrainers();

	void addTrainer(Trainers trainer);

	void updateTrainer(Trainers trainer);

	void deleteTrainers(int trainerId);

	Trainers getTrainersById(int trainerId);
}
