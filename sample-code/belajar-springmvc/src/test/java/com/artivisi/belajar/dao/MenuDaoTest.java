package com.artivisi.belajar.dao;

import java.sql.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.belajar.domain.Menu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
@Transactional(readOnly = true)
public class MenuDaoTest {

	@Autowired private MenuDao menuDao;
	
	//Catatan: untuk semua transaksi insert update delete akan di-rollback jika dilakukan di JUnitTest
	
	@Test
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void testSaveMenu() {
		Menu m = new Menu();
		m.setMenuName("News");
		m.setMenuDescription("Fourth Page");
		m.setCreateBy("John");
		m.setCreateDate(Date.valueOf("2014-06-11"));
		menuDao.saveMenu(m);
		
		Assert.assertNotNull(m.getMenuId());
		System.out.println("menuID : " + m.getMenuId());
	}
	
	@Test
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void testUpdateMenuAndCariMenuById() {
		Menu m = new Menu();
		m.setMenuName("News");
		m.setMenuDescription("Fourth Page");
		m.setCreateBy("John");
		m.setCreateDate(Date.valueOf("2014-06-11"));
		menuDao.saveMenu(m);
		
		Assert.assertNotNull(m.getMenuId());
		System.out.println("menuID : " + m.getMenuId());
		
		m.setMenuName("News from Admin");
		menuDao.saveMenu(m);
		
		Menu m2 = menuDao.cariMenuById(m.getMenuId());
		Assert.assertNotNull(m2);
		Assert.assertEquals("News from Admin", m.getMenuName());
	}
	
	@Test
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void testDeleteMenu() {
		Menu m = new Menu();
		m.setMenuName("Old News");
		m.setMenuDescription("Fourth Page");
		m.setCreateBy("John");
		m.setCreateDate(Date.valueOf("2014-06-11"));
		menuDao.saveMenu(m);
		
		Assert.assertNotNull(m.getMenuId());
		System.out.println("menuID : " + m.getMenuId());
				
		menuDao.deleteMenu(m);
		Assert.assertNull(menuDao.cariMenuById(m.getMenuId()));
	}

	@Test
    public void testCariSemuaMenu(){
        List<Menu> hasil = menuDao.cariSemuaMenu(0, 100);
        System.out.println("Hasil Semua Menu : "+hasil.size());
        
        Assert.assertTrue(hasil.size() == 3);
        Menu m = hasil.get(0);
        Assert.assertEquals("Login", m.getMenuName());               
        Assert.assertTrue(menuDao.cariSemuaMenu(0, 1).size() == 1);
    }
	
	@Test
    public void testCariMenuByName(){
		String menuName = "Login";
        Menu m = menuDao.cariMenuByName(menuName);                       
        Assert.assertEquals("First Page", m.getMenuDescription());                       
    }
	
	@Test
    public void testCariMenuByDescription(){
        List<Menu> hasil = menuDao.cariMenuByDescription("page");
        System.out.println("Hasil Description : "+hasil.size());
        
        Assert.assertTrue(hasil.size() == 3);
        Menu m = hasil.get(0);
        Assert.assertEquals("First Page", m.getMenuDescription());                       
    }
}
