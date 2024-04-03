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
		skillUpgradationDAO.updateSkillUpgradation(skillUpgradation);		
	}

	@Override
	public void deleteSkillUpgradation(SkillUpgradation skillUpgradation) {
		skillUpgradationDAO.deleteSkillUpgradation(skillUpgradation);		
	}

	@Override
	public SkillUpgradation getSkillUpgradationById(int skillUpgradationId) {
		return skillUpgradationDAO.getSkillUpgradationById(skillUpgradationId);
	}

}
