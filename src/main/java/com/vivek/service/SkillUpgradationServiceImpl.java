package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.SkillUpgradationDAOImpl;
import com.vivek.entities.SkillUpgradation;

@Service
public class SkillUpgradationServiceImpl implements SkillUpgradationService{

	@Autowired
	private SkillUpgradationDAOImpl skillUpgradationDAO;
	@Override
	public List<SkillUpgradation> getAllSkillUpgradation() {
		return skillUpgradationDAO.getAllSkillUpgradation();
	}

	@Override
	public void addSkillUpgradation(SkillUpgradation skillUpgradation) {
		skillUpgradationDAO.addSkillUpgradation(skillUpgradation);
	}

	@Override
	public void updateSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSkillUpgradation(int skillUpgradationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SkillUpgradation getSkillUpgradationById(int skillUpgradationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
