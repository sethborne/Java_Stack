package com.codingdojo.assignmenteight.greatnumbergame.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.assignmenteight.greatnumbergame.models.RandomNumber;

/**
 * Servlet implementation class GuessesController
 */
@WebServlet("/Guess")
public class GuessesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuessesController() {
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
		int getRandomNumber = (int) session.getAttribute("randomNumber");
		int getUserNumberGuess = (int) session.getAttribute("userNumberGuess");
		
		boolean isCorrectNumber = false;
		if(getRandomNumber == getUserNumberGuess) {
			isCorrectNumber = true;
		}
		else {
			isCorrectNumber = false;
		}
		session.setAttribute("isCorrectNumber", isCorrectNumber);
		System.out.println("isCorrectNumber Current Status is: " + isCorrectNumber);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/guess.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		HttpSession session = request.getSession();
		//call the randomNumber function
		int getRandomNumber = (int) session.getAttribute("randomNumber");
		Integer userNumberGuess = Integer.parseInt(request.getParameter("numGuess"));
		System.out.println("Random Number is: " + getRandomNumber);
		System.out.println("User Guess is: " + userNumberGuess);
			
		session.setAttribute("userNumberGuess", userNumberGuess);
		
		boolean isCorrectNumber = false;
		if(getRandomNumber == userNumberGuess) {
			isCorrectNumber = true;
		}
		else {
			isCorrectNumber = false;
		}
		
		String guessToRandom;
		if ( getRandomNumber > userNumberGuess) {
			guessToRandom = "low";
		}
		else {
			guessToRandom = "high";
		}
		session.setAttribute("isCorrectNumber", isCorrectNumber);
		System.out.println("isCorrectNumber Current Status is: " + isCorrectNumber);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/guess.jsp");
		dispatcher.forward(request, response);
	}

}
