/**
 * 
 */
package com.mobile.zoloApi.services;

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
}
