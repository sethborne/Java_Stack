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
                        <li><h4>Java on the Web - Team Roster - Add Player</h4></li>
                    </ul>
                </div>
                <div class="right">
                    <ul>
                        <li><h4><a href="/TeamRoster/Players">Show All Players On Team</a></h4></li>
                    </ul>
                </div>
            </div>
            <hr>
            <div id="body">
                <div id='top'>
	                <div class="left">
                		<br>
                        <h3>Add New Player to Team</h3>
                        <br>
                        <form action="/GreatNumberGame/Guess" method="POST">
                        	<h4>First Name:</h4>
							<input class="inputTextLeft" type="text" name="playerFirstName" placeholder="Enter Player First Name Here" >
							<h4>Last Name:</h4>
							<input class="inputTextLeft" type="text" name="playerLastName" placeholder="Enter Player Last Name Here" >
							<h4>Age:</h4>
							<input class="inputTextLeft" type="number" name="playerAge" placeholder="Enter Player Age Here" >
	                        <div class="btn-left">
	                            <input class='btnSubmit btnGreen' type='submit' value='Add Player To Team'>
	                        </div>
                        </form>
                        <br>
                	</div>
                	<div class="right">

                	</div>
            	</div>
            </div>
        </div>
	</body>
</html>