package com.zxz.pojo;

import java.util.Date;

/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -8387488478792994542L;
	private Integer payid;
	private Date paydate;
	private String purveyid;
	private String purveyname;
	private String paystrike1;
	private String paystrike2;
	private String paystrike3;
	private Double paymoney1;
	private Double paymoney2;
	private Double paymoney3;
	private String paymakeing;
	private String paydept;
	private String stodeptid;
	private String paycheckman;
	private String payremark;
	private Integer isaditing;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** full constructor */
	public Payment(Date paydate, String purveyid, String purveyname, String paystrike1, String paystrike2,
			String paystrike3, Double paymoney1, Double paymoney2, Double paymoney3, String paymakeing, String paydept,
			String stodeptid, String paycheckman, String payremark, Integer isaditing, Integer enables,
			String safetyone, String safetytwo) {
		this.paydate = paydate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.paystrike1 = paystrike1;
		this.paystrike2 = paystrike2;
		this.paystrike3 = paystrike3;
		this.paymoney1 = paymoney1;
		this.paymoney2 = paymoney2;
		this.paymoney3 = paymoney3;
		this.paymakeing = paymakeing;
		this.paydept = paydept;
		this.stodeptid = stodeptid;
		this.paycheckman = paycheckman;
		this.payremark = payremark;
		this.isaditing = isaditing;
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

	public Date getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public String getPurveyid() {
		return this.purveyid;
	}

	public void setPurveyid(String purveyid) {
		this.purveyid = purveyid;
	}

	public String getPurveyname() {
		return this.purveyname;
	}

	public void setPurveyname(String purveyname) {
		this.purveyname = purveyname;
	}

	public String getPaystrike1() {
		return this.paystrike1;
	}

	public void setPaystrike1(String paystrike1) {
		this.paystrike1 = paystrike1;
	}

	public String getPaystrike2() {
		return this.paystrike2;
	}

	public void setPaystrike2(String paystrike2) {
		this.paystrike2 = paystrike2;
	}

	public String getPaystrike3() {
		return this.paystrike3;
	}

	public void setPaystrike3(String paystrike3) {
		this.paystrike3 = paystrike3;
	}

	public Double getPaymoney1() {
		return this.paymoney1;
	}

	public void setPaymoney1(Double paymoney1) {
		this.paymoney1 = paymoney1;
	}

	public Double getPaymoney2() {
		return this.paymoney2;
	}

	public void setPaymoney2(Double paymoney2) {
		this.paymoney2 = paymoney2;
	}

	public Double getPaymoney3() {
		return this.paymoney3;
	}

	public void setPaymoney3(Double paymoney3) {
		this.paymoney3 = paymoney3;
	}

	public String getPaymakeing() {
		return this.paymakeing;
	}

	public void setPaymakeing(String paymakeing) {
		this.paymakeing = paymakeing;
	}

	public String getPaydept() {
		return this.paydept;
	}

	public void setPaydept(String paydept) {
		this.paydept = paydept;
	}

	public String getStodeptid() {
		return this.stodeptid;
	}

	public void setStodeptid(String stodeptid) {
		this.stodeptid = stodeptid;
	}

	public String getPaycheckman() {
		return this.paycheckman;
	}

	public void setPaycheckman(String paycheckman) {
		this.paycheckman = paycheckman;
	}

	public String getPayremark() {
		return this.payremark;
	}

	public void setPayremark(String payremark) {
		this.payremark = payremark;
	}

	public Integer getIsaditing() {
		return this.isaditing;
	}

	public void setIsaditing(Integer isaditing) {
		this.isaditing = isaditing;
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