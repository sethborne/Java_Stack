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
                        <h4>Java Spring Data II: Assignment Two: Dojos and Ninjas: Add Dojo</h4>
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
            		<h1>Create a New Dojo</h1>
	                <form:form method="POST" action="/dojos/create" modelAttribute="dojo">
	                    <!--name, creator version-->
	                    <form:label path="name">Dojo Name</form:label>
	                        <form:errors path="name" class="errors"/>
	                        <form:input path="name" class="inputTextLeft" type="text" placeholder="Please Enter the Dojo Name (Location)"/>
	                    
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