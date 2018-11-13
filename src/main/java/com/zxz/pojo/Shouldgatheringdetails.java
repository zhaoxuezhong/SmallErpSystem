package com.zxz.pojo;

import java.util.Date;

/**
 * Shouldgatheringdetails entity. @author MyEclipse Persistence Tools
 */

public class Shouldgatheringdetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3075692643845366749L;
	private Integer minusaddid;
	private Integer sinId;
	private String sinName;
	private String originBillId;
	private Date nowdate;
	private String cliid;
	private Date showDate;
	private Double origiddMoney;
	private Double currentlybalance;
	private String remark;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Shouldgatheringdetails() {
	}

	/** full constructor */
	public Shouldgatheringdetails(Integer sinId, String sinName, String originBillId, Date nowdate, String cliid,
			Date showDate, Double origiddMoney, Double currentlybalance, String remark, Integer enables,
			String safetyone, String safetytwo) {
		this.sinId = sinId;
		this.sinName = sinName;
		this.originBillId = originBillId;
		this.nowdate = nowdate;
		this.cliid = cliid;
		this.showDate = showDate;
		this.origiddMoney = origiddMoney;
		this.currentlybalance = currentlybalance;
		this.remark = remark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getMinusaddid() {
		return this.minusaddid;
	}

	public void setMinusaddid(Integer minusaddid) {
		this.minusaddid = minusaddid;
	}

	public Integer getSinId() {
		return this.sinId;
	}

	public void setSinId(Integer sinId) {
		this.sinId = sinId;
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

	public Date getNowdate() {
		return this.nowdate;
	}

	public void setNowdate(Date nowdate) {
		this.nowdate = nowdate;
	}

	public String getCliid() {
		return this.cliid;
	}

	public void setCliid(String cliid) {
		this.cliid = cliid;
	}

	public Date getShowDate() {
		return this.showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Double getOrigiddMoney() {
		return this.origiddMoney;
	}

	public void setOrigiddMoney(Double origiddMoney) {
		this.origiddMoney = origiddMoney;
	}

	public Double getCurrentlybalance() {
		return this.currentlybalance;
	}

	public void setCurrentlybalance(Double currentlybalance) {
		this.currentlybalance = currentlybalance;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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