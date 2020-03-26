/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.InterUnitEntity;

/**
 * @author Aman
 *
 */
public interface InterUnitRepository extends CrudRepository<InterUnitEntity, Integer>{
	@Query("SELECT i from InterUnitEntity i where i.iut_req_no=(:iut_req_no)")
	InterUnitEntity findMyRequest(@Param("iut_req_no") String iut_req_no);
	
}
