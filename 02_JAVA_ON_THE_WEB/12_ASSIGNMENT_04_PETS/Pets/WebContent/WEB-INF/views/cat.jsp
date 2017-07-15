<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cat Page</title>
		<link rel="stylesheet" href="./css/style.css">
	</head>
	<body>
		<div id="mainContainer">
			<div id="header">
                <div class="left">
                    <ul>
                        <li>
                            <h4>Java on the Web - Pets</h4>
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
					<div id='section'>
                		<div class='left'>
							<label><h3 class='showLabel'>Cat Information:  </h3></label><br>
                    		<label><h4 class='showLabel indent'>Name:  </h4></label><h4 class='h4Space'><c:out value="${ ourCat.name }"/></h4><br>
							<label><h4 class='showLabel indent'>Breed:  </h4></label><h4 class='h4Space'><c:out value="${ ourCat.breed }"/></h4><br>
							<label><h4 class='showLabel indent'>Weight:  </h4></label><h4 class='h4Space'><c:out value="${ ourCat.weight }"/></h4><br>
							<br>
							<h4 style="font-weight: normal;"><c:out value="${ ourCat.showAffection() }"/></h4><br>
						</div>
					</div>
				</div>
			</div>
			
			
			
		</div>
	</body>
</html>