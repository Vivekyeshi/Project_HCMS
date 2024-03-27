package com.vivek.dao;

import java.util.List;

import com.vivek.entities.SkillUpgradation;

public interface SkillUpgradationDAO {
	List<SkillUpgradation> getAllSkillUpgradation();

	void addSkillUpgradation(SkillUpgradation skillUpgradation);

	void updateSkillUpgradation(SkillUpgradation skillUpgradation);

	void deleteSkillUpgradation(int skillUpgradationId);

	SkillUpgradation getSkillUpgradationById(int skillUpgradationId);
}
