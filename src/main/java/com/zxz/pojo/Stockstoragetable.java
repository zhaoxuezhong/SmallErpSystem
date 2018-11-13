package com.zxz.pojo;

import java.util.Date;

/**
 * Stockstoragetable entity. @author MyEclipse Persistence Tools
 */

public class Stockstoragetable implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -5728712958408959468L;
	private Integer stockstorageno;
	private Date storagedate;
	private String purveyid;
	private String purveyname;
	private String purveyaddress;
	private String depotid;
	private String depotname;
	private String pricerevenue;
	private String stoperson;
	private String stodept;
	private String stodeptid;
	private String audituserid;
	private String repeatuserid;
	private String remark;
	private Integer estate;
	private String stockstoragetablename;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockstoragetable() {
	}

	/** full constructor */
	public Stockstoragetable(Date storagedate, String purveyid, String purveyname, String purveyaddress, String depotid,
			String depotname, String pricerevenue, String stoperson, String stodept, String stodeptid,
			String audituserid, String repeatuserid, String remark, Integer estate, String stockstoragetablename,
			Integer enables, String safetyone, String safetytwo) {
		this.storagedate = storagedate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.purveyaddress = purveyaddress;
		this.depotid = depotid;
		this.depotname = depotname;
		this.pricerevenue = pricerevenue;
		this.stoperson = stoperson;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.audituserid = audituserid;
		this.repeatuserid = repeatuserid;
		this.remark = remark;
		this.estate = estate;
		this.stockstoragetablename = stockstoragetablename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getStockstorageno() {
		return this.stockstorageno;
	}

	public void setStockstorageno(Integer stockstorageno) {
		this.stockstorageno = stockstorageno;
	}

	public Date getStoragedate() {
		return this.storagedate;
	}

	public void setStoragedate(Date storagedate) {
		this.storagedate = storagedate;
	}

	public String getPurveyid() {
		return this.purveyid;
	}

	public void setPurveyid(String purveyid) {
		this.purveyid = purveyid;
	}

	public String getPurveyname() {
		return this.purveyname;
	}

	public void setPurveyname(String purveyname) {
		this.purveyname = purveyname;
	}

	public String getPurveyaddress() {
		return this.purveyaddress;
	}

	public void setPurveyaddress(String purveyaddress) {
		this.purveyaddress = purveyaddress;
	}

	public String getDepotid() {
		return this.depotid;
	}

	public void setDepotid(String depotid) {
		this.depotid = depotid;
	}

	public String getDepotname() {
		return this.depotname;
	}

	public void setDepotname(String depotname) {
		this.depotname = depotname;
	}

	public String getPricerevenue() {
		return this.pricerevenue;
	}

	public void setPricerevenue(String pricerevenue) {
		this.pricerevenue = pricerevenue;
	}

	public String getStoperson() {
		return this.stoperson;
	}

	public void setStoperson(String stoperson) {
		this.stoperson = stoperson;
	}

	public String getStodept() {
		return this.stodept;
	}

	public void setStodept(String stodept) {
		this.stodept = stodept;
	}

	public String getStodeptid() {
		return this.stodeptid;
	}

	public void setStodeptid(String stodeptid) {
		this.stodeptid = stodeptid;
	}

	public String getAudituserid() {
		return this.audituserid;
	}

	public void setAudituserid(String audituserid) {
		this.audituserid = audituserid;
	}

	public String getRepeatuserid() {
		return this.repeatuserid;
	}

	public void setRepeatuserid(String repeatuserid) {
		this.repeatuserid = repeatuserid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getEstate() {
		return this.estate;
	}

	public void setEstate(Integer estate) {
		this.estate = estate;
	}

	public String getStockstoragetablename() {
		return this.stockstoragetablename;
	}

	public void setStockstoragetablename(String stockstoragetablename) {
		this.stockstoragetablename = stockstoragetablename;
	}

	public Integer getEnables() {
		return this.enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

	public String getSafetyone() {
		return this.safetyone;
	}

	public void setSafetyone(String safetyone) {
		this.safetyone = safetyone;
	}

	public String getSafetytwo() {
		return this.safetytwo;
	}

	public void setSafetytwo(String safetytwo) {
		this.safetytwo = safetytwo;
	}

}