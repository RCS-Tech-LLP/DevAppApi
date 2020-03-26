/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.EmployeeEntity;
import com.mobile.zoloApi.repository.EmployeeRepository;


/**
 * @author Jenish
 *
 */
@Service
public class EmployeeService {
	@Autowired 
	private EmployeeRepository EmployeeRepository;
	
	public Iterable<EmployeeEntity> getAllEmployee(){
		return EmployeeRepository.findAll();
	}
	
	public List<Object[]> findByEmpId(String emp_id){
		return EmployeeRepository.findByEmpId(emp_id);
	}
}
