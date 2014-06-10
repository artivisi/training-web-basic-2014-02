package com.artivisi.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_roles")
public class Roles {

	 @Id @GeneratedValue(generator = "system-uuid")
	 @GenericGenerator(name = "system-uuid", strategy = "uuid2")
	 @Column(name="roles_id")
	 private String rolesId;
	
	 @Column(nullable = false, unique = true, name="role_name")	 
	 private String roleName;	 
	 
	
}
