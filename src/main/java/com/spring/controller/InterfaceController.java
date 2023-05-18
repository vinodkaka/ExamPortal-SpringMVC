package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ExamDao;
import com.spring.DAO.QuestionDao;
import com.spring.DAO.ReportDao;
import com.spring.DAO.StudentDao;
import com.spring.model.Exam;
import com.spring.model.Question;
import com.spring.model.Student;

@Controller
public class InterfaceController {

	@RequestMapping("/admin")
	public String admin() {
		System.out.println("vinod");
		return "Admin";
	}

	@RequestMapping("/student")
	public String student() {
		return "Student";
	}
	
//	@RequestMapping("/vinod")
//	public String vinod() {
//		return "Admin";
//	}

	
	
}
