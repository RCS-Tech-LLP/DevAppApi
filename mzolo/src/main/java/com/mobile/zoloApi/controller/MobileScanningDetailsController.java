/**
 * 
 */
package com.mobile.zoloApi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.MobileScanningDetailsEntity;
import com.mobile.zoloApi.services.MobileScanningDetailsService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value="/audit")
public class MobileScanningDetailsController {
	@Autowired
	private MobileScanningDetailsService mobileScanningDetailsService;
	
	@PostMapping(value="/findAll")
	public List<MobileScanningDetailsEntity> getExistingRecords(){
		return mobileScanningDetailsService.getExistingRecords();
	}
	
	@PostMapping(value="/auditAsset")
	public void auditAsset(@RequestBody MobileScanningDetailsEntity mobileScanningDetailsEntity) {
		mobileScanningDetailsService.addAsset(mobileScanningDetailsEntity);
	}
	
}
