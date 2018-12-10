<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${not empty msg}">
<h2>Record Added sucessfully</h2>
</c:if>
<c:if test="${not empty msg1}">
<h2>Record Updated Sucessfully</h2>
</c:if>
<center>
<h1>Welcome to Client Rest Application User Management System</h1>
<h3>
<a href="adduser">AddNewUser</a><br>
<a href="delete">DeleteUserById</a><br>
<a href="updateUser">UpdateUser</a><br>
<a href="showUser">DisplayAllUser</a><br>
<a href="getUser">DisplayUserById</a>
</h3>
</center>