<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <div id="header">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Data III: Assignment Three: Products and Categories: Show Product</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                	<li><h4><a href="/">Return To Start Page</a></h4></li>
                    <li><h4><a href="/products/all">Show All Products</a></h4></li>
                    <li><h4><a href="/categorys/all">Show All Categorys</a></h4></li>
                    <!--<li><h4><a href="/products/add">Add New Product</a></h4></li>-->
                    <li><h4><a href="/categorys/add">Add New Category</a></h4></li>
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
            	<div class="left">
                    <div class="dojoForm">
                        <h1>Name:  ${showOneProduct.name}</h1>
                        <h2>Description:  ${showOneProduct.description}</h2>
                        <h3>Price:  $${showOneProduct.price}</h3>
                        <br>
                        <h2>Categories This Item Belongs Too:</h2>
                        <ul>
                        	<c:forEach items="${showOneProduct.categorys}" var="categorysJoined">
                        		<li>${categorysJoined.name}</li>
                        	</c:forEach>
                        </ul>
                                       
                        
                        <!--<a href="/"><input class='butInputSubmitGreen' type='submit' value='Return'></a>-->
                    </div>
                </div>
                <div class="right">
                    <div class="dojoForm">
                        <h2>Categorys this Product Has Not Been Added Too</h2>
                        <form method="POST" action="/products/addCategoryToProduct/${showOneProduct.id}">
                            <!--name, creator version-->
                            <!--<label>Category</label>-->
                                <select name="categoryId" class="inputTextLeft">
                                    <option value="-1">--UnJoined Categorys--</option>
                                	
                                	<c:forEach items="${allCategoriesNot}" var="category">
                                    	<option value="${category.id}">${category.name}</option>
                                    </c:forEach>
                                </select>
                            <br>
                            <div class="btn-left">
                                <input class='btnSubmit btnGreen' type="submit" value="Add Category to Product"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>
