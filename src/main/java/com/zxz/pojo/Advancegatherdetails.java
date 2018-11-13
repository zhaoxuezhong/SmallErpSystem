package com.zxz.pojo;

/**
 * Advancegatherdetails entity. @author MyEclipse Persistence Tools
 */

public class Advancegatherdetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 7104075829237374777L;
	private Integer billid;
	private Integer coteMark;
	private Double promisedMoney;
	private Double advanceMoney;
	private String sinName;
	private String originBillId;
	private String summary;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Advancegatherdetails() {
	}

	/** minimal constructor */
	public Advancegatherdetails(Integer billid) {
		this.billid = billid;
	}

	/** full constructor */
	public Advancegatherdetails(Integer billid, Integer coteMark, Double promisedMoney, Double advanceMoney,
			String sinName, String originBillId, String summary, Integer enables, String safetyone, String safetytwo) {
		this.billid = billid;
		this.coteMark = coteMark;
		this.promisedMoney = promisedMoney;
		this.advanceMoney = advanceMoney;
		this.sinName = sinName;
		this.originBillId = originBillId;
		this.summary = summary;
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

	public Double getPromisedMoney() {
		return this.promisedMoney;
	}

	public void setPromisedMoney(Double promisedMoney) {
		this.promisedMoney = promisedMoney;
	}

	public Double getAdvanceMoney() {
		return this.advanceMoney;
	}

	public void setAdvanceMoney(Double advanceMoney) {
		this.advanceMoney = advanceMoney;
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

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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