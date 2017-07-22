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
                        <h4>Java Spring Data II: Assignment One: Drivers License: New License</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/persons">Show All Persons</a></h4></li> 
                	<li><h4><a href="/persons/add">Add a Person</a></h4></li> 
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
            		<h1>New License</h1>
	                <form:form method="POST" action="/licenses/add" modelAttribute="license">
	                    <!--name, creator version-->
                        <form:label path="person">Person
                            <form:errors path="person" class="errors"/>
                            <form:select path="person" class="inputTextLeft" type="number">
                                <form:option value="-1">----Persons Without Assigned Licenses----</form:option>
                            </form:select>
                        </form:label><br>
	                    <form:label path="state">State
	                        <form:errors path="state" class="errors"/>
	                        <form:select path="state" class="inputTextLeft" type="text">
                                <form:option value="-1">----Please Select A State----</form:option>
                            </form:select>
	                    </form:label><br>
                        <!--hidden field license number THIS IS number-->
	                    <form:label path="expirationDate">Expiration Date
	                        <form:errors path="expirationDate" class="errors"/>
	                        <form:input path="expirationDate" class="inputTextLeft" type="date"/>
	                    </form:label><br>
	                    <div class="btn-left">
	                    	<input class='btnSubmit btnGreen' type="submit" value="Link a License"/>
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