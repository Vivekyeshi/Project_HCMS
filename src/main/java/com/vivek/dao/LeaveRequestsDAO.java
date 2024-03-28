package com.vivek.dao;

import java.util.List;

import com.vivek.entities.LeaveRequests;

public interface LeaveRequestsDAO {
	List<LeaveRequests> getAllLeaveRequests();

	void addLeaveRequest(LeaveRequests leaveRequest);

	void updateLeaveRequest(LeaveRequests leaveRequest);

	void deleteLeaveRequests(int leaveRequestId);

	LeaveRequests getLeaveRequestsById(int leaveRequestId);
}
