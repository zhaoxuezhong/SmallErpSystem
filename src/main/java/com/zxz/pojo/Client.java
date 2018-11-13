package com.zxz.pojo;

import java.util.Date;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */

public class Client implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -8231653801962222099L;
	private Integer cliid;
	private Integer clitypeid;
	private String cliname;
	private String clishortname;
	private String cliaddress;
	private String cliarea;
	private String cliename;
	private String clieshortname;
	private String cliprincipal;
	private String clilinkman;
	private String cliphoneone;
	private String cliphonetwo;
	private String cliphonethree;
	private String clibankaccounts;
	private String cliopenbank;
	private String empid;
	private String climobilephone;
	private String cliemail;
	private String cliweb;
	private String clifaxes;
	private Date clioldoutdate;
	private Date clioldintodate;
	private Date clinewoutdate;
	private Date clinewintodate;
	private String clidiscount;
	private String clipricestep;
	private Date clicreatedate;
	private Date clistopdate;
	private String clizhangkuanedu;
	private String cliremainedu;
	private String clicondition;
	private Date climonthreckoning;
	private String clicreditstep;
	private Double cliqcpremoney;
	private Double cliqcdealmoney;
	private Double cliqmpremoney;
	private Double cliqmdealmoney;
	private String cliotherremark;
	private Integer clitrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Client() {
	}

	/** full constructor */
	public Client(Integer clitypeid, String cliname, String clishortname, String cliaddress, String cliarea,
			String cliename, String clieshortname, String cliprincipal, String clilinkman, String cliphoneone,
			String cliphonetwo, String cliphonethree, String clibankaccounts, String cliopenbank, String empid,
			String climobilephone, String cliemail, String cliweb, String clifaxes, Date clioldoutdate,
			Date clioldintodate, Date clinewoutdate, Date clinewintodate, String clidiscount, String clipricestep,
			Date clicreatedate, Date clistopdate, String clizhangkuanedu, String cliremainedu, String clicondition,
			Date climonthreckoning, String clicreditstep, Double cliqcpremoney, Double cliqcdealmoney,
			Double cliqmpremoney, Double cliqmdealmoney, String cliotherremark, Integer clitrash, String safetyone,
			String safetytwo, Integer enables) {
		this.clitypeid = clitypeid;
		this.cliname = cliname;
		this.clishortname = clishortname;
		this.cliaddress = cliaddress;
		this.cliarea = cliarea;
		this.cliename = cliename;
		this.clieshortname = clieshortname;
		this.cliprincipal = cliprincipal;
		this.clilinkman = clilinkman;
		this.cliphoneone = cliphoneone;
		this.cliphonetwo = cliphonetwo;
		this.cliphonethree = cliphonethree;
		this.clibankaccounts = clibankaccounts;
		this.cliopenbank = cliopenbank;
		this.empid = empid;
		this.climobilephone = climobilephone;
		this.cliemail = cliemail;
		this.cliweb = cliweb;
		this.clifaxes = clifaxes;
		this.clioldoutdate = clioldoutdate;
		this.clioldintodate = clioldintodate;
		this.clinewoutdate = clinewoutdate;
		this.clinewintodate = clinewintodate;
		this.clidiscount = clidiscount;
		this.clipricestep = clipricestep;
		this.clicreatedate = clicreatedate;
		this.clistopdate = clistopdate;
		this.clizhangkuanedu = clizhangkuanedu;
		this.cliremainedu = cliremainedu;
		this.clicondition = clicondition;
		this.climonthreckoning = climonthreckoning;
		this.clicreditstep = clicreditstep;
		this.cliqcpremoney = cliqcpremoney;
		this.cliqcdealmoney = cliqcdealmoney;
		this.cliqmpremoney = cliqmpremoney;
		this.cliqmdealmoney = cliqmdealmoney;
		this.cliotherremark = cliotherremark;
		this.clitrash = clitrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getCliid() {
		return this.cliid;
	}

	public void setCliid(Integer cliid) {
		this.cliid = cliid;
	}

	public Integer getClitypeid() {
		return this.clitypeid;
	}

	public void setClitypeid(Integer clitypeid) {
		this.clitypeid = clitypeid;
	}

	public String getCliname() {
		return this.cliname;
	}

	public void setCliname(String cliname) {
		this.cliname = cliname;
	}

	public String getClishortname() {
		return this.clishortname;
	}

	public void setClishortname(String clishortname) {
		this.clishortname = clishortname;
	}

	public String getCliaddress() {
		return this.cliaddress;
	}

	public void setCliaddress(String cliaddress) {
		this.cliaddress = cliaddress;
	}

	public String getCliarea() {
		return this.cliarea;
	}

	public void setCliarea(String cliarea) {
		this.cliarea = cliarea;
	}

	public String getCliename() {
		return this.cliename;
	}

	public void setCliename(String cliename) {
		this.cliename = cliename;
	}

	public String getClieshortname() {
		return this.clieshortname;
	}

	public void setClieshortname(String clieshortname) {
		this.clieshortname = clieshortname;
	}

	public String getCliprincipal() {
		return this.cliprincipal;
	}

	public void setCliprincipal(String cliprincipal) {
		this.cliprincipal = cliprincipal;
	}

	public String getClilinkman() {
		return this.clilinkman;
	}

	public void setClilinkman(String clilinkman) {
		this.clilinkman = clilinkman;
	}

	public String getCliphoneone() {
		return this.cliphoneone;
	}

	public void setCliphoneone(String cliphoneone) {
		this.cliphoneone = cliphoneone;
	}

	public String getCliphonetwo() {
		return this.cliphonetwo;
	}

	public void setCliphonetwo(String cliphonetwo) {
		this.cliphonetwo = cliphonetwo;
	}

	public String getCliphonethree() {
		return this.cliphonethree;
	}

	public void setCliphonethree(String cliphonethree) {
		this.cliphonethree = cliphonethree;
	}

	public String getClibankaccounts() {
		return this.clibankaccounts;
	}

	public void setClibankaccounts(String clibankaccounts) {
		this.clibankaccounts = clibankaccounts;
	}

	public String getCliopenbank() {
		return this.cliopenbank;
	}

	public void setCliopenbank(String cliopenbank) {
		this.cliopenbank = cliopenbank;
	}

	public String getEmpid() {
		return this.empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getClimobilephone() {
		return this.climobilephone;
	}

	public void setClimobilephone(String climobilephone) {
		this.climobilephone = climobilephone;
	}

	public String getCliemail() {
		return this.cliemail;
	}

	public void setCliemail(String cliemail) {
		this.cliemail = cliemail;
	}

	public String getCliweb() {
		return this.cliweb;
	}

	public void setCliweb(String cliweb) {
		this.cliweb = cliweb;
	}

	public String getClifaxes() {
		return this.clifaxes;
	}

	public void setClifaxes(String clifaxes) {
		this.clifaxes = clifaxes;
	}

	public Date getClioldoutdate() {
		return this.clioldoutdate;
	}

	public void setClioldoutdate(Date clioldoutdate) {
		this.clioldoutdate = clioldoutdate;
	}

	public Date getClioldintodate() {
		return this.clioldintodate;
	}

	public void setClioldintodate(Date clioldintodate) {
		this.clioldintodate = clioldintodate;
	}

	public Date getClinewoutdate() {
		return this.clinewoutdate;
	}

	public void setClinewoutdate(Date clinewoutdate) {
		this.clinewoutdate = clinewoutdate;
	}

	public Date getClinewintodate() {
		return this.clinewintodate;
	}

	public void setClinewintodate(Date clinewintodate) {
		this.clinewintodate = clinewintodate;
	}

	public String getClidiscount() {
		return this.clidiscount;
	}

	public void setClidiscount(String clidiscount) {
		this.clidiscount = clidiscount;
	}

	public String getClipricestep() {
		return this.clipricestep;
	}

	public void setClipricestep(String clipricestep) {
		this.clipricestep = clipricestep;
	}

	public Date getClicreatedate() {
		return this.clicreatedate;
	}

	public void setClicreatedate(Date clicreatedate) {
		this.clicreatedate = clicreatedate;
	}

	public Date getClistopdate() {
		return this.clistopdate;
	}

	public void setClistopdate(Date clistopdate) {
		this.clistopdate = clistopdate;
	}

	public String getClizhangkuanedu() {
		return this.clizhangkuanedu;
	}

	public void setClizhangkuanedu(String clizhangkuanedu) {
		this.clizhangkuanedu = clizhangkuanedu;
	}

	public String getCliremainedu() {
		return this.cliremainedu;
	}

	public void setCliremainedu(String cliremainedu) {
		this.cliremainedu = cliremainedu;
	}

	public String getClicondition() {
		return this.clicondition;
	}

	public void setClicondition(String clicondition) {
		this.clicondition = clicondition;
	}

	public Date getClimonthreckoning() {
		return this.climonthreckoning;
	}

	public void setClimonthreckoning(Date climonthreckoning) {
		this.climonthreckoning = climonthreckoning;
	}

	public String getClicreditstep() {
		return this.clicreditstep;
	}

	public void setClicreditstep(String clicreditstep) {
		this.clicreditstep = clicreditstep;
	}

	public Double getCliqcpremoney() {
		return this.cliqcpremoney;
	}

	public void setCliqcpremoney(Double cliqcpremoney) {
		this.cliqcpremoney = cliqcpremoney;
	}

	public Double getCliqcdealmoney() {
		return this.cliqcdealmoney;
	}

	public void setCliqcdealmoney(Double cliqcdealmoney) {
		this.cliqcdealmoney = cliqcdealmoney;
	}

	public Double getCliqmpremoney() {
		return this.cliqmpremoney;
	}

	public void setCliqmpremoney(Double cliqmpremoney) {
		this.cliqmpremoney = cliqmpremoney;
	}

	public Double getCliqmdealmoney() {
		return this.cliqmdealmoney;
	}

	public void setCliqmdealmoney(Double cliqmdealmoney) {
		this.cliqmdealmoney = cliqmdealmoney;
	}

	public String getCliotherremark() {
		return this.cliotherremark;
	}

	public void setCliotherremark(String cliotherremark) {
		this.cliotherremark = cliotherremark;
	}

	public Integer getClitrash() {
		return this.clitrash;
	}

	public void setClitrash(Integer clitrash) {
		this.clitrash = clitrash;
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