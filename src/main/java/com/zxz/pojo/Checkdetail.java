package com.zxz.pojo;

/**
 * Checkdetail entity. @author MyEclipse Persistence Tools
 */

public class Checkdetail implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3542249214907324005L;
	private Integer cheid;
	private Integer chelineid;
	private String chematerielid;
	private String chematerielname;
	private String cheunitname;
	private Integer cheaccountqty;
	private Integer checheckqty;
	private Integer cheprofitandlossqty;
	private Double cheprofitandlossmoney;
	private Double cheprice;
	private String cheremark;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Checkdetail() {
	}

	/** full constructor */
	public Checkdetail(Integer chelineid, String chematerielid, String chematerielname, String cheunitname,
			Integer cheaccountqty, Integer checheckqty, Integer cheprofitandlossqty, Double cheprofitandlossmoney,
			Double cheprice, String cheremark, String safetyone, String safetytwo, Integer enables) {
		this.chelineid = chelineid;
		this.chematerielid = chematerielid;
		this.chematerielname = chematerielname;
		this.cheunitname = cheunitname;
		this.cheaccountqty = cheaccountqty;
		this.checheckqty = checheckqty;
		this.cheprofitandlossqty = cheprofitandlossqty;
		this.cheprofitandlossmoney = cheprofitandlossmoney;
		this.cheprice = cheprice;
		this.cheremark = cheremark;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getCheid() {
		return this.cheid;
	}

	public void setCheid(Integer cheid) {
		this.cheid = cheid;
	}

	public Integer getChelineid() {
		return this.chelineid;
	}

	public void setChelineid(Integer chelineid) {
		this.chelineid = chelineid;
	}

	public String getChematerielid() {
		return this.chematerielid;
	}

	public void setChematerielid(String chematerielid) {
		this.chematerielid = chematerielid;
	}

	public String getChematerielname() {
		return this.chematerielname;
	}

	public void setChematerielname(String chematerielname) {
		this.chematerielname = chematerielname;
	}

	public String getCheunitname() {
		return this.cheunitname;
	}

	public void setCheunitname(String cheunitname) {
		this.cheunitname = cheunitname;
	}

	public Integer getCheaccountqty() {
		return this.cheaccountqty;
	}

	public void setCheaccountqty(Integer cheaccountqty) {
		this.cheaccountqty = cheaccountqty;
	}

	public Integer getChecheckqty() {
		return this.checheckqty;
	}

	public void setChecheckqty(Integer checheckqty) {
		this.checheckqty = checheckqty;
	}

	public Integer getCheprofitandlossqty() {
		return this.cheprofitandlossqty;
	}

	public void setCheprofitandlossqty(Integer cheprofitandlossqty) {
		this.cheprofitandlossqty = cheprofitandlossqty;
	}

	public Double getCheprofitandlossmoney() {
		return this.cheprofitandlossmoney;
	}

	public void setCheprofitandlossmoney(Double cheprofitandlossmoney) {
		this.cheprofitandlossmoney = cheprofitandlossmoney;
	}

	public Double getCheprice() {
		return this.cheprice;
	}

	public void setCheprice(Double cheprice) {
		this.cheprice = cheprice;
	}

	public String getCheremark() {
		return this.cheremark;
	}

	public void setCheremark(String cheremark) {
		this.cheremark = cheremark;
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

	public Integer getEnables() {
		return this.enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

}