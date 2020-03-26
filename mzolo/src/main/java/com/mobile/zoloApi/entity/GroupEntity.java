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
@Table(name="group_master")
public class GroupEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int group_id;
	private String group_name;
	private String lifeofasset;
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getLifeofasset() {
		return lifeofasset;
	}
	public void setLifeofasset(String lifeofasset) {
		this.lifeofasset = lifeofasset;
	}
	
	@OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
	private Set<ProductEntity> productEntity = new HashSet<>();
	
	public GroupEntity() {
		
	}
	
}
