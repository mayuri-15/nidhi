package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.loginbean;
import com.cts.service.loginService;
import com.cts.service.loginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  loginService LoginService = new loginServiceImpl();
          loginbean bean = new loginbean();
          bean.setUname(request.getParameter("UserId"));
          bean.setPwd(request.getParameter("password"));
          System.out.println(bean);
          /*RequestDispatcher dispatcher = null;
          PrintWriter out1 = response.getWriter();*/
          if(LoginService.validateUser(bean)) {
        	  System.out.println("successful");
          }
        
          else {
        	  System.out.println("Unsuccessful");
          	/* out1.println("Incorrect Id or Password");
               RequestDispatcher dispatcher1 = request.getRequestDispatcher("/loginPage.jsp");
               dispatcher1.forward(request, response);
          	request.setAttribute("message", "Invalid"); // Will be available as ${message}
          	request.getRequestDispatcher("loginPage.jsp").forward(request,response);*/
           
          	 // out1.println("<script type=\"text/javascript\">");
          	  // out1.println("alert('User or password incorrect');");
          	  // out1.println("location='loginPage.jsp';");
          	   //out1.println("</script>");
        	 
	}
	}
}
