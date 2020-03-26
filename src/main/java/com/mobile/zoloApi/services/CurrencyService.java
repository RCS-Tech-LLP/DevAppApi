/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.CurrencyEntity;
import com.mobile.zoloApi.repository.CurrencyRepository;


/**
 * @author Jenish
 *
 */
@Service
public class CurrencyService {
	@Autowired 
	private CurrencyRepository CurrencyRepository;
	
	public Iterable<CurrencyEntity> getAllCurrency(){
		return CurrencyRepository.findAll();
	}
	
	public List<Object[]> findByCurId(String cur_id){
		return CurrencyRepository.findByCurId(cur_id);
	}
}
