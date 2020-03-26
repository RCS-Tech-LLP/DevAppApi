/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.EmployeeEntity;


/**
 * @author Jenish
 *
 */
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{
	@Query("SELECT t FROM EmployeeEntity t WHERE t.emp_id=(:emp_id)")
	public List<Object[]> findByEmpId(@Param ("emp_id")  String emp_id);
}
