/**
 * 
 */
package com.mobile.zoloApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mobile.zoloApi.entity.ProductEntity;

/**
 * @author Aman
 *
 */
public interface ProductRepository extends CrudRepository<ProductEntity, Integer>{
	@Query("SELECT t FROM ProductEntity t WHERE t.asset_type=(:asset_type)")
	public List<Object[]> findByAssetType(@Param ("asset_type")  String asset_type);
}
