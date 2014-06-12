package com.artivisi.belajar.dao;

import com.artivisi.belajar.domain.User;
import com.artivisi.belajar.domain.UserPassword;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
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
    
    public List<UserPassword> cariSemuaUserPassword(Integer start, Integer rows){
        return sessionFactory.getCurrentSession()
                .createQuery("select up from UserPassword up ")
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
    }
    
}
