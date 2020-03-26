/**
 * 
 */
package com.mobile.zoloApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.VendorEntity;
import com.mobile.zoloApi.services.VendorService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@GetMapping(value="/vendors")
	public Iterable<VendorEntity> getAllVendors(){
		return vendorService.getAllVendor();
	}
}
