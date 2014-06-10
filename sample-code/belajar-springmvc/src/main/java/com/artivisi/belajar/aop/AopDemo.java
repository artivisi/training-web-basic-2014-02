package com.artivisi.belajar.aop;

import com.artivisi.belajar.ioc.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:aop.xml");
        Customer c = (Customer) ctx.getBean("c");
        
        System.out.println("Nama : "+c.getNama());
        System.out.println("Email : "+c.getEmail());
    }
}
