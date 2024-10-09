package com.loopino.loopino.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import com.loopino.loopino.enums.ReactionType;

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
public class PostReaction {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID post_reaction_id;
	
	@OneToMany
	@JoinColumn(name= "post_id")
	private Post post_id; 
	
	@OneToMany
	@JoinColumn(name= "user_id")
	private User user_id;
	
	@Column(nullable = false)
	private ReactionType reaction_type;
	
	@CreationTimestamp
    @Column( updatable = false)
	private Timestamp created_at;

	public UUID getPost_reaction_id() {
		return post_reaction_id;
	}

	public void setPost_reaction_id(UUID post_reaction_id) {
		this.post_reaction_id = post_reaction_id;
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

	public ReactionType getReaction_type() {
		return reaction_type;
	}

	public void setReaction_type(ReactionType reaction_type) {
		this.reaction_type = reaction_type;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
	
}
