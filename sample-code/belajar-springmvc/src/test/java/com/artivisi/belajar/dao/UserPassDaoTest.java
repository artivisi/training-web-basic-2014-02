package com.artivisi.belajar.dao;
import java.util.List;

import com.artivisi.belajar.domain.User;
import com.artivisi.belajar.domain.UserPassword;

import org.hibernate.Hibernate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.belajar.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
@Transactional(readOnly = true)
public class UserPassDaoTest {
	@Autowired private UserDao userDao;
    @Autowired private UserPasswordDao userPasswordDao;
    
    @Test
    public void testCariById(){
        // cari user yang ada di sample data
    	User u = userDao.cariById("endy");    	    	    	
        UserPassword endy = userPasswordDao.cariByUser(u);        
        Assert.assertNotNull(endy);       
        
        // cari user yang tidak ada
        Assert.assertNull( userDao.cariById("123"));
    }
    
    @Test
    public void testCariBySemua(){
        // cari user yang ada di sample data    	    	    	    
        List <UserPassword> endy = userPasswordDao.cariSemuaUserPassword(0, 10);       
        
        for (UserPassword userPassword : endy) {
        	//Hibernate.initialize(userPassword.getUser());
			System.out.println(userPassword.getUser().getUsername());
			System.out.println(userPassword.getPassword());
		}
        
        Assert.assertNotNull(endy);       
        
       
    }    
        
}
