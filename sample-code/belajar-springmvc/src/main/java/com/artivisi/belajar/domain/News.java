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
	@Column(name = "news_id")
    private String newsId;
    
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

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String string) {
		this.newsId = string;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public String getNewsCode() {
		return newsCode;
	}

	public void setNewsCode(String newsCode) {
		this.newsCode = newsCode;
	}

	public String getNewsDesc() {
		return newsDesc;
	}

	public void setNewsDesc(String newsDesc) {
		this.newsDesc = newsDesc;
	}

	public String getNewsCreateUser() {
		return newsCreateUser;
	}

	public void setNewsCreateUser(String newsCreateUser) {
		this.newsCreateUser = newsCreateUser;
	}

	public Date getNewsCreateDate() {
		return newsCreateDate;
	}

	public void setNewsCreateDate(Date newsCreateDate) {
		this.newsCreateDate = newsCreateDate;
	}
    
    
}
