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

import com.artivisi.belajar.domain.General_Info;
import com.artivisi.belajar.domain.User;
import com.artivisi.belajar.domain.UserPassword;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
@Transactional(readOnly = true)
public class GeneralInfoDaoTest {
	@Autowired private GeneralInfoDao GeneralInfoDao;
	
	@Test
    public void testCariById(){
        // cari user yang ada di sample data
        General_Info info1 = GeneralInfoDao.cariById("endy");
        Assert.assertNotNull(info1);
        
        // cari user yang tidak ada
        Assert.assertNull(GeneralInfoDao.cariById("123"));
    }
	@Test
    public void testCariSemua(){
        List<General_Info> hasil = GeneralInfoDao.cariSemuaInfo(0, 100);
        System.out.println("Hasil : "+hasil.size());
        Assert.assertTrue(hasil.size() == 3);
        General_Info u = hasil.get(0);
        Assert.assertEquals("adi", u.getInfoName());
        
        
        Assert.assertTrue(GeneralInfoDao.cariSemuaInfo(0, 1).size() == 1);
    }
	
	@Test
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void testSaveUpdateDelete(){
        General_Info x = new General_Info();
        x.setInfoName("anton");
        x.setInfoLink("sample link anton");
        GeneralInfoDao.save(x);
        Assert.assertNotNull(x.getInfoId());
        System.out.println("ID : "+x.getInfoId());
        
        General_Info xx = GeneralInfoDao.cariById(x.getInfoId());
        Assert.assertNotNull(xx);
        Assert.assertEquals("anton", xx.getInfoName());
        
        GeneralInfoDao.delete(xx);
        Assert.assertNull(GeneralInfoDao.cariById(x.getInfoId()));
        
    }
}
