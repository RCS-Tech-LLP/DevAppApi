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
@Table(name = "vendor_master")
public class VendorEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendor_id;
	private String vendor_name;
	private String vendor_add1;
	private String vendor_add2;
	private String vendor_add3;
	private String vendor_city;
	private String vendor_pincode;
	private String vendor_state;
	private String vendor_country;
	private String vendor_phone;

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getVendor_add1() {
		return vendor_add1;
	}

	public void setVendor_add1(String vendor_add1) {
		this.vendor_add1 = vendor_add1;
	}

	public String getVendor_add2() {
		return vendor_add2;
	}

	public void setVendor_add2(String vendor_add2) {
		this.vendor_add2 = vendor_add2;
	}

	public String getVendor_add3() {
		return vendor_add3;
	}

	public void setVendor_add3(String vendor_add3) {
		this.vendor_add3 = vendor_add3;
	}

	public String getVendor_city() {
		return vendor_city;
	}

	public void setVendor_city(String vendor_city) {
		this.vendor_city = vendor_city;
	}

	public String getVendor_pincode() {
		return vendor_pincode;
	}

	public void setVendor_pincode(String vendor_pincode) {
		this.vendor_pincode = vendor_pincode;
	}

	public String getVendor_state() {
		return vendor_state;
	}

	public void setVendor_state(String vendor_state) {
		this.vendor_state = vendor_state;
	}

	public String getVendor_country() {
		return vendor_country;
	}

	public void setVendor_country(String vendor_country) {
		this.vendor_country = vendor_country;
	}

	public String getVendor_phone() {
		return vendor_phone;
	}

	public void setVendor_phone(String vendor_phone) {
		this.vendor_phone = vendor_phone;
	}

	// Implementing one to many mapping below.
	// Check ProductEntity class to check implementation on many to one mapping
	@OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY)
	private Set<ProductEntity> productEntity = new HashSet<>();

	public VendorEntity() {

	}
}
