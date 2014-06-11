package com.artivisi.belajar.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.artivisi.belajar.domain.UserActivity;


@Repository
public class UserActivityDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(UserActivity a){
		sessionFactory.getCurrentSession().saveOrUpdate(a);
	}
	
	public void delete(UserActivity a){
		sessionFactory.getCurrentSession().delete(a);
	}
	
	public UserActivity cariById(String id){
		return (UserActivity) sessionFactory.getCurrentSession().get(UserActivity.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<UserActivity> cariSemuaActivity(Integer start, Integer rows){
		return sessionFactory.getCurrentSession()
				.createQuery("select u from UserActivity u order by u.activityId")
				.setFirstResult(start)
				.setMaxResults(rows)
				.list();
	}
	
	public UserActivity cariByUserActivity(String userActivity){
		return (UserActivity) sessionFactory.getCurrentSession()
				.createQuery("select u from UserActivity u where u.userActivity = :uactivity")
				.setParameter("uactivity", userActivity)
				.uniqueResult();
	}
	
	public List<UserActivity> cariByUserId(String userId){
		return sessionFactory.getCurrentSession()
				.createQuery("select u from UserActivity u where u.user = :user")
				.setParameter("user", userId)
				.list();
	}
	
}
