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
                    <li><h4>Java Spring Data III: Assignment Three: Products and Categories: Show All Categorys</h4></li>
                    <!--<li><h4><a href="">Top Songs</a></h4></li>-->
                </ul>
            </div>
            <div class="right">
                <ul>
                    <!--<li><h4><a href="/products/all">Show All Products</a></h4></li>-->
                    <li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/products/all">Show All Products</a></h4></li>
                    <li><h4><a href="/products/add">Add New Product</a></h4></li>
                    <li><h4><a href="/categorys/add">Add New Category</a></h4></li>
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
				<div class='left'>
                	<table border="0" cellspacing="0" cellpadding="0">
                    	<thead>
                    		<tr>
	                    		<th>Category Name</th>
	                    		<!--<th>Description</th>-->
	                    		<!--<th>Price</th>-->
	                    		<th>Actions</th>
	                    	</tr>
                    	</thead>
                    	<tbody>
                    	<c:forEach items="${allCategorys}" var="varCategory" varStatus="loop">
	                    	<tr class="center">
	                    		<td><a href="/categorys/${varCategory.id}"><c:out value="${varCategory.name}"/></a></td>
	                    		<!--<td><c:out value="${varProduct.description}"/></td>-->
	                    		<!--<td>$<c:out value="${varProduct.price}"/></td>-->
	                    		<td><a href="/categorys/delete/${varCategory.id}">Delete</a></td>
                                <!--<a href="/products/edit/${person.id}">Edit</a>-->
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