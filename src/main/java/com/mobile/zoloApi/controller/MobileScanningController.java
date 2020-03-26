/**
 * 
 */
package com.mobile.zoloApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.MobileScanningEntity;
import com.mobile.zoloApi.services.MobileScanningService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value="/audit")
public class MobileScanningController {
	@Autowired
	private MobileScanningService mobileScanningService;
	
	@PostMapping(value="/auditDetails")
	public List<MobileScanningEntity> getAll(){
		return mobileScanningService.getAll();
	}
	
	@PostMapping(value="/findFac")
	public MobileScanningEntity findFac(String facility_code) {
		return mobileScanningService.findFac(facility_code);
	}
	
	
}
