package com.artivisi.belajar.controller;

import java.security.Principal;
import java.util.Date;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HaloController {
    
    @RequestMapping("/halo")
    public ModelAndView halo(@RequestParam(required = false) String nama, 
            @RequestParam(required = false)String template, 
            @AuthenticationPrincipal Authentication currentUser){
        System.out.println("Menjalankan method halo");
        ModelAndView mm = new ModelAndView();
        
        String pesan = "Hello ";
        
        if(nama != null) {
            pesan += nama;
        } else {
            pesan += "World";
        }
        
        if(template != null){
            mm.setViewName(template);
        }
        
        mm.addObject("waktu", new Date());
        mm.addObject("pesan", pesan);
        if(currentUser != null){
            mm.addObject("username", currentUser.getName());
            mm.addObject("permissions", currentUser.getAuthorities());
        }
        
        return mm;
    }
}
