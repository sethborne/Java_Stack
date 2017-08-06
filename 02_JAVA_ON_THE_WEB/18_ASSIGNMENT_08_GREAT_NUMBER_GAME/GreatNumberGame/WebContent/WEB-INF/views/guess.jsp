<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Random Word Generator</title>
		<link rel="stylesheet" href="./css/style.css">
	</head>
	<body>
		<div id="mainContainer">
            <div id="header">
                <div class="left">
                    <ul>
                        <li><h4>Java on the Web - Random Word Generator - Guess</h4></li>
                    </ul>
                </div>
                <div class="right">
                    <ul>
                        <!--<li><h4><a href="pages/dashboard.html">To Dashboard</a></h4></li>-->
                    </ul>
                </div>
            </div>
            <hr>
            <div id="body">
                <div id='top'>
                	<div class="center">
                		<br>
                        	<h1>Welcome to the Great Number Game!</h1>
                        <br>
                        	<% if((Boolean)request.getSession().getAttribute("isCorrectNumber") == false) {%>
                        		<h3>You Guessed <%= session.getAttribute("userNumberGuess") %>.  Which is Incorrect.</h3>

	                        	<h3>Please Guess Again</h3>                        		
		                        <form action="/GreatNumberGame/Guess" method="POST">
									<input class="inputTextCenter" type="number" name="numGuess" placeholder="Guess Again!" >
		                            <div class="btn-center">
		                                <input class='btnSubmit btnGreen' type='submit' value='Guess'>
		                            </div>
		                            <br>
		                            <form action="/GreatNumberGame" method="POST">
		                            <div class="btn-center">
		                                <input class='btnSubmit btnGreen' type='submit' value='Tired of Guessing?  Reset the Game.'>
		                            </div>
		                        </form>
		                        </form>
                        	<% } else { %>
                        		<h3>You Guessed Correctly!</h3>
                        		<br>
                        		<form action="/GreatNumberGame" method="POST">
		                            <div class="btn-center">
		                                <input class='btnSubmit btnGreen' type='submit' value='Play Again!'>
		                            </div>
		                        </form>
                        	<% } %>
                	</div>
            	</div>
            </div>
        </div>
	</body>
</html>