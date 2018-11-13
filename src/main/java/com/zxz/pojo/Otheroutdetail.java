package com.zxz.pojo;

/**
 * Otheroutdetail entity. @author MyEclipse Persistence Tools
 */

public class Otheroutdetail implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -1895302891077508225L;
	private Integer otheroutid;
	private String othoutline;
	private String othoutmertialsid;
	private String othoutmertialname;
	private String othouttypes;
	private String othoutunits;
	private Integer othoutamount;
	private String othoutremark;
	private Integer clitrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Otheroutdetail() {
	}

	/** full constructor */
	public Otheroutdetail(String othoutline, String othoutmertialsid, String othoutmertialname, String othouttypes,
			String othoutunits, Integer othoutamount, String othoutremark, Integer clitrash, String safetyone,
			String safetytwo, Integer enables) {
		this.othoutline = othoutline;
		this.othoutmertialsid = othoutmertialsid;
		this.othoutmertialname = othoutmertialname;
		this.othouttypes = othouttypes;
		this.othoutunits = othoutunits;
		this.othoutamount = othoutamount;
		this.othoutremark = othoutremark;
		this.clitrash = clitrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getOtheroutid() {
		return this.otheroutid;
	}

	public void setOtheroutid(Integer otheroutid) {
		this.otheroutid = otheroutid;
	}

	public String getOthoutline() {
		return this.othoutline;
	}

	public void setOthoutline(String othoutline) {
		this.othoutline = othoutline;
	}

	public String getOthoutmertialsid() {
		return this.othoutmertialsid;
	}

	public void setOthoutmertialsid(String othoutmertialsid) {
		this.othoutmertialsid = othoutmertialsid;
	}

	public String getOthoutmertialname() {
		return this.othoutmertialname;
	}

	public void setOthoutmertialname(String othoutmertialname) {
		this.othoutmertialname = othoutmertialname;
	}

	public String getOthouttypes() {
		return this.othouttypes;
	}

	public void setOthouttypes(String othouttypes) {
		this.othouttypes = othouttypes;
	}

	public String getOthoutunits() {
		return this.othoutunits;
	}

	public void setOthoutunits(String othoutunits) {
		this.othoutunits = othoutunits;
	}

	public Integer getOthoutamount() {
		return this.othoutamount;
	}

	public void setOthoutamount(Integer othoutamount) {
		this.othoutamount = othoutamount;
	}

	public String getOthoutremark() {
		return this.othoutremark;
	}

	public void setOthoutremark(String othoutremark) {
		this.othoutremark = othoutremark;
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