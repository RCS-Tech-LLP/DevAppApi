
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
@Table(name = "hardware_register")
public class HardwareRegisterEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ast_id;
	private String serialno;
	private String assetid;
	private String assetname;
	private String assetdesc;
	private String asset_type;
	private String ponumber;
	private String podate;
	private String invoicenumber;
	private String invoicedate;
	private String grn_number;
	private String grndate;
	private String manufacturer;
	private String model_no;
	private String asset_image;
	private String taggable;
	private String assetbond;
	private String bond_no;
	private String bond_date;
	private String billof_entry_no;
	private String billof_entry_date;
	private String insurance;
	private String policy_no;
	private String insurance_startdate;
	private String insurance_enddate;
	private String dcnumber;
	private String dcdate;
	private String asset_cost;
	private String exchange_rate_invoice;
	private String assetvalue;
	private String asset_config;
	private String asset_remarks;
	private String lifeof_assets;
	private String leasestatus;
	private String amc_warranty;
	private String asset_tag;
	private String grn_done_by;
	private String ceanumber;
	private String purchasetype;
	private String vouchernumber;
	private String voucherdate;
	private String leasestartdate;
	private String leaseenddate;
	private String install_type;
	private String installed;
	private String asset_status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subgroup_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private SubgroupEntity subgroup;
	
	public HardwareRegisterEntity() {

	}
	
	@JsonIgnore
	public SubgroupEntity getSubgroup() {
		return subgroup;
	}
	@JsonIgnore
	public void setSubgroup(SubgroupEntity subgroup) {
		this.subgroup = subgroup;
	}
	
	public int getAst_id() {
		return ast_id;
	}

	public void setAst_id(int ast_id) {
		this.ast_id = ast_id;
	}

	public String getAssetid() {
		return assetid;
	}

	public void setAssetid(String assetid) {
		this.assetid = assetid;
	}

	public String getAssetname() {
		return assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public String getAssetdesc() {
		return assetdesc;
	}

	public void setAssetdesc(String assetdesc) {
		this.assetdesc = assetdesc;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getAsset_type() {
		return asset_type;
	}

	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}

	public String getPonumber() {
		return ponumber;
	}

	public void setPonumber(String ponumber) {
		this.ponumber = ponumber;
	}
	
	public String getPodate() {
		return podate;
	}

	public void setPodate(String podate) {
		this.podate = podate;
	}
	
	public String getInvoicenumber() {
		return invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	
	public String getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(String invoicedate) {
		this.invoicedate = invoicedate;
	}
	
	public String getGrn_number() {
		return grn_number;
	}

	public void setGrn_number(String grn_number) {
		this.grn_number = grn_number;
	}
	
	public String getGrndate() {
		return grndate;
	}

	public void setGrndate(String grndate) {
		this.grndate = grndate;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}
	
	public String getAsset_image() {
		return asset_image;
	}

	public void setAsset_image(String asset_image) {
		this.asset_image = asset_image;
	}
	
	public String getTaggable() {
		return taggable;
	}

	public void setTaggable(String taggable) {
		this.taggable = taggable;
	}
	
	public String getAssetbond() {
		return assetbond;
	}

	public void setAssetbond(String assetbond) {
		this.assetbond = assetbond;
	}
	
	public String getBond_no() {
		return bond_no;
	}

	public void setBond_no(String bond_no) {
		this.bond_no = bond_no;
	}
	
	public String getBond_date() {
		return bond_date;
	}

	public void setBond_date(String bond_date) {
		this.bond_date = bond_date;
	}
	
	public String getBillof_entry_no() {
		return billof_entry_no;
	}

	public void setBillof_entry_no(String billof_entry_no) {
		this.billof_entry_no = billof_entry_no;
	}
	
	public String getBillof_entry_date() {
		return billof_entry_date;
	}

	public void setBillof_entry_date(String billof_entry_date) {
		this.billof_entry_date = billof_entry_date;
	}
	
	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}
	
	public String getInsurance_startdate() {
		return insurance_startdate;
	}

	public void setInsurance_startdate(String insurance_startdate) {
		this.insurance_startdate = insurance_startdate;
	}
	
	public String getInsurance_enddate() {
		return insurance_enddate;
	}

	public void setInsurance_enddate(String insurance_enddate) {
		this.insurance_enddate = insurance_enddate;
	}
	
	public String getDcnumber() {
		return dcnumber;
	}

	public void setDcnumber(String dcnumber) {
		this.dcnumber = dcnumber;
	}
	
	public String getDcdate() {
		return dcdate;
	}

	public void setDcdate(String dcdate) {
		this.dcdate = dcdate;
	}
	
	public String getAsset_cost() {
		return asset_cost;
	}

	public void setAsset_cost(String asset_cost) {
		this.asset_cost = asset_cost;
	}
	
	public String getExchange_rate_invoice() {
		return exchange_rate_invoice;
	}

	public void setExchange_rate_invoice(String exchange_rate_invoice) {
		this.exchange_rate_invoice = exchange_rate_invoice;
	}
	
	public String getAssetvalue() {
		return assetvalue;
	}

	public void setAssetvalue(String assetvalue) {
		this.assetvalue = assetvalue;
	}
	
	public String getAsset_config() {
		return asset_config;
	}

	public void setAsset_config(String asset_config) {
		this.asset_config = asset_config;
	}
	
	public String getAsset_remarks() {
		return asset_remarks;
	}

	public void setAsset_remarks(String asset_remarks) {
		this.asset_remarks = asset_remarks;
	}
	
	public String getLifeof_assets() {
		return lifeof_assets;
	}

	public void setLifeof_assets(String lifeof_assets) {
		this.lifeof_assets = lifeof_assets;
	}
	
	public String getLeasestatus() {
		return leasestatus;
	}

	public void setLeasestatus(String leasestatus) {
		this.leasestatus = leasestatus;
	}
	
	public String getAmc_warranty() {
		return amc_warranty;
	}

	public void setAmc_warranty(String amc_warranty) {
		this.amc_warranty = amc_warranty;
	}
	
	public String getAsset_tag() {
		return asset_tag;
	}

	public void setAsset_tag(String asset_tag) {
		this.asset_tag = asset_tag;
	}

	public String getGrn_done_by() {
		return grn_done_by;
	}

	public void setGrn_done_by(String grn_done_by) {
		this.grn_done_by = grn_done_by;
	}
	public String getCeanumber() {
		return ceanumber;
	}

	public void setCeanumber(String ceanumber) {
		this.ceanumber = ceanumber;
	}
	
	public String getPurchasetype() {
		return purchasetype;
	}

	public void setPurchasetype(String purchasetype) {
		this.purchasetype = purchasetype;
	}
	
	public String getVouchernumber() {
		return vouchernumber;
	}

	public void setVouchernumber(String vouchernumber) {
		this.vouchernumber = vouchernumber;
	}
	
	public String getVoucherdate() {
		return voucherdate;
	}

	public void setVoucherdate(String voucherdate) {
		this.voucherdate = voucherdate;
	}
	
	public String getLeasestartdate() {
		return leasestartdate;
	}

	public void setLeasestartdate(String leasestartdate) {
		this.leasestartdate = leasestartdate;
	}
	
	public String getLeaseenddate() {
		return leaseenddate;
	}

	public void setLeaseenddate(String leaseenddate) {
		this.leaseenddate = leaseenddate;
	}
	
	public String getInstall_type() {
		return install_type;
	}

	public void setInstall_type(String install_type) {
		this.install_type = install_type;
	}
	
	public String getInstalled() {
		return installed;
	}

	public void setInstalled(String installed) {
		this.installed = installed;
	}
	
	public String getAsset_status() {
		return asset_status;
	}

	public void setAsset_status(String asset_status) {
		this.asset_status = asset_status;
	}
	
	//to get group's name
    public String getSubgroup_name(){
        return subgroup.getSubgroup_name();
    }
}
