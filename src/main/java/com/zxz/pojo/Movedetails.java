package com.zxz.pojo;

/**
 * Movedetails entity. @author MyEclipse Persistence Tools
 */

public class Movedetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -2011014060297283182L;
	private Integer mdsno;
	private String mdsmseno;
	private String mdsmaterieltype;
	private String mdsmaterielname;
	private String mdsmaterielspecs;
	private String mdsmaterielunit;
	private String mdsmaterielnum;
	private String mdsavgcost;
	private String mdscost;
	private String mdsremark;
	private String mespreservingone;
	private String mespreservingtwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Movedetails() {
	}

	/** full constructor */
	public Movedetails(String mdsmseno, String mdsmaterieltype, String mdsmaterielname, String mdsmaterielspecs,
			String mdsmaterielunit, String mdsmaterielnum, String mdsavgcost, String mdscost, String mdsremark,
			String mespreservingone, String mespreservingtwo, Integer enables) {
		this.mdsmseno = mdsmseno;
		this.mdsmaterieltype = mdsmaterieltype;
		this.mdsmaterielname = mdsmaterielname;
		this.mdsmaterielspecs = mdsmaterielspecs;
		this.mdsmaterielunit = mdsmaterielunit;
		this.mdsmaterielnum = mdsmaterielnum;
		this.mdsavgcost = mdsavgcost;
		this.mdscost = mdscost;
		this.mdsremark = mdsremark;
		this.mespreservingone = mespreservingone;
		this.mespreservingtwo = mespreservingtwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getMdsno() {
		return this.mdsno;
	}

	public void setMdsno(Integer mdsno) {
		this.mdsno = mdsno;
	}

	public String getMdsmseno() {
		return this.mdsmseno;
	}

	public void setMdsmseno(String mdsmseno) {
		this.mdsmseno = mdsmseno;
	}

	public String getMdsmaterieltype() {
		return this.mdsmaterieltype;
	}

	public void setMdsmaterieltype(String mdsmaterieltype) {
		this.mdsmaterieltype = mdsmaterieltype;
	}

	public String getMdsmaterielname() {
		return this.mdsmaterielname;
	}

	public void setMdsmaterielname(String mdsmaterielname) {
		this.mdsmaterielname = mdsmaterielname;
	}

	public String getMdsmaterielspecs() {
		return this.mdsmaterielspecs;
	}

	public void setMdsmaterielspecs(String mdsmaterielspecs) {
		this.mdsmaterielspecs = mdsmaterielspecs;
	}

	public String getMdsmaterielunit() {
		return this.mdsmaterielunit;
	}

	public void setMdsmaterielunit(String mdsmaterielunit) {
		this.mdsmaterielunit = mdsmaterielunit;
	}

	public String getMdsmaterielnum() {
		return this.mdsmaterielnum;
	}

	public void setMdsmaterielnum(String mdsmaterielnum) {
		this.mdsmaterielnum = mdsmaterielnum;
	}

	public String getMdsavgcost() {
		return this.mdsavgcost;
	}

	public void setMdsavgcost(String mdsavgcost) {
		this.mdsavgcost = mdsavgcost;
	}

	public String getMdscost() {
		return this.mdscost;
	}

	public void setMdscost(String mdscost) {
		this.mdscost = mdscost;
	}

	public String getMdsremark() {
		return this.mdsremark;
	}

	public void setMdsremark(String mdsremark) {
		this.mdsremark = mdsremark;
	}

	public String getMespreservingone() {
		return this.mespreservingone;
	}

	public void setMespreservingone(String mespreservingone) {
		this.mespreservingone = mespreservingone;
	}

	public String getMespreservingtwo() {
		return this.mespreservingtwo;
	}

	public void setMespreservingtwo(String mespreservingtwo) {
		this.mespreservingtwo = mespreservingtwo;
	}

	public Integer getEnables() {
		return this.enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

}