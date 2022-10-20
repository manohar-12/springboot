package com.example.demo.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="todos")
public class Todos {

	
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String username;
	@Column
	private String description;
	@Temporal(TemporalType.DATE)
	@Column
	private Date trgetdate=new Date(System.currentTimeMillis());
	@Column
	private boolean isCompleted;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTrgetdate(Date trgetdate) {
		this.trgetdate=trgetdate;
	}
	public Date getTrgetdate() {
		return trgetdate;
	}
	
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Todos(long id, String username, String description,Date trgetdate, boolean isCompleted) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.trgetdate = trgetdate;
		this.isCompleted = isCompleted;
	}
	Todos(){
}
	
	
}
