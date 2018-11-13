package com.zxz.pojo;

import java.util.Date;

/**
 * Materiel entity. @author MyEclipse Persistence Tools
 */

public class Materiel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6848946420229060575L;
	private Integer matid;
	private String matname;
	private String matspec;
	private Integer mattypeid;
	private String mattypename;
	private Double matadviceprice;
	private Double matadvicepriceA;
	private Double matadvicepriceB;
	private Double matadvicepriceC;
	private Double matadvicepriceD;
	private Double matadvicepriceE;
	private Double matstandardprice;
	private String matshape;
	private Integer matifduty;
	private Double matdutyrate;
	private Integer matstockaheaddate;
	private String matmainafford;
	private Integer matmainaffordid;
	private Integer matgawpdate;
	private Date matstopdate;
	private String matremark;
	private String matunit;
	private String safetyone;
	private String safetytwo;
	private Integer enable;

	// Constructors

	/** default constructor */
	public Materiel() {
	}

	/** minimal constructor */
	public Materiel(String matname, Integer mattypeid, String mattypename, Double matadviceprice, String matshape) {
		this.matname = matname;
		this.mattypeid = mattypeid;
		this.mattypename = mattypename;
		this.matadviceprice = matadviceprice;
		this.matshape = matshape;
	}

	/** full constructor */
	public Materiel(String matname, String matspec, Integer mattypeid, String mattypename, Double matadviceprice,
			Double matadvicepriceA, Double matadvicepriceB, Double matadvicepriceC, Double matadvicepriceD,
			Double matadvicepriceE, Double matstandardprice, String matshape, Integer matifduty, Double matdutyrate,
			Integer matstockaheaddate, String matmainafford, Integer matmainaffordid, Integer matgawpdate,
			Date matstopdate, String matremark, String matunit, String safetyone, String safetytwo, Integer enable) {
		this.matname = matname;
		this.matspec = matspec;
		this.mattypeid = mattypeid;
		this.mattypename = mattypename;
		this.matadviceprice = matadviceprice;
		this.matadvicepriceA = matadvicepriceA;
		this.matadvicepriceB = matadvicepriceB;
		this.matadvicepriceC = matadvicepriceC;
		this.matadvicepriceD = matadvicepriceD;
		this.matadvicepriceE = matadvicepriceE;
		this.matstandardprice = matstandardprice;
		this.matshape = matshape;
		this.matifduty = matifduty;
		this.matdutyrate = matdutyrate;
		this.matstockaheaddate = matstockaheaddate;
		this.matmainafford = matmainafford;
		this.matmainaffordid = matmainaffordid;
		this.matgawpdate = matgawpdate;
		this.matstopdate = matstopdate;
		this.matremark = matremark;
		this.matunit = matunit;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enable = enable;
	}

	// Property accessors

	public Integer getMatid() {
		return this.matid;
	}

	public void setMatid(Integer matid) {
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

	public Integer getMattypeid() {
		return this.mattypeid;
	}

	public void setMattypeid(Integer mattypeid) {
		this.mattypeid = mattypeid;
	}

	public String getMattypename() {
		return this.mattypename;
	}

	public void setMattypename(String mattypename) {
		this.mattypename = mattypename;
	}

	public Double getMatadviceprice() {
		return this.matadviceprice;
	}

	public void setMatadviceprice(Double matadviceprice) {
		this.matadviceprice = matadviceprice;
	}

	public Double getMatadvicepriceA() {
		return this.matadvicepriceA;
	}

	public void setMatadvicepriceA(Double matadvicepriceA) {
		this.matadvicepriceA = matadvicepriceA;
	}

	public Double getMatadvicepriceB() {
		return this.matadvicepriceB;
	}

	public void setMatadvicepriceB(Double matadvicepriceB) {
		this.matadvicepriceB = matadvicepriceB;
	}

	public Double getMatadvicepriceC() {
		return this.matadvicepriceC;
	}

	public void setMatadvicepriceC(Double matadvicepriceC) {
		this.matadvicepriceC = matadvicepriceC;
	}

	public Double getMatadvicepriceD() {
		return this.matadvicepriceD;
	}

	public void setMatadvicepriceD(Double matadvicepriceD) {
		this.matadvicepriceD = matadvicepriceD;
	}

	public Double getMatadvicepriceE() {
		return this.matadvicepriceE;
	}

	public void setMatadvicepriceE(Double matadvicepriceE) {
		this.matadvicepriceE = matadvicepriceE;
	}

	public Double getMatstandardprice() {
		return this.matstandardprice;
	}

	public void setMatstandardprice(Double matstandardprice) {
		this.matstandardprice = matstandardprice;
	}

	public String getMatshape() {
		return this.matshape;
	}

	public void setMatshape(String matshape) {
		this.matshape = matshape;
	}

	public Integer getMatifduty() {
		return this.matifduty;
	}

	public void setMatifduty(Integer matifduty) {
		this.matifduty = matifduty;
	}

	public Double getMatdutyrate() {
		return this.matdutyrate;
	}

	public void setMatdutyrate(Double matdutyrate) {
		this.matdutyrate = matdutyrate;
	}

	public Integer getMatstockaheaddate() {
		return this.matstockaheaddate;
	}

	public void setMatstockaheaddate(Integer matstockaheaddate) {
		this.matstockaheaddate = matstockaheaddate;
	}

	public String getMatmainafford() {
		return this.matmainafford;
	}

	public void setMatmainafford(String matmainafford) {
		this.matmainafford = matmainafford;
	}

	public Integer getMatmainaffordid() {
		return this.matmainaffordid;
	}

	public void setMatmainaffordid(Integer matmainaffordid) {
		this.matmainaffordid = matmainaffordid;
	}

	public Integer getMatgawpdate() {
		return this.matgawpdate;
	}

	public void setMatgawpdate(Integer matgawpdate) {
		this.matgawpdate = matgawpdate;
	}

	public Date getMatstopdate() {
		return this.matstopdate;
	}

	public void setMatstopdate(Date matstopdate) {
		this.matstopdate = matstopdate;
	}

	public String getMatremark() {
		return this.matremark;
	}

	public void setMatremark(String matremark) {
		this.matremark = matremark;
	}

	public String getMatunit() {
		return this.matunit;
	}

	public void setMatunit(String matunit) {
		this.matunit = matunit;
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

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

}