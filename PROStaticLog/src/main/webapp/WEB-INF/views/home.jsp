<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC web application from scratch</title>
</head>
<body>
    <h1>Welcome to the home page.</h1>
    
	<form action="${pageContext.request.contextPath}/logout" method="post">
        <input type="submit" value="Logout" />
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
    </form>
</body>
</html>