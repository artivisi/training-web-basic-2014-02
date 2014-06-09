package com.artivisi.belajar.ioc;

import org.springframework.stereotype.Component;

// annotation yang diproses oleh Spring: @Controller, @Service, @Repository, @Component
@Component(value = "c")
public class Customer {
    private String nama = "endy";
    private String email = "endy@artivisi.com";
    
    private Alamat kantor;
    private Alamat rumah;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Alamat getKantor() {
        return kantor;
    }

    public void setKantor(Alamat kantor) {
        this.kantor = kantor;
    }

    public Alamat getRumah() {
        return rumah;
    }

    public void setRumah(Alamat rumah) {
        this.rumah = rumah;
    }
    
    
}
