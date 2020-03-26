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
import com.mobile.zoloApi.entity.SublocationEntity;
import com.mobile.zoloApi.services.SublocationService;


/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class SublocationController {
	@Autowired
	private SublocationService SublocationService;
	
	@GetMapping(value="/sublocation")
	public Iterable<SublocationEntity> getAllSublocation(){
		return SublocationService.getAllSublocation();
	}
	
	@PostMapping(value="/sublocation/subloc_id")
	public List<Object[]> findBySublocId(String subloc_id){
		return SublocationService.findBySublocId(subloc_id);
	}
}
