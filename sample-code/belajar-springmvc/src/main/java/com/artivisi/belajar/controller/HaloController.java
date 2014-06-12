package com.artivisi.belajar.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HaloController {
    
    @RequestMapping("/halo")
    public ModelMap halo(@RequestParam(required = false) String nama){
        System.out.println("Menjalankan method halo");
        ModelMap mm = new ModelMap();
        
        String pesan = "Hello ";
        
        if(nama != null) {
            pesan += nama;
        } else {
            pesan += "World";
        }
        
        mm.addAttribute("waktu", new Date());
        mm.addAttribute("pesan", pesan);
        
        return mm;
    }
}
