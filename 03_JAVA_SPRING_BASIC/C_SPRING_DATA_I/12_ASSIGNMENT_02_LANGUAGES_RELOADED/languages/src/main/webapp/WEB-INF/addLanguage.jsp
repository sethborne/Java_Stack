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
                        <h4>Java Spring Data I: Assignment Two: Languages Reloaded: Add Language</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                	<li><h4><a href="/languages">Dashboard</a></h4></li>
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
            	<div class="dojoForm">
                    <form:form method="POST" action="/languages/add" modelAttribute="language">
                    <!--name, creator version-->
                        <form:label path="name">Name
                            <form:errors path="name" class="errors"/>
                            <form:input path="name" class="inputText" type="text" placeholder="Please Enter Language Name"/>
                        </form:label><br>
                        <form:label path="creator">Creator
                            <form:errors path="creator" class="errors"/>
                            <form:input path="creator" class="inputText" type="text" placeholder="Please Enter Language Creator"/>
                        </form:label><br>
                        <form:label path="currentVersion">Version
                            <form:errors path="currentVersion" class="errors"/>
                            <form:input path="currentVersion" class="inputText" type="text" placeholder="Please Enter Version Number"/>
                        </form:label><br>
                        <input class='butInputSubmitGreen' type="submit" value="Submit New Language"/>
                    </form:form>
                </div>
            </div>
            <div id="bot">
            </div>
        </div>
    </div>
</body>

</html>