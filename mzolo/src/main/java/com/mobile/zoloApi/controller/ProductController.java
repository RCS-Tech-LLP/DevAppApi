/**
 * 
 */
package com.mobile.zoloApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
