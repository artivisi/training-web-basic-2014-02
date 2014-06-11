package com.artivisi.belajar.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.artivisi.belajar.domain.Roles;



@Repository
public class RolesDao {
	
	  @Autowired
	    private SessionFactory sessionFactory;
	    
	    public void save(Roles u){
	        sessionFactory.getCurrentSession().saveOrUpdate(u);
	    }
	    
	    public void delete(Roles u){
	        sessionFactory.getCurrentSession().delete(u);
	    }
	    
	    public Roles cariById(String id){
	        return (Roles) sessionFactory.getCurrentSession().get(Roles.class, id);
	    }
	    
	    public List<Roles> cariSemuaRoles(Integer start, Integer rows){
	        return sessionFactory.getCurrentSession()
	                .createQuery("select u from Roles u order by u.roleName")
	                .setFirstResult(start)
	                .setMaxResults(rows)
	                .list();
	    }
	    
	    public Roles cariByRolesName(String roleName){
	        return (Roles) sessionFactory.getCurrentSession()
	                .createQuery("select u from Roles u where u.roleName = :rname ")
	                .setParameter("rname", roleName)
	                .uniqueResult();
	    }	    
}
