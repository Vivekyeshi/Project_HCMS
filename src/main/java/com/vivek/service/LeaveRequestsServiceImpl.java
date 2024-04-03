package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.LeaveRequestsDAOImpl;
import com.vivek.entities.LeaveRequests;

@Service
public class LeaveRequestsServiceImpl implements LeaveRequestsService {

	@Autowired
	private LeaveRequestsDAOImpl leaveRequestsDAO;
	@Override
	public List<LeaveRequests> getAllLeaveRequests() {
		return leaveRequestsDAO.getAllLeaveRequests();
	}

	@Override
	public void addLeaveRequest(LeaveRequests leaveRequest) {
		leaveRequestsDAO.addLeaveRequest(leaveRequest);
	}

	@Override
	public void updateLeaveRequest(LeaveRequests leaveRequest) {
		leaveRequestsDAO.updateLeaveRequest(leaveRequest);		
	}

	@Override
	public void deleteLeaveRequests(LeaveRequests leaveRequest) {
		leaveRequestsDAO.deleteLeaveRequests(leaveRequest);		
	}

	@Override
	public LeaveRequests getLeaveRequestsById(int leaveRequestId) {
		return leaveRequestsDAO.getLeaveRequestsById(leaveRequestId);
	}

}
