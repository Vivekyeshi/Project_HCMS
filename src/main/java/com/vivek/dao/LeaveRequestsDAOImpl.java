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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeaveRequests(int leaveRequestId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LeaveRequests getLeaveRequestsById(int leaveRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

}
