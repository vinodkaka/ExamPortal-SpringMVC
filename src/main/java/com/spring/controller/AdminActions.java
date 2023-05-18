package com.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.DAO.ExamDao;
import com.spring.DAO.QuestionDao;
import com.spring.DAO.ReportDao;
import com.spring.DAO.StudentDao;
import com.spring.model.Exam;
import com.spring.model.Question;
import com.spring.model.Report;
import com.spring.model.Student;

@Controller
@Qualifier
public class AdminActions {

	@Autowired
	ExamDao examDao;
	
	@Autowired
	QuestionDao questiondao;
	
	@Autowired
	StudentDao studentdao;
	
	@Autowired
	ReportDao reportdao;
	
  
	@RequestMapping(value="/AddExams", method=RequestMethod.POST)
	public RedirectView addExam(@ModelAttribute Exam exam,HttpServletRequest requst) {
		System.out.println("exam added");
		RedirectView redirect=new RedirectView();
		examDao.addexam(exam);
		redirect.setUrl(requst.getContextPath()+"/AddExam");
		return redirect;
	}
		
	
	@RequestMapping(value="/deleteexams/{examId}")
	public String deleteexams(@PathVariable("examId") int id,HttpServletRequest requst) {
		examDao.deleteexam(examDao.getexambasedonid(id));
		System.out.println("exam deleted");
		return "redirect:/DeleteExam";
	}
	
	
	
@RequestMapping(value="/getbyid", method=RequestMethod.GET)
public ModelAndView getexamonid(@RequestParam("examId") int id,Model m) {
	ModelAndView mv=new ModelAndView();
	Exam exam=examDao.getexambasedonid(id);
	System.out.println(exam);
	mv.addObject("exam", exam);
	mv.setViewName("ShowExamById");
	return mv;
}
	





@RequestMapping(value="/addquestion", method=RequestMethod.POST)
public RedirectView addExams(@ModelAttribute Question question,HttpServletRequest requst) {
	System.out.println("question added");
	questiondao.addquestion(question);
	RedirectView redirect=new RedirectView();
	redirect.setUrl(requst.getContextPath()+"/AddQuestions");
	return redirect;
}

@RequestMapping(value="/deletequestion/{questionId}")
public String deletequestion(@PathVariable("questionId") int id,HttpServletRequest requst) {
	ModelAndView m = new ModelAndView();
	questiondao.deletequestion(questiondao.getquestionbasedonid(id));
	System.out.println("questondeleted");
	return "redirect:/DeleteQuestion";
}



//@RequestMapping(value="/getquestionbyid", method=RequestMethod.GET)
//public String getquestiononid(@RequestParam("questionId") int id,Model m) {
//	Question question=questiondao.getquestionbasedonid(id);
//	m.addAttribute("question", question);
//	return "GetAllQuestions";
//}

@RequestMapping(value="/getquestionbyid", method=RequestMethod.GET)
public ModelAndView getquestiononid(@RequestParam("questionId") int id) {
	ModelAndView m=new ModelAndView();
	Question question=questiondao.getquestionbasedonid(id);
	System.out.println(question);
	m.addObject("questions",question);
	m.setViewName("ShowQuestionById");
	return m;
}


//@RequestMapping(value="/updateexams/{id}", method=RequestMethod.PUT)
//public void updatequestion(@RequestParam("id")int questionId,Model m) {
//	Question question=questiondao.getquestionbasedonid(questionId);
//	m.addAttribute("questionId", question.getQuestionId());
//	m.addAttribute("question", question.getQuestion());
//	m.addAttribute("option1", question.getOption1());
//	m.addAttribute("option2", question.getOption2());
//	m.addAttribute("option3", question.getOption3());
//	m.addAttribute("option4", question.getOption4());
//	m.addAttribute("correctAnswer", question.getCorrectAnswer());
//	m.addAttribute("marks", question.getMarks());
//	questiondao.addquestion(question);
//}



@RequestMapping(value="/addstudents", method=RequestMethod.POST)
public RedirectView addstudent(@ModelAttribute Student student,HttpServletRequest requst) {
	studentdao.addstudent(student);
	System.out.println("studentAdded");
	RedirectView redirect=new RedirectView();
	redirect.setUrl(requst.getContextPath()+"/AddStudent");
	return redirect;
}

@RequestMapping(value="/deletestudent/{studentId}")
public String deletestudent(@PathVariable("studentId") int id,HttpServletRequest requst) {
	ModelAndView m = new ModelAndView();
	studentdao.deletestudent(studentdao.getstudentbasedonid(id));
	System.out.println("studentdeleted");
	return "redirect:/DeleteStudent";
}


@RequestMapping(value="/getstudentbyid", method=RequestMethod.GET)
public ModelAndView getstudentonid(@RequestParam("studentId") int id,Model m) {
	Student student=studentdao.getstudentbasedonid(id);
	System.out.println(student);
	ModelAndView mv=new ModelAndView();
	mv.addObject("student", student);
	mv.setViewName("ShowStudentById");
	return mv;
}

@RequestMapping(value="/updatestudent/{id}", method=RequestMethod.PUT)
public void updatestudent(@RequestParam("id")int studentId,Model m) {
	Student student=studentdao.getstudentbasedonid(studentId);
	m.addAttribute("studentId", student.getStudentId());
	m.addAttribute("studentName", student.getStudentName());
	m.addAttribute("studentEmail", student.getStudentEmail());
	m.addAttribute("enrollExam", student.getEnrolExam());
	studentdao.addstudent(student);
}


@RequestMapping(value="/getreportbyid", method=RequestMethod.GET)
public ModelAndView getreportonid(@RequestParam("reportId") int id,Model m) {
	ModelAndView mv=new ModelAndView();
	Report report=reportdao.getreportbasedonid(id);
	mv.addObject("report", report);
	mv.setViewName("ShowReportById");
	return mv;
	
}

@RequestMapping(value="/writeexam",method=RequestMethod.GET)
public ModelAndView WriteExam(@RequestParam("examid") int id) {
	List <Question> questions=questiondao.getQuestionsForExam(id);
	System.out.println(questions);
	ModelAndView m=new ModelAndView();
	m.addObject("questions", questions);
	m.setViewName("EnterAnswers");
	return m;
	
}


@RequestMapping(value="/submitanswer", method=RequestMethod.POST)
public ModelAndView submitAnswer(@RequestParam Map<String,String> allAnswers) {
  int numCorrect = 0;
System.out.println(allAnswers);
  for (Map.Entry<String,String> entry : allAnswers.entrySet()) {
	  System.out.println(entry);
	  //String s="correctAnswer[1]";
	     String s = entry.getKey();
	     int ind=s.indexOf("[");
		  String questionId=s.substring(ind+1,ind+2);

    String userAnswer = entry.getValue();
    if(!s.startsWith("answers"))
    continue;
    String correctAnswer = questiondao.getCorrectAnswerById(questionId);

    if (userAnswer.equalsIgnoreCase(correctAnswer)) {
      numCorrect++;
    }
  }
  System.out.println(numCorrect);

  ModelAndView modelAndView = new ModelAndView();
  modelAndView.addObject("numCorrect", numCorrect);
  System.out.println(numCorrect);
  modelAndView.setViewName("result");
  return modelAndView;
  
}






}
