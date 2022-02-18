package com.hibernate.simple202;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneMapping {
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

		
		// mantToOne
		Answer ans2 = new Answer();
		ans2.setAnswerID(204);
		ans2.setAnswer("Java is Object Oriented Language ");
		ans2.setQuestion(que1);
		
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		que1.setAnswer(list);
		
		Session session = sesfactory.openSession();
		Transaction trx = session.beginTransaction();
		
//		session.save(que1);
//		session.save(ans1);
//		session.save(ans2);
		
		Question qu = (Question)session.get(Question.class, 101);
		
		for(Answer i : qu.getAnswer())
		System.out.println(i.getAnswer());
		
		trx.commit();
	}

}
