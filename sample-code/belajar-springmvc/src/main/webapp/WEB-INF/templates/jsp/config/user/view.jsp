<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<body>
	<div class="jumbotron">
		<h3>View Users</h3>
		<form class="form-horizontal" role="form">
		  <div class="form-group">
		    <label class="col-sm-2 control-label" for="iSearchUser">Search User</label>
		    <div class="col-sm-10">
		    	<input type="text" class="form-control" id="iSearchUser" placeholder="Please Enter User Name">
		    </div>		    
		  </div>	
		  
		  <div class="form-group">
		  	<label class="col-sm-2 control-label">&nbsp;</label>
		    <div class="col-sm-10">
		    	<button type="submit" class="btn btn-primary btn-sm">Search User</button>
		    </div>
		  </div>  		  
		</form>
	</div>
</body>
</html>