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
public class Cycle {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID cycle_id; 
	
	@OneToMany
	@JoinColumn(name= "loop_id")
	private Loop loop_id;
	
    @Column(updatable = true)
	private Timestamp start_date;
    
    @Column(updatable = true)
	private Timestamp end_date;
    
	@Column(columnDefinition = "boolean default false")
	private Boolean is_active;
	
	@CreationTimestamp
    @Column( updatable = false)
	private Timestamp created_at;

	public UUID getCycle_id() {
		return cycle_id;
	}

	public void setCycle_id(UUID cycle_id) {
		this.cycle_id = cycle_id;
	}

	public Loop getLoop_id() {
		return loop_id;
	}

	public void setLoop_id(Loop loop_id) {
		this.loop_id = loop_id;
	}

	public Timestamp getStart_date() {
		return start_date;
	}

	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}

	public Timestamp getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Timestamp end_date) {
		this.end_date = end_date;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
	
}
