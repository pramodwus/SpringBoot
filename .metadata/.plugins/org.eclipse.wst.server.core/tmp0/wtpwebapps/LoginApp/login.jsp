<!-- login.jsp -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center>
<form:form action="check" method="post" commandName="imp">
<table>
<tr>
<td>Username:</td><td><form:input path="username"/></td>
<td><font color='red'><form:errors path="username"/></font></td>
</tr>
<td>Password:</td><td><form:input path="pasword"/></td>
<td><font color='red'><form:errors path="pasword"/></font></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</table>
</form:form>
<center>