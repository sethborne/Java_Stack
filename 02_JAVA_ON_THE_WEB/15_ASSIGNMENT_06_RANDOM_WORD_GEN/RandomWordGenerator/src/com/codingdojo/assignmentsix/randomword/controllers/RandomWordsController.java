package com.codingdojo.assignmentsix.randomword.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.assignmentsix.randomword.models.RandomWord;
/**
 * Servlet implementation class RandomWordsController
 */
@WebServlet("/RandomWordsController")
public class RandomWordsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomWordsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		int newCount;
		int currCount;
		currCount = (int) session.getAttribute("currCount");
		int getIncrement = Integer.parseInt(request.getParameter("countIncrement"));
		newCount = currCount + getIncrement;
		//save count in session
		session.setAttribute("currCount", newCount);
		
		//random string
		String randomWord = RandomWord.getRandomWordOfLength();
		System.out.println(randomWord);
		session.setAttribute("randomWord", randomWord);
		
		//creation date
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy h:mm:ss a");
		
		Date getWordCreationDate = RandomWord.getCreateWordDate();
		System.out.println(getWordCreationDate);
		
		String lastWordGenDate = dateFormat.format(getWordCreationDate);
		System.out.println(lastWordGenDate);
		
		session.setAttribute("lastWordGenDate", lastWordGenDate);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
