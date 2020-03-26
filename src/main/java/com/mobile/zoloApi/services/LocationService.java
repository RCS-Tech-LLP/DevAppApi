/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.LocationEntity;
import com.mobile.zoloApi.repository.LocationRepository;


/**
 * @author Jenish
 *
 */
@Service
public class LocationService {
	@Autowired 
	private LocationRepository LocationRepository;
	
	public Iterable<LocationEntity> getAllLocation(){
		return LocationRepository.findAll();
	}
	
	public List<Object[]> findByLocId(String loc_id){
		return LocationRepository.findByLocId(loc_id);
	}
}
