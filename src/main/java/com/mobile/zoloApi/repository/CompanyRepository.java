/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.CompanyEntity;


/**
 * @author Jenish
 *
 */
public interface CompanyRepository extends CrudRepository<CompanyEntity, Integer>{
	@Query("SELECT t FROM CompanyEntity t WHERE t.comp_code=(:comp_code)")
	public List<Object[]> findByCompCode(@Param ("comp_code")  String comp_code);
}
