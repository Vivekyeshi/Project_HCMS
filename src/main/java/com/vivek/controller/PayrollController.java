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

import com.vivek.entities.Payroll;
import com.vivek.service.PayrollService;

@Controller
public class PayrollController {

	@Autowired
	private PayrollService payrollService;
	
	@GetMapping("/payroll")
	public ResponseEntity<List<Payroll>> getAll() {

		return new ResponseEntity<List<Payroll>>(payrollService.getAllPayroll(), HttpStatus.OK);
	}

	@PostMapping("/addPayroll")
	public ResponseEntity<Payroll> addPayroll(@RequestBody Payroll payroll) {
		if (payroll == null) {
			return new ResponseEntity<Payroll>(HttpStatus.BAD_REQUEST);
		} else {
			payrollService.addPayroll(payroll);
			return new ResponseEntity<Payroll>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updatePayroll")
	public ResponseEntity<Void> updatePayroll(@RequestBody Payroll payrollToBeUpdate) {
		Payroll existingPayroll = payrollService.getPayrollById(payrollToBeUpdate.getPayrollId());

		if (existingPayroll == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			payrollService.updatePayroll(payrollToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getPayroll/{payrollId}")
	public ResponseEntity<Payroll> getPayrollById(@PathVariable int payrollId) {

		return new ResponseEntity<Payroll>(payrollService.getPayrollById(payrollId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deletePayroll/{payrollId}")
	public ResponseEntity<Void> deletePayroll(@PathVariable int payrollId) {
		
		Payroll payroll = payrollService.getPayrollById(payrollId);
		
		if(payroll == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			payrollService.deletePayroll(payroll);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
