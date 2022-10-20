package com.example.demo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LoginRegistration")
public class LoginRegistration {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	
	@Column
	private String UserName;
	
	@Column 
	private String Password;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date RegisteredDate=new Date(System.currentTimeMillis());
	
	 LoginRegistration() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public Date getRegisteredDate() {
		return RegisteredDate;
	}

	public void setRegisteredDate() {
		this.RegisteredDate =new Date(System.currentTimeMillis());;
	}

	public LoginRegistration(Long id, String userName, String password) {
		super();
		this.id = id;
		this.UserName = userName;
		this.Password = password;
		this.RegisteredDate = new Date(System.currentTimeMillis());
	}

	
}
