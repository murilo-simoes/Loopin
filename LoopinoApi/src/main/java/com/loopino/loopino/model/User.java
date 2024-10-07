package com.loopino.loopino.model;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate(true)
@Table(name = "users")
public class User {

}
