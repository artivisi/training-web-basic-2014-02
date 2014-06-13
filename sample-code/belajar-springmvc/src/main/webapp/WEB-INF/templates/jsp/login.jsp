<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/bootstrap.min.css" media="screen">
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/aplikasi.css" media="screen">
    </head>
    <body>
        <div class="container">

            <c:if test="${param.error}">
                Username / Password salah
            </c:if>

            <form class="form-signin" role="form" action="j_spring_security_check" method="POST">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <h2 class="form-signin-heading">Please sign in</h2>
                <input type="text" name="j_username" class="form-control" placeholder="Username" required autofocus>
                <input type="password" name="j_password" class="form-control" placeholder="Password" required>
                <label class="checkbox">
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>

        </div> <!-- /container -->
    </body>
</html>
