package com.zxz.pojo;

import java.util.Date;

/**
 * Stockrecede entity. @author MyEclipse Persistence Tools
 */

public class Stockrecede implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 4430998678780524186L;
	private Integer recid;
	private Date recdate;
	private String peoid;
	private String purveyname;
	private String peoaddress;
	private String stoid;
	private String depotname;
	private Integer containtax;
	private Integer anewstorage;
	private String stoperson;
	private String stopersonid;
	private String stodept;
	private String stodeptid;
	private String makeperson;
	private String auditingperson;
	private String recremark;
	private String estate;
	private String stockrecedename;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockrecede() {
	}

	/** full constructor */
	public Stockrecede(Date recdate, String peoid, String purveyname, String peoaddress, String stoid, String depotname,
			Integer containtax, Integer anewstorage, String stoperson, String stopersonid, String stodept,
			String stodeptid, String makeperson, String auditingperson, String recremark, String estate,
			String stockrecedename, Integer enables, String safetyone, String safetytwo) {
		this.recdate = recdate;
		this.peoid = peoid;
		this.purveyname = purveyname;
		this.peoaddress = peoaddress;
		this.stoid = stoid;
		this.depotname = depotname;
		this.containtax = containtax;
		this.anewstorage = anewstorage;
		this.stoperson = stoperson;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.makeperson = makeperson;
		this.auditingperson = auditingperson;
		this.recremark = recremark;
		this.estate = estate;
		this.stockrecedename = stockrecedename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getRecid() {
		return this.recid;
	}

	public void setRecid(Integer recid) {
		this.recid = recid;
	}

	public Date getRecdate() {
		return this.recdate;
	}

	public void setRecdate(Date recdate) {
		this.recdate = recdate;
	}

	public String getPeoid() {
		return this.peoid;
	}

	public void setPeoid(String peoid) {
		this.peoid = peoid;
	}

	public String getPurveyname() {
		return this.purveyname;
	}

	public void setPurveyname(String purveyname) {
		this.purveyname = purveyname;
	}

	public String getPeoaddress() {
		return this.peoaddress;
	}

	public void setPeoaddress(String peoaddress) {
		this.peoaddress = peoaddress;
	}

	public String getStoid() {
		return this.stoid;
	}

	public void setStoid(String stoid) {
		this.stoid = stoid;
	}

	public String getDepotname() {
		return this.depotname;
	}

	public void setDepotname(String depotname) {
		this.depotname = depotname;
	}

	public Integer getContaintax() {
		return this.containtax;
	}

	public void setContaintax(Integer containtax) {
		this.containtax = containtax;
	}

	public Integer getAnewstorage() {
		return this.anewstorage;
	}

	public void setAnewstorage(Integer anewstorage) {
		this.anewstorage = anewstorage;
	}

	public String getStoperson() {
		return this.stoperson;
	}

	public void setStoperson(String stoperson) {
		this.stoperson = stoperson;
	}

	public String getStopersonid() {
		return this.stopersonid;
	}

	public void setStopersonid(String stopersonid) {
		this.stopersonid = stopersonid;
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

	public String getRecremark() {
		return this.recremark;
	}

	public void setRecremark(String recremark) {
		this.recremark = recremark;
	}

	public String getEstate() {
		return this.estate;
	}

	public void setEstate(String estate) {
		this.estate = estate;
	}

	public String getStockrecedename() {
		return this.stockrecedename;
	}

	public void setStockrecedename(String stockrecedename) {
		this.stockrecedename = stockrecedename;
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