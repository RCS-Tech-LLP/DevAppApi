/**
 * 
 */
package com.mobile.zoloApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.FacilityEntity;
import com.mobile.zoloApi.services.FacilityService;



/**
 * @author Aman
 *
 */
@RestController
public class FacilityController {
	@Autowired
	private FacilityService facilityService;
	
	@PostMapping(value="/allFacCode")
	public List<FacilityEntity> getAllFac(){
		return facilityService.getAllFac();
	}
	
	@PostMapping(value="/facCode")
	public List<FacilityEntity> findMyBranch(){
		return facilityService.findMyBranch();
	}
}
