package com.zxz.pojo;

import java.util.Date;

/**
 * Othercome entity. @author MyEclipse Persistence Tools
 */

public class Othercome implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 525564802088178229L;
	private Integer othcomeid;
	private Date othcomedate;
	private String othcometypeid;
	private String othcomestore;
	private String othcomename;
	private String othcomedept;
	private String othcomemakemanid;
	private String othcomerepeatuserid;
	private Integer clitrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Othercome() {
	}

	/** full constructor */
	public Othercome(Date othcomedate, String othcometypeid, String othcomestore, String othcomename,
			String othcomedept, String othcomemakemanid, String othcomerepeatuserid, Integer clitrash, String safetyone,
			String safetytwo, Integer enables) {
		this.othcomedate = othcomedate;
		this.othcometypeid = othcometypeid;
		this.othcomestore = othcomestore;
		this.othcomename = othcomename;
		this.othcomedept = othcomedept;
		this.othcomemakemanid = othcomemakemanid;
		this.othcomerepeatuserid = othcomerepeatuserid;
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

	public Date getOthcomedate() {
		return this.othcomedate;
	}

	public void setOthcomedate(Date othcomedate) {
		this.othcomedate = othcomedate;
	}

	public String getOthcometypeid() {
		return this.othcometypeid;
	}

	public void setOthcometypeid(String othcometypeid) {
		this.othcometypeid = othcometypeid;
	}

	public String getOthcomestore() {
		return this.othcomestore;
	}

	public void setOthcomestore(String othcomestore) {
		this.othcomestore = othcomestore;
	}

	public String getOthcomename() {
		return this.othcomename;
	}

	public void setOthcomename(String othcomename) {
		this.othcomename = othcomename;
	}

	public String getOthcomedept() {
		return this.othcomedept;
	}

	public void setOthcomedept(String othcomedept) {
		this.othcomedept = othcomedept;
	}

	public String getOthcomemakemanid() {
		return this.othcomemakemanid;
	}

	public void setOthcomemakemanid(String othcomemakemanid) {
		this.othcomemakemanid = othcomemakemanid;
	}

	public String getOthcomerepeatuserid() {
		return this.othcomerepeatuserid;
	}

	public void setOthcomerepeatuserid(String othcomerepeatuserid) {
		this.othcomerepeatuserid = othcomerepeatuserid;
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