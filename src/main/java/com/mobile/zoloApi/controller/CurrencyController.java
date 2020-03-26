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
import com.mobile.zoloApi.entity.CurrencyEntity;
import com.mobile.zoloApi.services.CurrencyService;



/**
 * @author Jenish
 *
 */
@RestController
@RequestMapping(value="/configuration")
public class CurrencyController {
	@Autowired
	private CurrencyService CurrencyService;
	
	@GetMapping(value="/currency")
	public Iterable<CurrencyEntity> getAllCurrency(){
		return CurrencyService.getAllCurrency();
	}
	
	@PostMapping(value="/currency/cur_id")
	public List<Object[]> findByCurId(String cur_id){
		return CurrencyService.findByCurId(cur_id);
	}
}
