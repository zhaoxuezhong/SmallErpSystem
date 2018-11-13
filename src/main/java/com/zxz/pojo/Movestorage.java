package com.zxz.pojo;

import java.util.Date;

/**
 * Movestorage entity. @author MyEclipse Persistence Tools
 */

public class Movestorage implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -4334521567772734784L;
	private Integer mseno;
	private Date msedate;
	private String mseoutstorage;
	private String mseinsertstor;
	private String mseemployee;
	private String mesAuditingemp;
	private String mesremark;
	private String messtate;
	private String mestrash;
	private String mespreservingone;
	private String mespreservingtwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Movestorage() {
	}

	/** full constructor */
	public Movestorage(Date msedate, String mseoutstorage, String mseinsertstor, String mseemployee,
			String mesAuditingemp, String mesremark, String messtate, String mestrash, String mespreservingone,
			String mespreservingtwo, Integer enables) {
		this.msedate = msedate;
		this.mseoutstorage = mseoutstorage;
		this.mseinsertstor = mseinsertstor;
		this.mseemployee = mseemployee;
		this.mesAuditingemp = mesAuditingemp;
		this.mesremark = mesremark;
		this.messtate = messtate;
		this.mestrash = mestrash;
		this.mespreservingone = mespreservingone;
		this.mespreservingtwo = mespreservingtwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getMseno() {
		return this.mseno;
	}

	public void setMseno(Integer mseno) {
		this.mseno = mseno;
	}

	public Date getMsedate() {
		return this.msedate;
	}

	public void setMsedate(Date msedate) {
		this.msedate = msedate;
	}

	public String getMseoutstorage() {
		return this.mseoutstorage;
	}

	public void setMseoutstorage(String mseoutstorage) {
		this.mseoutstorage = mseoutstorage;
	}

	public String getMseinsertstor() {
		return this.mseinsertstor;
	}

	public void setMseinsertstor(String mseinsertstor) {
		this.mseinsertstor = mseinsertstor;
	}

	public String getMseemployee() {
		return this.mseemployee;
	}

	public void setMseemployee(String mseemployee) {
		this.mseemployee = mseemployee;
	}

	public String getMesAuditingemp() {
		return this.mesAuditingemp;
	}

	public void setMesAuditingemp(String mesAuditingemp) {
		this.mesAuditingemp = mesAuditingemp;
	}

	public String getMesremark() {
		return this.mesremark;
	}

	public void setMesremark(String mesremark) {
		this.mesremark = mesremark;
	}

	public String getMesstate() {
		return this.messtate;
	}

	public void setMesstate(String messtate) {
		this.messtate = messtate;
	}

	public String getMestrash() {
		return this.mestrash;
	}

	public void setMestrash(String mestrash) {
		this.mestrash = mestrash;
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