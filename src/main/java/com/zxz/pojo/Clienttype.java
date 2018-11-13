package com.zxz.pojo;

/**
 * Clienttype entity. @author MyEclipse Persistence Tools
 */

public class Clienttype implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -120736863167725073L;
	private Integer clitypeid;
	private String clitypename;
	private String clitypeename;
	private String cliremark;
	private Integer clitypetrash;
	private String safetyone;
	private String safetytwo;
	private Integer enable;

	// Constructors

	/** default constructor */
	public Clienttype() {
	}

	/** full constructor */
	public Clienttype(String clitypename, String clitypeename, String cliremark, Integer clitypetrash, String safetyone,
			String safetytwo, Integer enable) {
		this.clitypename = clitypename;
		this.clitypeename = clitypeename;
		this.cliremark = cliremark;
		this.clitypetrash = clitypetrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enable = enable;
	}

	// Property accessors

	public Integer getClitypeid() {
		return this.clitypeid;
	}

	public void setClitypeid(Integer clitypeid) {
		this.clitypeid = clitypeid;
	}

	public String getClitypename() {
		return this.clitypename;
	}

	public void setClitypename(String clitypename) {
		this.clitypename = clitypename;
	}

	public String getClitypeename() {
		return this.clitypeename;
	}

	public void setClitypeename(String clitypeename) {
		this.clitypeename = clitypeename;
	}

	public String getCliremark() {
		return this.cliremark;
	}

	public void setCliremark(String cliremark) {
		this.cliremark = cliremark;
	}

	public Integer getClitypetrash() {
		return this.clitypetrash;
	}

	public void setClitypetrash(Integer clitypetrash) {
		this.clitypetrash = clitypetrash;
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

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

}