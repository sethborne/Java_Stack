package com.sethborne.assignmentthree.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Song {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(min = 5, max = 20, message="Please Enter a Song Title Over 5 Characters")
	private String title;
	
	@Column
	@Size(min = 5, max = 20, message="Please Enter an Artist Name Over 5 Characters")
	private String artist;
	
	@Column
	@Min(value = 0, message="Please select a Valid Rating")
	private int rating;
	
	@Column(updatable = false)
	@CreationTimestamp
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@UpdateTimestamp
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	Song(){
	}
	
	Song(Long id, String title, String artist, int rating, Date createdAt, Date updatedAt){
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	//getters/setters
	
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

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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
}
