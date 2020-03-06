/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mobile.zoloApi.entity.FacilityEntity;



/**
 * @author Aman
 *
 */
public interface FacilityRepository extends CrudRepository<FacilityEntity, Integer>{
	@Query
	("SELECT f FROM FacilityEntity f where f.facility_id in (select a.facility_id from MobileScanningEntity a)")
	List<FacilityEntity> findMyBranch();
}
