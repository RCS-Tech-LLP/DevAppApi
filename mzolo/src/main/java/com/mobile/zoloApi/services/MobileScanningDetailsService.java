/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.MobileScanningDetailsEntity;
import com.mobile.zoloApi.repository.MobileScanningDetailsRepository;

/**
 * @author Aman
 *
 */
@Service
public class MobileScanningDetailsService {
	@Autowired 
	private MobileScanningDetailsRepository mobileScanningDetailsRepository;
	
	public List<MobileScanningDetailsEntity> getExistingRecords(){
		List<MobileScanningDetailsEntity> mobileScanningDetailsEntity = new ArrayList<>();
		mobileScanningDetailsRepository.findAll().forEach(mobileScanningDetailsEntity::add);
		return mobileScanningDetailsEntity;
	}
	
	public void addAsset(MobileScanningDetailsEntity mobileScanningDetailsEntity) {
		mobileScanningDetailsRepository.save(mobileScanningDetailsEntity);
	}
}
