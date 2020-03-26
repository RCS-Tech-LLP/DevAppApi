/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.CurrencyEntity;


/**
 * @author Jenish
 *
 */
public interface CurrencyRepository extends CrudRepository<CurrencyEntity, Integer>{
	@Query("SELECT t FROM CurrencyEntity t WHERE t.cur_id=(:cur_id)")
	public List<Object[]> findByCurId(@Param ("cur_id")  String cur_id);
}
