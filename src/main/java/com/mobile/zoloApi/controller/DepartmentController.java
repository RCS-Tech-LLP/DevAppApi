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
import com.mobile.zoloApi.entity.DepartmentEntity;
import com.mobile.zoloApi.services.DepartmentService;


/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class DepartmentController {
	@Autowired
	private DepartmentService DepartmentService;
	
	@GetMapping(value="/department")
	public Iterable<DepartmentEntity> getAllDepartment(){
		return DepartmentService.getAllDepartment();
	}
	
	@PostMapping(value="/department/dep_id")
	public List<Object[]> findByDepId(String dep_id){
		return DepartmentService.findByDepId(dep_id);
	}
}
