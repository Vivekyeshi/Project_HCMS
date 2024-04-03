package com.vivek.service;

import java.util.List;

import com.vivek.entities.LeaveTypes;

public interface LeaveTypesService {
	List<LeaveTypes> getAllLeaveTypes();

	void addLeaveType(LeaveTypes leaveType);

	void updateLeaveType(LeaveTypes leaveType);

	void deleteLeaveTypes(LeaveTypes leaveType);

	LeaveTypes getLeaveTypesById(int leaveTypeId);
}
