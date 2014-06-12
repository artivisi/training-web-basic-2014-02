<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List Users</title>
</head>
<body>	
	<h3>List Users</h3>		
		
	<form role="form">
		<div class="form-group">		
			<a href="form?type=1" class="btn btn-primary btn-sm active" role="button">Add User</a>
		</div>	
		<div class="form-group">
			<table class="table table-striped table-hover">
				<tr>
					<th>User Id</th>
					<th>User Name</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Edit</th>
				</tr>
				<c:forEach var="i" items="${lUser}">
					<tr>
						<td>${i.id}</td>
						<td>${i.username}</td>
						<td>${i.fullname}</td>
						<td>${i.email}</td>
						<td><a href="form?type=2&id=${i.id}" class="btn btn-success btn-sm active" role="button">Edit</a></td>
					</tr>
				</c:forEach>
			</table>
			Total User(s) : ${totUser}					
		</div>		
	</form>	
</body>
</html>