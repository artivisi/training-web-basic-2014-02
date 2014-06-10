package com.artivisi.belajar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_news")
public class News {


	@Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String news_id;
    
    @Column(nullable = false, unique = false, name = "news_date")
    private Date newsDate;
    
    @Column(nullable = false, unique = true, name = "news_code")
    private String newsCode;
    
    @Column(nullable = false, unique = false, name = "news_desc")
    private String newsDesc;
    
    @Column(nullable = false, unique = false,name = "news_createuser")
    private String newsCreateUser;
    
    @Column(nullable = false, unique = false,name = "news_createdate")
    private Date newsCreateDate;
}
