package com.zxz.pojo;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -4137507623766632058L;
	private Integer id;
	private String code;
	private String email;
	private String phone;
	private String password;
	private Timestamp createDate;
	private Timestamp lastLoginTime;
	private Timestamp lastLogOutTime;
	private Integer type;
	private String typeName;
	private Integer enables;

	// Constructors

	/** default constructor */
	public User() {
	}

	public User(String code) {
		super();
		this.code = code;
	}

	/** full constructor */
	public User(Integer id, String code, String email, String phone, String password, Timestamp createDate,
			Timestamp lastLoginTime, Timestamp lastLogOutTime, Integer type) {
		super();
		this.id = id;
		this.code = code;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.createDate = createDate;
		this.lastLoginTime = lastLoginTime;
		this.lastLogOutTime = lastLogOutTime;
		this.type = type;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Timestamp getLastLogOutTime() {
		return this.lastLogOutTime;
	}

	public void setLastLogOutTime(Timestamp lastLogOutTime) {
		this.lastLogOutTime = lastLogOutTime;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getEnables() {
		return enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}