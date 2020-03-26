/**
 * 
 */
package com.mobile.zoloApi.services;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.InterUnitAssetEntity;

import com.mobile.zoloApi.repository.InterUnitAssetRepository;


/**
 * @author Aman
 *
 */

@Service
public class InterUnitAssetService {
	@Autowired 
	private InterUnitAssetRepository interUnitAssetRepository; 
	public Iterable<InterUnitAssetEntity> getAll(){
		return interUnitAssetRepository.findAll();
	}
	public void addRequestAssets(ArrayList<InterUnitAssetEntity> interUnitAssetEntity) {
		interUnitAssetRepository.saveAll(interUnitAssetEntity);
	}
	

}
