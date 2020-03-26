/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.HardwareRegisterEntity;
import com.mobile.zoloApi.repository.HardwareRegisterRepository;


/**
 * @author Jenish
 *
 */
@Service
public class HardwareRegisterService {
	@Autowired 
	private HardwareRegisterRepository HardwareRegisterRepository;
	
	public Iterable<HardwareRegisterEntity> getAllAsset(){
		return HardwareRegisterRepository.findAll();
	}
	
	public List<Object[]> findByAssetId(String assetid){
		return HardwareRegisterRepository.findByAssetId(assetid);
	}
}
