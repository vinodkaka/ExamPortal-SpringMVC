package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	int questionId;
	@Column(unique=true)
	String question;
	@Column
	String option1;
	@Column
	String option2;
	@Column
	String option3;
	@Column
	String option4;
	@Column
	String correctAnswer;
	@Column
	float marks;
	
	@OneToOne
	Exam exam;

	
	
	public Question() {
		super();
	}



	public Question(int questionId, String question, String option1, String option2, String option3, String option4,
			String correctAnswer, float marks, Exam exam) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.marks = marks;
		this.exam = exam;
	}



	public int getQuestionId() {
		return questionId;
	}



	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getOption1() {
		return option1;
	}



	public void setOption1(String option1) {
		this.option1 = option1;
	}



	public String getOption2() {
		return option2;
	}



	public void setOption2(String option2) {
		this.option2 = option2;
	}



	public String getOption3() {
		return option3;
	}



	public void setOption3(String option3) {
		this.option3 = option3;
	}



	public String getOption4() {
		return option4;
	}



	public void setOption4(String option4) {
		this.option4 = option4;
	}



	public String getCorrectAnswer() {
		return correctAnswer;
	}



	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}



	public float getMarks() {
		return marks;
	}



	public void setMarks(float marks) {
		this.marks = marks;
	}



	public Exam getExam() {
		return exam;
	}



	


	public void setExam(Exam exam) {
		this.exam = exam;
	}



	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", correctAnswer=" + correctAnswer
				+ ", marks=" + marks + ", exam=" + exam + "]";
	}




	
	
}
