
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='en'>

<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div id='mainContainer'>
        <div id="header">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Security: Lesson: Dashboard</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li>
	                    <form id="logoutForm" method="POST" action="/logout">
			                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			                <div class="btn-right">
			                	<input class='btnSubmit btnBlue' type="submit" value="Logout!"/>
			                </div>
			            </form>
		            </li>
                </ul>
            </div>
        </div>
        <div id="body">
            <hr>
            <br>
            <div id='body-top'>
                <div class='left'>
        			<h1>Welcome <c:out value="${currentUser.firstName}"></c:out>!</h1>
        		</div>
                <div class='right'></div>
            </div>
            <div id='top'>
            	<div class='left'>
                </div>
                <div class="">
                	<div class="blackEdgeBox">
                		<label><h4 style='text-align: left' class='h4label'>First Name:  </h4></label>
                    	<h4 class='h4Space'><c:out value="${currentUser.firstName}"/></h4><br>
                    	                    
                    	<label><h4 style='text-align: left' class='h4label'>Email:  </h4></label>
                    	<h4 class='h4Space'><c:out value="${currentUser.username}"/></h4><br>
                    	                    
                    	<label><h4 style='text-align: left' class='h4label'>Sign Up:  </h4></label>
                    	<h4 class='h4Space'><c:out value="${currentUser.createdAt}"/></h4><br>
                    	                    
                    	<label><h4 style='text-align: left' class='h4label'>Last Sign In:  </h4></label>
                    	<h4 class='h4Space'><c:out value="${currentUser.updatedAt}"/></h4><br>
                	</div>
                </div>
            </div>
            
            <div id="bot"></div>
        </div>
    </div>
</body>

</html>