package com.zxz.pojo;

import java.util.Date;

/**
 * Stockorderdetails entity. @author MyEclipse Persistence Tools
 */

public class Stockorderdetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -5614467693805398743L;
	private Integer sodid;
	private Integer sodlineid;
	private String sodmaterielid;
	private String sodmatid;
	private String sodspec;
	private Integer sodamount;
	private Double sodpreprice;
	private Integer sodagio;
	private Double sodprice;
	private Double sodsum;
	private Integer sodcess;
	private Double sodsumcess;
	private Double sodsumprice;
	private Date sodpreincomestorage;
	private Integer sodpresent;
	private String sodorigintype;
	private String sodorigin;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Stockorderdetails() {
	}

	/** full constructor */
	public Stockorderdetails(Integer sodlineid, String sodmaterielid, String sodmatid, String sodspec,
			Integer sodamount, Double sodpreprice, Integer sodagio, Double sodprice, Double sodsum, Integer sodcess,
			Double sodsumcess, Double sodsumprice, Date sodpreincomestorage, Integer sodpresent, String sodorigintype,
			String sodorigin, Integer enables, String safetyone, String safetytwo) {
		this.sodlineid = sodlineid;
		this.sodmaterielid = sodmaterielid;
		this.sodmatid = sodmatid;
		this.sodspec = sodspec;
		this.sodamount = sodamount;
		this.sodpreprice = sodpreprice;
		this.sodagio = sodagio;
		this.sodprice = sodprice;
		this.sodsum = sodsum;
		this.sodcess = sodcess;
		this.sodsumcess = sodsumcess;
		this.sodsumprice = sodsumprice;
		this.sodpreincomestorage = sodpreincomestorage;
		this.sodpresent = sodpresent;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getSodid() {
		return this.sodid;
	}

	public void setSodid(Integer sodid) {
		this.sodid = sodid;
	}

	public Integer getSodlineid() {
		return this.sodlineid;
	}

	public void setSodlineid(Integer sodlineid) {
		this.sodlineid = sodlineid;
	}

	public String getSodmaterielid() {
		return this.sodmaterielid;
	}

	public void setSodmaterielid(String sodmaterielid) {
		this.sodmaterielid = sodmaterielid;
	}

	public String getSodmatid() {
		return this.sodmatid;
	}

	public void setSodmatid(String sodmatid) {
		this.sodmatid = sodmatid;
	}

	public String getSodspec() {
		return this.sodspec;
	}

	public void setSodspec(String sodspec) {
		this.sodspec = sodspec;
	}

	public Integer getSodamount() {
		return this.sodamount;
	}

	public void setSodamount(Integer sodamount) {
		this.sodamount = sodamount;
	}

	public Double getSodpreprice() {
		return this.sodpreprice;
	}

	public void setSodpreprice(Double sodpreprice) {
		this.sodpreprice = sodpreprice;
	}

	public Integer getSodagio() {
		return this.sodagio;
	}

	public void setSodagio(Integer sodagio) {
		this.sodagio = sodagio;
	}

	public Double getSodprice() {
		return this.sodprice;
	}

	public void setSodprice(Double sodprice) {
		this.sodprice = sodprice;
	}

	public Double getSodsum() {
		return this.sodsum;
	}

	public void setSodsum(Double sodsum) {
		this.sodsum = sodsum;
	}

	public Integer getSodcess() {
		return this.sodcess;
	}

	public void setSodcess(Integer sodcess) {
		this.sodcess = sodcess;
	}

	public Double getSodsumcess() {
		return this.sodsumcess;
	}

	public void setSodsumcess(Double sodsumcess) {
		this.sodsumcess = sodsumcess;
	}

	public Double getSodsumprice() {
		return this.sodsumprice;
	}

	public void setSodsumprice(Double sodsumprice) {
		this.sodsumprice = sodsumprice;
	}

	public Date getSodpreincomestorage() {
		return this.sodpreincomestorage;
	}

	public void setSodpreincomestorage(Date sodpreincomestorage) {
		this.sodpreincomestorage = sodpreincomestorage;
	}

	public Integer getSodpresent() {
		return this.sodpresent;
	}

	public void setSodpresent(Integer sodpresent) {
		this.sodpresent = sodpresent;
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