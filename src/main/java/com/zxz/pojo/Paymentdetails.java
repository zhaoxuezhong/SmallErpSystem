package com.zxz.pojo;

/**
 * Paymentdetails entity. @author MyEclipse Persistence Tools
 */

public class Paymentdetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3073368072656776564L;
	private Integer payid;
	private String paydetid;
	private String paydetoddtype;
	private String paydetoddid;
	private Double formeroddmoney;
	private Double nocebalance;
	private Double payzr;
	private Double paydetmoney;
	private Double takadvmoney;
	private Double rushmoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Paymentdetails() {
	}

	/** minimal constructor */
	public Paymentdetails(Integer payid) {
		this.payid = payid;
	}

	/** full constructor */
	public Paymentdetails(Integer payid, String paydetid, String paydetoddtype, String paydetoddid,
			Double formeroddmoney, Double nocebalance, Double payzr, Double paydetmoney, Double takadvmoney,
			Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		this.payid = payid;
		this.paydetid = paydetid;
		this.paydetoddtype = paydetoddtype;
		this.paydetoddid = paydetoddid;
		this.formeroddmoney = formeroddmoney;
		this.nocebalance = nocebalance;
		this.payzr = payzr;
		this.paydetmoney = paydetmoney;
		this.takadvmoney = takadvmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getPayid() {
		return this.payid;
	}

	public void setPayid(Integer payid) {
		this.payid = payid;
	}

	public String getPaydetid() {
		return this.paydetid;
	}

	public void setPaydetid(String paydetid) {
		this.paydetid = paydetid;
	}

	public String getPaydetoddtype() {
		return this.paydetoddtype;
	}

	public void setPaydetoddtype(String paydetoddtype) {
		this.paydetoddtype = paydetoddtype;
	}

	public String getPaydetoddid() {
		return this.paydetoddid;
	}

	public void setPaydetoddid(String paydetoddid) {
		this.paydetoddid = paydetoddid;
	}

	public Double getFormeroddmoney() {
		return this.formeroddmoney;
	}

	public void setFormeroddmoney(Double formeroddmoney) {
		this.formeroddmoney = formeroddmoney;
	}

	public Double getNocebalance() {
		return this.nocebalance;
	}

	public void setNocebalance(Double nocebalance) {
		this.nocebalance = nocebalance;
	}

	public Double getPayzr() {
		return this.payzr;
	}

	public void setPayzr(Double payzr) {
		this.payzr = payzr;
	}

	public Double getPaydetmoney() {
		return this.paydetmoney;
	}

	public void setPaydetmoney(Double paydetmoney) {
		this.paydetmoney = paydetmoney;
	}

	public Double getTakadvmoney() {
		return this.takadvmoney;
	}

	public void setTakadvmoney(Double takadvmoney) {
		this.takadvmoney = takadvmoney;
	}

	public Double getRushmoney() {
		return this.rushmoney;
	}

	public void setRushmoney(Double rushmoney) {
		this.rushmoney = rushmoney;
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