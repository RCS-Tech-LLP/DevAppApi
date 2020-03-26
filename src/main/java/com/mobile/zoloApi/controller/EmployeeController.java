/**
 * 
 */
package com.mobile.zoloApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mobile.zoloApi.entity.EmployeeEntity;
import com.mobile.zoloApi.services.EmployeeService;


/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class EmployeeController {
	@Autowired
	private EmployeeService EmployeeService;
	
	@GetMapping(value="/employee")
	public Iterable<EmployeeEntity> getAllEmployee(){
		return EmployeeService.getAllEmployee();
	}
	
	@PostMapping(value="/employee/emp_id")
	public List<Object[]> findByEmpId(String emp_id){
		return EmployeeService.findByEmpId(emp_id);
	}
}
