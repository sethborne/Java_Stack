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
                    <li><h4>Java Spring Data II: Assignment One: Drivers License: Show All Dojos</h4></li>
                    <!--<li><h4><a href="">Top Songs</a></h4></li>-->
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/dojos/all">Show All Dojos</a></h4></li>
                    <li><h4><a href="/dojos/add">Add New Dojo</a></h4></li>
                    <li><h4><a href="/ninjas/add">Add New Ninja</a></h4></li>
                    <!--<li><h4>Java Spring Data I: Assignment Three: Lookify</h4></li>-->
                </ul>
            </div>
        </div>
        <div id="body">
            <hr>
            <br>
            <div id='body-top'>
                <div class='left'>
                </div>
                <div class='right'>
                    <!--<a href="/persons/add"><input class='butInputSubmitBlue' type="submit" value="Add New Person"/></a>-->
                </div>
            </div>
            <div id='top'>
				<div class='center'>
                	<table border="0" cellspacing="0" cellpadding="0">
                    	<thead>
                    		<tr>
	                    		<th>Dojo Name</th>
	                    		<!--<th>Creator</th>-->
	                    		<!--<th>Version</th>-->
	                    		<th>Actions</th>
	                    	</tr>
                    	</thead>
                    	<tbody>
                    	<c:forEach items="${allDojos}" var="varDojo" varStatus="loop">
	                    	<tr class="center">
	                    		<td><a href="/dojos/${varDojo.id}"><c:out value="${varDojo.name}"/></a></td>
	                    		<!--<td><c:out value=""/></td>-->
	                    		<!--<td><c:out value=""/></td>-->
	                    		<td><a href="/dojos/delete/${varDojo.id}">Delete</a></td>
                                <!--<a href="/persons/edit/${person.id}">Edit</a>-->
	                    	</tr>
                    	</c:forEach>
                    	</tbody>
                    </table>
                </div>

            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>