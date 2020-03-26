/**
 * 
 */
package com.mobile.zoloApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.zoloApi.entity.InterUnitEntity;
import com.mobile.zoloApi.services.InterUnitService;

/**
 * @author Aman
 *
 */
@RestController
@RequestMapping(value = "/movements")
public class InterUnitController {
	@Autowired
	InterUnitService interUnitService;

	@GetMapping(value = "/getRequests")
	public Iterable<InterUnitEntity> findAll() {
		return interUnitService.findAll();
	}
	@PostMapping(value="/getIdRequests")
	public Optional<InterUnitEntity> findById(int id){
		return interUnitService.findById(id);
		
	}
	@PostMapping(value="/insertRequests")
	public void createRequest(@RequestBody InterUnitEntity interUnitEntity) {
		interUnitService.createRequest(interUnitEntity);
	}
	@PostMapping(value="/findMyRequests")
	public InterUnitEntity findMyRequest(String iut_req_no){
		System.out.println("iut_req_no-->"+iut_req_no);
		return interUnitService.findMyRequest(iut_req_no);
		
	}
}
