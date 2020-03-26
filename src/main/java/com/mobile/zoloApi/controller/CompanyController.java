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
import com.mobile.zoloApi.entity.CompanyEntity;
import com.mobile.zoloApi.services.CompanyService;


/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class CompanyController {
	@Autowired
	private CompanyService CompanyService;
	
	@GetMapping(value="/company")
	public Iterable<CompanyEntity> getAllCompany(){
		return CompanyService.getAllCompany();
	}
	
	@PostMapping(value="/company/comp_code")
	public List<Object[]> findByCompCode(String comp_code){
		return CompanyService.findByCompCode(comp_code);
	}
}
