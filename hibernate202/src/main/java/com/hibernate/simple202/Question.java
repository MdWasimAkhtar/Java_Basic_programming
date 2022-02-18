package com.hibernate.simple202;
import java.util.List;

import javax.persistence.*;

@Entity
public class Question {

	@Id
	@Column(name="Que_ID")
	private int questionId;
	private String question ;
	
//	@OneToOne
//	@JoinColumn(name="AnsID")
//	private Answer answer;

	
	@OneToMany(mappedBy="question")// will not make extra Table
	private List<Answer> answer;
	
	Question(){
		super();
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
//	public Answer getAnswer() {
//		return answer;
//	}
//	public void setAnswer(Answer answer) {
//		this.answer = answer;
//	}

	public Question(int questionId, String question, List<Answer> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	
	
	
}
