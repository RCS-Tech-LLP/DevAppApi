/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.ProductEntity;
import com.mobile.zoloApi.repository.ProductRepository;

/**
 * @author Aman
 *
 */
@Service
public class ProductService {
	@Autowired 
	private ProductRepository productRepository;
	
	public Iterable<ProductEntity> getAllProd(){
		return productRepository.findAll();
	}
	
	public List<Object[]> findByAssetType(String asset_type){
		return productRepository.findByAssetType(asset_type);
	}
}
