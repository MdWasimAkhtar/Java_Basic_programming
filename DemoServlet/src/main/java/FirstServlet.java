import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class FirstServlet extends GenericServlet
{
//http://localhost:8081/DemoServlet/first01
//http://localhost:8081/DemoServlet/WEB-INF/classes/Servlet002.java
	@Override
	public void service(ServletRequest req , ServletResponse res) 
			                      throws ServletException , IOException {
		
		System.out.println("this is servlet using GenricServlet");
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1> This is my First Servlet </h1>  ");
		
	}

}
