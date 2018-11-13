package com.zxz.pojo;

import java.util.Date;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -1106795965921677726L;
	private Integer empid;
	private String empname;
	private String empename;
	private String depid;
	private String empsex;
	private String empcard;
	private String empstate;
	private String empduty;
	private String empphoneone;
	private String empphonetwo;
	private String empphonethree;
	private String empbankaccounts;
	private Date empbirthday;
	private String empjob;
	private String empemail;
	private String empweb;
	private String empfaxes;
	private String empopenbank;
	private String emptop;
	private String empdegree;
	private Date empgotime;
	private String empgraduatetime;
	private Date emppactstarttime;
	private Date emppactendtime;
	private String empnowmailid;
	private String empfamilyphone;
	private String empfamilyplace;
	private String empnowphone;
	private String empnowplace;
	private String empexigenceman;
	private String empfamilymailid;
	private String empremark;
	private Integer emptrash;
	private String safetyone;
	private String safetytwo;
	private Integer enables;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(String empname, String empename, String depid, String empsex, String empcard, String empstate,
			String empduty, String empphoneone, String empphonetwo, String empphonethree, String empbankaccounts,
			Date empbirthday, String empjob, String empemail, String empweb, String empfaxes, String empopenbank,
			String emptop, String empdegree, Date empgotime, String empgraduatetime, Date emppactstarttime,
			Date emppactendtime, String empnowmailid, String empfamilyphone, String empfamilyplace, String empnowphone,
			String empnowplace, String empexigenceman, String empfamilymailid, String empremark, Integer emptrash,
			String safetyone, String safetytwo, Integer enables) {
		this.empname = empname;
		this.empename = empename;
		this.depid = depid;
		this.empsex = empsex;
		this.empcard = empcard;
		this.empstate = empstate;
		this.empduty = empduty;
		this.empphoneone = empphoneone;
		this.empphonetwo = empphonetwo;
		this.empphonethree = empphonethree;
		this.empbankaccounts = empbankaccounts;
		this.empbirthday = empbirthday;
		this.empjob = empjob;
		this.empemail = empemail;
		this.empweb = empweb;
		this.empfaxes = empfaxes;
		this.empopenbank = empopenbank;
		this.emptop = emptop;
		this.empdegree = empdegree;
		this.empgotime = empgotime;
		this.empgraduatetime = empgraduatetime;
		this.emppactstarttime = emppactstarttime;
		this.emppactendtime = emppactendtime;
		this.empnowmailid = empnowmailid;
		this.empfamilyphone = empfamilyphone;
		this.empfamilyplace = empfamilyplace;
		this.empnowphone = empnowphone;
		this.empnowplace = empnowplace;
		this.empexigenceman = empexigenceman;
		this.empfamilymailid = empfamilymailid;
		this.empremark = empremark;
		this.emptrash = emptrash;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	// Property accessors

	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpename() {
		return this.empename;
	}

	public void setEmpename(String empename) {
		this.empename = empename;
	}

	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getEmpsex() {
		return this.empsex;
	}

	public void setEmpsex(String empsex) {
		this.empsex = empsex;
	}

	public String getEmpcard() {
		return this.empcard;
	}

	public void setEmpcard(String empcard) {
		this.empcard = empcard;
	}

	public String getEmpstate() {
		return this.empstate;
	}

	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}

	public String getEmpduty() {
		return this.empduty;
	}

	public void setEmpduty(String empduty) {
		this.empduty = empduty;
	}

	public String getEmpphoneone() {
		return this.empphoneone;
	}

	public void setEmpphoneone(String empphoneone) {
		this.empphoneone = empphoneone;
	}

	public String getEmpphonetwo() {
		return this.empphonetwo;
	}

	public void setEmpphonetwo(String empphonetwo) {
		this.empphonetwo = empphonetwo;
	}

	public String getEmpphonethree() {
		return this.empphonethree;
	}

	public void setEmpphonethree(String empphonethree) {
		this.empphonethree = empphonethree;
	}

	public String getEmpbankaccounts() {
		return this.empbankaccounts;
	}

	public void setEmpbankaccounts(String empbankaccounts) {
		this.empbankaccounts = empbankaccounts;
	}

	public Date getEmpbirthday() {
		return this.empbirthday;
	}

	public void setEmpbirthday(Date empbirthday) {
		this.empbirthday = empbirthday;
	}

	public String getEmpjob() {
		return this.empjob;
	}

	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}

	public String getEmpemail() {
		return this.empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpweb() {
		return this.empweb;
	}

	public void setEmpweb(String empweb) {
		this.empweb = empweb;
	}

	public String getEmpfaxes() {
		return this.empfaxes;
	}

	public void setEmpfaxes(String empfaxes) {
		this.empfaxes = empfaxes;
	}

	public String getEmpopenbank() {
		return this.empopenbank;
	}

	public void setEmpopenbank(String empopenbank) {
		this.empopenbank = empopenbank;
	}

	public String getEmptop() {
		return this.emptop;
	}

	public void setEmptop(String emptop) {
		this.emptop = emptop;
	}

	public String getEmpdegree() {
		return this.empdegree;
	}

	public void setEmpdegree(String empdegree) {
		this.empdegree = empdegree;
	}

	public Date getEmpgotime() {
		return this.empgotime;
	}

	public void setEmpgotime(Date empgotime) {
		this.empgotime = empgotime;
	}

	public String getEmpgraduatetime() {
		return this.empgraduatetime;
	}

	public void setEmpgraduatetime(String empgraduatetime) {
		this.empgraduatetime = empgraduatetime;
	}

	public Date getEmppactstarttime() {
		return this.emppactstarttime;
	}

	public void setEmppactstarttime(Date emppactstarttime) {
		this.emppactstarttime = emppactstarttime;
	}

	public Date getEmppactendtime() {
		return this.emppactendtime;
	}

	public void setEmppactendtime(Date emppactendtime) {
		this.emppactendtime = emppactendtime;
	}

	public String getEmpnowmailid() {
		return this.empnowmailid;
	}

	public void setEmpnowmailid(String empnowmailid) {
		this.empnowmailid = empnowmailid;
	}

	public String getEmpfamilyphone() {
		return this.empfamilyphone;
	}

	public void setEmpfamilyphone(String empfamilyphone) {
		this.empfamilyphone = empfamilyphone;
	}

	public String getEmpfamilyplace() {
		return this.empfamilyplace;
	}

	public void setEmpfamilyplace(String empfamilyplace) {
		this.empfamilyplace = empfamilyplace;
	}

	public String getEmpnowphone() {
		return this.empnowphone;
	}

	public void setEmpnowphone(String empnowphone) {
		this.empnowphone = empnowphone;
	}

	public String getEmpnowplace() {
		return this.empnowplace;
	}

	public void setEmpnowplace(String empnowplace) {
		this.empnowplace = empnowplace;
	}

	public String getEmpexigenceman() {
		return this.empexigenceman;
	}

	public void setEmpexigenceman(String empexigenceman) {
		this.empexigenceman = empexigenceman;
	}

	public String getEmpfamilymailid() {
		return this.empfamilymailid;
	}

	public void setEmpfamilymailid(String empfamilymailid) {
		this.empfamilymailid = empfamilymailid;
	}

	public String getEmpremark() {
		return this.empremark;
	}

	public void setEmpremark(String empremark) {
		this.empremark = empremark;
	}

	public Integer getEmptrash() {
		return this.emptrash;
	}

	public void setEmptrash(Integer emptrash) {
		this.emptrash = emptrash;
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