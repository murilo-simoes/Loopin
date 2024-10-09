package com.loopino.loopino.model;

import java.util.UUID;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate(true)
@Table
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID comment_id; 
	
	@OneToMany
	@JoinColumn(name= "post_id")
	private Post post_id; 
	
	@OneToMany
	@JoinColumn(name= "user_id")
	private User user_id;
	
	@Column(nullable = false, length = 255)
	private String content_text;
	
	@Column(nullable = true, length = 2083)
	private String content_media;
	
	@Column(nullable = true)
	private UUID parent_comment_id;

	public UUID getComment_id() {
		return comment_id;
	}

	public void setComment_id(UUID comment_id) {
		this.comment_id = comment_id;
	}

	public Post getPost_id() {
		return post_id;
	}

	public void setPost_id(Post post_id) {
		this.post_id = post_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
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

	public UUID getParent_comment_id() {
		return parent_comment_id;
	}

	public void setParent_comment_id(UUID parent_comment_id) {
		this.parent_comment_id = parent_comment_id;
	}
	
	
}
