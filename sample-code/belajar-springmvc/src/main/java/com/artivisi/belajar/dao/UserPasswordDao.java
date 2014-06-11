package com.artivisi.belajar.dao;

import com.artivisi.belajar.domain.User;
import com.artivisi.belajar.domain.UserPassword;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserPasswordDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(UserPassword u){
        sessionFactory.getCurrentSession().saveOrUpdate(u);
    }
    
    public void delete(UserPassword u){
        sessionFactory.getCurrentSession().delete(u);
    }
    
    public UserPassword cariByUser(User u){
        return (UserPassword) sessionFactory.getCurrentSession().get(UserPassword.class, u.getId());
    }
    
    public List<User> cariSemuaUserPassword(Integer start, Integer rows){
        return sessionFactory.getCurrentSession()
                .createQuery("select u from UserPassword u order by u.user")
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
    }
    
}
