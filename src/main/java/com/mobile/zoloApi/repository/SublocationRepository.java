/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.SublocationEntity;


/**
 * @author Jenish
 *
 */
public interface SublocationRepository extends CrudRepository<SublocationEntity, Integer>{
	@Query("SELECT t FROM SublocationEntity t WHERE t.subloc_id=(:subloc_id)")
	public List<Object[]> findBySublocId(@Param ("subloc_id")  String subloc_id);
}
