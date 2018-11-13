package com.zxz.pojo;

import java.util.Date;

/**
 * Stockapply entity. @author MyEclipse Persistence Tools
 */

public class Stockapply implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3569599027714223914L;
	private Integer appid;
	private Date appdate;
	private String apptype;
	private Integer appcircs;
	private String appperson;
	private String apppersonid;
	private String appdept;
	private String appdeptid;
	private String appmaker;
	private String appauditingperson;
	private String appauditing;
	private String stockapplyname;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockapply() {
	}

	/** full constructor */
	public Stockapply(Date appdate, String apptype, Integer appcircs, String appperson, String apppersonid,
			String appdept, String appdeptid, String appmaker, String appauditingperson, String appauditing,
			String stockapplyname, Integer enables, String safetyone, String safetytwo) {
		this.appdate = appdate;
		this.apptype = apptype;
		this.appcircs = appcircs;
		this.appperson = appperson;
		this.apppersonid = apppersonid;
		this.appdept = appdept;
		this.appdeptid = appdeptid;
		this.appmaker = appmaker;
		this.appauditingperson = appauditingperson;
		this.appauditing = appauditing;
		this.stockapplyname = stockapplyname;
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

	public String getApptype() {
		return this.apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}

	public Integer getAppcircs() {
		return this.appcircs;
	}

	public void setAppcircs(Integer appcircs) {
		this.appcircs = appcircs;
	}

	public String getAppperson() {
		return this.appperson;
	}

	public void setAppperson(String appperson) {
		this.appperson = appperson;
	}

	public String getApppersonid() {
		return this.apppersonid;
	}

	public void setApppersonid(String apppersonid) {
		this.apppersonid = apppersonid;
	}

	public String getAppdept() {
		return this.appdept;
	}

	public void setAppdept(String appdept) {
		this.appdept = appdept;
	}

	public String getAppdeptid() {
		return this.appdeptid;
	}

	public void setAppdeptid(String appdeptid) {
		this.appdeptid = appdeptid;
	}

	public String getAppmaker() {
		return this.appmaker;
	}

	public void setAppmaker(String appmaker) {
		this.appmaker = appmaker;
	}

	public String getAppauditingperson() {
		return this.appauditingperson;
	}

	public void setAppauditingperson(String appauditingperson) {
		this.appauditingperson = appauditingperson;
	}

	public String getAppauditing() {
		return this.appauditing;
	}

	public void setAppauditing(String appauditing) {
		this.appauditing = appauditing;
	}

	public String getStockapplyname() {
		return this.stockapplyname;
	}

	public void setStockapplyname(String stockapplyname) {
		this.stockapplyname = stockapplyname;
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