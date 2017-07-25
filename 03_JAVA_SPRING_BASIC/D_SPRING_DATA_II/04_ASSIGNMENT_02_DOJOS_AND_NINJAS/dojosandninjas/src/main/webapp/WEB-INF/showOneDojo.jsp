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
                        <h4>Java Spring Data II: Assignment One: Drivers License: Show Dojo</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/dojos/all">Show All Dojos</a></h4></li>
                    <li><h4><a href="/dojos/add">Add New Dojo</a></h4></li>
                    <li><h4><a href="/ninjas/add">Add New Ninja</a></h4></li>
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
                    <h1>${dojo.name}</h1>
                    <c:choose>
	                    <c:when test="${ dojo.getNinjas().size() > 0 }">
	                    	<table border="0" cellspacing="0" cellpadding="0">
                                <thead>
                                    <tr>
                                        <th>Ninja Name</th>
                                        <th>Age</th>
                                        <th>Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${dojo.ninjas}" var="ninja" varStatus="loop">
                                        <tr class="center">
                                            <td>
                                                <a href="/ninjas/${ninja.id}">
                                                    <c:out value="${ninja.firstName}" />
                                                    <c:out value="${ninja.lastName}" />
                                                </a>
                                            </td>
                                            <td>
                                                <c:out value="${ninja.age}" />
                                            </td>
                                            <td><a href="/ninjas/delete/${ninja.id}">Delete</a></td>
                                            <!--<a href="/persons/edit/${person.id}">Edit</a>-->
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
	                    </c:when>
	                    <c:otherwise>
	                    	<label><h4 style='text-align: left' class='h4label'>There are no individals registerd at this dojo.</h4></label>
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
