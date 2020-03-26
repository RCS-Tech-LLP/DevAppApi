/**
 * 
 */
package com.mobile.zoloApi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.InterUnitAssetEntity;
import com.mobile.zoloApi.services.InterUnitAssetService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value = "/movements")
public class InterUnitAssetController {
	@Autowired
	InterUnitAssetService interUnitAssetService;

	@GetMapping(value="/requestLists")
	public Iterable<InterUnitAssetEntity> getAll(){
		return interUnitAssetService.getAll();
	}
	
	@PostMapping(value="/insertRequestLists")
	public void addRequestAssets(@RequestBody ArrayList<InterUnitAssetEntity> interUnitAssetEntity) {
		interUnitAssetService.addRequestAssets(interUnitAssetEntity);
	}
	
}
