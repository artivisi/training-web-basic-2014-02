package com.artivisi.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="user_activity")
public class UserActivity {
	
	@Id @GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Column(name= "activity_id")
	private String activityId;
	
	@Column(nullable= false, name="user_id")
	private String userId;
	
	@Column(nullable= false, name="user_activity")
	private String userActivity;

	
	
}
