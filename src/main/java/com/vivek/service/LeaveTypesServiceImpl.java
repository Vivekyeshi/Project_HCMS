package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.LeaveTypesDAOImpl;
import com.vivek.entities.LeaveTypes;

@Service
public class LeaveTypesServiceImpl implements LeaveTypesService{

	@Autowired
	private LeaveTypesDAOImpl leaveTypesDAO;
	@Override
	public List<LeaveTypes> getAllLeaveTypes() {
		return leaveTypesDAO.getAllLeaveTypes();
	}

	@Override
	public void addLeaveType(LeaveTypes leaveType) {
		leaveTypesDAO.addLeaveType(leaveType);
	}

	@Override
	public void updateLeaveType(LeaveTypes leaveType) {
		leaveTypesDAO.updateLeaveType(leaveType);		
	}

	@Override
	public void deleteLeaveTypes(LeaveTypes leaveType) {
		leaveTypesDAO.deleteLeaveTypes(leaveType);		
	}

	@Override
	public LeaveTypes getLeaveTypesById(int leaveTypeId) {
		return leaveTypesDAO.getLeaveTypesById(leaveTypeId);
	}

}
