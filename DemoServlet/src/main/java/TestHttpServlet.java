
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class TestHttpServlet  extends HttpServlet //HttpServlet extends GenericServlet 
                                                  // Generic Servlet is abstract Class and implenets Servlet interface , serializable
                                                 //Servlet is Interface and has  5 Method 
{            

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
			                      throws ServletException ,IOException
	 {
		 System.out.println("This is get Method .....");
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<h1> This get Method of my Servlet");
	 }
	
	
}
