package com.zxz.pojo;

/**
 * Advancedetails entity. @author MyEclipse Persistence Tools
 */

public class Advancedetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 2274666386199717790L;
	private Integer advdetid;
	private Integer advid;
	private Double advdetmoney;
	private String advdetoddtype;
	private String advdetoddid;
	private String advdetdegest;
	private Double advdetbalance;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Advancedetails() {
	}

	/** full constructor */
	public Advancedetails(Integer advid, Double advdetmoney, String advdetoddtype, String advdetoddid,
			String advdetdegest, Double advdetbalance, Integer enables, String safetyone, String safetytwo) {
		this.advid = advid;
		this.advdetmoney = advdetmoney;
		this.advdetoddtype = advdetoddtype;
		this.advdetoddid = advdetoddid;
		this.advdetdegest = advdetdegest;
		this.advdetbalance = advdetbalance;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getAdvdetid() {
		return this.advdetid;
	}

	public void setAdvdetid(Integer advdetid) {
		this.advdetid = advdetid;
	}

	public Integer getAdvid() {
		return this.advid;
	}

	public void setAdvid(Integer advid) {
		this.advid = advid;
	}

	public Double getAdvdetmoney() {
		return this.advdetmoney;
	}

	public void setAdvdetmoney(Double advdetmoney) {
		this.advdetmoney = advdetmoney;
	}

	public String getAdvdetoddtype() {
		return this.advdetoddtype;
	}

	public void setAdvdetoddtype(String advdetoddtype) {
		this.advdetoddtype = advdetoddtype;
	}

	public String getAdvdetoddid() {
		return this.advdetoddid;
	}

	public void setAdvdetoddid(String advdetoddid) {
		this.advdetoddid = advdetoddid;
	}

	public String getAdvdetdegest() {
		return this.advdetdegest;
	}

	public void setAdvdetdegest(String advdetdegest) {
		this.advdetdegest = advdetdegest;
	}

	public Double getAdvdetbalance() {
		return this.advdetbalance;
	}

	public void setAdvdetbalance(Double advdetbalance) {
		this.advdetbalance = advdetbalance;
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