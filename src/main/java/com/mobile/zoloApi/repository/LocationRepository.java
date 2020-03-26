/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.LocationEntity;


/**
 * @author Jenish
 *
 */
public interface LocationRepository extends CrudRepository<LocationEntity, Integer>{
	@Query("SELECT t FROM LocationEntity t WHERE t.loc_id=(:loc_id)")
	public List<Object[]> findByLocId(@Param ("loc_id")  String loc_id);
}
