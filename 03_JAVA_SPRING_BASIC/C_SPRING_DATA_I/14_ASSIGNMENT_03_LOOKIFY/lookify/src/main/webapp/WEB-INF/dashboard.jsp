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
        <div id="head">
            <div class="left">
                <ul>
                    <li><h4>Java Spring Data I: Assignment Three: Lookify:  Dashboard</h4></li>
                    <li><h4><a href="">Top Songs</a></h4></li>
                </ul>
            </div>
            <div class="right">
                <ul>
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
                    <a href="/songs/add"><input class='butInputSubmitBlue' type="submit" value="Add New Song"/></a>
                </div>
            </div>
            <div id='top'>
				<div class='center'>
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
                    	<c:forEach items="${songs}" var="song" varStatus="loop">
	                    	<tr class="center">
	                    		<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
	                    		<td><c:out value="${song.artist}"/></td>
	                    		<td><c:out value="${song.rating}"/></td>
	                    		<td><a href="/songs/delete/${song.id}">Delete</a> <a href="/songs/edit/${song.id}">Edit</a></td>
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