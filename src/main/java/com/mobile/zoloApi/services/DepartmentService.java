/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.DepartmentEntity;
import com.mobile.zoloApi.repository.DepartmentRepository;


/**
 * @author Jenish
 *
 */
@Service
public class DepartmentService {
	@Autowired 
	private DepartmentRepository DepartmentRepository;
	
	public Iterable<DepartmentEntity> getAllDepartment(){
		return DepartmentRepository.findAll();
	}
	
	public List<Object[]> findByDepId(String dep_id){
		return DepartmentRepository.findByDepId(dep_id);
	}
}
