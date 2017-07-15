package com.codingdojo.assignmentfour.pets.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.assignmentfour.pets.models.Cat;

/**
 * Servlet implementation class Cats
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cats() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served Cats: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight;
		try {
			weight = Double.parseDouble(request.getParameter("weight"));
		} catch (Exception e) {
			weight = 0.0;
		}
		Cat ourCat = new Cat(name, breed, weight);
		request.setAttribute("ourCat", ourCat);
		//where is this going?
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/cat.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
