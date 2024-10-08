package com.loopino.loopino.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.id.GUIDGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate(true)
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID user_id; 
	
	@Column(nullable = false, length = 70)
	private String name;
	
	@Column(unique=true, nullable = false, length = 255)
	private String email;
	
	@Column(unique=true, nullable = false, length = 25)
	private String username;
	
	@Column(nullable = true, length = 255)
	private String biography;
	
	@Column(nullable = true, length = 2083 )
	private String url;
	
	@Column(nullable = true, length = 2083)
	private String profile_picture_url;
	
	@CreationTimestamp
    @Column( updatable = false)
	private Timestamp created_at;
	
	@CreationTimestamp
    @Column( updatable = true)
	private Timestamp updated_at;
	
	@Column(columnDefinition = "boolean default false")
	private Boolean is_active;

	@Column(columnDefinition = "boolean default false")
	private Boolean first_access;
	
	public UUID getId() {
		return user_id;
	}

	public void setId(UUID id) {
		this.user_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getprofile_picture_url() {
		return profile_picture_url;
	}

	public void setprofile_picture_url(String profile_picture_url) {
		this.profile_picture_url = profile_picture_url;
	}

	public Timestamp getcreated_at() {
		return created_at;
	}

	public void setcreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdatedAt() {
		return updated_at;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updated_at = updatedAt;
	}

	public Boolean getis_active() {
		return is_active;
	}

	public void setis_active(Boolean is_active) {
		this.is_active = is_active;
	}

	public Boolean getfirst_access() {
		return first_access;
	}

	public void setfirst_access(Boolean first_access) {
		this.first_access = first_access;
	}

}
