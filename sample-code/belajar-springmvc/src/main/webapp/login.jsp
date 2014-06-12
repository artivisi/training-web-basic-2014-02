<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/bootstrap.min.css" media="screen">
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/aplikasi.css" media="screen">
    </head>
    <body>
        <div class="container">

            <form class="form-signin" role="form">
                <h2 class="form-signin-heading">Please sign in</h2>
                <input type="email" class="form-control" placeholder="Email address" required autofocus>
                <input type="password" class="form-control" placeholder="Password" required>
                <label class="checkbox">
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>

        </div> <!-- /container -->
    </body>
</html>
