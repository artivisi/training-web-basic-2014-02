package com.artivisi.belajar.dao;

import com.artivisi.belajar.domain.User;
import com.artivisi.belajar.domain.UserPassword;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
public class UserDaoTest {
    
    @Autowired private UserDao userDao;
    
    @Test
    public void testCariById(){
        // cari user yang ada di sample data
        User endy = userDao.cariById("endy");
        Assert.assertNotNull(endy);
        
        // cari user yang tidak ada
        Assert.assertNull(userDao.cariById("123"));
    }
    
    @Test
    public void testCariSemua(){
        List<User> hasil = userDao.cariSemuaUser(0, 100);
        System.out.println("Hasil : "+hasil.size());
        Assert.assertTrue(hasil.size() == 3);
        User u = hasil.get(0);
        Assert.assertEquals("adi", u.getUsername());
        
        
        Assert.assertTrue(userDao.cariSemuaUser(0, 1).size() == 1);
    }
    
    @Test
    public void testSaveUpdateDelete(){
        User x = new User();
        x.setUsername("anton");
        UserPassword password = new UserPassword();
        password.setPassword("123");
        password.setUser(x);
        x.setPassword(password);
        x.setEmail("anton@artivisi.com");
        
        userDao.save(x);
        Assert.assertNotNull(x.getId());
        System.out.println("ID : "+x.getId());
        
        x.setFullname("Anton");
        userDao.save(x);
        
        User xx = userDao.cariById(x.getId());
        Assert.assertNotNull(xx);
        Assert.assertEquals("Anton", xx.getFullname());
        
        userDao.delete(xx);
        Assert.assertNull(userDao.cariById(x.getId()));
        
    }
}
