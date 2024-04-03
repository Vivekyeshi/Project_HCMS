package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.LeaveTypes;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LeaveTypesDAOImpl implements LeaveTypesDAO{
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<LeaveTypes> getAllLeaveTypes() {
		return entityManager.unwrap(Session.class).createQuery("from LeaveTypes",LeaveTypes.class).getResultList();
	}

	@Override
	public void addLeaveType(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).persist(leaveType);
		
	}

	@Override
	public void updateLeaveType(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).merge(leaveType);		
	}

	@Override
	public void deleteLeaveTypes(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).remove(leaveType);		
	}

	@Override
	public LeaveTypes getLeaveTypesById(int leaveTypeId) {
		return entityManager.unwrap(Session.class).get(LeaveTypes.class, leaveTypeId);
	}

}
