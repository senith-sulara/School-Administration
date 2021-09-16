<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Event</title>
<link rel="stylesheet" type="text/css" href="styles/adminHome.css">
<link rel="stylesheet" type="text/css" href="styles/master.css">
<link rel="stylesheet" type="text/css" href="styles/footer.css">
</head>
<body style="background-image: url(image/az.jpg)">
    <div class="header">
        <img id="logo" src="image/ab.png" alt="scllogo">
		
        <div id="divProfile">
            <img id="imageProfile" src="image/m3.png">
            <div class="divWelcomeLabel">Welcome</div>
            <div class="divWelcomeLabel email">Rikki@gmail.com</div>
        </div>
    </div>
    <div class="footer">
        <ul>
            <li><a href="#">About</a></li>
            <li><a href="#">Privacy Policy</a></li>
            <li><a href="#">Contact Us</a></li>
        </ul>
    </div>

	<div id="mysidenav" class="sidenav">
        <!--<a href="siteJs:void(0)" class="closebtn" onclick="closenav()">&times;</a>-->
        <a href="AdminHome.jsp"><img class="home" src="image/home-white.png" />Dashboard</a><br />
        <a href="#"><img class="home" src="image/organization-white.png" />Organization</a><br />
        <a href="#"><img class="home" src="image/users-white.png" />User</></a><br />
        <a href="EventAdminDis.jsp"><img class="home" src="image/leaves-white.png" />Events</a><br />
        <a href="#"><img class="home" src="image/reports-white.png" />Reports</a>
    </div>
<br><br><br><br><br>
<form class="formAddEvent" method="POST" action="AddEvent">

		<table align="center">

			<tr>
				<td>Event Name</td>
				<td><input type="text" name="eventName" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="text" name="date" /></td>
			</tr>
			<tr>
				<td>About Event</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Event" class="add-button" /> </td>
			</tr>
			<tr>	
				<td colspan="2"><input type="reset" value="Reset" class="reset-button" /></td>
			</tr>
		</table>
	</form>

	<form method="POST" action="ListEvent">
		<table align="center">
			<tr>
				<td colspan="2"><input type="submit" value="List All Event" class="list-button" />
				</td>
			</tr>
		</table>
	</form>
	
</div>
</body>
</html>