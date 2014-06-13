package com.artivisi.belajar.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import com.artivisi.belajar.dao.RolesDao;
import com.artivisi.belajar.domain.Roles;
import com.artivisi.belajar.domain.User;




@Controller
@SessionAttributes("titleForm")

public class RolesController {
	
	
	@Autowired
    private RolesDao rolesDao;

    @RequestMapping("/config/roles/list")
    public ModelAndView getList(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        
    	ModelAndView mm = new ModelAndView();
    	  
    	List<Roles> roles = rolesDao.cariSemuaRoles(0, 100);
      
        
        mm.addObject("roleslist",roles);
                
        return mm;
    }    
    


    @RequestMapping(value= "/config/roles/form", method = RequestMethod.GET)
    public ModelAndView getForm(@RequestParam(required= true)int type, @RequestParam(required = false)String id){
    
    	ModelAndView mm = new ModelAndView();
		String titleForm = "Add Roles";
		if (type==1) {
			titleForm = "Add Roles";
		} else if(type==2) {
			titleForm = "Edit Roles";
		} 
		
		mm.addObject("titleForm", titleForm);
		mm.addObject("rolesId", id);		
        
        Roles u = rolesDao.cariById(id);
        
        if (type==3) {  
        	
        	System.out.println(" Roles ID : "+u.getRolesId());
        	rolesDao.delete(u);
        	mm.setViewName("/config/roles/list");
        	
        } else {
        
	        if(u == null){
	            u = new Roles();
	        }
	                
	        System.out.println(" Roles ID : "+u.getRolesId());
	                
			mm.addObject("roles", u);
        }
        
		return mm;
    }
    
    
    @RequestMapping(value = "/config/roles/form", method = RequestMethod.POST)
    public String postForm(@ModelAttribute @Valid Roles u, BindingResult errors, SessionStatus status,HttpSession session){
        System.out.println("Rolesname : "+u.getRoleName());
        
        if(errors.hasErrors()) {
            return "/config/roles/form";
        }
        
        System.out.println("roles id : " + u.getRolesId());
        
        rolesDao.save(u);
        status.setComplete();
        return "redirect:list";
    }
    
    @RequestMapping("/config/roles/view")
    public ModelAndView getView(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
      
        ModelAndView mm = new ModelAndView();        
                
        return mm;
    }
    

}
