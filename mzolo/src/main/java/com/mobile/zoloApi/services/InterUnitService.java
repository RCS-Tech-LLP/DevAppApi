/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.InterUnitEntity;
import com.mobile.zoloApi.repository.InterUnitRepository;

/**
 * @author Aman
 *
 */
@Service
public class InterUnitService {
	@Autowired
	InterUnitRepository interUnitRepository;
	
	public Iterable<InterUnitEntity> findAll() {
		return interUnitRepository.findAll();
	}
	
	public Optional<InterUnitEntity> findById(int id){
		return interUnitRepository.findById(id);
	}
	
	public void createRequest(InterUnitEntity interUnitEntity) {
		interUnitRepository.save(interUnitEntity);
	}
	
	public InterUnitEntity findMyRequest(String iut_req_no){
		return interUnitRepository.findMyRequest(iut_req_no);
	}
}
