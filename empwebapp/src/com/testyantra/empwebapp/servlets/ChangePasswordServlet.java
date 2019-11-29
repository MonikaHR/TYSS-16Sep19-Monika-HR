package com.testyantra.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.dao.EmployeeDao;
import com.testyantra.empwebapp.dto.EmployeeInfo;
import com.testyantra.empwebapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			String pass = req.getParameter("newpassword");
			String confirmpass = req.getParameter("Confirmpassword");

			if(pass.equals(confirmpass)) {
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
				EmployeeDao dao = EmployeeDaoManager.getEmployeeDao();
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
				
			}else {
				String msg = "password not matching";
				req.setAttribute("msg", msg);
//				PrintWriter out = resp.getWriter();
//				out.println("<html>");
//				out.println("<body>");
//				out.println("<h4>Password not matching</h4>");
//				out.println("</html>");
//				out.println("</body>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.jsp");
//				dispatcher.include(req, resp);
				dispatcher.forward(req, resp);
			}

		}else {
			RequestDispatcher disptacher = req.getRequestDispatcher("/login.jsp");
			disptacher.forward(req, resp);
		}


	}   //end of doPost
}       //end of ChangepasswordServlet
