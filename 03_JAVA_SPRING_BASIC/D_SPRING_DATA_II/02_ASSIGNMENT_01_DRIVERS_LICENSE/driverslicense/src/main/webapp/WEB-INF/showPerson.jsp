<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='../css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="header">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Data II: Assignment One: Drivers License: Show Person</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/persons">Show All Persons</a></h4></li>
                    <li><h4><a href="/persons/add">Add New Person</a></h4></li>
                    <li><h4><a href="/licenses/add">Add New License</a></h4></li>
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
                <div class="dojoForm">
                    <h1>${person.firstName} ${person.lastName}</h1>
                    <c:choose>
	                    <c:when test="${ person.license.number != null }">
	                    	<label><h4 style='text-align: left' class='h4label'>License Number:  ${person.license.number}</h4></label>
	                    	<h4 class='h4Space'><c:out value=""/></h4><br>                    
	                    	<label><h4 style='text-align: left' class='h4label'>State:  </h4></label>
	                    	<h4 class='h4Space'><c:out value=""/></h4><br>                    
	                    	<label><h4 style='text-align: left' class='h4label'>Expiration Date:  </h4></label>
	                    	<h4 class='h4Space'><c:out value=""/></h4><br>
	                    </c:when>
	                    <c:otherwise>
	                    	<label><h4 style='text-align: left' class='h4label'>There is no License Information for this Person.</h4></label>
	                    </c:otherwise>
	                </c:choose>               
                    
                    <!--<a href="/"><input class='butInputSubmitGreen' type='submit' value='Return'></a>-->
                </div>
            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>
