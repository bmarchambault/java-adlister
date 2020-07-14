<%--
  Created by IntelliJ IDEA.
  User: bobbiearchambault
  Date: 7/14/20
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
<h1> this is your profile page</h1>

<%--the following are the same way.  each retrieve from the home.jsp.  the ${} is the way to use experssion language--%>
<h3> Hi, <%=request.getParameter("username")%></h3>
<h3> Hi, ${param.username}</h3>
</body>
</html>
