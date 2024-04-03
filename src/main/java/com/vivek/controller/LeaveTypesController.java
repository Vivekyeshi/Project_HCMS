package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.LeaveTypes;
import com.vivek.service.LeaveTypesService;
@Controller
public class LeaveTypesController {

	@Autowired
	private LeaveTypesService leaveTypesService;
	
	
	@GetMapping("/leaveTypes")
	public ResponseEntity<List<LeaveTypes>> getAll() {

		return new ResponseEntity<List<LeaveTypes>>(leaveTypesService.getAllLeaveTypes(), HttpStatus.OK);
	}

	@PostMapping("/addLeaveType")
	public ResponseEntity<LeaveTypes> addLeaveType(@RequestBody LeaveTypes leaveType) {
		if (leaveType == null) {
			return new ResponseEntity<LeaveTypes>(HttpStatus.BAD_REQUEST);
		} else {
			leaveTypesService.addLeaveType(leaveType);
			return new ResponseEntity<LeaveTypes>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateLeaveType")
	public ResponseEntity<Void> updateLeaveType(@RequestBody LeaveTypes leaveTypeToBeUpdate) {
		LeaveTypes existingLeaveType = leaveTypesService.getLeaveTypesById(leaveTypeToBeUpdate.getLeaveTypeId());

		if (existingLeaveType == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveTypesService.updateLeaveType(leaveTypeToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getLeaveType/{leaveTypeId}")
	public ResponseEntity<LeaveTypes> getLeaveTypeById(@PathVariable int leaveTypeId) {

		return new ResponseEntity<LeaveTypes>(leaveTypesService.getLeaveTypesById(leaveTypeId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteLeaveType/{leaveTypeId}")
	public ResponseEntity<Void> deleteLeaveType(@PathVariable int leaveTypeId) {
		
		LeaveTypes leaveType = leaveTypesService.getLeaveTypesById(leaveTypeId);
		
		if(leaveType == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			leaveTypesService.deleteLeaveTypes(leaveType);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	
}
