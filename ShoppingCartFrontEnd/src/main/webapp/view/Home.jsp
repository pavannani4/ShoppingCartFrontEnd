<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping cart</title>
</head>
<body>
<h2>Happy shopping</h2>

${message}

<a href="Login">Login </a>
<a href="Registration"> New user</a>
<hr color="blue">
<c:if test="${userClickLoginHere}==true">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>
<c:if test="${userClickRegisterHere}==true">
<jsp:include page="Registration.jsp"></jsp:include>
</c:if>

</body>
</html>