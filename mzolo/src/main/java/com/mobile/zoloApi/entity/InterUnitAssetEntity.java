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
@Table(name ="iut_request_assets")
public class InterUnitAssetEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ast_id;
	private String ast_name;
	private String serial_no;
	private String ast_desc;
	private String approval_status;
	private String approval_date;
	private String req_status;
	private String it_approval_status;
	private String it_approval_date;
	private int iut_req_id;
	
	
	
	public int getIut_req_id() {
		return iut_req_id;
	}
	public void setIut_req_id(int iut_req_id) {
		this.iut_req_id = iut_req_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAst_id() {
		return ast_id;
	}
	public void setAst_id(String ast_id) {
		this.ast_id = ast_id;
	}
	public String getAst_name() {
		return ast_name;
	}
	public void setAst_name(String ast_name) {
		this.ast_name = ast_name;
	}
	public String getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}
	public String getAst_desc() {
		return ast_desc;
	}
	public void setAst_desc(String ast_desc) {
		this.ast_desc = ast_desc;
	}
	public String getApproval_status() {
		return approval_status;
	}
	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}
	public String getApproval_date() {
		return approval_date;
	}
	public void setApproval_date(String approval_date) {
		this.approval_date = approval_date;
	}
	public String getReq_status() {
		return req_status;
	}
	public void setReq_status(String req_status) {
		this.req_status = req_status;
	}
	public String getIt_approval_status() {
		return it_approval_status;
	}
	public void setIt_approval_status(String it_approval_status) {
		this.it_approval_status = it_approval_status;
	}
	public String getIt_approval_date() {
		return it_approval_date;
	}
	public void setIt_approval_date(String it_approval_date) {
		this.it_approval_date = it_approval_date;
	}
	
	
}

