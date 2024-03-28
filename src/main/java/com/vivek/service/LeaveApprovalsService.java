package com.vivek.service;

import java.util.List;

import com.vivek.entities.LeaveApprovals;

public interface LeaveApprovalsService {
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApproval(LeaveApprovals leaveApproval);

	void updateLeaveApproval(LeaveApprovals leaveApproval);

	void deleteLeaveApprovals(int leaveApprovalId);

	LeaveApprovals getLeaveApprovalsById(int leaveApprovalId);
}
