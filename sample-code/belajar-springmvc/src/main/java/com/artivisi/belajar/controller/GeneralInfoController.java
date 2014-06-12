package com.artivisi.belajar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GeneralInfoController {
	@RequestMapping("config/generalinfo/list")
    public ModelAndView list(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        ModelAndView mm = new ModelAndView();
        return mm;
    }
	@RequestMapping("config/generalinfo/form")
    public ModelAndView form(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        ModelAndView mm = new ModelAndView();
        return mm;
    }
	@RequestMapping("config/generalinfo/view")
    public ModelAndView view(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
        ModelAndView mm = new ModelAndView();
        return mm;
    }
}
