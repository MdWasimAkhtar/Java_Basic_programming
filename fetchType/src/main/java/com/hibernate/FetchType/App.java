package com.hibernate.FetchType;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg= new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sesfac= cfg.buildSessionFactory();
    	
    	Question que1 = new Question();
    	que1.setQuestionID(12);
    	que1.setQuestion("Why we use Angular? ");
    	
//1st answer    	
    	Answer ans1 = new Answer();
    	ans1.setAnswer_id(120);
    	ans1.setAnswer("Angular helps build interactive and dynamic single page applications (SPAs) "
    			+ "through its compelling features that include templating, two-way binding, modularization,"
    			+ " RESTful API handling, "
    			+ "dependency injection, and AJAX handling");
    	
 // 2nd answer   	
    	Answer ans2 = new Answer();
    	ans2.setAnswer_id(121);
    	ans2.setAnswer(" 1. Supported by Google "
    			+ "2. TypeScript "
    			+ " Code Consistency and Easy Testing ");
    	
// to store list of Answer Object    	
       List<Answer> lans = new ArrayList<Answer>();
       
    	que1.setAnswer(lans);
    	
    	Session sess = sesfac.openSession();
    	Transaction trx = sess.beginTransaction();
    	sess.save(que1);
    	sess.save(ans1);
    	sess.save(ans2);
    	
    	//fetch by eger or lazy loading
    	
    	Question q = (Question)sess.get(Question.class, 12);
    	
    	System.out.println(q.getQuestionID());
    	System.out.println(q.getQuestion());
    	System.out.println(q.getAnswer());
    	
    	trx.commit();
    	
    	sess.close();
    	sesfac.close();
    	
        
    }
}
