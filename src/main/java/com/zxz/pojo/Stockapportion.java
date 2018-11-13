package com.zxz.pojo;

import java.util.Date;

/**
 * Stockapportion entity. @author MyEclipse Persistence Tools
 */

public class Stockapportion implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 6341129960639717798L;
	private Integer appid;
	private Date appdate;
	private String wisname;
	private Double appamtmoney;
	private String makeperson;
	private String auditingperson;
	private String estate;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockapportion() {
	}

	/** full constructor */
	public Stockapportion(Date appdate, String wisname, Double appamtmoney, String makeperson, String auditingperson,
			String estate, Integer enables, String safetyone, String safetytwo) {
		this.appdate = appdate;
		this.wisname = wisname;
		this.appamtmoney = appamtmoney;
		this.makeperson = makeperson;
		this.auditingperson = auditingperson;
		this.estate = estate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getAppid() {
		return this.appid;
	}

	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	public Date getAppdate() {
		return this.appdate;
	}

	public void setAppdate(Date appdate) {
		this.appdate = appdate;
	}

	public String getWisname() {
		return this.wisname;
	}

	public void setWisname(String wisname) {
		this.wisname = wisname;
	}

	public Double getAppamtmoney() {
		return this.appamtmoney;
	}

	public void setAppamtmoney(Double appamtmoney) {
		this.appamtmoney = appamtmoney;
	}

	public String getMakeperson() {
		return this.makeperson;
	}

	public void setMakeperson(String makeperson) {
		this.makeperson = makeperson;
	}

	public String getAuditingperson() {
		return this.auditingperson;
	}

	public void setAuditingperson(String auditingperson) {
		this.auditingperson = auditingperson;
	}

	public String getEstate() {
		return this.estate;
	}

	public void setEstate(String estate) {
		this.estate = estate;
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