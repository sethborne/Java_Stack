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
                        <h4>Java Spring Data II: Assignment Two: Dojos and Ninjas</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <!--<li><h5><a href="/logout">Logout</a></h5></li>-->
                    <li><h4><a href="/dojos/all">Show All Dojos</a></h4></li>
                    <li><h4><a href="/dojos/add">Create a New Dojo</a></h4></li>
                    <li><h4><a href="/ninjas/add">Create a New Ninja</a></h4></li>  
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
                	<h1>Welcome to Dojos and Ninjas</h1>
                	<br><br>
                	<h2>Would you like to create a Dojo?</h2>
                	<br>
                	<div class="btn-center">
                    	<a href="/dojos/add"><input class='btnSubmit btnGreen' type='submit' value='Click Here to Create a Dojo'></a>
                    </div>
                </div>

            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>