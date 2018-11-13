package com.zxz.pojo;

/**
 * Stockstoragedetails entity. @author MyEclipse Persistence Tools
 */

public class Stockstoragedetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1678251046157592645L;
	private Integer storagedetailno;
	private Integer rowno;
	private String materielid;
	private String materielname;
	private String types;
	private String units;
	private Integer amount;
	private Double rebateprice;
	private Double rebate;
	private Double unitprice;
	private Double moneys;
	private Double cess;
	private Double tax;
	private Double taxmoneys;
	private String origintype;
	private String originno;
	private String present;
	private Double apportionmoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockstoragedetails() {
	}

	/** minimal constructor */
	public Stockstoragedetails(Integer storagedetailno) {
		this.storagedetailno = storagedetailno;
	}

	/** full constructor */
	public Stockstoragedetails(Integer storagedetailno, Integer rowno, String materielid, String materielname,
			String types, String units, Integer amount, Double rebateprice, Double rebate, Double unitprice,
			Double moneys, Double cess, Double tax, Double taxmoneys, String origintype, String originno,
			String present, Double apportionmoney, Integer enables, String safetyone, String safetytwo) {
		this.storagedetailno = storagedetailno;
		this.rowno = rowno;
		this.materielid = materielid;
		this.materielname = materielname;
		this.types = types;
		this.units = units;
		this.amount = amount;
		this.rebateprice = rebateprice;
		this.rebate = rebate;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.cess = cess;
		this.tax = tax;
		this.taxmoneys = taxmoneys;
		this.origintype = origintype;
		this.originno = originno;
		this.present = present;
		this.apportionmoney = apportionmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getStoragedetailno() {
		return this.storagedetailno;
	}

	public void setStoragedetailno(Integer storagedetailno) {
		this.storagedetailno = storagedetailno;
	}

	public Integer getRowno() {
		return this.rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getMaterielid() {
		return this.materielid;
	}

	public void setMaterielid(String materielid) {
		this.materielid = materielid;
	}

	public String getMaterielname() {
		return this.materielname;
	}

	public void setMaterielname(String materielname) {
		this.materielname = materielname;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getRebateprice() {
		return this.rebateprice;
	}

	public void setRebateprice(Double rebateprice) {
		this.rebateprice = rebateprice;
	}

	public Double getRebate() {
		return this.rebate;
	}

	public void setRebate(Double rebate) {
		this.rebate = rebate;
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

	public Double getCess() {
		return this.cess;
	}

	public void setCess(Double cess) {
		this.cess = cess;
	}

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTaxmoneys() {
		return this.taxmoneys;
	}

	public void setTaxmoneys(Double taxmoneys) {
		this.taxmoneys = taxmoneys;
	}

	public String getOrigintype() {
		return this.origintype;
	}

	public void setOrigintype(String origintype) {
		this.origintype = origintype;
	}

	public String getOriginno() {
		return this.originno;
	}

	public void setOriginno(String originno) {
		this.originno = originno;
	}

	public String getPresent() {
		return this.present;
	}

	public void setPresent(String present) {
		this.present = present;
	}

	public Double getApportionmoney() {
		return this.apportionmoney;
	}

	public void setApportionmoney(Double apportionmoney) {
		this.apportionmoney = apportionmoney;
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