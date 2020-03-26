/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.MobileScanningEntity;
import com.mobile.zoloApi.repository.MobileScanningRepository;

/**
 * @author Aman
 *
 */
@Service
public class MobileScanningService {
	@Autowired
	private MobileScanningRepository mobileScanningRepository;
	
	
	public List<MobileScanningEntity> getAll(){
		return (List<MobileScanningEntity>) mobileScanningRepository.findAll();
	}
	public MobileScanningEntity findFac(String facility_code) {
		return mobileScanningRepository.findFacility(facility_code);
	}
}
