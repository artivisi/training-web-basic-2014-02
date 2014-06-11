package com.artivisi.belajar.dao;

import java.sql.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.belajar.domain.UserActivity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aplikasi.xml")
@Transactional(readOnly = true)

public class UserActivityDaoTest {
	@Autowired 
	private UserActivityDao userActivityDao;
	
	@Test
	public void testCariById(){
		System.out.println("Cari by ID");
		UserActivity userActivity = userActivityDao.cariById("1");
		Assert.assertNotNull(userActivity.getActivityId());
		
		Assert.assertNull(userActivityDao.cariById("xxx"));
	}
	
	
	@Test 
	public void testCariSemua(){
		System.out.println("Cari semua");
		List<UserActivity> listActivity = userActivityDao.cariSemuaActivity(0, 3);
		System.out.println("--------Hasil----- : " + listActivity.size());
		Assert.assertTrue(listActivity.size()==3);
		UserActivity userActivity = listActivity.get(0);
		Assert.assertEquals("login", userActivity.getUserActivity());
		Assert.assertTrue(userActivityDao.cariSemuaActivity(0, 3).size()==3);
	}
	
	@Test
	public void cariActivityByPeriod(){
		
		List<UserActivity> listActivity = userActivityDao.cariByActivityDate(Date.valueOf("2014-06-11"), Date.valueOf("2014-06-12"));
		System.out.println("--------Activity by date result : " + listActivity.size());
		
	}
	
}
