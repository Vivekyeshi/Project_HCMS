package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.LeaveRequests;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LeaveRequestsDAOImpl implements LeaveRequestsDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<LeaveRequests> getAllLeaveRequests() {
		return entityManager.unwrap(Session.class).createQuery("from LeaveRequests",LeaveRequests.class).getResultList();
	}

	@Override
	public void addLeaveRequest(LeaveRequests leaveRequest) {
		entityManager.unwrap(Session.class).persist(leaveRequest);
		
	}

	@Override
	public void updateLeaveRequest(LeaveRequests leaveRequest) {
		entityManager.unwrap(Session.class).merge(leaveRequest);		
	}

	@Override
	public void deleteLeaveRequests(LeaveRequests leaveRequest) {
		entityManager.unwrap(Session.class).remove(leaveRequest);		
	}

	@Override
	public LeaveRequests getLeaveRequestsById(int leaveRequestId) {
		return entityManager.unwrap(Session.class).get(LeaveRequests.class, leaveRequestId);
	}

}
