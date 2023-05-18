package com.spring.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.Exam;
import com.spring.model.Report;

@Component
public class ReportDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	
//	public List<Report> getreports(){
//		List<Report> reports = this.hibernateTemplate.loadAll(Report.class);
//		return reports;	
//	}
	
	public Object getreports() {
		return this.hibernateTemplate.loadAll(Report.class);
	}
	
	public Report getreportbasedonid(int id) {
		return this.hibernateTemplate.get(Report.class, id);
		
	}
}
