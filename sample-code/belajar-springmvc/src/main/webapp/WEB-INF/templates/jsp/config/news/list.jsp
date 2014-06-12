<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <!-- Main component for a primary marketing message or call to action -->
        <div class="jumbotron">
            <h1>${pesan}</h1>
 
            
              <h2>
                     News LIST                 
              </h2>
              <h3>
                     Total Records : <c:out value="${fn:length(newslist)}"/>
              </h3>
            
            
           <table>
           		<tr>
           			<td>News ID </td>
           			<td>News Code </td>
           			<td>News Create Date </td>	
           			<td>News Create User </td>	
           			<td>News Date </td>	
           			<td>News Description </td>	
           		</tr>
           		
 				<c:forEach var="listVar" items="${newslist}">
                     <tr>
                     	<td><c:out value="${listVar.newsId}"/></td>
                     	<td><c:out value="${listVar.newsDate}"/></td>
                     	<td><c:out value="${listVar.newsCode}"/></td>
                     	<td><c:out value="${listVar.newsDesc}"/></td>
                     	<td><c:out value="${listVar.newsCreateUser}"/></td>
                     	<td><c:out value="${listVar.newsCreateDate}"/></td>
                     	<td><a href="#">Edit</a></td>
                     	<td><a href="#">Delete</a></td>
             		 </tr>                      
              
              	</c:forEach>

           
           </table>
        </div>
        
        
</body>
</html>