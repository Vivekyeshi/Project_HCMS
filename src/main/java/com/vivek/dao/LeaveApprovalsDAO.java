package com.vivek.dao;

import java.util.List;

import com.vivek.entities.LeaveApprovals;

public interface LeaveApprovalsDAO {
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApproval(LeaveApprovals leaveApproval);

	void updateLeaveApproval(LeaveApprovals leaveApproval);

	void deleteLeaveApprovals(LeaveApprovals leaveApproval);

	LeaveApprovals getLeaveApprovalsById(int leaveApprovalId);
}
