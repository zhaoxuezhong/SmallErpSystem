package com.zxz.pojo;

import java.util.Date;

/**
 * Checked entity. @author MyEclipse Persistence Tools
 */

public class Checked implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -2646326063916602890L;
	private Integer cheid;
	private String chestorage;
	private String chestoragename;
	private Date chedate;
	private String cheman;
	private String chedeptname;
	private String cherestrictman;
	private String cheauditingman;
	private Integer chestatu;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Checked() {
	}

	/** full constructor */
	public Checked(String chestorage, String chestoragename, Date chedate, String cheman, String chedeptname,
			String cherestrictman, String cheauditingman, Integer chestatu, String safetyone, String safetytwo,
			Integer enables) {
		this.chestorage = chestorage;
		this.chestoragename = chestoragename;
		this.chedate = chedate;
		this.cheman = cheman;
		this.chedeptname = chedeptname;
		this.cherestrictman = cherestrictman;
		this.cheauditingman = cheauditingman;
		this.chestatu = chestatu;
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

	public String getChestorage() {
		return this.chestorage;
	}

	public void setChestorage(String chestorage) {
		this.chestorage = chestorage;
	}

	public String getChestoragename() {
		return this.chestoragename;
	}

	public void setChestoragename(String chestoragename) {
		this.chestoragename = chestoragename;
	}

	public Date getChedate() {
		return this.chedate;
	}

	public void setChedate(Date chedate) {
		this.chedate = chedate;
	}

	public String getCheman() {
		return this.cheman;
	}

	public void setCheman(String cheman) {
		this.cheman = cheman;
	}

	public String getChedeptname() {
		return this.chedeptname;
	}

	public void setChedeptname(String chedeptname) {
		this.chedeptname = chedeptname;
	}

	public String getCherestrictman() {
		return this.cherestrictman;
	}

	public void setCherestrictman(String cherestrictman) {
		this.cherestrictman = cherestrictman;
	}

	public String getCheauditingman() {
		return this.cheauditingman;
	}

	public void setCheauditingman(String cheauditingman) {
		this.cheauditingman = cheauditingman;
	}

	public Integer getChestatu() {
		return this.chestatu;
	}

	public void setChestatu(Integer chestatu) {
		this.chestatu = chestatu;
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