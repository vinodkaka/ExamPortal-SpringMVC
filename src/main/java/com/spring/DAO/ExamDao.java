package com.spring.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.Exam;

@Component
public class ExamDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addexam(Exam exam) {
		System.out.println("sudha");
		this.hibernateTemplate.saveOrUpdate(exam);
	}
	
//	@Transactional
//	public List<Exam> getExams(){
//		return this.hibernateTemplate.loadAll(Exam.class);
//		
//	}
	
	public Object getAllExams() {
		return this.hibernateTemplate.loadAll(Exam.class);
	}
	

	
	@Transactional
	public void deleteexam(Exam exam) {
		this.hibernateTemplate.delete(exam);
	}
	
	@Transactional
	public Exam getexambasedonid(int id) {
		return this.hibernateTemplate.get(Exam.class, id);
		
	}
	
	public void updateExam(Exam exam) {
		this.hibernateTemplate.update(exam);
	}
}
