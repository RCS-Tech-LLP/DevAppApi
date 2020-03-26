/**
 * 
 */
package com.mobile.zoloApi.entity;

import java.io.Serializable;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * @author Aman
 *
 */
@Entity
@Table(name = "iut_request")
public class InterUnitEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String iut_req_no;
	private String iut_type;
	private int vendor_id;
	private String usertype;
	private int loc_id;
	private int subloc_id;
	private int current_loc_id;
	private int current_subloc_id;
	private int facility_id;
	private int cubicle_id;
	private int req_by;
	
	private String transfertype;
	private String comment;
	private String return_date;
	private int temp_facility;
	private int temp_cubicle;
	private String warranty;
	private String repair_cost;
	private String damage;
	private String user_role;
	private String file_types;
	private String req_asset_type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIut_req_no() {
		return iut_req_no;
	}

	public void setIut_req_no(String iut_req_no) {
		this.iut_req_no = iut_req_no;
	}

	public String getIut_type() {
		return iut_type;
	}

	public void setIut_type(String iut_type) {
		this.iut_type = iut_type;
	}

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public int getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}

	public int getSubloc_id() {
		return subloc_id;
	}

	public void setSubloc_id(int subloc_id) {
		this.subloc_id = subloc_id;
	}

	public int getCurrent_loc_id() {
		return current_loc_id;
	}

	public void setCurrent_loc_id(int current_loc_id) {
		this.current_loc_id = current_loc_id;
	}

	public int getCurrent_subloc_id() {
		return current_subloc_id;
	}

	public void setCurrent_subloc_id(int current_subloc_id) {
		this.current_subloc_id = current_subloc_id;
	}

	public int getFacility_id() {
		return facility_id;
	}

	public void setFacility_id(int facility_id) {
		this.facility_id = facility_id;
	}

	public int getCubicle_id() {
		return cubicle_id;
	}

	public void setCubicle_id(int cubicle_id) {
		this.cubicle_id = cubicle_id;
	}

	public int getReq_by() {
		return req_by;
	}

	public void setReq_by(int req_by) {
		this.req_by = req_by;
	}

	public String getTransfertype() {
		return transfertype;
	}

	public void setTransfertype(String transfertype) {
		this.transfertype = transfertype;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public int getTemp_facility() {
		return temp_facility;
	}

	public void setTemp_facility(int temp_facility) {
		this.temp_facility = temp_facility;
	}

	public int getTemp_cubicle() {
		return temp_cubicle;
	}

	public void setTemp_cubicle(int temp_cubicle) {
		this.temp_cubicle = temp_cubicle;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getRepair_cost() {
		return repair_cost;
	}

	public void setRepair_cost(String repair_cost) {
		this.repair_cost = repair_cost;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getFile_types() {
		return file_types;
	}

	public void setFile_types(String file_types) {
		this.file_types = file_types;
	}

	public String getReq_asset_type() {
		return req_asset_type;
	}

	public void setReq_asset_type(String req_asset_type) {
		this.req_asset_type = req_asset_type;
	}

	
}
