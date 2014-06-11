package com.artivisi.belajar.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.artivisi.belajar.domain.General_Info;
import com.artivisi.belajar.domain.User;

@Repository
public class GeneralInfoDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	public void save(General_Info g){
        sessionFactory.getCurrentSession().saveOrUpdate(g);
    }
	public void delete(General_Info g){
        sessionFactory.getCurrentSession().delete(g);
    }
	public General_Info cariById(String id){
        return (General_Info) sessionFactory.getCurrentSession().get(General_Info.class, id);
    }
	
	public List<General_Info> cariSemuaInfo(Integer start, Integer rows){
        return sessionFactory.getCurrentSession()
                .createQuery("select g from General_Info g order by g.infoName")
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
    }
	public General_Info cariByInfoname(String Infoname){
        return (General_Info) sessionFactory.getCurrentSession()
                .createQuery("select g from General_Info g where g.infoName = :uname ")
                .setParameter("uname", Infoname)
                .uniqueResult();
    }
}
