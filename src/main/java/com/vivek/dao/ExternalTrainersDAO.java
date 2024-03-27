package com.vivek.dao;

import java.util.List;

import com.vivek.entities.ExternalTrainers;

public interface ExternalTrainersDAO {

	List<ExternalTrainers> getAllExtrnalTrainers();

	void addextrnalTrainers(ExternalTrainers extrnalTrainer);

	void updateextrnalTrainers(ExternalTrainers extrnalTrainer);

	void deleteExtrnalTrainers(int extrnalTrainerId);

	ExternalTrainers getExtrnalTrainersById(int extrnalTrainerId);
}
