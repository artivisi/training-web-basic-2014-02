package com.artivisi.belajar.dao;

import com.artivisi.belajar.domain.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(User u){
        sessionFactory.getCurrentSession().saveOrUpdate(u);
    }
    
    public void delete(User u){
        sessionFactory.getCurrentSession().delete(u);
    }
    
    public User cariById(String id){
        if(id == null || id.trim().length() < 1) {
            return null;
        }
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }
    
    public List<User> cariSemuaUser(Integer start, Integer rows, String sort, String dir){
        if(sort == null || sort.trim().length() < 1) {
            sort = "username";
        }
        
        if(dir == null || dir.trim().length() < 1){
            dir = "asc";
        }
        return sessionFactory.getCurrentSession()
                .createQuery("select u from User u order by u."+sort+" "+dir)
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
    }
    
    public User cariByUsername(String username){
        return (User) sessionFactory.getCurrentSession()
                .createQuery("select u from User u where u.username = :uname ")
                .setParameter("uname", username)
                .uniqueResult();
    }
    
    public List<User> cariByFullname(String nama){
        return sessionFactory.getCurrentSession()
                .createQuery("select u from User u where lower(u.fullname) like :nama order by u.username")
                .setParameter("nama", "%"+nama.toLowerCase()+"%")
                .list();
    }

    public Long countSemuaUser() {
        return (Long) sessionFactory.getCurrentSession()
                .createQuery("select count(u) from User u")
                .uniqueResult();
    }
}
