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
                        <th><a href="list?page=${currentPage}&sort=username">User Name</a></th>
                        <th><a href="list?page=${currentPage}&sort=fullname">Full Name</a></th>
                        <th>
                            Email
                            <a class="btn" href="list?sort=email&dir=asc">
                                <span class="glyphicon glyphicon-arrow-up"></span>
                            </a>
                            <a class="btn" href="list?sort=email&dir=desc">
                                <span class="glyphicon glyphicon-arrow-down"></span>
                            </a>
                        </th>
                        <th>Edit</th>
                    </tr>
                    <c:forEach var="i" items="${lUser}">
                        <tr>
                            <td>${i.username}</td>
                            <td>${i.fullname}</td>
                            <td>${i.email}</td>
                            <td><a href="form?type=2&id=${i.id}" class="btn btn-success btn-sm active" role="button">Edit</a></td>
                        </tr>
                    </c:forEach>
                </table>
                Total User(s) : ${totUser}	

                <ul class="pagination">
                    <li><a href="list?page=1&sort=${currentSort}&dir=${currentDir}">&laquo;</a></li>
                    <c:forEach var="p" begin="1" end="${totPage}">
                    <li><a href="list?page=${p}&sort=${currentSort}&dir=${currentDir}">${p}</a></li>
                    </c:forEach>
                    <li><a href="list?page=${totPage}&sort=${currentSort}&dir=${currentDir}">&raquo;</a></li>
                </ul>
            </div>		
        </form>	
    </body>
</html>