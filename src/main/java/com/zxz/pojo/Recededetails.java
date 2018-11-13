package com.zxz.pojo;

/**
 * Recededetails entity. @author MyEclipse Persistence Tools
 */

public class Recededetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 6678973327451637254L;
	private Integer detsequ;
	private Integer recid;
	private String matid;
	private String matname;
	private String matspec;
	private Integer detnum;
	private Double detagioprice;
	private Integer detdiscount;
	private Double detprice;
	private Double detamtmoney;
	private Integer depcess;
	private Double depcessmoney;
	private Integer deplargess;
	private String sodorigintype;
	private String sodorigin;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Recededetails() {
	}

	/** minimal constructor */
	public Recededetails(Integer detsequ) {
		this.detsequ = detsequ;
	}

	/** full constructor */
	public Recededetails(Integer detsequ, Integer recid, String matid, String matname, String matspec, Integer detnum,
			Double detagioprice, Integer detdiscount, Double detprice, Double detamtmoney, Integer depcess,
			Double depcessmoney, Integer deplargess, String sodorigintype, String sodorigin, Integer enables,
			String safetyone, String safetytwo) {
		this.detsequ = detsequ;
		this.recid = recid;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.detnum = detnum;
		this.detagioprice = detagioprice;
		this.detdiscount = detdiscount;
		this.detprice = detprice;
		this.detamtmoney = detamtmoney;
		this.depcess = depcess;
		this.depcessmoney = depcessmoney;
		this.deplargess = deplargess;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getDetsequ() {
		return this.detsequ;
	}

	public void setDetsequ(Integer detsequ) {
		this.detsequ = detsequ;
	}

	public Integer getRecid() {
		return this.recid;
	}

	public void setRecid(Integer recid) {
		this.recid = recid;
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

	public Integer getDetnum() {
		return this.detnum;
	}

	public void setDetnum(Integer detnum) {
		this.detnum = detnum;
	}

	public Double getDetagioprice() {
		return this.detagioprice;
	}

	public void setDetagioprice(Double detagioprice) {
		this.detagioprice = detagioprice;
	}

	public Integer getDetdiscount() {
		return this.detdiscount;
	}

	public void setDetdiscount(Integer detdiscount) {
		this.detdiscount = detdiscount;
	}

	public Double getDetprice() {
		return this.detprice;
	}

	public void setDetprice(Double detprice) {
		this.detprice = detprice;
	}

	public Double getDetamtmoney() {
		return this.detamtmoney;
	}

	public void setDetamtmoney(Double detamtmoney) {
		this.detamtmoney = detamtmoney;
	}

	public Integer getDepcess() {
		return this.depcess;
	}

	public void setDepcess(Integer depcess) {
		this.depcess = depcess;
	}

	public Double getDepcessmoney() {
		return this.depcessmoney;
	}

	public void setDepcessmoney(Double depcessmoney) {
		this.depcessmoney = depcessmoney;
	}

	public Integer getDeplargess() {
		return this.deplargess;
	}

	public void setDeplargess(Integer deplargess) {
		this.deplargess = deplargess;
	}

	public String getSodorigintype() {
		return this.sodorigintype;
	}

	public void setSodorigintype(String sodorigintype) {
		this.sodorigintype = sodorigintype;
	}

	public String getSodorigin() {
		return this.sodorigin;
	}

	public void setSodorigin(String sodorigin) {
		this.sodorigin = sodorigin;
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