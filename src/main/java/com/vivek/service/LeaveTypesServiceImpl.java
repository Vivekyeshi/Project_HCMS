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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeaveTypes(int leaveTypeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LeaveTypes getLeaveTypesById(int leaveTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
