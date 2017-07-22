<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='../../css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="header">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Data II: Assignment One: Drivers License: New Driver</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/persons">Show All Persons</a></h4></li> 
                	<li><h4><a href="/licenses/add">Add a License</a></h4></li> 
                    <!--<li><h5><a href="/logout">Logout</a></h5></li>-->
                </ul>
            </div>
        </div>
        <div id="body">
            <hr>
            <br>
            <div id='body-top'>
                <div class='left'>
                    
                </div>
                <div class='right'></div>
            </div>
            <div id='top'>
            	
            	<div class='left'>
            		<h1>New Person</h1>
	                <form:form method="POST" action="/persons/add" modelAttribute="person">
	                    <!--name, creator version-->
	                    <form:label path="firstName">First Name
	                        <form:errors path="firstName" class="errors"/>
	                        <form:input path="firstName" class="inputTextLeft" type="text" placeholder="Please Enter Your First Name"/>
	                    </form:label><br>
	                    <form:label path="lastName">Last Name
	                        <form:errors path="lastName" class="errors"/>
	                        <form:input path="lastName" class="inputTextLeft" type="text" placeholder="Please Enter Your Last Name"/>
	                    </form:label><br>
	                    <div class="btn-left">
	                    	<input class='btnSubmit btnGreen' type="submit" value="Create an Account"/>
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