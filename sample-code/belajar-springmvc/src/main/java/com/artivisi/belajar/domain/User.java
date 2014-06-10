package com.artivisi.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="m_user")
public class User {
    
    @Id @GeneratedValue
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable = false)
    private String password;
    private String fullname;
    
    @Column(nullable = false, unique = true)
    private String email;
}
