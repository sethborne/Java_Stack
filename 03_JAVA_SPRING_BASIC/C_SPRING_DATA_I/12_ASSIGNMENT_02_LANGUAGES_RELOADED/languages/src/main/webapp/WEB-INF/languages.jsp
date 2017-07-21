<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='../css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="head">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Data I: Assignment Two: Languages Reloaded</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                	<!--<li><h5><a href="/languages">Dashboard</a></h5></li>-->
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
                <div class='right'>
                	<a href="/languages/add"><input class='butInputSubmitBlue' type="submit" value="Add a New Language"/></a>
                	
                </div>
            </div>
            <div id='top'>
				<table border="0" cellspacing="0" cellpadding="0">
                    		<thead>
                    			<tr>
	                    			<th>Name</th>
	                    			<th>Creator</th>
	                    			<th>Version</th>
	                    			<th>Actions</th>
	                    		</tr>
                    		</thead>
                    		<tbody>
                    		<c:forEach items="${languages}" var="language" varStatus="loop">
	                    		<tr class="center">
	                    			<td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
	                    			<td><c:out value="${language.creator}"/></td>
	                    			<td><c:out value="${language.currentVersion}"/></td>
	                    			<td><a href="/languages/delete/${language.id}">Delete</a> <a href="/languages/edit/${language.id}">Edit</a></td>
	                    		</tr>
                    		</c:forEach>
                    		</tbody>
                    </table>
            </div>
            
            <div id="bot">
                
            </div>
        </div>
    </div>
</body>

</html>