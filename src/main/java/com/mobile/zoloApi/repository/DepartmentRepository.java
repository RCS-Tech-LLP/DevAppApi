/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.DepartmentEntity;


/**
 * @author Jenish
 *
 */
public interface DepartmentRepository extends CrudRepository<DepartmentEntity, Integer>{
	@Query("SELECT t FROM DepartmentEntity t WHERE t.dep_id=(:dep_id)")
	public List<Object[]> findByDepId(@Param ("dep_id")  String dep_id);
}
