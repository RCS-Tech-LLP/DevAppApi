/**
 * 
 */
package com.mobile.zoloApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.zoloApi.entity.CompanyEntity;
import com.mobile.zoloApi.repository.CompanyRepository;


/**
 * @author Jenish
 *
 */
@Service
public class CompanyService {
	@Autowired 
	private CompanyRepository CompanyRepository;
	
	public Iterable<CompanyEntity> getAllCompany(){
		return CompanyRepository.findAll();
	}
	
	public List<Object[]> findByCompCode(String comp_code){
		return CompanyRepository.findByCompCode(comp_code);
	}
}
