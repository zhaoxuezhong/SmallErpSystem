package com.zxz.pojo;

/**
 * Stockapplytype entity. @author MyEclipse Persistence Tools
 */

public class Stockapplytype implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 2430018599677791307L;
	private Integer aptid;
	private String aptname;
	private String aptename;
	private String aptremark;
	private Integer enable;

	// Constructors

	/** default constructor */
	public Stockapplytype() {
	}

	/** full constructor */
	public Stockapplytype(String aptname, String aptename, String aptremark, Integer enable) {
		this.aptname = aptname;
		this.aptename = aptename;
		this.aptremark = aptremark;
		this.enable = enable;
	}

	// Property accessors

	public Integer getAptid() {
		return this.aptid;
	}

	public void setAptid(Integer aptid) {
		this.aptid = aptid;
	}

	public String getAptname() {
		return this.aptname;
	}

	public void setAptname(String aptname) {
		this.aptname = aptname;
	}

	public String getAptename() {
		return this.aptename;
	}

	public void setAptename(String aptename) {
		this.aptename = aptename;
	}

	public String getAptremark() {
		return this.aptremark;
	}

	public void setAptremark(String aptremark) {
		this.aptremark = aptremark;
	}

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

}