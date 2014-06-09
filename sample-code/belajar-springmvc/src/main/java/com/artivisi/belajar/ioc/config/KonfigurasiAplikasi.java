package com.artivisi.belajar.ioc.config;

import com.artivisi.belajar.ioc.Alamat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.artivisi.belajar.ioc")
public class KonfigurasiAplikasi {
    
    @Bean(name = "k")
    public Alamat alamatKantor(){
        Alamat a = new Alamat();
        a.setJalan("Jl. Gatot Subroto");
        a.setNomer("321");
        a.setKota("Jakarta Pusat");
        a.setProvinsi("DKI Jakarta");
        return a;
    }
    
    @Bean(name = "r")
    public Alamat alamatRumah(){
        Alamat a = new Alamat();
        a.setJalan("Jl. Sudirman");
        a.setNomer("123");
        a.setKota("Bogor");
        a.setProvinsi("Jawa Barat");
        return a;
    }
}
