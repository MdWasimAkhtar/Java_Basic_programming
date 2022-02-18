package com.hibernate.Third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sesfactory = cfg.buildSessionFactory();

		// creating question
		Question que1 = new Question();
		que1.setQuestionId(101);
		que1.setQuestion("What is java ?");

		// creating Answer Objects
		Answer ans1 = new Answer();
		ans1.setAnswerID(202);
		ans1.setAnswer("Java is Programming Language ");
		ans1.setQuestion(que1);
		// !!!
		que1.setAnswer(ans1);

		// creating question-2
		Question que2 = new Question();
		que2.setQuestionId(234);
		que2.setQuestion("what is Collection framWork ?");

		// creating Answer Objects -2
		Answer ans2 = new Answer();
		ans2.setAnswerID(468);
		ans2.setAnswer("API to work with Objects with java ");
		ans2.setQuestion(que2);
		// !!!
		que2.setAnswer(ans2);

		Session session = sesfactory.openSession();
		Transaction trx = session.beginTransaction();
		session.save(que1);
		session.save(que2);
		
		session.save(ans1);
		session.save(ans2);
		
		trx.commit();
		
		// retriving data
		Question qu = (Question)session.get(Question.class,234);
		System.out.println(qu.getQuestion());
		System.out.println(qu.getAnswer().getAnswer());
		
		
        session.close();
		sesfactory.close();
	}
}
