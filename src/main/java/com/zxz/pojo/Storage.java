package com.zxz.pojo;

/**
 * Storage entity. @author MyEclipse Persistence Tools
 */

public class Storage implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -4815100262278105028L;
	private Integer stoid;
	private String stoname;
	private String stosimplename;
	private String stoconnectper;
	private Integer stoempid;
	private String stophone;
	private String stoaddress;
	private String storemark;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Storage() {
	}

	/** full constructor */
	public Storage(String stoname, String stosimplename, String stoconnectper, Integer stoempid, String stophone,
			String stoaddress, String storemark, String safetyone, String safetytwo, Integer enables) {
		this.stoname = stoname;
		this.stosimplename = stosimplename;
		this.stoconnectper = stoconnectper;
		this.stoempid = stoempid;
		this.stophone = stophone;
		this.stoaddress = stoaddress;
		this.storemark = storemark;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getStoid() {
		return this.stoid;
	}

	public void setStoid(Integer stoid) {
		this.stoid = stoid;
	}

	public String getStoname() {
		return this.stoname;
	}

	public void setStoname(String stoname) {
		this.stoname = stoname;
	}

	public String getStosimplename() {
		return this.stosimplename;
	}

	public void setStosimplename(String stosimplename) {
		this.stosimplename = stosimplename;
	}

	public String getStoconnectper() {
		return this.stoconnectper;
	}

	public void setStoconnectper(String stoconnectper) {
		this.stoconnectper = stoconnectper;
	}

	public Integer getStoempid() {
		return this.stoempid;
	}

	public void setStoempid(Integer stoempid) {
		this.stoempid = stoempid;
	}

	public String getStophone() {
		return this.stophone;
	}

	public void setStophone(String stophone) {
		this.stophone = stophone;
	}

	public String getStoaddress() {
		return this.stoaddress;
	}

	public void setStoaddress(String stoaddress) {
		this.stoaddress = stoaddress;
	}

	public String getStoremark() {
		return this.storemark;
	}

	public void setStoremark(String storemark) {
		this.storemark = storemark;
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