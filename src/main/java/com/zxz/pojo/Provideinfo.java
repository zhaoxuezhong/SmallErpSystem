package com.zxz.pojo;

/**
 * Provideinfo entity. @author MyEclipse Persistence Tools
 */

public class Provideinfo implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -5379156034414606615L;
	private Integer peoid;
	private String peoname;
	private String peoshortname;
	private String peoascription;
	private String peopeeid;
	private String peopeename;
	private String peoarea;
	private String peoprincipal;
	private String peolinkman;
	private String peophoneone;
	private String peophonetwo;
	private String peomobilephone;
	private String peobankaccounts;
	private String peoopenbank;
	private String peoempid;
	private String peoempname;
	private String peocalling;
	private String peoemail;
	private String peoweb;
	private String peofaxes;
	private String peocreatedate;
	private String peocreditclass;
	private Double peozhangkuanedu;
	private Double peoremainedu;
	private Double peomonthreckoning;
	private Double peoqcprepaymoney;
	private Double peoqcdealmoney;
	private Double peoqmprepaymoney;
	private Double peoqmdealmoney;
	private String peoremark;
	private Integer peotrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Provideinfo() {
	}

	/** full constructor */
	public Provideinfo(String peoname, String peoshortname, String peoascription, String peopeeid, String peopeename,
			String peoarea, String peoprincipal, String peolinkman, String peophoneone, String peophonetwo,
			String peomobilephone, String peobankaccounts, String peoopenbank, String peoempid, String peoempname,
			String peocalling, String peoemail, String peoweb, String peofaxes, String peocreatedate,
			String peocreditclass, Double peozhangkuanedu, Double peoremainedu, Double peomonthreckoning,
			Double peoqcprepaymoney, Double peoqcdealmoney, Double peoqmprepaymoney, Double peoqmdealmoney,
			String peoremark, Integer peotrash, String safetyone, String safetytwo, Integer enables) {
		this.peoname = peoname;
		this.peoshortname = peoshortname;
		this.peoascription = peoascription;
		this.peopeeid = peopeeid;
		this.peopeename = peopeename;
		this.peoarea = peoarea;
		this.peoprincipal = peoprincipal;
		this.peolinkman = peolinkman;
		this.peophoneone = peophoneone;
		this.peophonetwo = peophonetwo;
		this.peomobilephone = peomobilephone;
		this.peobankaccounts = peobankaccounts;
		this.peoopenbank = peoopenbank;
		this.peoempid = peoempid;
		this.peoempname = peoempname;
		this.peocalling = peocalling;
		this.peoemail = peoemail;
		this.peoweb = peoweb;
		this.peofaxes = peofaxes;
		this.peocreatedate = peocreatedate;
		this.peocreditclass = peocreditclass;
		this.peozhangkuanedu = peozhangkuanedu;
		this.peoremainedu = peoremainedu;
		this.peomonthreckoning = peomonthreckoning;
		this.peoqcprepaymoney = peoqcprepaymoney;
		this.peoqcdealmoney = peoqcdealmoney;
		this.peoqmprepaymoney = peoqmprepaymoney;
		this.peoqmdealmoney = peoqmdealmoney;
		this.peoremark = peoremark;
		this.peotrash = peotrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getPeoid() {
		return this.peoid;
	}

	public void setPeoid(Integer peoid) {
		this.peoid = peoid;
	}

	public String getPeoname() {
		return this.peoname;
	}

	public void setPeoname(String peoname) {
		this.peoname = peoname;
	}

	public String getPeoshortname() {
		return this.peoshortname;
	}

	public void setPeoshortname(String peoshortname) {
		this.peoshortname = peoshortname;
	}

	public String getPeoascription() {
		return this.peoascription;
	}

	public void setPeoascription(String peoascription) {
		this.peoascription = peoascription;
	}

	public String getPeopeeid() {
		return this.peopeeid;
	}

	public void setPeopeeid(String peopeeid) {
		this.peopeeid = peopeeid;
	}

	public String getPeopeename() {
		return this.peopeename;
	}

	public void setPeopeename(String peopeename) {
		this.peopeename = peopeename;
	}

	public String getPeoarea() {
		return this.peoarea;
	}

	public void setPeoarea(String peoarea) {
		this.peoarea = peoarea;
	}

	public String getPeoprincipal() {
		return this.peoprincipal;
	}

	public void setPeoprincipal(String peoprincipal) {
		this.peoprincipal = peoprincipal;
	}

	public String getPeolinkman() {
		return this.peolinkman;
	}

	public void setPeolinkman(String peolinkman) {
		this.peolinkman = peolinkman;
	}

	public String getPeophoneone() {
		return this.peophoneone;
	}

	public void setPeophoneone(String peophoneone) {
		this.peophoneone = peophoneone;
	}

	public String getPeophonetwo() {
		return this.peophonetwo;
	}

	public void setPeophonetwo(String peophonetwo) {
		this.peophonetwo = peophonetwo;
	}

	public String getPeomobilephone() {
		return this.peomobilephone;
	}

	public void setPeomobilephone(String peomobilephone) {
		this.peomobilephone = peomobilephone;
	}

	public String getPeobankaccounts() {
		return this.peobankaccounts;
	}

	public void setPeobankaccounts(String peobankaccounts) {
		this.peobankaccounts = peobankaccounts;
	}

	public String getPeoopenbank() {
		return this.peoopenbank;
	}

	public void setPeoopenbank(String peoopenbank) {
		this.peoopenbank = peoopenbank;
	}

	public String getPeoempid() {
		return this.peoempid;
	}

	public void setPeoempid(String peoempid) {
		this.peoempid = peoempid;
	}

	public String getPeoempname() {
		return this.peoempname;
	}

	public void setPeoempname(String peoempname) {
		this.peoempname = peoempname;
	}

	public String getPeocalling() {
		return this.peocalling;
	}

	public void setPeocalling(String peocalling) {
		this.peocalling = peocalling;
	}

	public String getPeoemail() {
		return this.peoemail;
	}

	public void setPeoemail(String peoemail) {
		this.peoemail = peoemail;
	}

	public String getPeoweb() {
		return this.peoweb;
	}

	public void setPeoweb(String peoweb) {
		this.peoweb = peoweb;
	}

	public String getPeofaxes() {
		return this.peofaxes;
	}

	public void setPeofaxes(String peofaxes) {
		this.peofaxes = peofaxes;
	}

	public String getPeocreatedate() {
		return this.peocreatedate;
	}

	public void setPeocreatedate(String peocreatedate) {
		this.peocreatedate = peocreatedate;
	}

	public String getPeocreditclass() {
		return this.peocreditclass;
	}

	public void setPeocreditclass(String peocreditclass) {
		this.peocreditclass = peocreditclass;
	}

	public Double getPeozhangkuanedu() {
		return this.peozhangkuanedu;
	}

	public void setPeozhangkuanedu(Double peozhangkuanedu) {
		this.peozhangkuanedu = peozhangkuanedu;
	}

	public Double getPeoremainedu() {
		return this.peoremainedu;
	}

	public void setPeoremainedu(Double peoremainedu) {
		this.peoremainedu = peoremainedu;
	}

	public Double getPeomonthreckoning() {
		return this.peomonthreckoning;
	}

	public void setPeomonthreckoning(Double peomonthreckoning) {
		this.peomonthreckoning = peomonthreckoning;
	}

	public Double getPeoqcprepaymoney() {
		return this.peoqcprepaymoney;
	}

	public void setPeoqcprepaymoney(Double peoqcprepaymoney) {
		this.peoqcprepaymoney = peoqcprepaymoney;
	}

	public Double getPeoqcdealmoney() {
		return this.peoqcdealmoney;
	}

	public void setPeoqcdealmoney(Double peoqcdealmoney) {
		this.peoqcdealmoney = peoqcdealmoney;
	}

	public Double getPeoqmprepaymoney() {
		return this.peoqmprepaymoney;
	}

	public void setPeoqmprepaymoney(Double peoqmprepaymoney) {
		this.peoqmprepaymoney = peoqmprepaymoney;
	}

	public Double getPeoqmdealmoney() {
		return this.peoqmdealmoney;
	}

	public void setPeoqmdealmoney(Double peoqmdealmoney) {
		this.peoqmdealmoney = peoqmdealmoney;
	}

	public String getPeoremark() {
		return this.peoremark;
	}

	public void setPeoremark(String peoremark) {
		this.peoremark = peoremark;
	}

	public Integer getPeotrash() {
		return this.peotrash;
	}

	public void setPeotrash(Integer peotrash) {
		this.peotrash = peotrash;
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