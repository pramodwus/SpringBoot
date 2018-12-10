<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border=1>
<tr>
<th>UserId</th>
<th>UserName</th>
<th>Email</th>
</tr>
<c:if test="${not empty data}">
<c:forEach items="${data}" var="ob">
<tr>
<td>${ob.userId}</td>
<td>${ob.userName}</td>
<td>${ob.gmail}</td>
</tr>
</c:forEach>

</c:if>
</table>
<a href="index.jsp">Click Here</a>
</center>

</body>
</html>