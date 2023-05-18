package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.spring.model.Report;
import com.spring.model.Student;

@Controller
public class AdminInterfaceController {

	@Autowired
	ExamDao examDao;
	
	@Autowired
	QuestionDao questiondao;
	
	@Autowired
	StudentDao studentdao;
	
	@Autowired
	ReportDao reportdao;
	
	@RequestMapping(value="/adminlogin")
	public ModelAndView doLogin(@RequestParam("username") String uname,
					@RequestParam("password") String pwd)
	{
		
		if(uname.equals("vinod")&pwd.equals("vinod@123")) {
			ModelAndView model=new ModelAndView();
			model.addObject("Uname", uname);
			model.addObject("password", pwd);
			model.setViewName("AdminInterface");
			return model;
		}else {
			ModelAndView model=new ModelAndView();
			model.setViewName("Invalid");
			return model;
		}

		
	}
	
	@RequestMapping(value="/AddExam")
	public String AddExam() {
		return "AddExam";
	}
	
	@RequestMapping(value="/UpdateExam")
	public ModelAndView UpdateExam() {
		 ModelAndView m = new ModelAndView();
		  m.addObject("exams", examDao.getAllExams());
	  m.setViewName("DeleteExam"); 
	  return m;
			}
	
	@RequestMapping(value="/updateexams")
	public String UpdateExams() {
		return "AddExam";
	}
	
	

	 @RequestMapping("/DeleteExam")
	  public ModelAndView DeleteExam(){ 
		  ModelAndView m = new ModelAndView();
		  m.addObject("exams", examDao.getAllExams());
	  m.setViewName("DeleteExam"); 
	  return m; 
	  }

	@RequestMapping(value="/GetExamById")
	public String GetExamById() {
		return "GetExamById";
	}

	

	
	  @RequestMapping("/GetAllExams")
	  public ModelAndView allflight(){ 
		  ModelAndView m = new ModelAndView();
		  m.addObject("exams", examDao.getAllExams());
	  m.setViewName("GetAllExams"); 
	  return m; 
	  }
	 

	@RequestMapping(value="/AddQuestions")
	public String AddQuestions() {
		return "AddQuestions";
	}

	@RequestMapping(value="/updatequestion")
	public String UpdateQuestions() {
		return "AddQuestions";
	}

	@RequestMapping(value="/UpdateQuestions")
	public ModelAndView updatequestions() {
		 ModelAndView m = new ModelAndView();
		 m.addObject("questions", questiondao.getquestions());
		 m.setViewName("DeleteQuestion");
		return m;
	}
	
	@RequestMapping(value="/DeleteQuestion")
	public ModelAndView DeleteQuestion() {
		 ModelAndView m = new ModelAndView();
		 m.addObject("questions", questiondao.getquestions());
		 m.setViewName("DeleteQuestion");
		return m;
	}

	

	
	@RequestMapping(value="/GetAllQuestions")
	public ModelAndView GetAllQuestions() {
		  ModelAndView m = new ModelAndView();
		  m.addObject("questions", questiondao.getquestions());
	  m.setViewName("GetAllQuestions"); 
	  return m; 
	}

	@RequestMapping(value="/GetQuestionById")
	public String GetQuestionById() {
		return "GetQuestionById";
	}

	@RequestMapping(value="/AddStudent")
	public String AddStudent() {
		return "AddStudent";
	}

	@RequestMapping(value="/UpdateStudent")
	public ModelAndView UpdateStudent() {
		 ModelAndView m = new ModelAndView();
		 m.addObject("students", studentdao.getstudents());
		 m.setViewName("DeleteStudent");
		return m;
	}
	
	@RequestMapping(value="/updatestudent")
	public String updatestudent() {
		return "AddStudent";
	}

	@RequestMapping(value="/DeleteStudent")
	public ModelAndView DeleteStudent() {
		 ModelAndView m = new ModelAndView();
		 m.addObject("students", studentdao.getstudents());
		 m.setViewName("DeleteStudent");
		return m;
	}

	
	@RequestMapping(value="/GetAllStudents")
	public ModelAndView GetAllStudents() {
		ModelAndView m=new ModelAndView();
		m.addObject("students",studentdao.getstudents());
		m.setViewName("GetAllStudents");
		return m;
	}

	@RequestMapping(value="/GetStudentById")
	public String GetStudentById() {
		return "GetStudentById";
	}

	@RequestMapping(value="/GetAllReports")
	public ModelAndView GetAllReports() {
		ModelAndView m=new ModelAndView();
		m.addObject("reports",reportdao.getreports());
		m.setViewName("GetAllReports");
		return m;
	}

	@RequestMapping(value="/GetReportByStudentId")
	public String GetReportByStudentId() {
		return "report";
	}
	
	@RequestMapping(value="/Exit")
	public String  Exit() {
		return "index";
	}
	
	@RequestMapping(value="/exam")
	public String writeexam() {
		System.out.println("inside write exam for fetching exam id");
		return "questionforexamid";
	}
}
