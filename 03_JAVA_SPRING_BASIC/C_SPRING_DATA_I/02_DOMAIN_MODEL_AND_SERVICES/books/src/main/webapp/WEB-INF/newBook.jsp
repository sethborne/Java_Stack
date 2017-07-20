<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
                        <h4>Lesson - Books - Make New</h4>
                        <!--<h4><a href="results">Results</a></h4>-->
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
                <div class='right'></div>
            </div>
            <div id='top'>
                <div class="dojoForm">
                    <form:form method="POST" action="/books/new" modelAttribute="book">
                        <form:label path="title">Title
					    <form:errors path="title" class="errors"/>
					    <form:input path="title" class='inputText' type='text' placeholder='Please Enter Title Here'/></form:label><br>
					    <form:label path="description">Description
					    <form:errors path="description" class="errors"/>
					    <form:textarea path="description" class="textAreaIdea" rows="8" cols="20" placeholder="Please Enter Your Description Here"/></form:label><br>
					    <form:label path="language" >Language
					    <form:errors path="language" class="errors"/>
					    <form:input path="language" class='inputText' type='text' placeholder='Please Enter The Language the Book is Written In'/></form:label><br>
					    <form:label path="numberOfPages" >Pages
					    <form:errors path="numberOfPages" class="errors"/> 
					    <form:input type="number" path="numberOfPages" class='inputText' placeholder='Please Enter Number of Pages'/></form:label><br>
					    <input class='butInputSubmitGreen' type="submit" value="Submit"/>
                    </form:form>
                </div>
            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>