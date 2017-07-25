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
                        <h4>Java Spring Data II: Assignment Two: Dojos and Ninjas: Add Ninja</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/dojos/all">Show All Dojos</a></h4></li> 
                	<!--<li><h4><a href="/ninjas/add">Add a License</a></h4></li> -->
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
            		<h1>Create a Ninja</h1>
	                <form:form method="POST" action="/ninjas/create" modelAttribute="ninja">
	                    <!--name, creator version-->
                        <form:label path="dojo">Person
                            <form:errors path="dojo" class="errors"/>
                            <form:select path="dojo" class="inputTextLeft" type="text">
                                <form:option value="-1">----Please Select a Dojo Location----</form:option>
                                <c:forEach items="${allDojos}" var="dojoLoc">
                                	<form:option value="${dojoLoc.id}"><c:out value="${dojoLoc.name}"/></form:option>
                                </c:forEach>
                            </form:select>
                        </form:label><br>
	                    <form:label path="firstName">First Name</form:label>
	                        <form:errors path="firstName" class="errors"/>
	                        <form:input path="firstName" class="inputTextLeft" type="text" placeholder="Please Enter Ninja's First Name"/>
	                    <br>
                        <form:label path="lastName">Last Name</form:label>
	                        <form:errors path="lastName" class="errors"/>
	                        <form:input path="lastName" class="inputTextLeft" type="text" placeholder="Please Enter Ninja's Last Name"/>
	                    <br>
                        <form:label path="age">Age</form:label>
	                        <form:errors path="age" class="errors"/>
	                        <form:input path="age" class="inputTextLeft" step="1" type="number" placeholder="Please Enter Ninja's Age"/>
	                    <br>
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