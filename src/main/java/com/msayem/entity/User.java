package com.msayem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * User Data Model (i.e. Entity) class.
 * 
 * @author MSAYEM
 * 
 */
@Entity
@Table(name = "user")
public class User {

	private Long userid;
	private String username;
	private String password;
	private String email;
	private Date dateofbirth;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}

	@Column(length = 8, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Column(length = 8, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Column(nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
}