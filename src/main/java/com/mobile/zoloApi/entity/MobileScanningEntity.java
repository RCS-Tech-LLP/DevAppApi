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
@Table(name="mobile_scanning")
public class MobileScanningEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String audit_name;
	private int loc_id;
	private int subloc_id;
	private int facility_id;
	private int cubicle_id;
	private int created_by;
	private String start_date;
	private String end_date;
	private int auditor;
	private int audit_status;
	private int closed_by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAudit_name() {
		return audit_name;
	}
	public void setAudit_name(String audit_name) {
		this.audit_name = audit_name;
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
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getAuditor() {
		return auditor;
	}
	public void setAuditor(int auditor) {
		this.auditor = auditor;
	}
	public int getAudit_status() {
		return audit_status;
	}
	public void setAudit_status(int audit_status) {
		this.audit_status = audit_status;
	}
	public int getClosed_by() {
		return closed_by;
	}
	public void setClosed_by(int closed_by) {
		this.closed_by = closed_by;
	}
}
