package com.zxz.pojo;

/**
 * Materieltype entity. @author MyEclipse Persistence Tools
 */

public class Materieltype implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6121106796677166793L;
	private Integer matypeid;
	private String matypename;
	private String matypeengname;
	private String matyperemark;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Materieltype() {
	}

	/** minimal constructor */
	public Materieltype(String matypename) {
		this.matypename = matypename;
	}

	/** full constructor */
	public Materieltype(String matypename, String matypeengname, String matyperemark, String safetyone,
			String safetytwo, Integer enables) {
		this.matypename = matypename;
		this.matypeengname = matypeengname;
		this.matyperemark = matyperemark;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getMatypeid() {
		return this.matypeid;
	}

	public void setMatypeid(Integer matypeid) {
		this.matypeid = matypeid;
	}

	public String getMatypename() {
		return this.matypename;
	}

	public void setMatypename(String matypename) {
		this.matypename = matypename;
	}

	public String getMatypeengname() {
		return this.matypeengname;
	}

	public void setMatypeengname(String matypeengname) {
		this.matypeengname = matypeengname;
	}

	public String getMatyperemark() {
		return this.matyperemark;
	}

	public void setMatyperemark(String matyperemark) {
		this.matyperemark = matyperemark;
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