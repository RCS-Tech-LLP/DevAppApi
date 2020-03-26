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
@Table(name = "company_master")
public class CompanyEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int comp_code;
	private String comp_name;

	public CompanyEntity() {

	}
	
	
	public int getComp_code() {
		return comp_code;
	}

	public void setComp_code(int comp_code) {
		this.comp_code = comp_code;
	}

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

}
