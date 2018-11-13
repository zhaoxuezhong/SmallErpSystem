package com.zxz.pojo;

/**
 * ApportiondetailsId entity. @author MyEclipse Persistence Tools
 */

public class ApportiondetailsId implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1776208600484468668L;
	private Integer adeid;
	private Integer adesequ;
	private String adeexesid;
	private String adeexesname;
	private Double adeamtmoney;
	private Integer enables;
	private String safetyone;
	private String safetytwo;

	// Constructors

	/** default constructor */
	public ApportiondetailsId() {
	}

	/** minimal constructor */
	public ApportiondetailsId(Integer adeid) {
		this.adeid = adeid;
	}

	/** full constructor */
	public ApportiondetailsId(Integer adeid, Integer adesequ, String adeexesid, String adeexesname, Double adeamtmoney,
			Integer enables, String safetyone, String safetytwo) {
		this.adeid = adeid;
		this.adesequ = adesequ;
		this.adeexesid = adeexesid;
		this.adeexesname = adeexesname;
		this.adeamtmoney = adeamtmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	// Property accessors

	public Integer getAdeid() {
		return this.adeid;
	}

	public void setAdeid(Integer adeid) {
		this.adeid = adeid;
	}

	public Integer getAdesequ() {
		return this.adesequ;
	}

	public void setAdesequ(Integer adesequ) {
		this.adesequ = adesequ;
	}

	public String getAdeexesid() {
		return this.adeexesid;
	}

	public void setAdeexesid(String adeexesid) {
		this.adeexesid = adeexesid;
	}

	public String getAdeexesname() {
		return this.adeexesname;
	}

	public void setAdeexesname(String adeexesname) {
		this.adeexesname = adeexesname;
	}

	public Double getAdeamtmoney() {
		return this.adeamtmoney;
	}

	public void setAdeamtmoney(Double adeamtmoney) {
		this.adeamtmoney = adeamtmoney;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ApportiondetailsId))
			return false;
		ApportiondetailsId castOther = (ApportiondetailsId) other;

		return ((this.getAdeid() == castOther.getAdeid()) || (this.getAdeid() != null && castOther.getAdeid() != null
				&& this.getAdeid().equals(castOther.getAdeid())))
				&& ((this.getAdesequ() == castOther.getAdesequ()) || (this.getAdesequ() != null
						&& castOther.getAdesequ() != null && this.getAdesequ().equals(castOther.getAdesequ())))
				&& ((this.getAdeexesid() == castOther.getAdeexesid()) || (this.getAdeexesid() != null
						&& castOther.getAdeexesid() != null && this.getAdeexesid().equals(castOther.getAdeexesid())))
				&& ((this.getAdeexesname() == castOther.getAdeexesname())
						|| (this.getAdeexesname() != null && castOther.getAdeexesname() != null
								&& this.getAdeexesname().equals(castOther.getAdeexesname())))
				&& ((this.getAdeamtmoney() == castOther.getAdeamtmoney())
						|| (this.getAdeamtmoney() != null && castOther.getAdeamtmoney() != null
								&& this.getAdeamtmoney().equals(castOther.getAdeamtmoney())))
				&& ((this.getEnables() == castOther.getEnables()) || (this.getEnables() != null
						&& castOther.getEnables() != null && this.getEnables().equals(castOther.getEnables())))
				&& ((this.getSafetyone() == castOther.getSafetyone()) || (this.getSafetyone() != null
						&& castOther.getSafetyone() != null && this.getSafetyone().equals(castOther.getSafetyone())))
				&& ((this.getSafetytwo() == castOther.getSafetytwo()) || (this.getSafetytwo() != null
						&& castOther.getSafetytwo() != null && this.getSafetytwo().equals(castOther.getSafetytwo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAdeid() == null ? 0 : this.getAdeid().hashCode());
		result = 37 * result + (getAdesequ() == null ? 0 : this.getAdesequ().hashCode());
		result = 37 * result + (getAdeexesid() == null ? 0 : this.getAdeexesid().hashCode());
		result = 37 * result + (getAdeexesname() == null ? 0 : this.getAdeexesname().hashCode());
		result = 37 * result + (getAdeamtmoney() == null ? 0 : this.getAdeamtmoney().hashCode());
		result = 37 * result + (getEnables() == null ? 0 : this.getEnables().hashCode());
		result = 37 * result + (getSafetyone() == null ? 0 : this.getSafetyone().hashCode());
		result = 37 * result + (getSafetytwo() == null ? 0 : this.getSafetytwo().hashCode());
		return result;
	}

}