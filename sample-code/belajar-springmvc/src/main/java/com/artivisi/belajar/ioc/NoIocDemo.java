package com.artivisi.belajar.ioc;

public class NoIocDemo {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setNama("Endy Muhardin");
        c.setEmail("endy.muhardin@gmail.com");
        
        // tampilkan
        System.out.println("Nama : "+c.getNama());
        System.out.println("Email : "+c.getEmail());
    }
}
