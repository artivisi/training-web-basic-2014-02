package com.artivisi.belajar.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_roles")
public class Roles {

	 @Id @GeneratedValue(generator = "system-uuid")
	 @GenericGenerator(name = "system-uuid", strategy = "uuid2")
	 @Column(name="roles_id")
	 private String rolesId;
	
	 @Column(nullable = false, unique = true, name="role_name")	 
	 private String roleName;	 
	 
     @ManyToMany
     @JoinTable(
             name = "m_menu_roles",
     joinColumns = @JoinColumn(name = "roles_id"),
     inverseJoinColumns = @JoinColumn(name = "menu_id")
     )
	 private List<Menu> daftarMenu = new ArrayList<Menu>();
	
	 public String getRolesId() {
		return rolesId;
	 }
	
	 public void setRolesId(String rolesId) {
		this.rolesId = rolesId;
	 }
	
	 public String getRoleName() {
		return roleName;
	 }
	
	 public void setRoleName(String roleName) {
		this.roleName = roleName;
	 }
	
	 public List<Menu> getDaftarMenu() {
		return daftarMenu;
	 }
	
	 public void setDaftarMenu(List<Menu> daftarMenu) {
		this.daftarMenu = daftarMenu;
	 }
         
         
        
}
