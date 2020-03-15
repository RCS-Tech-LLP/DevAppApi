/**
 * 
 */
package com.mobile.zoloApi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Aman
 *
 */
@Entity
@Table(name = "product_master")
public class ProductEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prod_id;
	private String product_name;
	private String product_desc;
	private String product_cost;
	private String asset_type;
	private String manufacturer;
	private String model;

	// Implementing many to one mapping below.
	// column vendor is getting mapped here. Check VendorEntity for one to many
	// mapping.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendor_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private VendorEntity vendor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private GroupEntity group;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subgroup_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private SubgroupEntity subgroup;
	
	
	@JsonIgnore
	public SubgroupEntity getSubgroup() {
		return subgroup;
	}
	@JsonIgnore
	public void setSubgroup(SubgroupEntity subgroup) {
		this.subgroup = subgroup;
	}
	@JsonIgnore
	public GroupEntity getGroup() {
		return group;
	}
	@JsonIgnore
	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	@JsonIgnore
	public VendorEntity getVendor() {
		return vendor;
	}

	@JsonIgnore
	public void setVendor(VendorEntity vendor) {
		this.vendor = vendor;
	}

	public ProductEntity() {

	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public String getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(String product_cost) {
		this.product_cost = product_cost;
	}

	public String getAsset_type() {
		return asset_type;
	}

	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


    //Getter Method's
	//to get vendor's full name
    public String getVendor_name(){
        return vendor.getVendor_name();
    }
    //to get group's name
    public String getGroup_name(){
        return group.getGroup_name();
    }
  //to get group's name
    public String getSubgroup_name(){
        return subgroup.getSubgroup_name();
    }
 

}
