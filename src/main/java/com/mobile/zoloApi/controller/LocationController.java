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
import com.mobile.zoloApi.entity.LocationEntity;
import com.mobile.zoloApi.services.LocationService;


/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class LocationController {
	@Autowired
	private LocationService LocationService;
	
	@GetMapping(value="/location")
	public Iterable<LocationEntity> getAllLocation(){
		return LocationService.getAllLocation();
	}
	
	@PostMapping(value="/location/loc_id")
	public List<Object[]> findByLocId(String loc_id){
		return LocationService.findByLocId(loc_id);
	}
}
