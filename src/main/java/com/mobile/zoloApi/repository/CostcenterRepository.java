/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.CostcenterEntity;


/**
 * @author Jenish
 *
 */
public interface CostcenterRepository extends CrudRepository<CostcenterEntity, Integer>{
	@Query("SELECT t FROM CostcenterEntity t WHERE t.costcenter_id=(:costcenter_id)")
	public List<Object[]> findByCostcenterId(@Param ("costcenter_id")  String costcenter_id);
}
