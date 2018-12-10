<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	alert("welcome to JQuery...");
});
</script>

<script src="http://code.jquery.com/jquery-3.2.1min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#empId").change(function(){
		$.ajax({
			url:'checkId',
			data:{eid:$("#empId").val()},
			success:function(resTxt){
				$("#msg").text(resTxt);
				if(resTxt!=""){
					$("#empId").val("");
					$("#empId").focus();
				}
					
			}
		});
	});
});
</script>






</head>
<body>
<h1>Welcome to Register page</h1>
<form action="insert" method="post">
<pre>
Id   : <input type="text" name="empId" id="empId"/><span id="msg"></span>
Name : <input type="text" name="empName"/>
Sal  : <input type="text" name="empSal"/>
<input type="submit" value="Insert"/>
</pre>
</form>
${msg}<br/>
<a href="viewAllEmp">View All Records</a>
</body>
