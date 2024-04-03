package com.vivek.service;

import java.util.List;

import com.vivek.entities.ExternalTrainers;

public interface ExternalTrainersService {

	List<ExternalTrainers> getAllExternalTrainers();

	void addExternalTrainers(ExternalTrainers externalTrainer);

	void updateExternalTrainers(ExternalTrainers externalTrainer);

	void deleteExternalTrainers(ExternalTrainers externalTrainer);

	ExternalTrainers getExternalTrainersById(int extrnalTrainerId);
}
