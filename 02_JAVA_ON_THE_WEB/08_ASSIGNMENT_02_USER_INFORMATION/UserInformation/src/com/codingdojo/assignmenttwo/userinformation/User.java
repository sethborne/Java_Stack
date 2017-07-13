package com.codingdojo.assignmenttwo.userinformation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private String firstName;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
//        this.firstName = "Unknown";
//        String lastName = "Unknown";
//        String favoriteLanguage = "Unknown";
//        String hometown = "Unknown";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		firstName
//		lastName
//		favoriteLanguage
//		hometown
		String firstName = request.getParameter("firstName");
		if (firstName == null) {
			firstName = "Unknown";
		}
		String lastName = request.getParameter("lastName");
		if (lastName == null) {
			lastName = "Unknown";
		}
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		if (favoriteLanguage == null) {
			favoriteLanguage = "Unknown";
		}
		String hometown = request.getParameter("hometown");
		if (hometown == null) {
			hometown = "Unknown";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1> Welcome, " + firstName + " " + lastName + "</h1>");
		out.write("<h2> Your favorite language is: " + favoriteLanguage + "</h2>");
		out.write("<h2> Your hometown is: " + hometown + "</h2>");
//		http://localhost:8080/UserInformation/User?firstName=Seth&lastName=Borne&favoriteLanguage=Java&hometown=Decatur
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
