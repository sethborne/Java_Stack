
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id='head'>
        </div>
        <div id='body'>
			<h1>Hello <c:out value="${name}"/></h1>
			<br>
			<h3>Welcome to SpringBoot!</h3>
        </div>
        <div id='foot'>
        </div>
    </div>
</body>

</html>