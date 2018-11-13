package com.zxz.pojo;

/**
 * Stockinquiredetails entity. @author MyEclipse Persistence Tools
 */

public class Stockinquiredetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3935839813805102374L;
	private Integer stoid;
	private Integer sdarows;
	private String sdamaterielid;
	private String sdamateridlname;
	private String sdamodel;
	private String sdaunit;
	private Integer sdanum;
	private Double sdaagioes;
	private Integer sdaagiocess;
	private Double sdaprice;
	private Double sdamoney;
	private Integer sdacess;
	private Double sdataxmoney;
	private Double sdataxmoneys;
	private Integer sdaislargess;
	private String sdaoriginid;
	private String sdaorigintype;
	private String sdaremark;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockinquiredetails() {
	}

	/** minimal constructor */
	public Stockinquiredetails(Integer stoid) {
		this.stoid = stoid;
	}

	/** full constructor */
	public Stockinquiredetails(Integer stoid, Integer sdarows, String sdamaterielid, String sdamateridlname,
			String sdamodel, String sdaunit, Integer sdanum, Double sdaagioes, Integer sdaagiocess, Double sdaprice,
			Double sdamoney, Integer sdacess, Double sdataxmoney, Double sdataxmoneys, Integer sdaislargess,
			String sdaoriginid, String sdaorigintype, String sdaremark, Integer enables, String safetyone,
			String safetytwo) {
		this.stoid = stoid;
		this.sdarows = sdarows;
		this.sdamaterielid = sdamaterielid;
		this.sdamateridlname = sdamateridlname;
		this.sdamodel = sdamodel;
		this.sdaunit = sdaunit;
		this.sdanum = sdanum;
		this.sdaagioes = sdaagioes;
		this.sdaagiocess = sdaagiocess;
		this.sdaprice = sdaprice;
		this.sdamoney = sdamoney;
		this.sdacess = sdacess;
		this.sdataxmoney = sdataxmoney;
		this.sdataxmoneys = sdataxmoneys;
		this.sdaislargess = sdaislargess;
		this.sdaoriginid = sdaoriginid;
		this.sdaorigintype = sdaorigintype;
		this.sdaremark = sdaremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getStoid() {
		return this.stoid;
	}

	public void setStoid(Integer stoid) {
		this.stoid = stoid;
	}

	public Integer getSdarows() {
		return this.sdarows;
	}

	public void setSdarows(Integer sdarows) {
		this.sdarows = sdarows;
	}

	public String getSdamaterielid() {
		return this.sdamaterielid;
	}

	public void setSdamaterielid(String sdamaterielid) {
		this.sdamaterielid = sdamaterielid;
	}

	public String getSdamateridlname() {
		return this.sdamateridlname;
	}

	public void setSdamateridlname(String sdamateridlname) {
		this.sdamateridlname = sdamateridlname;
	}

	public String getSdamodel() {
		return this.sdamodel;
	}

	public void setSdamodel(String sdamodel) {
		this.sdamodel = sdamodel;
	}

	public String getSdaunit() {
		return this.sdaunit;
	}

	public void setSdaunit(String sdaunit) {
		this.sdaunit = sdaunit;
	}

	public Integer getSdanum() {
		return this.sdanum;
	}

	public void setSdanum(Integer sdanum) {
		this.sdanum = sdanum;
	}

	public Double getSdaagioes() {
		return this.sdaagioes;
	}

	public void setSdaagioes(Double sdaagioes) {
		this.sdaagioes = sdaagioes;
	}

	public Integer getSdaagiocess() {
		return this.sdaagiocess;
	}

	public void setSdaagiocess(Integer sdaagiocess) {
		this.sdaagiocess = sdaagiocess;
	}

	public Double getSdaprice() {
		return this.sdaprice;
	}

	public void setSdaprice(Double sdaprice) {
		this.sdaprice = sdaprice;
	}

	public Double getSdamoney() {
		return this.sdamoney;
	}

	public void setSdamoney(Double sdamoney) {
		this.sdamoney = sdamoney;
	}

	public Integer getSdacess() {
		return this.sdacess;
	}

	public void setSdacess(Integer sdacess) {
		this.sdacess = sdacess;
	}

	public Double getSdataxmoney() {
		return this.sdataxmoney;
	}

	public void setSdataxmoney(Double sdataxmoney) {
		this.sdataxmoney = sdataxmoney;
	}

	public Double getSdataxmoneys() {
		return this.sdataxmoneys;
	}

	public void setSdataxmoneys(Double sdataxmoneys) {
		this.sdataxmoneys = sdataxmoneys;
	}

	public Integer getSdaislargess() {
		return this.sdaislargess;
	}

	public void setSdaislargess(Integer sdaislargess) {
		this.sdaislargess = sdaislargess;
	}

	public String getSdaoriginid() {
		return this.sdaoriginid;
	}

	public void setSdaoriginid(String sdaoriginid) {
		this.sdaoriginid = sdaoriginid;
	}

	public String getSdaorigintype() {
		return this.sdaorigintype;
	}

	public void setSdaorigintype(String sdaorigintype) {
		this.sdaorigintype = sdaorigintype;
	}

	public String getSdaremark() {
		return this.sdaremark;
	}

	public void setSdaremark(String sdaremark) {
		this.sdaremark = sdaremark;
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