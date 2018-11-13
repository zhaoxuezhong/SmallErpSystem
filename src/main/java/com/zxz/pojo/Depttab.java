package com.zxz.pojo;

/**
 * Depttab entity. @author MyEclipse Persistence Tools
 */

public class Depttab implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 4721629384286647009L;
	private Integer depid;
	private String depname;
	private String depremark;
	private String deptrash;
	private String safetyone;
	private String safetytwo;
	private String enables;

	// Constructors

	/** default constructor */
	public Depttab() {
	}

	/** full constructor */
	public Depttab(String depname, String depremark, String deptrash, String safetyone, String safetytwo,
			String enables) {
		this.depname = depname;
		this.depremark = depremark;
		this.deptrash = deptrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getDepid() {
		return this.depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return this.depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getDepremark() {
		return this.depremark;
	}

	public void setDepremark(String depremark) {
		this.depremark = depremark;
	}

	public String getDeptrash() {
		return this.deptrash;
	}

	public void setDeptrash(String deptrash) {
		this.deptrash = deptrash;
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

	public String getEnables() {
		return this.enables;
	}

	public void setEnables(String enables) {
		this.enables = enables;
	}

}