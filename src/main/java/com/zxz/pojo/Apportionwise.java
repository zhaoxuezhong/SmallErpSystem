package com.zxz.pojo;

/**
 * Apportionwise entity. @author MyEclipse Persistence Tools
 */

public class Apportionwise implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 3848297846160304887L;
	private Integer wisid;
	private String wisname;
	private String wisename;
	private String wisremark;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Apportionwise() {
	}

	/** full constructor */
	public Apportionwise(String wisname, String wisename, String wisremark, Integer enables, String safetyone,
			String safetytwo) {
		this.wisname = wisname;
		this.wisename = wisename;
		this.wisremark = wisremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getWisid() {
		return this.wisid;
	}

	public void setWisid(Integer wisid) {
		this.wisid = wisid;
	}

	public String getWisname() {
		return this.wisname;
	}

	public void setWisname(String wisname) {
		this.wisname = wisname;
	}

	public String getWisename() {
		return this.wisename;
	}

	public void setWisename(String wisename) {
		this.wisename = wisename;
	}

	public String getWisremark() {
		return this.wisremark;
	}

	public void setWisremark(String wisremark) {
		this.wisremark = wisremark;
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