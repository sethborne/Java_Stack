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
                    <li><h4>Java Spring Data III: Assignment Three: Products and Categories: Show All Products</h4></li>
                    <!--<li><h4><a href="">Top Songs</a></h4></li>-->
                </ul>
            </div>
            <div class="right">
                <ul>
                    <!--<li><h4><a href="/products/all">Show All Products</a></h4></li>-->
                    <li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/categorys/all">Show All Categorys</a></h4></li>
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
				<div class='center'>
                	<table border="0" cellspacing="0" cellpadding="0">
                    	<thead>
                    		<tr>
	                    		<th>Product Name</th>
	                    		<th>Description</th>
	                    		<th>Price</th>
	                    		<th>Actions</th>
	                    	</tr>
                    	</thead>
                    	<tbody>
                    	<c:forEach items="${allProducts}" var="varProduct" varStatus="loop">
	                    	<tr class="center">
	                    		<td><a href="/products/${varProduct.id}"><c:out value="${varProduct.name}"/></a></td>
	                    		<td><c:out value="${varProduct.description}"/></td>
	                    		<td>$<c:out value="${varProduct.price}"/></td>
	                    		<td><a href="/products/delete/${varProduct.id}">Delete</a></td>
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