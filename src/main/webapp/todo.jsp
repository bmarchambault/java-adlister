<%--
  Created by IntelliJ IDEA.
  User: bobbiearchambault
  Date: 7/14/20
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setAttribute("isAdmin", true);%>
<%request.setAttribute("myTasks", new String[]{"item 1", "item 2", "item 3"}); %>
<html>
<head>
    <title>To Do List</title>
</head>
<body>

<%@ include file="partials/navbar.jsp"%>
<%--say we want the header to change if the user is an admin--%>
<h1>Welcome to your to do list</h1>
<c:choose>
    <c:when test="${isAdmin}">
        <p>You are viewing this as an admin.</p>
    </c:when>
    <c:otherwise>
        <p> Move along now...</p>
    </c:otherwise>
</c:choose>



<h1>Here is your to do list:</h1>
<p><%= request.getParameter("item")%></p>

<ul>
    <c:forEach items="${myTasks}" var="task">
        <li>${task}</li>
    </c:forEach>
</ul>


<%--reveals what method we are using to get to to--%>
<p><%=request.getMethod()%></p>
<%@ include file="partials/footer.jsp"%>

</body>
</html>