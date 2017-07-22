package com.sethborne.lessonone.relationships.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="licenses")

public class License {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;
	
	private Date expirationDate;
	
	private String state;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;
	public License() {
	}
	
	public License(String number, Person person) {
		this.number = number;
		this.person = person;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}
}
