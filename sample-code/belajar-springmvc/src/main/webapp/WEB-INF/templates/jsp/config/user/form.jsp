<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form User (${titleForm})</title>
</head>
<body>
	<div class="jumbotron">	
		<h3>${titleForm}</h3>
		
		<form role="form">
		  <div class="form-group">
		    <label for="iUsername">User Name</label>
		    <input type="text" class="form-control" id="iUsername" placeholder="Please Enter User Name">
		  </div>
		  <div class="form-group">
		    <label for="iFullname">Full Name</label>
		    <input type="text" class="form-control" id="iFullname" placeholder="Please Enter Full Name">
		  </div>
		  <div class="form-group">
		    <label for="iEmail">Email</label>
		    <input type="email" class="form-control" id="iEmail" placeholder="Please Enter email">
		  </div>
		  		  
		  <button type="submit" class="btn btn-primary btn-sm">${titleForm}</button>		  
		  <a href="list" class="btn btn-info btn-sm active" role="button">Back</a>
		</form>
	</div>
</body>
</html>