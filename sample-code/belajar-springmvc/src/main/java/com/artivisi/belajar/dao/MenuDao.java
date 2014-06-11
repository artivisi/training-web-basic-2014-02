package com.artivisi.belajar.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.belajar.domain.Menu;

@Repository
//@Transactional 
//Note: @Transactional jika ditaruh di class, maka semua transactional akan di implementasikan terhadap isi class tsb (per method)
public class MenuDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveMenu (Menu m){
		sessionFactory.getCurrentSession().saveOrUpdate(m);
	}
	
	public void deleteMenu (Menu m){
		sessionFactory.getCurrentSession().delete(m);
	}
	
	//Untuk mencari unique ID, gunakan method get
	public Menu cariMenuById (String menuId){
		return (Menu) sessionFactory.getCurrentSession().get(Menu.class, menuId);
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu> cariSemuaMenu(Integer start, Integer rows){
		return sessionFactory.getCurrentSession()
			.createQuery("select m from Menu m order by m.menuId")
			.setFirstResult(start)
			.setMaxResults(rows)
			.list(); //gunakan .list() untuk return > 1 row					
	}
	
	public Menu cariMenuByName (String menuName){
		return (Menu) sessionFactory.getCurrentSession()
		.createQuery("select m from Menu m where m.menuName = :mName")
		.setParameter("mName", menuName)
		.uniqueResult(); //gunakan .uniqueResult() untuk return 1 row
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu> cariMenuByDescription (String description){
		return sessionFactory.getCurrentSession()
		.createQuery("select m from Menu m where m.menuDescription like :mDescript order by m.menuId")
		.setParameter("mDescript", "%" + description + "%")
		.list();
	}
}
