package com.vivek.service;

import java.util.List;

import com.vivek.entities.SkillMatrix;

public interface SkillMatrixService {
	List<SkillMatrix> getAllSkillMatrix();

	void addSkillMatrix(SkillMatrix skillMatrix);

	void updateSkillMatrix(SkillMatrix skillMatrix);

	void deleteSkillMatrix(SkillMatrix skillMatrix);

	SkillMatrix getSkillMatrixById(int skillMatrixId);
}
