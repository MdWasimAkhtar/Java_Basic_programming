package com.hibernate.simple202;
import javax.persistence.*;

@Entity
public class Answer{

	@Id
	@Column(name="Ans_ID")
	private int  answerID;
	private String answer;
	 
	//bidirectional 
//	@OneToOne(mappedBy="answer")
	@ManyToOne
	private Question question;
	
	Answer()
	{
		super();
	}
	
	public int getAnswerID() {
		return answerID;
	}
	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
