/**
 * 
 */
package com.mobile.zoloApi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.MobileScanningEntity;

/**
 * @author Aman
 *
 */
public interface MobileScanningRepository extends CrudRepository<MobileScanningEntity, Integer>{
	@Query("SELECT m from MobileScanningEntity m WHERE m.facility_id in(SELECT f.facility_id from FacilityEntity f WHERE (f.facility_code)=(:facility_code))")
	MobileScanningEntity findFacility(@Param("facility_code") String facility_code);
	
}
