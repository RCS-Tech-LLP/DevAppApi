/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.FinyearEntity;
import com.mobile.zoloApi.repository.FinyearRepository;


/**
 * @author Jenish
 *
 */
@Service
public class FinyearService {
	@Autowired 
	private FinyearRepository FinyearRepository;
	
	public Iterable<FinyearEntity> getAllFinyear(){
		return FinyearRepository.findAll();
	}
	
	public List<Object[]> findByFinyearId(String finyear_id){
		return FinyearRepository.findByFinyearId(finyear_id);
	}
}
