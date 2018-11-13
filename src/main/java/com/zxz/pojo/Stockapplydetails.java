package com.zxz.pojo;

import java.util.Date;

/**
 * Stockapplydetails entity. @author MyEclipse Persistence Tools
 */

public class Stockapplydetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 8150863497838571077L;
	private Integer appid;
	private Integer apdrows;
	private String apdmateridlid;
	private String apdmateridlname;
	private String apdmodel;
	private String apdunit;
	private Integer apdnum;
	private Double apdstandardprice;
	private Double apdstandardmoney;
	private Double apdprice;
	private Double apdintomoney;
	private Date apddemanddate;
	private Date apdstockdate;
	private Integer apdnotnum;
	private String apdoriginid;
	private String apdorigintype;
	private String apdremark;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockapplydetails() {
	}

	/** minimal constructor */
	public Stockapplydetails(Integer appid) {
		this.appid = appid;
	}

	/** full constructor */
	public Stockapplydetails(Integer appid, Integer apdrows, String apdmateridlid, String apdmateridlname,
			String apdmodel, String apdunit, Integer apdnum, Double apdstandardprice, Double apdstandardmoney,
			Double apdprice, Double apdintomoney, Date apddemanddate, Date apdstockdate, Integer apdnotnum,
			String apdoriginid, String apdorigintype, String apdremark, Integer enables, String safetyone,
			String safetytwo) {
		this.appid = appid;
		this.apdrows = apdrows;
		this.apdmateridlid = apdmateridlid;
		this.apdmateridlname = apdmateridlname;
		this.apdmodel = apdmodel;
		this.apdunit = apdunit;
		this.apdnum = apdnum;
		this.apdstandardprice = apdstandardprice;
		this.apdstandardmoney = apdstandardmoney;
		this.apdprice = apdprice;
		this.apdintomoney = apdintomoney;
		this.apddemanddate = apddemanddate;
		this.apdstockdate = apdstockdate;
		this.apdnotnum = apdnotnum;
		this.apdoriginid = apdoriginid;
		this.apdorigintype = apdorigintype;
		this.apdremark = apdremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getAppid() {
		return this.appid;
	}

	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	public Integer getApdrows() {
		return this.apdrows;
	}

	public void setApdrows(Integer apdrows) {
		this.apdrows = apdrows;
	}

	public String getApdmateridlid() {
		return this.apdmateridlid;
	}

	public void setApdmateridlid(String apdmateridlid) {
		this.apdmateridlid = apdmateridlid;
	}

	public String getApdmateridlname() {
		return this.apdmateridlname;
	}

	public void setApdmateridlname(String apdmateridlname) {
		this.apdmateridlname = apdmateridlname;
	}

	public String getApdmodel() {
		return this.apdmodel;
	}

	public void setApdmodel(String apdmodel) {
		this.apdmodel = apdmodel;
	}

	public String getApdunit() {
		return this.apdunit;
	}

	public void setApdunit(String apdunit) {
		this.apdunit = apdunit;
	}

	public Integer getApdnum() {
		return this.apdnum;
	}

	public void setApdnum(Integer apdnum) {
		this.apdnum = apdnum;
	}

	public Double getApdstandardprice() {
		return this.apdstandardprice;
	}

	public void setApdstandardprice(Double apdstandardprice) {
		this.apdstandardprice = apdstandardprice;
	}

	public Double getApdstandardmoney() {
		return this.apdstandardmoney;
	}

	public void setApdstandardmoney(Double apdstandardmoney) {
		this.apdstandardmoney = apdstandardmoney;
	}

	public Double getApdprice() {
		return this.apdprice;
	}

	public void setApdprice(Double apdprice) {
		this.apdprice = apdprice;
	}

	public Double getApdintomoney() {
		return this.apdintomoney;
	}

	public void setApdintomoney(Double apdintomoney) {
		this.apdintomoney = apdintomoney;
	}

	public Date getApddemanddate() {
		return this.apddemanddate;
	}

	public void setApddemanddate(Date apddemanddate) {
		this.apddemanddate = apddemanddate;
	}

	public Date getApdstockdate() {
		return this.apdstockdate;
	}

	public void setApdstockdate(Date apdstockdate) {
		this.apdstockdate = apdstockdate;
	}

	public Integer getApdnotnum() {
		return this.apdnotnum;
	}

	public void setApdnotnum(Integer apdnotnum) {
		this.apdnotnum = apdnotnum;
	}

	public String getApdoriginid() {
		return this.apdoriginid;
	}

	public void setApdoriginid(String apdoriginid) {
		this.apdoriginid = apdoriginid;
	}

	public String getApdorigintype() {
		return this.apdorigintype;
	}

	public void setApdorigintype(String apdorigintype) {
		this.apdorigintype = apdorigintype;
	}

	public String getApdremark() {
		return this.apdremark;
	}

	public void setApdremark(String apdremark) {
		this.apdremark = apdremark;
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