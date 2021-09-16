<%@page import="com.model.Event"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
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
        <a href="#"><img class="home" src="image/home-white.png" />Dashboard</a><br />
        <a href="#"><img class="home" src="image/organization-white.png" />Organization</a><br />
        <a href="#"><img class="home" src="image/users-white.png" />User</></a><br />
        <a href="EventAdminDis.jsp"><img class="home" src="image/leaves-white.png" />Events</a><br />
        <a href="#"><img class="home" src="image/reports-white.png" />Reports</a>
    </div>
<br><br><br><br><br>

<%
		Event event = (Event) request.getAttribute("event");
%>

	<form method="POST" action="UpdateEvent">
		<table align="center">
			<tr>
				<td>Event ID</td>
				<td><input type="text" name="eventID" disabled="disabled"
					value="<%=event.getEventID()%>" /></td>
			</tr>
			<tr>
				<td>Event Name</td>
				<td><input type="text" name="eventName"
					value="<%=event.getEventName()%>" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="text" name="date"
					value="<%=event.getDate()%>" /></td>
			</tr>
			<tr>
				<td>About Event</td>
				<td><input type="text" name="description"
					value="<%=event.getDescription()%>" /></td>
			</tr>
			
				<td colspan="2"><input type="hidden" name="eventID"
					value="<%=event.getEventID()%>" /> <input type="submit"
					value="Update Event" class="update-button"/></td>
			</tr>
		</table>
	</form>
</body>
</html>