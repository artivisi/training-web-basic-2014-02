package com.artivisi.belajar.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewsController {
	@RequestMapping("/config/news/form")
    public ModelAndView form(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        System.out.println("Menjalankan method form");
        ModelAndView mm = new ModelAndView();
        
        String pesan = "Anyong ";
        
        if(nama != null) {
            pesan += nama;
        } else {
            pesan += "Haseo form";
        }
        
        if(template != null){
            mm.setViewName(template);
        }
        
        mm.addObject("waktu", new Date());
        mm.addObject("pesan", pesan);
        
        return mm;
    }
	
	@RequestMapping("/config/news/view")
    public ModelAndView view(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        System.out.println("Menjalankan method view");
        ModelAndView mm = new ModelAndView();
        
        String pesan = "Anyong ";
        
        if(nama != null) {
            pesan += nama;
        } else {
            pesan += "Haseo view";
        }
        
        if(template != null){
            mm.setViewName(template);
        }
        
        mm.addObject("waktu", new Date());
        mm.addObject("pesan", pesan);
        
        return mm;
    }
	
	@RequestMapping("/config/news/list")
    public ModelAndView list(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        System.out.println("Menjalankan method list");
        ModelAndView mm = new ModelAndView();
        
        String pesan = "Anyong ";
        
        if(nama != null) {
            pesan += nama;
        } else {
            pesan += "Haseo list";
        }
        
        if(template != null){
            mm.setViewName(template);
        }
        
        mm.addObject("waktu", new Date());
        mm.addObject("pesan", pesan);
        
        return mm;
    }


}
