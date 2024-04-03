package com.vivek.service;

import java.util.List;

import com.vivek.entities.SkillUpgradation;

public interface SkillUpgradationService {
	List<SkillUpgradation> getAllSkillUpgradation();

	void addSkillUpgradation(SkillUpgradation skillUpgradation);

	void updateSkillUpgradation(SkillUpgradation skillUpgradation);

	void deleteSkillUpgradation(SkillUpgradation skillUpgradation);

	SkillUpgradation getSkillUpgradationById(int skillUpgradationId);
}
