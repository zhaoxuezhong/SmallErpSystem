package com.zxz.pojo;

import java.util.Date;

/**
 * Minusandadddetail entity. @author MyEclipse Persistence Tools
 */

public class Minusandadddetail implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -7672860094971590953L;
	private Integer minusaddid;
	private Date minusdate;
	private String matypeid;
	private String matypename;
	private Integer minusadd;
	private Double unitprice;
	private Double moneys;
	private Date storagedate;
	private String stoid;
	private String stoname;
	private String origintype;
	private String originid;
	private Integer aftermath;
	private Integer enables;
	private String safetytone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Minusandadddetail() {
	}

	/** full constructor */
	public Minusandadddetail(Date minusdate, String matypeid, String matypename, Integer minusadd, Double unitprice,
			Double moneys, Date storagedate, String stoid, String stoname, String origintype, String originid,
			Integer aftermath, Integer enables, String safetytone, String safetytwo) {
		this.minusdate = minusdate;
		this.matypeid = matypeid;
		this.matypename = matypename;
		this.minusadd = minusadd;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.storagedate = storagedate;
		this.stoid = stoid;
		this.stoname = stoname;
		this.origintype = origintype;
		this.originid = originid;
		this.aftermath = aftermath;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getMinusaddid() {
		return this.minusaddid;
	}

	public void setMinusaddid(Integer minusaddid) {
		this.minusaddid = minusaddid;
	}

	public Date getMinusdate() {
		return this.minusdate;
	}

	public void setMinusdate(Date minusdate) {
		this.minusdate = minusdate;
	}

	public String getMatypeid() {
		return this.matypeid;
	}

	public void setMatypeid(String matypeid) {
		this.matypeid = matypeid;
	}

	public String getMatypename() {
		return this.matypename;
	}

	public void setMatypename(String matypename) {
		this.matypename = matypename;
	}

	public Integer getMinusadd() {
		return this.minusadd;
	}

	public void setMinusadd(Integer minusadd) {
		this.minusadd = minusadd;
	}

	public Double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}

	public Double getMoneys() {
		return this.moneys;
	}

	public void setMoneys(Double moneys) {
		this.moneys = moneys;
	}

	public Date getStoragedate() {
		return this.storagedate;
	}

	public void setStoragedate(Date storagedate) {
		this.storagedate = storagedate;
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

	public String getOrigintype() {
		return this.origintype;
	}

	public void setOrigintype(String origintype) {
		this.origintype = origintype;
	}

	public String getOriginid() {
		return this.originid;
	}

	public void setOriginid(String originid) {
		this.originid = originid;
	}

	public Integer getAftermath() {
		return this.aftermath;
	}

	public void setAftermath(Integer aftermath) {
		this.aftermath = aftermath;
	}

	public Integer getEnables() {
		return this.enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

	public String getSafetytone() {
		return this.safetytone;
	}

	public void setSafetytone(String safetytone) {
		this.safetytone = safetytone;
	}

	public String getSafetytwo() {
		return this.safetytwo;
	}

	public void setSafetytwo(String safetytwo) {
		this.safetytwo = safetytwo;
	}

}