package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginInfo")
public class LoginInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Read values from url
		String username=request.getParameter("username");
		String password=request.getParameter("txtpassword");
		//set response content type
		response.setContentType("text/html");
		//object to print values on browser
		PrintWriter out=response.getWriter();
		
		if(username.equals("admin")&& password.equals("admin@123"))
			out.println("Welcome User");
		else
			out.println("Invalid user and password");
		
		
		
	}

	
}