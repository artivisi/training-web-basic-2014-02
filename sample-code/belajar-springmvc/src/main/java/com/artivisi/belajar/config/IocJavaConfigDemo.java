package com.artivisi.belajar.config;

import com.artivisi.belajar.ioc.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocJavaConfigDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(KonfigurasiAplikasi.class);
        // ambil object dari spring container
        Customer c = (Customer) ctx.getBean(Customer.class);
        
        // tampilkan
        System.out.println("Nama : "+c.getNama());
        System.out.println("Email : "+c.getEmail());
        System.out.println("Alamat Rumah : "+c.getRumah().getJalan());
        System.out.println("Alamat Kantor : "+c.getKantor().getJalan());
    }
}
