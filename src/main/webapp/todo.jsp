<%--
  Created by IntelliJ IDEA.
  User: bobbiearchambault
  Date: 7/14/20
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Do List</title>
</head>
<body>
<h1>Here is your to do list:</h1>
<p><%= request.getParameter("item")%></p>

<%--reveals what method we are using to get to to--%>
<p><%=request.getMethod()%></p>
</body>
</html>
