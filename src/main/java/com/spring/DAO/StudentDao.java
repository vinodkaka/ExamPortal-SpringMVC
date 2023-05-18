package com.spring.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.Student;

@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addstudent(Student student) {
		this.hibernateTemplate.save(student);
	}
	
	
	public Object getstudents() {
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
	@Transactional
	public void deletestudent(Student student) {
		 this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public Student getstudentbasedonid(int id) {
		return this.hibernateTemplate.get(Student.class, id);
		
	}
	
	
}
