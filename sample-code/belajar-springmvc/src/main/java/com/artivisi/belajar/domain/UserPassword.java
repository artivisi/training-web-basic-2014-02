package com.artivisi.belajar.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity @Table(name="m_user_password")
public class UserPassword implements Serializable {
    
	@Id @Column(name="user_id")
	private String id;
	
    @OneToOne @PrimaryKeyJoinColumn
    private User user;
    
    @Column(nullable = false, name = "user_password")
    private String password;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
