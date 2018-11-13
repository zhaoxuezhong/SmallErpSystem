package com.zxz.pojo;

/**
 * Providetype entity. @author MyEclipse Persistence Tools
 */

public class Providetype implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3615963436458073466L;
	private Integer peeid;
	private String peename;
	private String peeename;
	private String peeremark;
	private Integer peetrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Providetype() {
	}

	/** full constructor */
	public Providetype(String peename, String peeename, String peeremark, Integer peetrash, String safetyone,
			String safetytwo, Integer enables) {
		this.peename = peename;
		this.peeename = peeename;
		this.peeremark = peeremark;
		this.peetrash = peetrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getPeeid() {
		return this.peeid;
	}

	public void setPeeid(Integer peeid) {
		this.peeid = peeid;
	}

	public String getPeename() {
		return this.peename;
	}

	public void setPeename(String peename) {
		this.peename = peename;
	}

	public String getPeeename() {
		return this.peeename;
	}

	public void setPeeename(String peeename) {
		this.peeename = peeename;
	}

	public String getPeeremark() {
		return this.peeremark;
	}

	public void setPeeremark(String peeremark) {
		this.peeremark = peeremark;
	}

	public Integer getPeetrash() {
		return this.peetrash;
	}

	public void setPeetrash(Integer peetrash) {
		this.peetrash = peetrash;
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