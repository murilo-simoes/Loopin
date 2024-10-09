package com.loopino.loopino.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate(true)
@Table
public class Post {


	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID post_id; 
	
	@OneToMany
	@JoinColumn(name= "user_id")
	private User user_id;
	
	@OneToMany
	@JoinColumn(name= "cycle_id")
	private Cycle cycle_id;
	
	@Column(nullable = false, length = 255)
	private String content_text;
	
	@Column(nullable = true, length = 2083)
	private String content_media;
	
	@CreationTimestamp
    @Column( updatable = false)
	private Timestamp created_at;
	
    @Column( updatable = false)
	private Timestamp expires_at;

	public UUID getPost_id() {
		return post_id;
	}

	public void setPost_id(UUID post_id) {
		this.post_id = post_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Cycle getCycle_id() {
		return cycle_id;
	}

	public void setCycle_id(Cycle cycle_id) {
		this.cycle_id = cycle_id;
	}

	public String getContent_text() {
		return content_text;
	}

	public void setContent_text(String content_text) {
		this.content_text = content_text;
	}

	public String getContent_media() {
		return content_media;
	}

	public void setContent_media(String content_media) {
		this.content_media = content_media;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getExpires_at() {
		return expires_at;
	}

	public void setExpires_at(Timestamp expires_at) {
		this.expires_at = expires_at;
	}
    
    
}
