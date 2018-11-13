package com.zxz.pojo;

import java.util.Date;

/**
 * Moveprice entity. @author MyEclipse Persistence Tools
 */

public class Moveprice implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 3666368582556261526L;
	private String moveorderno;
	private Date movedate;
	private String moveadjust;
	private String movestorage;
	private String movemake;
	private String movecheck;
	private String moveremark;
	private Integer moveAuditingState;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Moveprice() {
	}

	/** minimal constructor */
	public Moveprice(String moveorderno) {
		this.moveorderno = moveorderno;
	}

	/** full constructor */
	public Moveprice(String moveorderno, Date movedate, String moveadjust, String movestorage, String movemake,
			String movecheck, String moveremark, Integer moveAuditingState, String safetyone, String safetytwo,
			Integer enables) {
		this.moveorderno = moveorderno;
		this.movedate = movedate;
		this.moveadjust = moveadjust;
		this.movestorage = movestorage;
		this.movemake = movemake;
		this.movecheck = movecheck;
		this.moveremark = moveremark;
		this.moveAuditingState = moveAuditingState;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public String getMoveorderno() {
		return this.moveorderno;
	}

	public void setMoveorderno(String moveorderno) {
		this.moveorderno = moveorderno;
	}

	public Date getMovedate() {
		return this.movedate;
	}

	public void setMovedate(Date movedate) {
		this.movedate = movedate;
	}

	public String getMoveadjust() {
		return this.moveadjust;
	}

	public void setMoveadjust(String moveadjust) {
		this.moveadjust = moveadjust;
	}

	public String getMovestorage() {
		return this.movestorage;
	}

	public void setMovestorage(String movestorage) {
		this.movestorage = movestorage;
	}

	public String getMovemake() {
		return this.movemake;
	}

	public void setMovemake(String movemake) {
		this.movemake = movemake;
	}

	public String getMovecheck() {
		return this.movecheck;
	}

	public void setMovecheck(String movecheck) {
		this.movecheck = movecheck;
	}

	public String getMoveremark() {
		return this.moveremark;
	}

	public void setMoveremark(String moveremark) {
		this.moveremark = moveremark;
	}

	public Integer getMoveAuditingState() {
		return this.moveAuditingState;
	}

	public void setMoveAuditingState(Integer moveAuditingState) {
		this.moveAuditingState = moveAuditingState;
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