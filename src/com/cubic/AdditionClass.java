package com.cubic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdditionClass extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		PrintWriter pw= res.getWriter();
		pw.print("The result is: "+(num1+num2));
	}

}
