package com.vivek.service;

import java.util.List;

import com.vivek.entities.ExternalTrainers;

public interface ExternalTrainersService {

	List<ExternalTrainers> getAllExtrnalTrainers();

	void addextrnalTrainers(ExternalTrainers extrnalTrainer);

	void updateextrnalTrainers(ExternalTrainers extrnalTrainer);

	void deleteExtrnalTrainers(int extrnalTrainerId);

	ExternalTrainers getExtrnalTrainersById(int extrnalTrainerId);
}
