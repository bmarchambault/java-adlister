<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <div>
              <h1>Welcome to your profile page, ${sessionScope.user}!</h1>
        </div>

    </div>

</body>
</html>
