package com.artivisi.belajar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.artivisi.belajar.dao.UserDao;
import com.artivisi.belajar.domain.User;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("titleForm")
public class UserController {
	@Autowired private UserDao userDao;
	
	@RequestMapping("/config/user/list")
	public ModelAndView configUserList(@RequestParam (required=false) Integer start, @RequestParam (required=false) Integer rows) {
		ModelAndView mm = new ModelAndView();
		if(start==null) start = 0; if(rows==null) rows = 100;
		List<User> lUser = userDao.cariSemuaUser(start, rows);
		mm.addObject("lUser", lUser);
		mm.addObject("totUser", lUser.size());
		return mm;
	}
	
	@RequestMapping(value = "/config/user/form", method = RequestMethod.GET)
	public ModelAndView configUserForm(@RequestParam (required=false) Integer type, 
                @RequestParam (required=false) String id) {
		ModelAndView mm = new ModelAndView();
		String titleForm = "Add User";
		if (type==1) {
			titleForm = "Add User";
		} else if(type==2) {
			titleForm = "Edit User";
		}
		
		mm.addObject("titleForm", titleForm);
		mm.addObject("uid", id);
                System.out.println("UID : "+id);
                User u = userDao.cariById(id);
                if(u == null){
                    u = new User();
                }
                
                System.out.println("ID : "+u.getId());
                
		mm.addObject("user", u);
		return mm;
	}
        
	@RequestMapping(value = "/config/user/form", method = RequestMethod.POST)
        public String prosesUserForm(@ModelAttribute @Valid User u, BindingResult errors, SessionStatus status){
            System.out.println("Username : "+u.getUsername());
            System.out.println("Fullname : "+u.getFullname());
            System.out.println("Email : "+u.getEmail());
            
            if(errors.hasErrors()) {
                return "/config/user/form";
            }
            
            userDao.save(u);
            status.setComplete();
            return "redirect:list";
        }
	
	@RequestMapping("/config/user/view")
	public ModelAndView configUserView() {
		ModelAndView mm = new ModelAndView();
		
		return mm;
	}
}
