/**
 * 
 */
package com.mobile.zoloApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.VendorEntity;
import com.mobile.zoloApi.repository.VendorRepository;

/**
 * @author Aman
 *
 */
@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;

	public Iterable<VendorEntity> getAllVendor() {
		return vendorRepository.findAll();
	}

}
