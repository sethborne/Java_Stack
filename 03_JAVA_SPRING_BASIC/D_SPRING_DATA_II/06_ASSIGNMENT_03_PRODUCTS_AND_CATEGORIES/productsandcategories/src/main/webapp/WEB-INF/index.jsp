<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="header">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Data III: Assignment Three: Products and Categories</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/products/all">Show All Products</a></h4></li>
                    <li><h4><a href="/products/add">Create a New Product</a></h4></li>
                    <li><h4><a href="/categorys/add">Create a New Category</a></h4></li>  
                </ul>
            </div>
        </div>
        <div id="body">
            <hr>
            <br>
            <div id='body-top'>
                
            </div>
            <div id='top'>
				<div class='center'>
                	<h1>Welcome to Products and Categories</h1>
                	<br><br>
                	<h2>Would you like to create a Product?</h2>
                	<br>
                	<div class="btn-center">
                    	<a href="/products/add"><input class='btnSubmit btnGreen' type='submit' value='Click Here to Create a Product'></a>
                    </div>
                </div>

            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>