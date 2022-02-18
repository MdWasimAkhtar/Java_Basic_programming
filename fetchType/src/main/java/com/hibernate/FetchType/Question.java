package com.hibernate.FetchType;
import javax.persistence.*;
import java.util.*;

@Entity
public class Question {

	@Id
	@Column(name="Ques_ID")
	private int questionID;
	
	private String question;
	
	@OneToMany(mappedBy="question" , fetch=FetchType.EAGER)
	private List<Answer> answer;
	
	public Question() {
		super();
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	
}
