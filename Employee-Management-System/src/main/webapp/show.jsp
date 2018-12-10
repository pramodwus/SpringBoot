<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>


</body>
<table border=1>
<tr>

<th>EmployeeNo</th>
<th>EmployeeName</th>
<th>Salary</th>
<th>DeptNo</th>
<th>Action</th>
</tr>
<c:if test="${not empty data}">
<c:forEach items="${data}" var="ob">
<tr>
<td>${ob.emno}</td>
<td>${ob.ename}</td>
<td>${ob.salary}</td>
<td>${ob.deptno}</td>
<td><a href="updatedata?id=${ob.emno}">update</a>
<td><a href="delete?id=${ob.emno}">Delete</a>
</td>
</tr>
</c:forEach>

</c:if>


</html>