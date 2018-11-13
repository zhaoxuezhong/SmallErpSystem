package com.zxz.pojo;

/**
 * Clashfunddetailstwo entity. @author MyEclipse Persistence Tools
 */

public class Clashfunddetailstwo implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -5517066612353345684L;
	private Integer billid;
	private Integer coteMark;
	private String gatherId;
	private String sinName;
	private String originBillId;
	private Integer originoddrowId;
	private Double advanceMoney;
	private Double advancebalance;
	private Double adoptAdvanceMoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Clashfunddetailstwo() {
	}

	/** minimal constructor */
	public Clashfunddetailstwo(Integer billid) {
		this.billid = billid;
	}

	/** full constructor */
	public Clashfunddetailstwo(Integer billid, Integer coteMark, String gatherId, String sinName, String originBillId,
			Integer originoddrowId, Double advanceMoney, Double advancebalance, Double adoptAdvanceMoney,
			Integer enables, String safetyone, String safetytwo) {
		this.billid = billid;
		this.coteMark = coteMark;
		this.gatherId = gatherId;
		this.sinName = sinName;
		this.originBillId = originBillId;
		this.originoddrowId = originoddrowId;
		this.advanceMoney = advanceMoney;
		this.advancebalance = advancebalance;
		this.adoptAdvanceMoney = adoptAdvanceMoney;
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

	public String getGatherId() {
		return this.gatherId;
	}

	public void setGatherId(String gatherId) {
		this.gatherId = gatherId;
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

	public Integer getOriginoddrowId() {
		return this.originoddrowId;
	}

	public void setOriginoddrowId(Integer originoddrowId) {
		this.originoddrowId = originoddrowId;
	}

	public Double getAdvanceMoney() {
		return this.advanceMoney;
	}

	public void setAdvanceMoney(Double advanceMoney) {
		this.advanceMoney = advanceMoney;
	}

	public Double getAdvancebalance() {
		return this.advancebalance;
	}

	public void setAdvancebalance(Double advancebalance) {
		this.advancebalance = advancebalance;
	}

	public Double getAdoptAdvanceMoney() {
		return this.adoptAdvanceMoney;
	}

	public void setAdoptAdvanceMoney(Double adoptAdvanceMoney) {
		this.adoptAdvanceMoney = adoptAdvanceMoney;
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