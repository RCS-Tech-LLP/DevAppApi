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
 * @author Jenish
 *
 */
@Entity
@Table(name = "costcenter_master")
public class CostcenterEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int costcenter_id;
	private String costcenter_name;

	public CostcenterEntity() {

	}
	
	
	public int getCostcenter_id() {
		return costcenter_id;
	}

	public void setCostcenter_id(int costcenter_id) {
		this.costcenter_id = costcenter_id;
	}

	public String getCostcenter_name() {
		return costcenter_name;
	}

	public void setCostcenter_name(String costcenter_name) {
		this.costcenter_name = costcenter_name;
	}

}
