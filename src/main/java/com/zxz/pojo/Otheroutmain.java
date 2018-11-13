package com.zxz.pojo;

import java.util.Date;

/**
 * Otheroutmain entity. @author MyEclipse Persistence Tools
 */

public class Otheroutmain implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 4754566720158861195L;
	private Integer othid;
	private Date othdate;
	private String othouttypeid;
	private String othstore;
	private String othoutname;
	private String othdept;
	private String othmakemanid;
	private String othrepeatuserid;
	private Integer clitrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Otheroutmain() {
	}

	/** full constructor */
	public Otheroutmain(Date othdate, String othouttypeid, String othstore, String othoutname, String othdept,
			String othmakemanid, String othrepeatuserid, Integer clitrash, String safetyone, String safetytwo,
			Integer enables) {
		this.othdate = othdate;
		this.othouttypeid = othouttypeid;
		this.othstore = othstore;
		this.othoutname = othoutname;
		this.othdept = othdept;
		this.othmakemanid = othmakemanid;
		this.othrepeatuserid = othrepeatuserid;
		this.clitrash = clitrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getOthid() {
		return this.othid;
	}

	public void setOthid(Integer othid) {
		this.othid = othid;
	}

	public Date getOthdate() {
		return this.othdate;
	}

	public void setOthdate(Date othdate) {
		this.othdate = othdate;
	}

	public String getOthouttypeid() {
		return this.othouttypeid;
	}

	public void setOthouttypeid(String othouttypeid) {
		this.othouttypeid = othouttypeid;
	}

	public String getOthstore() {
		return this.othstore;
	}

	public void setOthstore(String othstore) {
		this.othstore = othstore;
	}

	public String getOthoutname() {
		return this.othoutname;
	}

	public void setOthoutname(String othoutname) {
		this.othoutname = othoutname;
	}

	public String getOthdept() {
		return this.othdept;
	}

	public void setOthdept(String othdept) {
		this.othdept = othdept;
	}

	public String getOthmakemanid() {
		return this.othmakemanid;
	}

	public void setOthmakemanid(String othmakemanid) {
		this.othmakemanid = othmakemanid;
	}

	public String getOthrepeatuserid() {
		return this.othrepeatuserid;
	}

	public void setOthrepeatuserid(String othrepeatuserid) {
		this.othrepeatuserid = othrepeatuserid;
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