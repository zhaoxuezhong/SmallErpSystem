package com.zxz.pojo;

import java.util.Date;

/**
 * Sellcancel entity. @author MyEclipse Persistence Tools
 */

public class Sellcancel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -5960753623896524233L;
	private Integer billid;
	private Date billDate;
	private Integer sinId;
	private String cliid;
	private String clishortname;
	private String cliplaceid;
	private String cliplace;
	private Date effectdate;
	private String currencyType;
	private String priceWhetherTax;
	private String stoid;
	private String stoname;
	private Integer whetheranewenterstorage;
	private String empid;
	private String empName;
	private String depid;
	private String depName;
	private String makeEmpName;
	private String auditingEmpName;
	private Integer checkstate;
	private Integer enable;
	private String remark;
	private Double totalMoney;
	private Double totalTax;
	private Double totalTaxMoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Sellcancel() {
	}

	/** full constructor */
	public Sellcancel(Date billDate, Integer sinId, String cliid, String clishortname, String cliplaceid,
			String cliplace, Date effectdate, String currencyType, String priceWhetherTax, String stoid, String stoname,
			Integer whetheranewenterstorage, String empid, String empName, String depid, String depName,
			String makeEmpName, String auditingEmpName, Integer checkstate, Integer enable, String remark,
			Double totalMoney, Double totalTax, Double totalTaxMoney, Integer enables, String safetyone,
			String safetytwo) {
		this.billDate = billDate;
		this.sinId = sinId;
		this.cliid = cliid;
		this.clishortname = clishortname;
		this.cliplaceid = cliplaceid;
		this.cliplace = cliplace;
		this.effectdate = effectdate;
		this.currencyType = currencyType;
		this.priceWhetherTax = priceWhetherTax;
		this.stoid = stoid;
		this.stoname = stoname;
		this.whetheranewenterstorage = whetheranewenterstorage;
		this.empid = empid;
		this.empName = empName;
		this.depid = depid;
		this.depName = depName;
		this.makeEmpName = makeEmpName;
		this.auditingEmpName = auditingEmpName;
		this.checkstate = checkstate;
		this.enable = enable;
		this.remark = remark;
		this.totalMoney = totalMoney;
		this.totalTax = totalTax;
		this.totalTaxMoney = totalTaxMoney;
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

	public Date getBillDate() {
		return this.billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Integer getSinId() {
		return this.sinId;
	}

	public void setSinId(Integer sinId) {
		this.sinId = sinId;
	}

	public String getCliid() {
		return this.cliid;
	}

	public void setCliid(String cliid) {
		this.cliid = cliid;
	}

	public String getClishortname() {
		return this.clishortname;
	}

	public void setClishortname(String clishortname) {
		this.clishortname = clishortname;
	}

	public String getCliplaceid() {
		return this.cliplaceid;
	}

	public void setCliplaceid(String cliplaceid) {
		this.cliplaceid = cliplaceid;
	}

	public String getCliplace() {
		return this.cliplace;
	}

	public void setCliplace(String cliplace) {
		this.cliplace = cliplace;
	}

	public Date getEffectdate() {
		return this.effectdate;
	}

	public void setEffectdate(Date effectdate) {
		this.effectdate = effectdate;
	}

	public String getCurrencyType() {
		return this.currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getPriceWhetherTax() {
		return this.priceWhetherTax;
	}

	public void setPriceWhetherTax(String priceWhetherTax) {
		this.priceWhetherTax = priceWhetherTax;
	}

	public String getStoid() {
		return this.stoid;
	}

	public void setStoid(String stoid) {
		this.stoid = stoid;
	}

	public String getStoname() {
		return this.stoname;
	}

	public void setStoname(String stoname) {
		this.stoname = stoname;
	}

	public Integer getWhetheranewenterstorage() {
		return this.whetheranewenterstorage;
	}

	public void setWhetheranewenterstorage(Integer whetheranewenterstorage) {
		this.whetheranewenterstorage = whetheranewenterstorage;
	}

	public String getEmpid() {
		return this.empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getMakeEmpName() {
		return this.makeEmpName;
	}

	public void setMakeEmpName(String makeEmpName) {
		this.makeEmpName = makeEmpName;
	}

	public String getAuditingEmpName() {
		return this.auditingEmpName;
	}

	public void setAuditingEmpName(String auditingEmpName) {
		this.auditingEmpName = auditingEmpName;
	}

	public Integer getCheckstate() {
		return this.checkstate;
	}

	public void setCheckstate(Integer checkstate) {
		this.checkstate = checkstate;
	}

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getTotalMoney() {
		return this.totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Double getTotalTax() {
		return this.totalTax;
	}

	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}

	public Double getTotalTaxMoney() {
		return this.totalTaxMoney;
	}

	public void setTotalTaxMoney(Double totalTaxMoney) {
		this.totalTaxMoney = totalTaxMoney;
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