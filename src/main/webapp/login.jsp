<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bobbiearchambault
  Date: 7/15/20
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>
<h1> Please login </h1>
<br>
<form action="/login.jsp" method="post">
    <label for="username"> Please enter your user name </label>
    <input type="text" id="username" name="username">
    <br>
    <label for="password"> Please enter your password</label>
    <input type="password" id="password" name="password">
    <br>
    <button type="submit">Login</button>
</form>

<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>

</body>
</html>
