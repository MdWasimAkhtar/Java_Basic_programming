package com.hibernate.OnetoOneMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOneMap {
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sesfactory = cfg.buildSessionFactory();
		
		Question que1 = new Question();
		que1.setQuestionId(11);
		que1.setQuestion("What is java?");
		
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(22);
		ans1.setAnswer("java Is programming language");;
		que1.setAnswer(ans1);
		ans1.setQuestion(que1);
		
		
		Session session = sesfactory.openSession();
	    Transaction trx = session.beginTransaction();
	    session.save(que1);
	    session.save(ans1);
	    
	    trx.commit();
	    sesfactory.close();
	}

}
