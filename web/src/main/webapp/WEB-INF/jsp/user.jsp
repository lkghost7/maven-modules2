<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <p>Username: </p>
    <ul >
    <c:forEach items="${requestScope.users}" var="user">
            <li>
                    ${user.name}
            </li>
    </c:forEach>

</div>
</body>
</html>
