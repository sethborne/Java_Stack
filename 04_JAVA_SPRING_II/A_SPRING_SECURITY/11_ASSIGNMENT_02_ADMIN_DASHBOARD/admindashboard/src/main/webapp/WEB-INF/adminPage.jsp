
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
                        <h4>Java Spring Data II: Spring Security: Assignment 02: Admin Dashboard: Admin</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                	<li><a href="/dashboard"><h4>Return to Dashboard</h4></a></li>
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
        		<h1>Welcome to the Admin Page, <c:out value="${currentUser.firstName}"></c:out>!</h1>
                <div class='left'>
        		</div>
                <div class='right'></div>
            </div>
            <div id='top'>
            	<div class="center">
            		<table border="0" cellspacing="0" cellpadding="0">
            			<thead>
            				<tr>
            					<th>Name</th>
            					<th>Email</th>
            					<th>Permissions</th>
            					<th>Action</th>
            					<th>Admin Toggle</th>
            				</tr>
            			</thead>
            			<tbody>
	            			<c:forEach items="${allUsers}" var="user">
	            				<tr>
	            					<td><c:out value="${user.firstName}"/> <c:out value="${user.lastName}"/></td>
	            					<td><c:out value="${user.username}"/></td>
	            					<td>
	            						<c:if test="${user.roles.contains(adminRole)}">Admin</c:if>
	            						<c:if test="${!user.roles.contains(adminRole)}">Not Admin</c:if>
	            					</td>
	            					<c:choose>
		            					<c:when test="${!user.roles.contains(adminRole)}">
		            						<td>
			            						<div>
				            						<!-- This should be a form -->
								                	<input class='btnSubmit2 btnRedHov' type="submit" value="Delete"/>
								                </div>
								            </td>
								            <td>
								                <div>
								                	<form style="display: inline-block" action="/users/makeadmin/${user.id}" method = "post">
								                		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								                		<input type="hidden" value="${user.id}"/>
								                		
								                		<input class='btnSubmit2 btnGreenHov' type="submit" value="Grant Status"/>
								                	</form>
								                </div>
		            						</td>
							            </c:when>
							            <c:otherwise>
							            	<td></td>
							            	<td></td>
							            </c:otherwise>
							        </c:choose>
	            				</tr>
            				</c:forEach>
            			</tbody>
            		</table>
            	</div>
            </div>
            
            <div id="bot"></div>
        </div>
    </div>
</body>

</html>