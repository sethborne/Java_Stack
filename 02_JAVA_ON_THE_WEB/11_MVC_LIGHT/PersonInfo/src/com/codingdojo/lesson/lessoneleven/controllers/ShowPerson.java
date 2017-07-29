package com.codingdojo.lesson.lessoneleven.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.lesson.lessoneleven.models.Person;

public class ShowPerson extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Process Request
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		// Create Model
//		Person person = new Person(name, age);
		Person person = new Person();
		// Set Model for View
		request.setAttribute("person", person);
		// Let View Handle the Request
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/showPerson.jsp");
		view.forward(request, response);
	}
}
