package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.SkillMatrixDAOImpl;
import com.vivek.entities.SkillMatrix;

@Service
public class SkillMatrixServiceImpl implements SkillMatrixService{

	@Autowired
	private SkillMatrixDAOImpl skillMatrixDAO;
	@Override
	public List<SkillMatrix> getAllSkillMatrix() {
		return skillMatrixDAO.getAllSkillMatrix();
	}

	@Override
	public void addSkillMatrix(SkillMatrix skillMatrix) {
		skillMatrixDAO.addSkillMatrix(skillMatrix);		
	}

	@Override
	public void updateSkillMatrix(SkillMatrix skillMatrix) {
		skillMatrixDAO.updateSkillMatrix(skillMatrix);		
	}

	@Override
	public void deleteSkillMatrix(SkillMatrix skillMatrix) {
		skillMatrixDAO.deleteSkillMatrix(skillMatrix);		
	}

	@Override
	public SkillMatrix getSkillMatrixById(int skillMatrixId) {
		return skillMatrixDAO.getSkillMatrixById(skillMatrixId);
	}

}
