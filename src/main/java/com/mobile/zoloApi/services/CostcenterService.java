/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.CostcenterEntity;
import com.mobile.zoloApi.repository.CostcenterRepository;


/**
 * @author Jenish
 *
 */
@Service
public class CostcenterService {
	@Autowired 
	private CostcenterRepository CostcenterRepository;
	
	public Iterable<CostcenterEntity> getAllCostcenter(){
		return CostcenterRepository.findAll();
	}
	
	public List<Object[]> findByCostcenterId(String costcenter_id){
		return CostcenterRepository.findByCostcenterId(costcenter_id);
	}
}
