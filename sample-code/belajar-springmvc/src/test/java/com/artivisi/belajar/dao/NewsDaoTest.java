package com.artivisi.belajar.dao;

import com.artivisi.belajar.domain.News;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
@Transactional(readOnly = true)
public class NewsDaoTest {
    
    @Autowired private NewsDao newsDao;
    
    @Test
    public void cariById(){
        // cari user yang ada di sample data
        News news1 = newsDao.cariById("1");
        Assert.assertNotNull(news1);
        
        // cari user yang tidak ada
        Assert.assertNull(newsDao.cariById("10"));
    }
    
    @Test
    public void cariSemuaNews(){
        List<News> hasil = newsDao.cariSemuaNews(0, 100);
        System.out.println("Hasil : "+hasil.size());
        Assert.assertTrue(hasil.size() == 5);
        News n = hasil.get(0);
        Assert.assertEquals("001", n.getNewsCode());
        
        
        Assert.assertTrue(newsDao.cariSemuaNews(0, 1).size() == 1);
    }
    
    @Test
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void testSaveUpdateDelete() throws Exception{
    	News x = new News();
        x.setNewsCode("006");
        Date tanggal = new SimpleDateFormat("yyyyMMdd").parse("20140611");
        x.setNewsCreateDate(tanggal);
        x.setNewsCreateUser("IMMAN");
        x.setNewsDate(tanggal);
        x.setNewsDesc("test doang");
        
        newsDao.save(x);
        Assert.assertNotNull(x.getNews_id());
        System.out.println("ID : "+x.getNews_id());
        
        x.setNewsCreateUser("FERRY");
        newsDao.save(x);
        
        News xx = newsDao.cariById(x.getNews_id());
        Assert.assertNotNull(xx);
        Assert.assertEquals("FERRY", xx.getNewsCreateUser());
        
        newsDao.delete(xx);
        Assert.assertNull(newsDao.cariById(x.getNews_id()));
        
    }
}
