<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='en'>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Page</title>
    <link rel='stylesheet' href='css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="header">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Security: Lesson: Login and Registration</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/registration">Registration Page</a></h4></li>
                    <li><h4><a href="/login">Login Page</a></h4></li>
                </ul>
            </div>
        </div>
        <div id="body">
            <hr>
            <br>
            <div id='body-top'>
                <div class='left'></div>
                <div class='right'></div>
            </div>
            <div id='top'>
            	
            	<div class='left'>
            		<h1>Register!</h1>
            
		            <p><form:errors path="user.*"/></p>
		            
		            <form:form method="POST" action="/registration" modelAttribute="user">
		                    <p>
		                    	<form:label path="username">Username:</form:label>
		                        <form:input class="inputTextLeft" path="username"/>
		                    </p>
		                    <p>
		                        <form:label path="password">Password:</form:label>
		                        <form:password class="inputTextLeft" path="password"/>
		                    </p>
		                    <p>
		                        <form:label path="passwordConfirmation">Password Confirmation:</form:label>
		                        <form:password class="inputTextLeft" path="passwordConfirmation"/>
		                    </p>
		                    <div class="btn-left">
		                    	<input class='btnSubmit btnGreen' type="submit" value="Register!"/>
		                    </div>
		            </form:form>
                </div>
            </div>
            
            <div id="bot">
                
            </div>
        </div>
    </div>
</body>

</html>