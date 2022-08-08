<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		
		<h1 class="text-center mb-3">Welcome to Employee App</h1>
		<table border="1" cellpadding="5">
		<tr>
		<th>First Name</th>
		<th> Last Name</th>
		<th>User Name</th>
		<th>Password</th>
		<th>Adress</th>
		<th>Contact</th>
		</tr>
		
		<c:forEach items="${listEmployee}" var="employee" varStatus="status">
		<tr>
		<td>${status.index +1}</td>
		<td>${status.fname +1}</td>
		<td>${status.lname +1}</td>
		<td>${status.uname +1}</td>
		<td>${status.pass +1}</td>
		<td>${status.add +1}</td>
		<td>${status.contact +1}</td>
		
		
		</c:forEach>
		</table>
		</div>

</body>
</html>
