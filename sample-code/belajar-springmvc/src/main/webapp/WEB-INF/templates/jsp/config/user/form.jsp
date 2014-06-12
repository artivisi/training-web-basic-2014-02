<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form User (${titleForm})</title>
</head>
<body>
	<div class="jumbotron">	
		<h3>${titleForm}</h3>
		
                <form:form role="form" commandName="user">
		  <div class="form-group">
		    <label for="iUsername">User Name</label>
                    <form:input path="username" class="form-control" id="iUsername"/>
		  </div>
		  <div class="form-group">
		    <label for="iFullname">Full Name</label>
                    <form:input path="fullname" class="form-control" id="iFullname"/>
		  </div>
		  <div class="form-group">
		    <label for="iEmail">Email</label>
                    <form:input path="email" class="form-control" id="iEmail"/>
		  </div>
		  		  
		  <button type="submit" class="btn btn-primary btn-sm">${titleForm}</button>		  
		  <a href="list" class="btn btn-info btn-sm active" role="button">Back</a>
		</form:form>
	</div>
</body>
</html>