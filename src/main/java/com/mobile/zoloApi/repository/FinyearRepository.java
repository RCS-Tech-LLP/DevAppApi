/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.FinyearEntity;


/**
 * @author Jenish
 *
 */
public interface FinyearRepository extends CrudRepository<FinyearEntity, Integer>{
	@Query("SELECT t FROM FinyearEntity t WHERE t.finyear_id=(:finyear_id)")
	public List<Object[]> findByFinyearId(@Param ("finyear_id")  String finyear_id);
}
