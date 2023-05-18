package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="/studentlogin")
	public ModelAndView doLogin(@RequestParam("username") String uname,
					@RequestParam("password") String pwd)
	{
		//model.addAttribute("uname");
		//model.addAttribute("add");
		if(uname.equals("vinod")&pwd.equals("vinod@123")) {
			ModelAndView model=new ModelAndView();
			model.addObject("Uname", uname);
			model.addObject("password", pwd);
			model.setViewName("StudentInterface");
			return model;
		}else {
			ModelAndView model=new ModelAndView();
			model.setViewName("Invalid");
			return model;
		}

		
	}
}
