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
                        <h4>Java Spring Data I: Assignment Three: Lookify: Add Song</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                	<!--<li><h5><a href="/languages">Dashboard</a></h5></li> -->
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
                <form:form method="POST" action="/songs/add" modelAttribute="song">
                    <!--name, creator version-->
                    <form:label path="title">Title
                        <form:errors path="title" class="errors"/>
                        <form:input path="title" class="inputText" type="text" placeholder="Please Enter Song Title"/>
                    </form:label><br>
                    <form:label path="artist">Artist
                        <form:errors path="artist" class="errors"/>
                        <form:input path="artist" class="inputText" type="text" placeholder="Please Enter Artist Name"/>
                    </form:label><br>
                    <form:label path="rating">Rating
                        <form:errors path="rating" class="errors"/>
                        <form:select path="rating" class="inputText" type="number">
                        	<form:option value="-1">--SELECT--</form:option>
                        	<form:option value="10">10</form:option>
                        	<form:option value="9">9</form:option>
                        	<form:option value="8">8</form:option>
                        	<form:option value="7">7</form:option>
                        	<form:option value="6">6</form:option>
                        	<form:option value="5">5</form:option>
                        	<form:option value="4">4</form:option>
                        	<form:option value="3">3</form:option>
                        	<form:option value="2">2</form:option>
                        	<form:option value="1">1</form:option>
                        	<form:option value="0">0</form:option>
                        </form:select>
                    </form:label><br>
                    <input class='butInputSubmitGreen' type="submit" value="Submit"/>
                </form:form>    
            </div>
            
            <div id="bot">
                
            </div>
        </div>
    </div>
</body>

</html>