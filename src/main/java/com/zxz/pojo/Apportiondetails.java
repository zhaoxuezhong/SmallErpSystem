package com.zxz.pojo;

/**
 * Apportiondetails entity. @author MyEclipse Persistence Tools
 */

public class Apportiondetails implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -1809923598871312284L;
	private ApportiondetailsId id;

	// Constructors

	/** default constructor */
	public Apportiondetails() {
	}

	/** full constructor */
	public Apportiondetails(ApportiondetailsId id) {
		this.id = id;
	}

	// Property accessors

	public ApportiondetailsId getId() {
		return this.id;
	}

	public void setId(ApportiondetailsId id) {
		this.id = id;
	}

}