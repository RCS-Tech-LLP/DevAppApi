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
@Table(name = "finyear_master")
public class FinyearEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int finyear_id;
	private String fin_curyear;
	private String fin_stdate;
	private String fin_enddate;

	public FinyearEntity() {

	}
	
	
	public int getFinyear_id() {
		return finyear_id;
	}

	public void setFinyear_id(int finyear_id) {
		this.finyear_id = finyear_id;
	}

	public String getFin_curyear() {
		return fin_curyear;
	}

	public void setFin_curyear(String fin_curyear) {
		this.fin_curyear = fin_curyear;
	}
	
	public String getFin_stdate() {
		return fin_stdate;
	}

	public void setFin_stdate(String fin_stdate) {
		this.fin_stdate = fin_stdate;
	}
	
	public String getFin_enddate() {
		return fin_enddate;
	}

	public void setFin_enddate(String fin_enddate) {
		this.fin_enddate = fin_enddate;
	}

}
