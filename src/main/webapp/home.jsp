<%--
  Created by IntelliJ IDEA.
  User: bobbiearchambault
  Date: 7/14/20
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int myNumber = 1; %>
<% request.setAttribute("number", 12);%>
<%--to use the above set attribute, you add the following into the body:  <h3>(or any tag) ${number} (or attribute name) </h3>
set attributes are supposed to be on the servlet.  you can set a title as an attribute, for example.  this helps us separate
things out and your page is created dynamically. --%>
<html>
<head>
    <title>Home Page</title>
<%--&lt;%&ndash; this is an example of using the request object &ndash;%&gt;--%>
<%--<%--%>
<%--    String firstName = request.getParameter("firstName");--%>
<%--        if(firstName.equalsIgnoreCase("bobbie")){--%>
<%--            response.sendRedirect("/index.jsp");--%>
<%--        }--%>
<%--%>--%>
</head>
<body>
<%-- this is how we include the navbar file (use the include key word.) --%>
<%@ include file="partials/navbar.jsp"%>

<h3>What would you like to do? </h3>

<h3>View your profile</h3>
<form action= "/user-profile.jsp" method = "get">

<%--    to auto input a name: --%>
<input type="hidden" id="username" name="username" value="Bobbie">

<button type= "submit"> Go There </button>
</form>

<h3> Add a To Do </h3>
<form action="/todo.jsp" method="post">
    <input type = "text" id="item" name="item">
    <button type="submit"> Add to list </button>
</form>






<%--&lt;%&ndash; create instance varibles:  &ndash;%&gt;--%>
<%--<%! String firstName = "Bobbie";--%>
<%--String lastName = "Archambault"; %>--%>


<%--<h1> Hello, <%= firstName + " " + lastName%> </h1>--%>

<%--&lt;%&ndash; this is an example of using the request object &ndash;%&gt;--%>
<%--<h1>Welcome To The Site!</h1>--%>
<%--<p>Path: <%= request.getRequestURL() %></p>--%>
<%--<p>Query String: <%= request.getQueryString() %></p>--%>
<%--<p>"name" parameter: <%= request.getParameter("name") %></p>--%>
<%--<p>"method" attribute: <%= request.getMethod() %></p>--%>
<%--<p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>

<%--&lt;%&ndash; sets a redirect to the page you define.   &ndash;%&gt;--%>
<%--<%response.sendRedirect("/index.jsp");%>--%>



<%--<%@include file="partials/aboutme.jsp"%>--%>



<%-- this is how we include the footer file --%>
<%@ include file="partials/footer.jsp"%>
</body>
</html>
