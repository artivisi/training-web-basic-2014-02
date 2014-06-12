package com.artivisi.belajar.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HaloController {
    
    @RequestMapping("/halo")
    public ModelMap halo(){
        System.out.println("Menjalankan method halo");
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("waktu", new Date());
        
        return mm;
    }
}
