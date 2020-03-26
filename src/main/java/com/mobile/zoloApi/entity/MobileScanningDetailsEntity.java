/**
 * 
 */
package com.mobile.zoloApi.entity;

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
@Table(name="mobile_scanning_details")
public class MobileScanningDetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int audit_id;
	private String asset_id;
	private String scan_date;
	private int scan_loc_id;
	private int scan_subloc_id;
	private int scan_facility_id;
	private int scan_cubicle_id;
	private int scanned_by;
	private String working_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAudit_id() {
		return audit_id;
	}
	public void setAudit_id(int audit_id) {
		this.audit_id = audit_id;
	}
	public String getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}
	public String getScan_date() {
		return scan_date;
	}
	public void setScan_date(String scan_date) {
		this.scan_date = scan_date;
	}
	public int getScan_loc_id() {
		return scan_loc_id;
	}
	public void setScan_loc_id(int scan_loc_id) {
		this.scan_loc_id = scan_loc_id;
	}
	public int getScan_subloc_id() {
		return scan_subloc_id;
	}
	public void setScan_subloc_id(int scan_subloc_id) {
		this.scan_subloc_id = scan_subloc_id;
	}
	public int getScan_facility_id() {
		return scan_facility_id;
	}
	public void setScan_facility_id(int scan_facility_id) {
		this.scan_facility_id = scan_facility_id;
	}
	public int getScan_cubicle_id() {
		return scan_cubicle_id;
	}
	public void setScan_cubicle_id(int scan_cubicle_id) {
		this.scan_cubicle_id = scan_cubicle_id;
	}
	public int getScanned_by() {
		return scanned_by;
	}
	public void setScanned_by(int scanned_by) {
		this.scanned_by = scanned_by;
	}
	public String getWorking_status() {
		return working_status;
	}
	public void setWorking_status(String working_status) {
		this.working_status = working_status;
	}

}
