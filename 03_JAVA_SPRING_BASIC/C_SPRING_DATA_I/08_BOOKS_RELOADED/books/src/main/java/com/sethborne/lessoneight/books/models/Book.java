package com.sethborne.lessoneight.books.models;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Book {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(min = 5, max = 200)
	private String title;
	
	@Column
	@Size(min = 5, max = 200)
	private String description;
	
	@Column
	@Size(min = 3, max = 40)
	private String language;
	
	@Column
	@Min(100)
	private int numberOfPages;
	
	@Column(updatable = false)
//	@Column
	@CreationTimestamp
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@UpdateTimestamp
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	
	public Book() {
	}
	
	public Book(Long id, String title, String desc, String lang, int pages, Date createdAt, Date updatedAt) {
		this.id = id;
		this.title = title;
		this.description = desc;
		this.language = lang;
		this.numberOfPages = pages;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
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
	
	@PrePersist
    protected void onCreate(){
            this.createdAt = new Date();
            this.updatedAt = new Date();
    }
	
    @PreUpdate
    protected void onUpdate(){
            this.updatedAt = new Date();
    }

}
