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

import com.mobile.zoloApi.entity.HardwareRegisterEntity;
import com.mobile.zoloApi.services.HardwareRegisterService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class HardwareRegisterController {
	@Autowired
	private HardwareRegisterService HardwareRegisterService;
	
	@GetMapping(value="/hardware_register")
	public Iterable<HardwareRegisterEntity> getAllAsset(){
		return HardwareRegisterService.getAllAsset();
	}
	
	@PostMapping(value="/hardware_register/assetid")
	public List<Object[]> findByAssetId(String assetid){
		return HardwareRegisterService.findByAssetId(assetid);
	}
}
