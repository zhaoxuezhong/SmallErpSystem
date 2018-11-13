package com.zxz.pojo;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Accountmoneydetail entity. @author MyEclipse Persistence Tools
 */

public class Accountmoneydetail implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 2693279497837386707L;
	private Integer storageid;
	private Date storagedate;
	private String origintypes;
	private String originid;
	private Timestamp wdate;
	private String clientsupply;
	private String citationid;
	private Double formerlymoneys;
	private Double wadaysmoneys;
	private Integer enables;
	private String safetytone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public Accountmoneydetail() {
	}

	/** full constructor */
	public Accountmoneydetail(Date storagedate, String origintypes, String originid, Timestamp wdate,
			String clientsupply, String citationid, Double formerlymoneys, Double wadaysmoneys, Integer enables,
			String safetytone, String safetytwo) {
		this.storagedate = storagedate;
		this.origintypes = origintypes;
		this.originid = originid;
		this.wdate = wdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.formerlymoneys = formerlymoneys;
		this.wadaysmoneys = wadaysmoneys;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getStorageid() {
		return this.storageid;
	}

	public void setStorageid(Integer storageid) {
		this.storageid = storageid;
	}

	public Date getStoragedate() {
		return this.storagedate;
	}

	public void setStoragedate(Date storagedate) {
		this.storagedate = storagedate;
	}

	public String getOrigintypes() {
		return this.origintypes;
	}

	public void setOrigintypes(String origintypes) {
		this.origintypes = origintypes;
	}

	public String getOriginid() {
		return this.originid;
	}

	public void setOriginid(String originid) {
		this.originid = originid;
	}

	public Timestamp getWdate() {
		return this.wdate;
	}

	public void setWdate(Timestamp wdate) {
		this.wdate = wdate;
	}

	public String getClientsupply() {
		return this.clientsupply;
	}

	public void setClientsupply(String clientsupply) {
		this.clientsupply = clientsupply;
	}

	public String getCitationid() {
		return this.citationid;
	}

	public void setCitationid(String citationid) {
		this.citationid = citationid;
	}

	public Double getFormerlymoneys() {
		return this.formerlymoneys;
	}

	public void setFormerlymoneys(Double formerlymoneys) {
		this.formerlymoneys = formerlymoneys;
	}

	public Double getWadaysmoneys() {
		return this.wadaysmoneys;
	}

	public void setWadaysmoneys(Double wadaysmoneys) {
		this.wadaysmoneys = wadaysmoneys;
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