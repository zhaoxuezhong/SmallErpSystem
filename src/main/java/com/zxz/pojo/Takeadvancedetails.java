package com.zxz.pojo;

/**
 * Takeadvancedetails entity. @author MyEclipse Persistence Tools
 */

public class Takeadvancedetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1420819135830171789L;
	private Integer takid;
	private Integer payid;
	private String advid;
	private String advdetid;
	private Double takadvmoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Takeadvancedetails() {
	}

	/** full constructor */
	public Takeadvancedetails(Integer payid, String advid, String advdetid, Double takadvmoney, Integer enables,
			String safetyone, String safetytwo) {
		this.payid = payid;
		this.advid = advid;
		this.advdetid = advdetid;
		this.takadvmoney = takadvmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getTakid() {
		return this.takid;
	}

	public void setTakid(Integer takid) {
		this.takid = takid;
	}

	public Integer getPayid() {
		return this.payid;
	}

	public void setPayid(Integer payid) {
		this.payid = payid;
	}

	public String getAdvid() {
		return this.advid;
	}

	public void setAdvid(String advid) {
		this.advid = advid;
	}

	public String getAdvdetid() {
		return this.advdetid;
	}

	public void setAdvdetid(String advdetid) {
		this.advdetid = advdetid;
	}

	public Double getTakadvmoney() {
		return this.takadvmoney;
	}

	public void setTakadvmoney(Double takadvmoney) {
		this.takadvmoney = takadvmoney;
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