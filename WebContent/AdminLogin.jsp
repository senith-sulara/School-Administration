<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="styles/footer.css">
<link rel="stylesheet" type="text/css" href="styles/adminLogin.css">
<link rel="stylesheet" type="text/css" href="styles/body.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include><br><br><br><div class="e1">
<div class="login">

                    <form class="logf" action = "AdminLogin" method = "post">

                        <img src="image/m3.png" class="umale">

                        <h1>Administrator Login</h1>

                        <p>User Name</p>
                        <input type="text" placeholder="Enter User Name" name = "userName"required>
                        <p>Pasword</p>
                        <input type="password" placeholder="Enter paswword" name = "password"required>
                        <input type="submit" name="submit" value="Login">

                        <a href="#">Forgot password?</a>

                    </form><!---->
<h4 align="center"> ${message} </h4>
            </div><!--login-->
</div>            
 <jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>           
</body>
</html>