package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.LeaveApprovals;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LeaveApprovalsDAOImpl implements LeaveApprovalsDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<LeaveApprovals> getAllLeaveApprovals() {
		return entityManager.unwrap(Session.class).createQuery("from LeaveApprovals",LeaveApprovals.class).getResultList();
	}

	@Override
	public void addLeaveApproval(LeaveApprovals leaveApproval) {
		entityManager.unwrap(Session.class).persist(leaveApproval);
		
	}

	@Override
	public void updateLeaveApproval(LeaveApprovals leaveApproval) {
		entityManager.unwrap(Session.class).merge(leaveApproval);		
	}

	@Override
	public void deleteLeaveApprovals(LeaveApprovals leaveApproval) {
		entityManager.unwrap(Session.class).remove(leaveApproval);		
	}

	@Override
	public LeaveApprovals getLeaveApprovalsById(int leaveApprovalId) {
		return entityManager.unwrap(Session.class).get(LeaveApprovals.class, leaveApprovalId);
	}

}
