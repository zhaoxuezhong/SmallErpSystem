package com.zxz.pojo;

/**
 * Quotedetails entity. @author MyEclipse Persistence Tools
 */

public class Quotedetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 309738379384746357L;
	private Integer billid;
	private Integer coteMark;
	private String matid;
	private String matname;
	private String matspec;
	private String matunit;
	private Integer quonumber;
	private Double agioAgoPrice;
	private Double agio;
	private Double price;
	private Double money;
	private Double cess;
	private Double taxmoney;
	private Double intaxmoney;
	private String present;
	private Double factCost;
	private Double criterionCost;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Quotedetails() {
	}

	/** full constructor */
	public Quotedetails(Integer coteMark, String matid, String matname, String matspec, String matunit,
			Integer quonumber, Double agioAgoPrice, Double agio, Double price, Double money, Double cess,
			Double taxmoney, Double intaxmoney, String present, Double factCost, Double criterionCost, Integer enables,
			String safetyone, String safetytwo) {
		this.coteMark = coteMark;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.matunit = matunit;
		this.quonumber = quonumber;
		this.agioAgoPrice = agioAgoPrice;
		this.agio = agio;
		this.price = price;
		this.money = money;
		this.cess = cess;
		this.taxmoney = taxmoney;
		this.intaxmoney = intaxmoney;
		this.present = present;
		this.factCost = factCost;
		this.criterionCost = criterionCost;
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

	public String getMatid() {
		return this.matid;
	}

	public void setMatid(String matid) {
		this.matid = matid;
	}

	public String getMatname() {
		return this.matname;
	}

	public void setMatname(String matname) {
		this.matname = matname;
	}

	public String getMatspec() {
		return this.matspec;
	}

	public void setMatspec(String matspec) {
		this.matspec = matspec;
	}

	public String getMatunit() {
		return this.matunit;
	}

	public void setMatunit(String matunit) {
		this.matunit = matunit;
	}

	public Integer getQuonumber() {
		return this.quonumber;
	}

	public void setQuonumber(Integer quonumber) {
		this.quonumber = quonumber;
	}

	public Double getAgioAgoPrice() {
		return this.agioAgoPrice;
	}

	public void setAgioAgoPrice(Double agioAgoPrice) {
		this.agioAgoPrice = agioAgoPrice;
	}

	public Double getAgio() {
		return this.agio;
	}

	public void setAgio(Double agio) {
		this.agio = agio;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Double getCess() {
		return this.cess;
	}

	public void setCess(Double cess) {
		this.cess = cess;
	}

	public Double getTaxmoney() {
		return this.taxmoney;
	}

	public void setTaxmoney(Double taxmoney) {
		this.taxmoney = taxmoney;
	}

	public Double getIntaxmoney() {
		return this.intaxmoney;
	}

	public void setIntaxmoney(Double intaxmoney) {
		this.intaxmoney = intaxmoney;
	}

	public String getPresent() {
		return this.present;
	}

	public void setPresent(String present) {
		this.present = present;
	}

	public Double getFactCost() {
		return this.factCost;
	}

	public void setFactCost(Double factCost) {
		this.factCost = factCost;
	}

	public Double getCriterionCost() {
		return this.criterionCost;
	}

	public void setCriterionCost(Double criterionCost) {
		this.criterionCost = criterionCost;
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