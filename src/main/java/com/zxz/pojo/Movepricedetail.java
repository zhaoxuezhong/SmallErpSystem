package com.zxz.pojo;

/**
 * Movepricedetail entity. @author MyEclipse Persistence Tools
 */

public class Movepricedetail implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6620587531110791014L;
	private Integer moveinle;
	private String moveorder;
	private String movemateriel;
	private String movematerielname;
	private String movespectype;
	private String moveunit;
	private Integer movestocks;
	private Double moveaveragecost;
	private Double moveprice;
	private Double movemoveprice;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Movepricedetail() {
	}

	/** full constructor */
	public Movepricedetail(String moveorder, String movemateriel, String movematerielname, String movespectype,
			String moveunit, Integer movestocks, Double moveaveragecost, Double moveprice, Double movemoveprice,
			String safetyone, String safetytwo, Integer enables) {
		this.moveorder = moveorder;
		this.movemateriel = movemateriel;
		this.movematerielname = movematerielname;
		this.movespectype = movespectype;
		this.moveunit = moveunit;
		this.movestocks = movestocks;
		this.moveaveragecost = moveaveragecost;
		this.moveprice = moveprice;
		this.movemoveprice = movemoveprice;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getMoveinle() {
		return this.moveinle;
	}

	public void setMoveinle(Integer moveinle) {
		this.moveinle = moveinle;
	}

	public String getMoveorder() {
		return this.moveorder;
	}

	public void setMoveorder(String moveorder) {
		this.moveorder = moveorder;
	}

	public String getMovemateriel() {
		return this.movemateriel;
	}

	public void setMovemateriel(String movemateriel) {
		this.movemateriel = movemateriel;
	}

	public String getMovematerielname() {
		return this.movematerielname;
	}

	public void setMovematerielname(String movematerielname) {
		this.movematerielname = movematerielname;
	}

	public String getMovespectype() {
		return this.movespectype;
	}

	public void setMovespectype(String movespectype) {
		this.movespectype = movespectype;
	}

	public String getMoveunit() {
		return this.moveunit;
	}

	public void setMoveunit(String moveunit) {
		this.moveunit = moveunit;
	}

	public Integer getMovestocks() {
		return this.movestocks;
	}

	public void setMovestocks(Integer movestocks) {
		this.movestocks = movestocks;
	}

	public Double getMoveaveragecost() {
		return this.moveaveragecost;
	}

	public void setMoveaveragecost(Double moveaveragecost) {
		this.moveaveragecost = moveaveragecost;
	}

	public Double getMoveprice() {
		return this.moveprice;
	}

	public void setMoveprice(Double moveprice) {
		this.moveprice = moveprice;
	}

	public Double getMovemoveprice() {
		return this.movemoveprice;
	}

	public void setMovemoveprice(Double movemoveprice) {
		this.movemoveprice = movemoveprice;
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