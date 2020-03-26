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
import com.mobile.zoloApi.entity.CostcenterEntity;
import com.mobile.zoloApi.services.CostcenterService;


/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class CostcenterController {
	@Autowired
	private CostcenterService CostcenterService;
	
	@GetMapping(value="/costcenter")
	public Iterable<CostcenterEntity> getAllCostcenter(){
		return CostcenterService.getAllCostcenter();
	}
	
	@PostMapping(value="/costcenter/costcenter_id")
	public List<Object[]> findByCostcenterId(String costcenter_id){
		return CostcenterService.findByCostcenterId(costcenter_id);
	}
}
