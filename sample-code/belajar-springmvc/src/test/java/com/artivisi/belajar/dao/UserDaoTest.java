package com.artivisi.belajar.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
public class UserDaoTest {
    
    @Test
    public void testHello(){
        System.out.println("Hello World");
    }
}
