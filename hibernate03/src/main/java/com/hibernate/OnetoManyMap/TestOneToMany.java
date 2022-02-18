package com.hibernate.OnetoManyMap;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessf = cfg.buildSessionFactory();
		
		 Question q1 = new Question();
		 q1.setQuestionId(121312);
		 q1.setQuestion("what is hibernate?");
		 
		 Answer ans1 = new Answer();
		 ans1.setAnswerId(121311);
		 ans1.setAnswer("Hibernate Query Language (HQL) is an object-oriented query language, similar to SQL");
		 ans1.setQuestion(q1);
		 
		 Answer ans2 = new Answer();
		 ans2.setAnswerId(121310);
		 ans2.setAnswer("but instead of operating on tables and columns, HQL works with persistent objects and their properties.");
		 ans2.setQuestion(q1);
		 
		 Answer ans3 = new Answer();
		 ans3.setAnswerId(121309);
		 ans3.setAnswer("HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database");
		 ans3.setQuestion(q1);
		 
		 
		 List<Answer>  anslist1 = new ArrayList<Answer>();
		 anslist1.add(ans1);
		 anslist1.add(ans2);
		 anslist1.add(ans3);
		 
		 q1.setAnswer(anslist1);
		 
		 Session session = sessf.openSession();
		 Transaction trx = session.beginTransaction();
//		 
//		 session.save(q1);
//		 session.save(ans1);
//		 session.save(ans2);
//		 session.save(ans3);
		 
		Question res = (Question) session.get(Question.class,121312 );
		
		System.out.println(res.getQuestion());
		 for(Answer a: res.getAnswer())
			 System.out.println(a.getAnswer());
		
		 
		 trx.commit();
		 sessf.close();
		 
	}
}
