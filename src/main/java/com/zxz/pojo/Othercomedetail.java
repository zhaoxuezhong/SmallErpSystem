package com.zxz.pojo;

/**
 * Othercomedetail entity. @author MyEclipse Persistence Tools
 */

public class Othercomedetail implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 8330777145613536673L;
	private Integer othcomeid;
	private String othcome;
	private String othcomemertialsid;
	private String othcomemertialname;
	private String othcometypes;
	private String othcomeunits;
	private Integer othcomeamount;
	private String othcomeremark;
	private Integer clitrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Othercomedetail() {
	}

	/** full constructor */
	public Othercomedetail(String othcome, String othcomemertialsid, String othcomemertialname, String othcometypes,
			String othcomeunits, Integer othcomeamount, String othcomeremark, Integer clitrash, String safetyone,
			String safetytwo, Integer enables) {
		this.othcome = othcome;
		this.othcomemertialsid = othcomemertialsid;
		this.othcomemertialname = othcomemertialname;
		this.othcometypes = othcometypes;
		this.othcomeunits = othcomeunits;
		this.othcomeamount = othcomeamount;
		this.othcomeremark = othcomeremark;
		this.clitrash = clitrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getOthcomeid() {
		return this.othcomeid;
	}

	public void setOthcomeid(Integer othcomeid) {
		this.othcomeid = othcomeid;
	}

	public String getOthcome() {
		return this.othcome;
	}

	public void setOthcome(String othcome) {
		this.othcome = othcome;
	}

	public String getOthcomemertialsid() {
		return this.othcomemertialsid;
	}

	public void setOthcomemertialsid(String othcomemertialsid) {
		this.othcomemertialsid = othcomemertialsid;
	}

	public String getOthcomemertialname() {
		return this.othcomemertialname;
	}

	public void setOthcomemertialname(String othcomemertialname) {
		this.othcomemertialname = othcomemertialname;
	}

	public String getOthcometypes() {
		return this.othcometypes;
	}

	public void setOthcometypes(String othcometypes) {
		this.othcometypes = othcometypes;
	}

	public String getOthcomeunits() {
		return this.othcomeunits;
	}

	public void setOthcomeunits(String othcomeunits) {
		this.othcomeunits = othcomeunits;
	}

	public Integer getOthcomeamount() {
		return this.othcomeamount;
	}

	public void setOthcomeamount(Integer othcomeamount) {
		this.othcomeamount = othcomeamount;
	}

	public String getOthcomeremark() {
		return this.othcomeremark;
	}

	public void setOthcomeremark(String othcomeremark) {
		this.othcomeremark = othcomeremark;
	}

	public Integer getClitrash() {
		return this.clitrash;
	}

	public void setClitrash(Integer clitrash) {
		this.clitrash = clitrash;
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

	public Integer getEnables() {
		return this.enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

}