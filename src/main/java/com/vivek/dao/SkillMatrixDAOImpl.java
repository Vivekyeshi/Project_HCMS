package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.SkillMatrix;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SkillMatrixDAOImpl implements SkillMatrixDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<SkillMatrix> getAllSkillMatrix() {
		return entityManager.unwrap(Session.class).createQuery("from SkillMatrix",SkillMatrix.class).getResultList();
	}

	@Override
	public void addSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).persist(skillMatrix);
		
	}

	@Override
	public void updateSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).merge(skillMatrix);		
	}

	@Override
	public void deleteSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).remove(skillMatrix);
	}

	@Override
	public SkillMatrix getSkillMatrixById(int skillMatrixId) {
		return entityManager.unwrap(Session.class).get(SkillMatrix.class, skillMatrixId);
	}

}
