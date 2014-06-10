package com.artivisi.belajar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_menu") 
public class Menu {
	@Id @GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
        @Column(name = "menu_id")
	private String menuId;
	
	@Column(name="menu_name", nullable=false, length=100)
	private String menuName;
	
	@Column(name="menu_description", length=300)
	private String menuDescription;
	
	@Column(name="create_by", nullable=false)
	private String createBy;
	
        @Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
}
