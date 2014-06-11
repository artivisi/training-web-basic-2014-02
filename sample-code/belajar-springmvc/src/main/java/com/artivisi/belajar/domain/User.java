package com.artivisi.belajar.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="m_user")
public class User {
    
    @Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @OneToOne(mappedBy = "user")
    private UserPassword password;
    
    private String fullname;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserActivity> daftarActivity = new ArrayList<UserActivity>();
    
    @ManyToMany
         @JoinTable(
                 name = "m_user_roles",
                 joinColumns = @JoinColumn(name = "user_id"),
                 inverseJoinColumns = @JoinColumn(name = "roles_id")
         )
	private Set<Roles> daftarRole = new HashSet<Roles>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserPassword getPassword() {
        return password;
    }

    public void setPassword(UserPassword password) {
        this.password = password;
    }

    public List<UserActivity> getDaftarActivity() {
        return daftarActivity;
    }

    public void setDaftarActivity(List<UserActivity> daftarActivity) {
        this.daftarActivity = daftarActivity;
    }

    public Set<Roles> getDaftarRole() {
        return daftarRole;
    }

    public void setDaftarRole(Set<Roles> daftarRole) {
        this.daftarRole = daftarRole;
    }
    
}
