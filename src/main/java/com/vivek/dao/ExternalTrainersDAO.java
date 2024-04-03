package com.vivek.dao;

import java.util.List;

import com.vivek.entities.ExternalTrainers;

public interface ExternalTrainersDAO {

	List<ExternalTrainers> getAllExternalTrainers();

	void addExternalTrainers(ExternalTrainers externalTrainer);

	void updateExternalTrainers(ExternalTrainers externalTrainer);

	void deleteExternalTrainers(ExternalTrainers externalTrainer);

	ExternalTrainers getExternalTrainersById(int externalTrainerId);
}
