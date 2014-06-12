<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
	    
	    <table class="table table-striped">
			<tr>
				<td>InfoName</td>
				<td>InfoLink</td>
			</tr>
			<c:forEach var="listVar" items="${generalInfoList}">
				<tr>
            		<td><c:out value="${listVar.infoName}"/></td>
                	<td><c:out value="${listVar.infoLink}"/></td>
                	<td><a href="#">Edit</a></td>
                	<td><a href="#">Delete</a></td>
           		</tr>
        	</c:forEach>		
		</table>
		<h2>
			ROLES LIST                 
        </h2>
        <h3>
            Total Records : <c:out value="${fn:length(generalInfoList)}"/>
        </h3>
	</div>
	
</body>
</html>