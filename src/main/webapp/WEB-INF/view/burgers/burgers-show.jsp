<%--
  Created by IntelliJ IDEA.
  User: bobbiearchambault
  Date: 7/17/20
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: casey
  Date: 7/16/20
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="${burger.title} Details"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<div class="container">
    <h1>${burger.title} Details</h1>
    <div class="list-group">
        <c:forEach items="${burger.ingredients}" var="ingredient">
            <a href="#" class="list-group-item list-group-item-action">
                <strong>${ingredient.title}</strong>
            </a>
        </c:forEach>
    </div>
</div>


<%-- Bootstrap includes (and other scripts) are loaded last --%>
<jsp:include page="../partials/scripts.jsp" />
</body>
</html>
