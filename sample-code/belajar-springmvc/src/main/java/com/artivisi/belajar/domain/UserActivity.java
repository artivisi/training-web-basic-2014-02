package com.artivisi.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="user_activity")
public class UserActivity {
	
	@Id
	@Column(nullable= false, name="user_id")
	private String userId;
	
	@Column(nullable= false, name="user_activity")
	private String userActivity;
	
}
