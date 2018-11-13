package com.zxz.pojo;

/**
 * Apportionresult entity. @author MyEclipse Persistence Tools
 */

public class Apportionresult implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -960148825622133408L;
	private Integer atisequ;
	private Integer atiid;
	private String storageid;
	private String matid;
	private String matname;
	private String matspec;
	private Double stockprice;
	private Integer atinum;
	private Double ademoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Apportionresult() {
	}

	/** full constructor */
	public Apportionresult(Integer atiid, String storageid, String matid, String matname, String matspec,
			Double stockprice, Integer atinum, Double ademoney, Integer enables, String safetyone, String safetytwo) {
		this.atiid = atiid;
		this.storageid = storageid;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.stockprice = stockprice;
		this.atinum = atinum;
		this.ademoney = ademoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getAtisequ() {
		return this.atisequ;
	}

	public void setAtisequ(Integer atisequ) {
		this.atisequ = atisequ;
	}

	public Integer getAtiid() {
		return this.atiid;
	}

	public void setAtiid(Integer atiid) {
		this.atiid = atiid;
	}

	public String getStorageid() {
		return this.storageid;
	}

	public void setStorageid(String storageid) {
		this.storageid = storageid;
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

	public Double getStockprice() {
		return this.stockprice;
	}

	public void setStockprice(Double stockprice) {
		this.stockprice = stockprice;
	}

	public Integer getAtinum() {
		return this.atinum;
	}

	public void setAtinum(Integer atinum) {
		this.atinum = atinum;
	}

	public Double getAdemoney() {
		return this.ademoney;
	}

	public void setAdemoney(Double ademoney) {
		this.ademoney = ademoney;
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