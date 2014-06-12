package com.artivisi.belajar.dao;

import com.artivisi.belajar.domain.News;
import com.artivisi.belajar.domain.User;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Transactional 
@Repository
public class NewsDao {
	 @Autowired
	    private SessionFactory sessionFactory;
	    
	    public void save(News n){
	        sessionFactory.getCurrentSession().saveOrUpdate(n);
	    }
	    
	    public void delete(News n){
	        sessionFactory.getCurrentSession().delete(n);
	    }
	    
	    public News cariById(String NewsId){
	        return (News) sessionFactory.getCurrentSession().get(News.class, NewsId);
	    }
	    
	    public List<News> cariSemuaNews(Integer start, Integer rows){
	        return sessionFactory.getCurrentSession()
	                .createQuery("select n from News n order by n.newsCode")
	                .setFirstResult(start)
	                .setMaxResults(rows)
	                .list();
	    }
	    
	    public List<News> cariByCrUser(String username){
	        return sessionFactory.getCurrentSession()
	                .createQuery("select n from News n where n.newsCreateUser = :uname ")
	                .setParameter("uname", username)
	                .list();
	    }
	    
	    public News cariByCode(String Code){
	        return (News) sessionFactory.getCurrentSession()
	                .createQuery("select n from News n where n.newsCode = :code ")
	                .setParameter("code", Code)
	                .uniqueResult();
	    }
	    
	    
	    public List<News> cariByDate(Date Tgl){
	        return sessionFactory.getCurrentSession()
	                .createQuery("select n from News n where n.newsDate = :tgl order by n.newsDate")
	                .setParameter("tgl", Tgl)
	                .list();
	    }
	    
	    public List<News> cariByDesc(String Desc){
	        return sessionFactory.getCurrentSession()
	                .createQuery("select n from News n where lower(n.newsDesc) like :desc order by n.newsDesc")
	                .setParameter("desc", "%"+Desc.toLowerCase()+"%")
	                .list();
	    } 
	    
	    
}
