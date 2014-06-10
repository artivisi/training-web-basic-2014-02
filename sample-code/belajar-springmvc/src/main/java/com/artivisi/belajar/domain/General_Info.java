package com.artivisi.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_general_info")

public class General_Info {
	@Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String infoId;
	
	@Column(nullable = false)
    private String infoName;
	
	@Column(nullable = false)
	private String infoLink;
}