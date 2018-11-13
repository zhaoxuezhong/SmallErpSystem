package com.zxz.pojo;

/**
 * Generalledger entity. @author MyEclipse Persistence Tools
 */

public class Generalledger implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -7484106919217732714L;
	private Integer genid;
	private String genmaterielid;
	private String genstorage;
	private String genstoragename;
	private Integer genexpectstartqty;
	private Double genstandarcost;
	private Double genallcost;
	private Double genexpectstartallcost;
	private Integer gensafetyqty;
	private Double genavgcost;
	private Integer genqty;
	private Double genwavgcost;
	private Double genstandardcostall;
	private Double genwcost;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Generalledger() {
	}

	/** full constructor */
	public Generalledger(String genmaterielid, String genstorage, String genstoragename, Integer genexpectstartqty,
			Double genstandarcost, Double genallcost, Double genexpectstartallcost, Integer gensafetyqty,
			Double genavgcost, Integer genqty, Double genwavgcost, Double genstandardcostall, Double genwcost,
			String safetyone, String safetytwo, Integer enables) {
		this.genmaterielid = genmaterielid;
		this.genstorage = genstorage;
		this.genstoragename = genstoragename;
		this.genexpectstartqty = genexpectstartqty;
		this.genstandarcost = genstandarcost;
		this.genallcost = genallcost;
		this.genexpectstartallcost = genexpectstartallcost;
		this.gensafetyqty = gensafetyqty;
		this.genavgcost = genavgcost;
		this.genqty = genqty;
		this.genwavgcost = genwavgcost;
		this.genstandardcostall = genstandardcostall;
		this.genwcost = genwcost;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getGenid() {
		return this.genid;
	}

	public void setGenid(Integer genid) {
		this.genid = genid;
	}

	public String getGenmaterielid() {
		return this.genmaterielid;
	}

	public void setGenmaterielid(String genmaterielid) {
		this.genmaterielid = genmaterielid;
	}

	public String getGenstorage() {
		return this.genstorage;
	}

	public void setGenstorage(String genstorage) {
		this.genstorage = genstorage;
	}

	public String getGenstoragename() {
		return this.genstoragename;
	}

	public void setGenstoragename(String genstoragename) {
		this.genstoragename = genstoragename;
	}

	public Integer getGenexpectstartqty() {
		return this.genexpectstartqty;
	}

	public void setGenexpectstartqty(Integer genexpectstartqty) {
		this.genexpectstartqty = genexpectstartqty;
	}

	public Double getGenstandarcost() {
		return this.genstandarcost;
	}

	public void setGenstandarcost(Double genstandarcost) {
		this.genstandarcost = genstandarcost;
	}

	public Double getGenallcost() {
		return this.genallcost;
	}

	public void setGenallcost(Double genallcost) {
		this.genallcost = genallcost;
	}

	public Double getGenexpectstartallcost() {
		return this.genexpectstartallcost;
	}

	public void setGenexpectstartallcost(Double genexpectstartallcost) {
		this.genexpectstartallcost = genexpectstartallcost;
	}

	public Integer getGensafetyqty() {
		return this.gensafetyqty;
	}

	public void setGensafetyqty(Integer gensafetyqty) {
		this.gensafetyqty = gensafetyqty;
	}

	public Double getGenavgcost() {
		return this.genavgcost;
	}

	public void setGenavgcost(Double genavgcost) {
		this.genavgcost = genavgcost;
	}

	public Integer getGenqty() {
		return this.genqty;
	}

	public void setGenqty(Integer genqty) {
		this.genqty = genqty;
	}

	public Double getGenwavgcost() {
		return this.genwavgcost;
	}

	public void setGenwavgcost(Double genwavgcost) {
		this.genwavgcost = genwavgcost;
	}

	public Double getGenstandardcostall() {
		return this.genstandardcostall;
	}

	public void setGenstandardcostall(Double genstandardcostall) {
		this.genstandardcostall = genstandardcostall;
	}

	public Double getGenwcost() {
		return this.genwcost;
	}

	public void setGenwcost(Double genwcost) {
		this.genwcost = genwcost;
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