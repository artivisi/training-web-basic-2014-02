package com.artivisi.belajar.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.artivisi.belajar.dao.RolesDao;
import com.artivisi.belajar.domain.Roles;




@Controller
public class RolesController {
	

    @RequestMapping("/config/roles/list")
    public ModelAndView getList(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        
        ModelAndView mm = new ModelAndView();
        
                
        return mm;
    }
    
    


    @RequestMapping("/config/roles/form")
    public ModelAndView getForm(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
    
        ModelAndView mm = new ModelAndView();        
                
        return mm;
    }
    
    
    @RequestMapping("/config/roles/view")
    public ModelAndView getView(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
      
        ModelAndView mm = new ModelAndView();        
                
        return mm;
    }
    

}
