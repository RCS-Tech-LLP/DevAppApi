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
import com.mobile.zoloApi.entity.FinyearEntity;
import com.mobile.zoloApi.services.FinyearService;



/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class FinyearController {
	@Autowired
	private FinyearService FinyearService;
	
	@GetMapping(value="/finyear")
	public Iterable<FinyearEntity> getAllFinyear(){
		return FinyearService.getAllFinyear();
	}
	
	@PostMapping(value="/finyear/finyear_id")
	public List<Object[]> findByFinyearId(String finyear_id){
		return FinyearService.findByFinyearId(finyear_id);
	}
}
