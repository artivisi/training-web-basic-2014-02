package com.artivisi.belajar.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocDemo {
    public static void main(String[] args) {
        // load file xml spring
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        
        // ambil object dari spring container
        Customer c = (Customer) ctx.getBean(Customer.class);
        
        // tampilkan
        System.out.println("Nama : "+c.getNama());
        System.out.println("Email : "+c.getEmail());
        System.out.println("Alamat Rumah : "+c.getRumah().getJalan());
        System.out.println("Alamat Kantor : "+c.getKantor().getJalan());
    }
}
