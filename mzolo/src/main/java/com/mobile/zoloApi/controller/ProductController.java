/**
 * 
 */
package com.mobile.zoloApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.ProductEntity;
import com.mobile.zoloApi.services.ProductService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/products")
	public Iterable<ProductEntity> getAllProd(){
		return productService.getAllProd();
	}
	
	@PostMapping(value="/products/asset_type")
	public List<Object[]> findByAssetType(String asset_type){
		return productService.findByAssetType(asset_type);
	}
}
