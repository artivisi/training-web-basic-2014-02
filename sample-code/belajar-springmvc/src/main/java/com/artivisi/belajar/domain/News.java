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
    
    @Column(nullable = false, unique = false)
    private Date news_date;
    
    @Column(nullable = false, unique = true)
    private String news_code;
    
    @Column(nullable = false, unique = false)
    private String news_desc;
    
    @Column(nullable = false, unique = false)
    private String news_createuser;
    
    @Column(nullable = false, unique = false)
    private Date news_createdate;
}
