package com.zxz.pojo;

import java.util.Date;

/**
 * Stockinquire entity. @author MyEclipse Persistence Tools
 */

public class Stockinquire implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 4076926595631306933L;
	private Integer stoid;
	private String stopname;
	private String stopid;
	private String stopaddress;
	private Date sotdate;
	private Date stoavdate;
	private String stoistax;
	private String stodaddress;
	private String stomakeperson;
	private String stoauditingperson;
	private String stostockperson;
	private String stopersonid;
	private String stodept;
	private String stodeptid;
	private String stoauditing;
	private String stockinquirename;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockinquire() {
	}

	/** full constructor */
	public Stockinquire(String stopname, String stopid, String stopaddress, Date sotdate, Date stoavdate,
			String stoistax, String stodaddress, String stomakeperson, String stoauditingperson, String stostockperson,
			String stopersonid, String stodept, String stodeptid, String stoauditing, String stockinquirename,
			Integer enables, String safetyone, String safetytwo) {
		this.stopname = stopname;
		this.stopid = stopid;
		this.stopaddress = stopaddress;
		this.sotdate = sotdate;
		this.stoavdate = stoavdate;
		this.stoistax = stoistax;
		this.stodaddress = stodaddress;
		this.stomakeperson = stomakeperson;
		this.stoauditingperson = stoauditingperson;
		this.stostockperson = stostockperson;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoauditing = stoauditing;
		this.stockinquirename = stockinquirename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getStoid() {
		return this.stoid;
	}

	public void setStoid(Integer stoid) {
		this.stoid = stoid;
	}

	public String getStopname() {
		return this.stopname;
	}

	public void setStopname(String stopname) {
		this.stopname = stopname;
	}

	public String getStopid() {
		return this.stopid;
	}

	public void setStopid(String stopid) {
		this.stopid = stopid;
	}

	public String getStopaddress() {
		return this.stopaddress;
	}

	public void setStopaddress(String stopaddress) {
		this.stopaddress = stopaddress;
	}

	public Date getSotdate() {
		return this.sotdate;
	}

	public void setSotdate(Date sotdate) {
		this.sotdate = sotdate;
	}

	public Date getStoavdate() {
		return this.stoavdate;
	}

	public void setStoavdate(Date stoavdate) {
		this.stoavdate = stoavdate;
	}

	public String getStoistax() {
		return this.stoistax;
	}

	public void setStoistax(String stoistax) {
		this.stoistax = stoistax;
	}

	public String getStodaddress() {
		return this.stodaddress;
	}

	public void setStodaddress(String stodaddress) {
		this.stodaddress = stodaddress;
	}

	public String getStomakeperson() {
		return this.stomakeperson;
	}

	public void setStomakeperson(String stomakeperson) {
		this.stomakeperson = stomakeperson;
	}

	public String getStoauditingperson() {
		return this.stoauditingperson;
	}

	public void setStoauditingperson(String stoauditingperson) {
		this.stoauditingperson = stoauditingperson;
	}

	public String getStostockperson() {
		return this.stostockperson;
	}

	public void setStostockperson(String stostockperson) {
		this.stostockperson = stostockperson;
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

	public String getStoauditing() {
		return this.stoauditing;
	}

	public void setStoauditing(String stoauditing) {
		this.stoauditing = stoauditing;
	}

	public String getStockinquirename() {
		return this.stockinquirename;
	}

	public void setStockinquirename(String stockinquirename) {
		this.stockinquirename = stockinquirename;
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