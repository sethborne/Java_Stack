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
                        <li><h4>Java on the Web - Random Word Generator</h4></li>
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
                        	<h3>You have generated a Word <%= session.getAttribute("currCount") %> Times</h3>
                        	<br>
                        	<div class="sectionborder">
                        		<h1><%= session.getAttribute("randomWord") %></h1>
                        	</div>
                        <form action="/RandomWordGenerator/RandomWordsController" method="POST">
							<input type="hidden" name="countIncrement" value="1">
                            <div class="btn-center">
                                <input class='btnSubmit btnGreen' type='submit' value='Generate'>
                            </div>
                        </form>
                        <br>
                        <h3>The Last Time You Generated a Word was:</h3>
                        	<div class="sectionborder">
                        		<h3><%= session.getAttribute("lastWordGenDate") %></h3>
                        	</div>
                        <form action="/RandomWordGenerator" method="POST">
                            <div class="btn-center">
                                <input class='btnSubmit btnGreen' type='submit' value='Reset Random Word Gen'>
                            </div>
                        </form>
  
                	</div>
            	</div>
            </div>
        </div>
	</body>
</html>