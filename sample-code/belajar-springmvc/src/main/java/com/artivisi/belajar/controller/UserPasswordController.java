package com.artivisi.belajar.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.artivisi.belajar.dao.UserDao;
import com.artivisi.belajar.dao.UserPasswordDao;

@Controller
public class UserPasswordController {
	@Autowired private UserDao userDao;
    @Autowired private UserPasswordDao userPasswordDao;
    
    @RequestMapping("/config/userpassword/list")
    public ModelAndView halo(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        System.out.println("Menjalankan method user password");
        ModelAndView mm = new ModelAndView();

        mm.addObject("listpassword", userPasswordDao.cariSemuaUserPassword(0, 10));
        
        return mm;
    }
}
