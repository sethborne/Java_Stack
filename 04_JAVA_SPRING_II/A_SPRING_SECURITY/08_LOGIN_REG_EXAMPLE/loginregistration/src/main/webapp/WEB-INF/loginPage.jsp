<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='en'>

<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="css/style.css">
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
            		<c:if test="${logoutMessage != null}">
            			<p class="errors"><c:out value="${logoutMessage}"></c:out></p>
            		</c:if>
            		
            		<h1>Login</h1>
		            
		            
					<c:if test="${errorMessage != null }">
		            	<p class="errors"><c:out value="${errorMessage}"></c:out></p>
		            </c:if>
		            
		            <form method="POST" action="/login">
		                <p>
		                    <label for="username">Username</label>
		                    <input class="inputTextLeft" type="text" id="username" name="username"/>
		                </p>
		                <p>
		                    <label for="password">Password</label>
		                    <input class="inputTextLeft" type="password" id="password" name="password"/>
		                </p>
		                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		                <div class="btn-left">
		                	<input class='btnSubmit btnGreen' type="submit" value="Login!"/>
		                </div>	
		            </form>
                </div>
            </div>
            
            <div id="bot">
                
            </div>
        </div>
    </div>
</body>

</html>