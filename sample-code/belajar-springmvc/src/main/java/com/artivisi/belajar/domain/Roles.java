package com.artivisi.belajar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_roles")
public class Roles {

	 @Id @GeneratedValue(generator = "system-uuid")
	    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
	 private String roles_id;
	
	
	
}
