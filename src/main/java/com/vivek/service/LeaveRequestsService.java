package com.vivek.service;

import java.util.List;

import com.vivek.entities.LeaveRequests;

public interface LeaveRequestsService {
	List<LeaveRequests> getAllLeaveRequests();

	void addLeaveRequest(LeaveRequests leaveRequest);

	void updateLeaveRequest(LeaveRequests leaveRequest);

	void deleteLeaveRequests(LeaveRequests leaveRequest);

	LeaveRequests getLeaveRequestsById(int leaveRequestId);
}
