<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List General Info</title>
</head>
<body>
	<h3>List General Info</h3>
	
	<form role="form">
		<div class="form-group">		
			<a href="form?type=1" class="btn btn-primary btn-sm active" role="button">Add User</a>
		</div>	
		<div class="form-group">
		<table class="table table-striped">
			<tr>
				<th>InfoId</th>
				<th>InfoName</th>
				<th>InfoLink</th>
				<th>Edit</th>
			</tr>
			<c:forEach var="listVar" items="${generalInfoList}">
				<tr>
            		<td>${listVar.infoId}</td>
            		<td>${listVar.infoName}</td>
                	<td>${listVar.infoLink}/></td>
                	<td><a href="form?type=2&id=${listVar.infoId}" class="btn btn-success btn-sm active" role="button">Edit</a></td>
           		</tr>
        	</c:forEach>		
		</table>
        Total Info : ${totInfo}
        </div>
	</form>
</body>
</html>