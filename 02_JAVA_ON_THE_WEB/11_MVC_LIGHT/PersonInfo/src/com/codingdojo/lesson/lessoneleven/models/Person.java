package com.codingdojo.lesson.lessoneleven.models;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private String name;
	private int age;
	public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
	// getter name
	public String getName() {
		//getter must return
		return name;
	}
	// setter name - no return
	public void setName( String name ) {
		this.name = name;
	}
	//getter Age
	public int getAge() {
		return age;
	}
	//setter Age
	public void setAge( int age ) {
		this.age = age;
	}
	//public method
	public String greeting() {
		return "Hello!  My Name is " + name + ".  I am" + age + " years old.";
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		greeting();
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		out.write("<h1>" + greeting() + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
