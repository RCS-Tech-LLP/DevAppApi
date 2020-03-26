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
@Table(name = "sublocation_master")
public class SublocationEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subloc_id;
	private String subloc_name;

	public SublocationEntity() {

	}
	
	
	public int getSubloc_id() {
		return subloc_id;
	}

	public void setSubloc_id(int subloc_id) {
		this.subloc_id = subloc_id;
	}

	public String getSubloc_name() {
		return subloc_name;
	}

	public void setSubloc_name(String subloc_name) {
		this.subloc_name = subloc_name;
	}

}
