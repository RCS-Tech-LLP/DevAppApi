/**
 * 
 */
package com.mobile.zoloApi.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Aman
 *
 */
@Entity
@Table(name="subgroup_master")
public class SubgroupEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subgroup_id;
	private String subgroup_name;
	public int getSubgroup_id() {
		return subgroup_id;
	}
	public void setSubgroup_id(int subgroup_id) {
		this.subgroup_id = subgroup_id;
	}
	public String getSubgroup_name() {
		return subgroup_name;
	}
	public void setSubgroup_name(String subgroup_name) {
		this.subgroup_name = subgroup_name;
	}
	
	// Implementing one to many mapping below.
	// Check ProductEntity class to check implementation on many to one mapping
	@OneToMany(mappedBy = "subgroup", fetch = FetchType.LAZY)
	private Set<ProductEntity> productEntity = new HashSet<>();
	
	// Implementing one to many mapping below.
	// Check HardwareRegisterEntity class to check implementation on many to one mapping
	@OneToMany(mappedBy = "subgroup", fetch = FetchType.LAZY)
	private Set<HardwareRegisterEntity> HardwareRegisterEntity = new HashSet<>();
	
	public SubgroupEntity() {}
}
