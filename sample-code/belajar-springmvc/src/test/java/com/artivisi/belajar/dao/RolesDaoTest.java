package com.artivisi.belajar.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.belajar.domain.Roles;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
@Transactional(readOnly = true)
public class RolesDaoTest {
	
	  @Autowired private RolesDao rolesDao;
	    
	    @Test
	    public void testCariById(){
	        // cari user yang ada di sample data
	        Roles r1 = rolesDao.cariById("r1");
	        Assert.assertNotNull(r1);
	        
	        // cari user yang tidak ada
	        Assert.assertNull(rolesDao.cariById("rx"));
	    }
	    
	    @Test
	    public void testCariSemua(){
	        List<Roles> hasil = rolesDao.cariSemuaRoles(0, 3);
	        System.out.println("Hasil : "+hasil.size());
	        Assert.assertTrue(hasil.size() == 3);
	        Roles u = hasil.get(0);
	        Assert.assertEquals("administrator", u.getRoleName());
	        
	        
	        Assert.assertTrue(rolesDao.cariSemuaRoles(0, 1).size() == 1);
	    }
	    
	    @Test
	    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	    public void testSaveUpdateDelete(){
	        Roles x = new Roles();
	        x.setRoleName("cao");
	        rolesDao.save(x);
	        
	        
	        Assert.assertNotNull(x.getRolesId());
	        System.out.println("ID : "+ x.getRolesId());
	        
	        x.setRoleName("soa");
	        rolesDao.save(x);
	        
	        Roles xx = rolesDao.cariById(x.getRolesId());
	        Assert.assertNotNull(xx);
	        Assert.assertEquals("soa", xx.getRoleName());
	        
	        rolesDao.delete(xx);
	        Assert.assertNull(rolesDao.cariById(x.getRolesId()));
	        
	    }
}
