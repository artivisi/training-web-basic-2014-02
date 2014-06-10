package com.artivisi.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_user_password")
public class UserPassword {
    
    @Id 	
	@Column(nullable = false)
    private String user_id;
    
    @Column(nullable = false)
    private String user_password;
}
