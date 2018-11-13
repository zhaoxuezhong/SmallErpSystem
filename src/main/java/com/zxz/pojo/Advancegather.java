package com.zxz.pojo;

import java.util.Date;

/**
 * Advancegather entity. @author MyEclipse Persistence Tools
 */

public class Advancegather implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 4813973752596313467L;
	private Integer billid;
	private Date billDate;
	private Integer sinId;
	private String cliid;
	private String clishortname;
	private String currencyType;
	private String reckonTypeF;
	private String reckonTypeS;
	private String reckonTypeT;
	private Double reckonMoneyF;
	private Double reckonMoneyS;
	private Double reckonMoneyT;
	private Double gatherDiscount;
	private Date gatherendaccountMonth;
	private String empid;
	private String empName;
	private String depid;
	private String depName;
	private String makeEmpName;
	private String auditingEmpName;
	private Integer checkstate;
	private String remark;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Advancegather() {
	}

	/** full constructor */
	public Advancegather(Date billDate, Integer sinId, String cliid, String clishortname, String currencyType,
			String reckonTypeF, String reckonTypeS, String reckonTypeT, Double reckonMoneyF, Double reckonMoneyS,
			Double reckonMoneyT, Double gatherDiscount, Date gatherendaccountMonth, String empid, String empName,
			String depid, String depName, String makeEmpName, String auditingEmpName, Integer checkstate, String remark,
			Integer enables, String safetyone, String safetytwo) {
		this.billDate = billDate;
		this.sinId = sinId;
		this.cliid = cliid;
		this.clishortname = clishortname;
		this.currencyType = currencyType;
		this.reckonTypeF = reckonTypeF;
		this.reckonTypeS = reckonTypeS;
		this.reckonTypeT = reckonTypeT;
		this.reckonMoneyF = reckonMoneyF;
		this.reckonMoneyS = reckonMoneyS;
		this.reckonMoneyT = reckonMoneyT;
		this.gatherDiscount = gatherDiscount;
		this.gatherendaccountMonth = gatherendaccountMonth;
		this.empid = empid;
		this.empName = empName;
		this.depid = depid;
		this.depName = depName;
		this.makeEmpName = makeEmpName;
		this.auditingEmpName = auditingEmpName;
		this.checkstate = checkstate;
		this.remark = remark;
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

	public String getCurrencyType() {
		return this.currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getReckonTypeF() {
		return this.reckonTypeF;
	}

	public void setReckonTypeF(String reckonTypeF) {
		this.reckonTypeF = reckonTypeF;
	}

	public String getReckonTypeS() {
		return this.reckonTypeS;
	}

	public void setReckonTypeS(String reckonTypeS) {
		this.reckonTypeS = reckonTypeS;
	}

	public String getReckonTypeT() {
		return this.reckonTypeT;
	}

	public void setReckonTypeT(String reckonTypeT) {
		this.reckonTypeT = reckonTypeT;
	}

	public Double getReckonMoneyF() {
		return this.reckonMoneyF;
	}

	public void setReckonMoneyF(Double reckonMoneyF) {
		this.reckonMoneyF = reckonMoneyF;
	}

	public Double getReckonMoneyS() {
		return this.reckonMoneyS;
	}

	public void setReckonMoneyS(Double reckonMoneyS) {
		this.reckonMoneyS = reckonMoneyS;
	}

	public Double getReckonMoneyT() {
		return this.reckonMoneyT;
	}

	public void setReckonMoneyT(Double reckonMoneyT) {
		this.reckonMoneyT = reckonMoneyT;
	}

	public Double getGatherDiscount() {
		return this.gatherDiscount;
	}

	public void setGatherDiscount(Double gatherDiscount) {
		this.gatherDiscount = gatherDiscount;
	}

	public Date getGatherendaccountMonth() {
		return this.gatherendaccountMonth;
	}

	public void setGatherendaccountMonth(Date gatherendaccountMonth) {
		this.gatherendaccountMonth = gatherendaccountMonth;
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