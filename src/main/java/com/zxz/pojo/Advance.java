package com.zxz.pojo;

import java.util.Date;

/**
 * Advance entity. @author MyEclipse Persistence Tools
 */

public class Advance implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 6416153954485478105L;
	private Integer advid;
	private Date advdate;
	private String purveyid;
	private String purveyname;
	private String advstrike1;
	private String advstrike2;
	private String advstrike3;
	private Double advmoney1;
	private Double advmoney2;
	private Double advmoney3;
	private String advmakeing;
	private String stodept;
	private String stodeptid;
	private String advcheckman;
	private String advremark;
	private Integer isaditing;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Advance() {
	}

	/** full constructor */
	public Advance(Date advdate, String purveyid, String purveyname, String advstrike1, String advstrike2,
			String advstrike3, Double advmoney1, Double advmoney2, Double advmoney3, String advmakeing, String stodept,
			String stodeptid, String advcheckman, String advremark, Integer isaditing, Integer enables,
			String safetyone, String safetytwo) {
		this.advdate = advdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.advstrike1 = advstrike1;
		this.advstrike2 = advstrike2;
		this.advstrike3 = advstrike3;
		this.advmoney1 = advmoney1;
		this.advmoney2 = advmoney2;
		this.advmoney3 = advmoney3;
		this.advmakeing = advmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.advcheckman = advcheckman;
		this.advremark = advremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getAdvid() {
		return this.advid;
	}

	public void setAdvid(Integer advid) {
		this.advid = advid;
	}

	public Date getAdvdate() {
		return this.advdate;
	}

	public void setAdvdate(Date advdate) {
		this.advdate = advdate;
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

	public String getAdvstrike1() {
		return this.advstrike1;
	}

	public void setAdvstrike1(String advstrike1) {
		this.advstrike1 = advstrike1;
	}

	public String getAdvstrike2() {
		return this.advstrike2;
	}

	public void setAdvstrike2(String advstrike2) {
		this.advstrike2 = advstrike2;
	}

	public String getAdvstrike3() {
		return this.advstrike3;
	}

	public void setAdvstrike3(String advstrike3) {
		this.advstrike3 = advstrike3;
	}

	public Double getAdvmoney1() {
		return this.advmoney1;
	}

	public void setAdvmoney1(Double advmoney1) {
		this.advmoney1 = advmoney1;
	}

	public Double getAdvmoney2() {
		return this.advmoney2;
	}

	public void setAdvmoney2(Double advmoney2) {
		this.advmoney2 = advmoney2;
	}

	public Double getAdvmoney3() {
		return this.advmoney3;
	}

	public void setAdvmoney3(Double advmoney3) {
		this.advmoney3 = advmoney3;
	}

	public String getAdvmakeing() {
		return this.advmakeing;
	}

	public void setAdvmakeing(String advmakeing) {
		this.advmakeing = advmakeing;
	}

	public String getStodept() {
		return this.stodept;
	}

	public void setStodept(String stodept) {
		this.stodept = stodept;
	}

	public String getStodeptid() {
		return this.stodeptid;
	}

	public void setStodeptid(String stodeptid) {
		this.stodeptid = stodeptid;
	}

	public String getAdvcheckman() {
		return this.advcheckman;
	}

	public void setAdvcheckman(String advcheckman) {
		this.advcheckman = advcheckman;
	}

	public String getAdvremark() {
		return this.advremark;
	}

	public void setAdvremark(String advremark) {
		this.advremark = advremark;
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