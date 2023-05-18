package com.spring.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.Question;

@Component
public class QuestionDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addquestion(Question question) {
		System.out.println("inside add question");
		this.hibernateTemplate.saveOrUpdate(question);
	}
	
	public Object getquestions(){
		return this.hibernateTemplate.loadAll(Question.class);
		
	}
	
	@Transactional
	public void deletequestion(Question question) {
		this.hibernateTemplate.delete(question);
	}
	

	
	public Question getquestionbasedonid(int id) {
		return this.hibernateTemplate.get(Question.class, id);
		
	}
	
	
	@Transactional
	public List<Question> getQuestionsForExam(int id) {
	    String hql = "FROM Question  WHERE exam_examId = :id";
	    Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
	    query.setParameter("id", id);
	    List<Question> questions = query.list();
	    return questions;
	}

	@Transactional
	public String getCorrectAnswerById(String questionId) {
		System.out.println(questionId);
	    String correctAnswer = null;
	    String hql = "FROM Question WHERE questionId = :questionId";
	    
	    Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql).setParameter("questionId", Integer.parseInt(questionId));
	    List<Question> questions = query.list();

	    for(Question question:questions) {
	    	 correctAnswer=question.getCorrectAnswer();
	    }
	    
	    return correctAnswer;
	}


}
