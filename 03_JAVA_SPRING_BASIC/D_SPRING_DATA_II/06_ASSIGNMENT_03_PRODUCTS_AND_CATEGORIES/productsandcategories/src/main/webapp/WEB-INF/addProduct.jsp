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
                        <h4>Java Spring Data III: Assignment Three: Products and Categories: Add Product</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/products/all">Show All Products</a></h4></li> 
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
            		<h1>Create a New Product</h1>
	                <form:form method="POST" action="/products/create" modelAttribute="product">
	                    <!--name, creator version-->
	                    <form:label path="name">Product Name</form:label>
	                        <form:errors path="name" class="errors"/>
	                        <form:input path="name" class="inputTextLeft" type="text" placeholder="Please Enter the Product Name"/>
	                    <br>
	                    <form:label path="description">Product Description</form:label>
	                        <form:errors path="description" class="errors"/>
	                        <form:input path="description" class="inputTextLeft" type="text" placeholder="Please Enter the Product Name"/>
	                    <br>
	                    <form:label path="price">Product Description</form:label>
	                        <form:errors path="price" class="errors"/>
	                        <form:input path="price" class="inputTextLeft" type="number" step=".01" min="0.00" placeholder="0.00"/> 
	                    <br>
	                    <div class="btn-left">
	                    	<input class='btnSubmit btnGreen' type="submit" value="Create an Account"/>
	                    </div>
	                </form:form>
	                <!--<input type="number" placeholder="0.00">-->
                </div>
            </div>
            
            <div id="bot">
                
            </div>
        </div>
    </div>
</body>

</html>