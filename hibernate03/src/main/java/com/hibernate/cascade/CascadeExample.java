package com.hibernate.cascade;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.OnetoManyMap.Question;
import com.hibernate.OnetoManyMap.*;

public class CascadeExample {
	public static void main(String[] args) {
		 
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(101210);
		q1.setQuestion("what is Collection Framework");
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(101209);
		ans1.setAnswer("its a framework provides an architecture to store and manipulate the group of Object");
		
		Answer ans2 = new Answer();
		ans2.setAnswerId(1012008);
		ans2.setAnswer("collection framework has ready made method to operate on group of Objects");
		
		Answer ans3 = new Answer();
		ans3.setAnswerId(1012007);
		ans3.setAnswer("its perform operaton such as sorting , insertion, searching");
		
		List<Answer> anslist=new  ArrayList<Answer>();
		anslist.add(ans1);
		anslist.add(ans2);
		anslist.add(ans3);
		
		q1.setAnswer(anslist);
		
		Transaction trx = session.beginTransaction();
		session.save(q1);
		trx.commit();
		
		
		factory.close();
		
	}

}
