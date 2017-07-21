package com.sethborne.assignmenttwo.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Language {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(min = 2, max = 20)
	private String name;
	
	@Column
	@Size(min = 2, max = 20)
	private String creator;
	
	@Column
//	@NotNull(message="value can not be null")
	private String currentVersion;

	@Column(updatable = false)
	@CreationTimestamp
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@UpdateTimestamp
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	public Language() {
	}
	
	public Language(String name, String creator, String currentVersion, Date createdAt, Date updatedAt) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
//    @PrePersist
//    protected void onCreate(){
//            this.createdAt = new Date();
//            this.updatedAt = new Date();
//    }
//    @PreUpdate
//    protected void onUpdate(){
//            this.updatedAt = new Date();
//    }

}
