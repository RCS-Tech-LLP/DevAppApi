/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.SublocationEntity;
import com.mobile.zoloApi.repository.SublocationRepository;


/**
 * @author Jenish
 *
 */
@Service
public class SublocationService {
	@Autowired 
	private SublocationRepository SublocationRepository;
	
	public Iterable<SublocationEntity> getAllSublocation(){
		return SublocationRepository.findAll();
	}
	
	public List<Object[]> findBySublocId(String subloc_id){
		return SublocationRepository.findBySublocId(subloc_id);
	}
}
