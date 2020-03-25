/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.HardwareRegisterEntity;

/**
 * @author Aman
 *
 */
public interface HardwareRegisterRepository extends CrudRepository<HardwareRegisterEntity, Integer>{
	@Query("SELECT t FROM HardwareRegisterEntity t WHERE t.assetid=(:assetid)")
	public List<Object[]> findByAssetId(@Param ("assetid")  String assetid);
}
