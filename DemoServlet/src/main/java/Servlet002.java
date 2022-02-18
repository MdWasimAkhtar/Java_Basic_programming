
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet002 implements Servlet // Servlet is Interface
{
	ServletConfig confg;
	
	public void init(ServletConfig confg) {
		
		this.confg= confg;
		System.out.println("Creating Objects......");
	}

	public  void service(ServletRequest req , ServletResponse res) throws ServletException , IOException{
		
		System.out.println("servicing ......");
	}
	
	public void destroy() {
		System.out.println("Going to destroy Servlet Object");
	}
	
	public ServletConfig getServletConfig() {
		return this.confg;
	}
	
	public  String getServletInfo() {
		return "this servlet is created by Shilpa ";
	}
}
