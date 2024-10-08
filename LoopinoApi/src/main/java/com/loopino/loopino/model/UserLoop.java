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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate(true)
@Table
public class UserLoop {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID user_loop_id; 
	
	@ManyToMany
	@JoinColumn(name= "user_id")
	private User user_id;
	
	@ManyToMany
	@JoinColumn(name= "loop_id")
	private Loop loop_id;
	
	@CreationTimestamp
    @Column(updatable = false)
	private Timestamp joined_at;
	
    @Column(updatable = true)
	private Timestamp exited_at;

	public UUID getuser_loop_id() {
		return user_loop_id;
	}

	public void setuser_loop_id(UUID user_loop_id) {
		this.user_loop_id = user_loop_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Loop getLoop_id() {
		return loop_id;
	}

	public void setLoop_id(Loop loop_id) {
		this.loop_id = loop_id;
	}

	public Timestamp getJoined_at() {
		return joined_at;
	}

	public void setJoined_at(Timestamp joined_at) {
		this.joined_at = joined_at;
	}

	public Timestamp getExited_at() {
		return exited_at;
	}

	public void setExited_at(Timestamp exited_at) {
		this.exited_at = exited_at;
	}
    
    
}
