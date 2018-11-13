package com.zxz.pojo;

import java.util.Date;

/**
 * Clashfunddetailsone entity. @author MyEclipse Persistence Tools
 */

public class Clashfunddetailsone implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 582350567174923976L;
	private Integer billid;
	private Integer coteMark;
	private String sinName;
	private String originBillId;
	private Date originoddDate;
	private Double originoddMoney;
	private Double currentlybalance;
	private Double discountMoney;
	private Double clashMoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Clashfunddetailsone() {
	}

	/** minimal constructor */
	public Clashfunddetailsone(Integer billid) {
		this.billid = billid;
	}

	/** full constructor */
	public Clashfunddetailsone(Integer billid, Integer coteMark, String sinName, String originBillId,
			Date originoddDate, Double originoddMoney, Double currentlybalance, Double discountMoney, Double clashMoney,
			Integer enables, String safetyone, String safetytwo) {
		this.billid = billid;
		this.coteMark = coteMark;
		this.sinName = sinName;
		this.originBillId = originBillId;
		this.originoddDate = originoddDate;
		this.originoddMoney = originoddMoney;
		this.currentlybalance = currentlybalance;
		this.discountMoney = discountMoney;
		this.clashMoney = clashMoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getBillid() {
		return this.billid;
	}

	public void setBillid(Integer billid) {
		this.billid = billid;
	}

	public Integer getCoteMark() {
		return this.coteMark;
	}

	public void setCoteMark(Integer coteMark) {
		this.coteMark = coteMark;
	}

	public String getSinName() {
		return this.sinName;
	}

	public void setSinName(String sinName) {
		this.sinName = sinName;
	}

	public String getOriginBillId() {
		return this.originBillId;
	}

	public void setOriginBillId(String originBillId) {
		this.originBillId = originBillId;
	}

	public Date getOriginoddDate() {
		return this.originoddDate;
	}

	public void setOriginoddDate(Date originoddDate) {
		this.originoddDate = originoddDate;
	}

	public Double getOriginoddMoney() {
		return this.originoddMoney;
	}

	public void setOriginoddMoney(Double originoddMoney) {
		this.originoddMoney = originoddMoney;
	}

	public Double getCurrentlybalance() {
		return this.currentlybalance;
	}

	public void setCurrentlybalance(Double currentlybalance) {
		this.currentlybalance = currentlybalance;
	}

	public Double getDiscountMoney() {
		return this.discountMoney;
	}

	public void setDiscountMoney(Double discountMoney) {
		this.discountMoney = discountMoney;
	}

	public Double getClashMoney() {
		return this.clashMoney;
	}

	public void setClashMoney(Double clashMoney) {
		this.clashMoney = clashMoney;
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