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
                    <li>
                        <h4>Lesson - Books - Show All</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
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
                	<a href="/books/new"><input class='butInputSubmitBlue' type="submit" value="Create New Book"/></a>
                </div>
            </div>
            <div id='top'>

                    <table border="0" cellspacing="0" cellpadding="0">
                    		<thead>
                    			<tr>
	                    			<th>Title</th>
	                    			<th>Description</th>
	                    			<th>Language</th>
	                    			<th>Number of Pages</th>
	                    			<th>Delete</th>
	                    		</tr>
                    		</thead>
                    		<tbody>
                    		<c:forEach items="${books}" var="book" varStatus="loop">
	                    		<tr class="center">
	                    			<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
	                    			<td><c:out value="${book.description}"/></td>
	                    			<td><c:out value="${book.language}"/></td>
	                    			<td><c:out value="${book.numberOfPages}"/></td>
	                    			<td><a href="/books/delete/${book.id}">Delete</a> <a href="/books/edit/${book.id}">Edit</a></td>
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