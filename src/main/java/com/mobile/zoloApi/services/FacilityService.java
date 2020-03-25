/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.FacilityEntity;
import com.mobile.zoloApi.repository.FacilityRepository;

/**
 * @author Aman
 *
 */
@Service
public class FacilityService {
	@Autowired
	private FacilityRepository facilityRepository;
	
	public List<FacilityEntity> getAllFac(){
		List<FacilityEntity> facilityEntity = new ArrayList<>();
		facilityRepository.findAll().forEach(facilityEntity::add);
		return facilityEntity;
	}
	public List<FacilityEntity> findMyBranch(){
		return facilityRepository.findMyBranch();
	}
}
