package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.LeaveApprovalsDAOImpl;
import com.vivek.entities.LeaveApprovals;

@Service
public class LeaveApprovalsServiceImpl implements LeaveApprovalsService{

	@Autowired
	private LeaveApprovalsDAOImpl leaveApprovalsDAO;
	@Override
	public List<LeaveApprovals> getAllLeaveApprovals() {
		return leaveApprovalsDAO.getAllLeaveApprovals();
	}

	@Override
	public void addLeaveApproval(LeaveApprovals leaveApproval) {
		leaveApprovalsDAO.addLeaveApproval(leaveApproval);		
	}

	@Override
	public void updateLeaveApproval(LeaveApprovals leaveApproval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeaveApprovals(int leaveApprovalId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LeaveApprovals getLeaveApprovalsById(int leaveApprovalId) {
		// TODO Auto-generated method stub
		return null;
	}

}
