<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.codingdojo.assignmentfive.buttonclicker.models.Counter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
		<div id="mainContainer">
            <div id="header">
                <div class="left">
                    <ul>
                        <li>
                            <h4>Java on the Web - Button Clicker</h4>
                        </li>
                        <!--<li>
                            <h4><a href="pages/dashboard.html">To Dashboard</a></h4>
                        </li>-->
                    </ul>
                </div>
                <div class="right">
                    <ul>
                        <!--<li><h4><a href="pages/dashboard.html">To Dashboard</a></h4></li>-->
                        <!--<li>
                            <h4><a href="index.html">Logout</a></h4>
                        </li>-->
                    </ul>
                </div>
            </div>
            <hr>
            <div id="body">
                <div id='top'>
                    <div class='left'>
                        <h3>Increment The Count by Clicking the Button Below</h3>
                        <form action="/ButtonClicker/Counters" method="POST">

							<input type="hidden" name="countIncrement" value="1">
                            <div class="btn-left">
                                <input class='btnSubmit btnGreen' type='submit' value='Increment Count'>
                            </div>
                        </form>
                        <br>
                        <p>You have clicked this button <%= session.getAttribute("currCount") %> times.</p>
                	</div>
            	</div>
            </div>
            <!--<hr>-->
            <!--<div id='body-top'>
                <div class='left'>
                    <h2>Enter Your Information - Left</h2>
                </div>
                <div class='right'>
                    <h2>Enter Your Information - Right</h2>
                </div>
            </div>-->

        </div>
	</body>
</html>