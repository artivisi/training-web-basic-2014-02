package com.artivisi.belajar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.artivisi.belajar.dao.GeneralInfoDao;
import com.artivisi.belajar.domain.General_Info;

@Controller
public class GeneralInfoController {
	@Autowired 
	private GeneralInfoDao generalInfoDao;
	
	
	@RequestMapping("config/generalinfo/list")
    public ModelAndView list(@RequestParam(required = false) String nama, @RequestParam(required = false)String template){
		ModelAndView mm = new ModelAndView();
		List<General_Info> generalinfo = generalInfoDao.cariSemuaInfo(0, 10);  
		
		System.out.println("general info total : " + generalinfo.size());
		mm.addObject("generalInfoList", generalinfo);
		mm.addObject("totInfo", generalinfo.size());
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
