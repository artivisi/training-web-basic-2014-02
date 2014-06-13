<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">	
		<h3>${titleForm}</h3>
		
         <form:form role="form" commandName="roles">
			  <div class="form-group">
			    <label for="iRoleName">Role Name</label>
	                    <form:input path="roleName" cssClass="form-control" id="iRoleName"/>
	                    <form:errors path="roleName" />
	                    
	                    <form:hidden path="rolesId" />
	                    
			  </div>		  
		  		  
		  		<button type="submit" class="btn btn-primary btn-sm">${titleForm}</button>		  
		  		<a href="list" class="btn btn-info btn-sm active" role="button">Back</a>
		</form:form>
	</div>
</body>
</html>