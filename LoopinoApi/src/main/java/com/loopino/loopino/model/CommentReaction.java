package com.loopino.loopino.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.loopino.loopino.enums.ReactionType;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class CommentReaction {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(nullable = false)
	private UUID post_reaction_id;
	
	@OneToMany
	@JoinColumn(name= "comment_id")
	private Comment comment_id; 
	
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

	public Comment getComment_id() {
		return comment_id;
	}

	public void setComment_id(Comment comment_id) {
		this.comment_id = comment_id;
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
