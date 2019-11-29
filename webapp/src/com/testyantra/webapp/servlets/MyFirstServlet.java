package com.testyantra.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{

	 public MyFirstServlet() {
		System.out.println("object created");                                   // 1. instantiation phase
	}
	 
	 @Override
	public void init() throws ServletException {
		System.out.println("initialization");                                   //initialization phase
	}
	
	@Override        
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		 
		System.out.println("service method");                                  //3. service phase
		System.out.println("extra line of code");
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");
		

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		Date date = new Date();
		out.println("<h1 style='color : Blue'>Date and Time is:");
		out.println(date.toString());
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("<h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("<h2>");

		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);

		out.println("</body>");
		out.println("</html>");

	}  //end of doGet()
	
	@Override
	public void destroy() {
		System.out.println("object destroyed");
	}

}     //end of MyFirstServlet
