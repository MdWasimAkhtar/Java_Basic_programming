package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import helper.FactoryProvider;
import notepack.Note;

/**
 * Servlet implementation class SaveNoteServlet
 */
@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveNoteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		try {
			//fetch title and content from add_note.js[ file
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			
			Note note = new Note(title, content , new Date());
			
//			System.out.println(note.getId()+ "  "+note.getTitle());
	
//			
//			Session session=FactoryProvider.getFactory().openSession();
//			Transaction trx = session.beginTransaction();
//			
//			session.save(note);
//			
//			trx.commit();
//			session.close();
//			response.setContentType("text/html");
//			PrintWriter out=response.getWriter();
//			out.println("<h1>Note is Added Successfully</h1>");

			  
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sess= cfg.buildSessionFactory();
			
			System.out.println("Hello "+sess);
			
			
		}
		catch(Exception e) {
		 e.printStackTrace();	
		}
		
	}

}
