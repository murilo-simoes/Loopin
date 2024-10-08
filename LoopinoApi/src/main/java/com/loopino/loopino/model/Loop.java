package com.loopino.loopino.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import com.loopino.loopino.enums.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@DynamicUpdate(true)
@Table(name = "loop")
public class Loop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID loop_id; 
	
	@Column(nullable = false, length = 35)
	private String title;
	
	@Column(nullable = true, length = 255)
	private String description;
	
	@Column(nullable = false)
	private Category category;
	
	@Column(nullable = true, length = 2083)
	private String banner_url;
	
	@Column(nullable = true, length = 25)
	private String password;
	
	@ManyToOne
	@JoinColumn(name= "user_id")
	private User owner_user_id;
	
	@CreationTimestamp
    @Column( updatable = false)
	private Timestamp created_at;
	
	@CreationTimestamp
    @Column(updatable = true)
	private Timestamp updated_at;
	
	@Column(columnDefinition = "boolean default false")
	private Boolean is_active;

	public UUID getloop_id() {
		return loop_id;
	}

	public void setloop_id(UUID loop_id) {
		this.loop_id = loop_id;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getbanner_url() {
		return banner_url;
	}

	public void setbanner_url(String banner_url) {
		this.banner_url = banner_url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getowner_user_id() {
		return owner_user_id;
	}

	public void setowner_user_id(User owner_user_id) {
		this.owner_user_id = owner_user_id;
	}

	public Timestamp getcreated_at() {
		return created_at;
	}

	public void setcreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getupdated_at() {
		return updated_at;
	}

	public void setupdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

	public Boolean getis_active() {
		return is_active;
	}

	public void setis_active(Boolean is_active) {
		this.is_active = is_active;
	}
	
	
}
